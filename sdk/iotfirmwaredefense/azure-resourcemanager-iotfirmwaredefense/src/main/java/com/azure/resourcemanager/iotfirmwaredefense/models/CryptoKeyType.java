// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.iotfirmwaredefense.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Different types of cryptographic keys.
 */
public final class CryptoKeyType extends ExpandableStringEnum<CryptoKeyType> {
    /**
     * The key is an asymmetric public key.
     */
    public static final CryptoKeyType PUBLIC = fromString("Public");

    /**
     * The key is an asymmetric private key.
     */
    public static final CryptoKeyType PRIVATE = fromString("Private");

    /**
     * Creates a new instance of CryptoKeyType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public CryptoKeyType() {
    }

    /**
     * Creates or finds a CryptoKeyType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding CryptoKeyType.
     */
    public static CryptoKeyType fromString(String name) {
        return fromString(name, CryptoKeyType.class);
    }

    /**
     * Gets known CryptoKeyType values.
     * 
     * @return known CryptoKeyType values.
     */
    public static Collection<CryptoKeyType> values() {
        return values(CryptoKeyType.class);
    }
}
