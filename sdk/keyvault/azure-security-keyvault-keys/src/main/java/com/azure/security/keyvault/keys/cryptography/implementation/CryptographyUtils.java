// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.security.keyvault.keys.cryptography.implementation;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.security.keyvault.keys.cryptography.models.EncryptionAlgorithm;
import com.azure.security.keyvault.keys.cryptography.models.KeyWrapAlgorithm;
import com.azure.security.keyvault.keys.cryptography.models.SignatureAlgorithm;
import com.azure.security.keyvault.keys.implementation.models.JsonWebKeyEncryptionAlgorithm;
import com.azure.security.keyvault.keys.implementation.models.JsonWebKeySignatureAlgorithm;
import com.azure.security.keyvault.keys.implementation.models.SecretKey;
import com.azure.security.keyvault.keys.models.JsonWebKey;
import com.azure.security.keyvault.keys.models.KeyOperation;
import com.azure.security.keyvault.keys.models.KeyType;
import reactor.core.publisher.Mono;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

import static com.azure.security.keyvault.keys.models.KeyType.EC;
import static com.azure.security.keyvault.keys.models.KeyType.EC_HSM;
import static com.azure.security.keyvault.keys.models.KeyType.OCT;
import static com.azure.security.keyvault.keys.models.KeyType.OCT_HSM;
import static com.azure.security.keyvault.keys.models.KeyType.RSA;
import static com.azure.security.keyvault.keys.models.KeyType.RSA_HSM;

/**
 * Utility methods for the Cryptography portion of KeyVault Keys.
 */
public final class CryptographyUtils {
    private CryptographyUtils() {
        // No-op
    }

    public static final String SECRETS_COLLECTION = "secrets";

    public static List<String> unpackAndValidateId(String keyId, ClientLogger logger) {
        if (CoreUtils.isNullOrEmpty(keyId)) {
            throw logger.logExceptionAsError(new IllegalArgumentException("'keyId' cannot be null or empty."));
        }

        try {
            URL url = new URL(keyId);
            String[] tokens = url.getPath().split("/");
            String vaultUrl = url.getProtocol() + "://" + url.getHost();

            if (url.getPort() != -1) {
                vaultUrl += ":" + url.getPort();
            }

            String keyCollection = (tokens.length >= 2 ? tokens[1] : null);
            String keyName = (tokens.length >= 3 ? tokens[2] : null);
            String keyVersion = (tokens.length >= 4 ? tokens[3] : null);

            if (CoreUtils.isNullOrEmpty(vaultUrl)) {
                throw logger
                    .logExceptionAsError(new IllegalArgumentException("Key endpoint in key identifier is invalid."));
            } else if (CoreUtils.isNullOrEmpty(keyName)) {
                throw logger
                    .logExceptionAsError(new IllegalArgumentException("Key name in key identifier is invalid."));
            }

            return Arrays.asList(vaultUrl, keyCollection, keyName, keyVersion);
        } catch (MalformedURLException e) {
            throw logger.logExceptionAsError(new IllegalArgumentException("The key identifier is malformed.", e));
        }
    }

    public static LocalKeyCryptographyClient retrieveJwkAndCreateLocalClient(CryptographyClientImpl implClient) {
        // Technically the collection portion of a key identifier should never be null/empty, but we still check for it.
        if (!CoreUtils.isNullOrEmpty(implClient.getKeyCollection())) {
            // Get the JWK from the service and validate it. Then attempt to create a local cryptography client or
            // default to using service-side cryptography.
            JsonWebKey jsonWebKey = CryptographyUtils.SECRETS_COLLECTION.equals(implClient.getKeyCollection())
                ? implClient.getSecretKey()
                : implClient.getKey(Context.NONE).getValue().getKey();

            if (jsonWebKey == null) {
                throw new IllegalStateException(
                    "Could not retrieve JSON Web Key to perform local cryptographic operations.");
            } else if (!jsonWebKey.isValid()) {
                throw new IllegalStateException("The retrieved JSON Web Key is not valid.");
            } else {
                return createLocalClient(jsonWebKey, implClient);
            }
        } else {
            // Couldn't/didn't create a local cryptography client.
            throw new IllegalStateException("Could not create a local cryptography client.");
        }
    }

    public static Mono<LocalKeyCryptographyClient>
        retrieveJwkAndCreateLocalAsyncClient(CryptographyClientImpl implClient) {
        // Technically the collection portion of a key identifier should never be null/empty, but we still check for it.
        if (!CoreUtils.isNullOrEmpty(implClient.getKeyCollection())) {
            // Get the JWK from the service and validate it. Then attempt to create a local cryptography client or
            // default to using service-side cryptography.
            Mono<JsonWebKey> jsonWebKeyMono = CryptographyUtils.SECRETS_COLLECTION.equals(implClient.getKeyCollection())
                ? implClient.getSecretKeyAsync()
                : implClient.getKeyAsync().map(keyVaultKeyResponse -> keyVaultKeyResponse.getValue().getKey());

            return jsonWebKeyMono.handle((jsonWebKey, sink) -> {
                if (!jsonWebKey.isValid()) {
                    sink.error(new IllegalStateException("The retrieved JSON Web Key is not valid."));
                } else {
                    sink.next(createLocalClient(jsonWebKey, implClient));
                }
            });
        } else {
            // Couldn't/didn't create a local cryptography client.
            return Mono.error(new IllegalStateException(
                "Could not create a local cryptography client. Key collection is null or empty."));
        }
    }

    public static LocalKeyCryptographyClient createLocalClient(JsonWebKey jsonWebKey,
        CryptographyClientImpl implClient) {

        if (!KeyType.values().contains(jsonWebKey.getKeyType())) {
            throw new IllegalArgumentException(
                String.format("The JSON Web Key type: %s is not supported.", jsonWebKey.getKeyType().toString()));
        }

        if (jsonWebKey.getKeyType().equals(RSA) || jsonWebKey.getKeyType().equals(RSA_HSM)) {
            return new RsaKeyCryptographyClient(jsonWebKey, implClient);
        } else if (jsonWebKey.getKeyType().equals(EC) || jsonWebKey.getKeyType().equals(EC_HSM)) {
            return new EcKeyCryptographyClient(jsonWebKey, implClient);
        } else if (jsonWebKey.getKeyType().equals(OCT) || jsonWebKey.getKeyType().equals(OCT_HSM)) {
            return new AesKeyCryptographyClient(jsonWebKey, implClient);
        }

        // Should never reach this point.
        throw new IllegalStateException("Could not create local cryptography client.");
    }

    public static void verifyKeyPermissions(JsonWebKey jsonWebKey, KeyOperation keyOperation) {
        if (!jsonWebKey.getKeyOps().contains(keyOperation)) {
            String keyOperationName = keyOperation == null ? null : keyOperation.toString().toLowerCase(Locale.ROOT);

            throw new UnsupportedOperationException(String.format("The %s operation is not allowed for key with id: %s",
                keyOperationName, jsonWebKey.getId()));
        }
    }

    public static boolean isThrowableRetryable(Throwable e) {
        if (e instanceof HttpResponseException) {
            int statusCode = ((HttpResponseException) e).getResponse().getStatusCode();

            // Not a retriable error code.
            return statusCode != 501
                && statusCode != 505
                && (statusCode >= 500 || statusCode == 408 || statusCode == 429);
        } else {
            // Not a service-related transient error.
            return false;
        }
    }

    /*
     * Determines whether the key is valid and of required size.
     *
     * @param key The key to be checked.
     * @param keySizeInBytes The minimum size required for the key
     */
    static void validate(byte[] key, int keySizeInBytes) {
        if (key == null) {
            throw new IllegalArgumentException("key must not be null");
        }

        if (key.length < keySizeInBytes) {
            throw new IllegalArgumentException(String.format("key must be at least %d bits long", keySizeInBytes << 3));
        }
    }

    /*
     * Compares two byte arrays in constant time.
     *
     * @param self
     *      The first byte array to compare
     * @param other
     *      The second byte array to compare
     * @return
     *      True if the two byte arrays are equal.
     */
    static boolean sequenceEqualConstantTime(byte[] self, byte[] other) {
        if (self == null) {
            throw new IllegalArgumentException("self");
        }

        if (other == null) {
            throw new IllegalArgumentException("other");
        }

        // Constant time comparison of two byte arrays
        long difference = (self.length & 0xffffffffL) ^ (other.length & 0xffffffffL);

        for (int i = 0; i < self.length && i < other.length; i++) {
            difference |= (self[i] ^ other[i]) & 0xffffffffL;
        }

        return difference == 0;
    }

    static JsonWebKey transformSecretKey(SecretKey secretKey) {
        return new JsonWebKey().setId(secretKey.getId())
            .setK(Base64.getUrlDecoder().decode(secretKey.getValue()))
            .setKeyType(KeyType.OCT)
            .setKeyOps(Arrays.asList(KeyOperation.WRAP_KEY, KeyOperation.UNWRAP_KEY, KeyOperation.ENCRYPT,
                KeyOperation.DECRYPT));
    }

    static JsonWebKeyEncryptionAlgorithm mapKeyEncryptionAlgorithm(EncryptionAlgorithm algorithm) {
        return JsonWebKeyEncryptionAlgorithm.fromString(Objects.toString(algorithm, null));
    }

    static JsonWebKeySignatureAlgorithm mapKeySignatureAlgorithm(SignatureAlgorithm algorithm) {
        return JsonWebKeySignatureAlgorithm.fromString(Objects.toString(algorithm, null));
    }

    static JsonWebKeyEncryptionAlgorithm mapWrapAlgorithm(KeyWrapAlgorithm algorithm) {
        return JsonWebKeyEncryptionAlgorithm.fromString(Objects.toString(algorithm, null));
    }
}
