// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.servicenetworking.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Frontend Properties.
 */
@Fluent
public final class FrontendProperties implements JsonSerializable<FrontendProperties> {
    /*
     * The Fully Qualified Domain Name of the DNS record associated to a Traffic Controller frontend.
     */
    private String fqdn;

    /*
     * Frontend Security Policy Configuration
     */
    private SecurityPolicyConfigurations securityPolicyConfigurations;

    /*
     * Provisioning State of Traffic Controller Frontend Resource
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of FrontendProperties class.
     */
    public FrontendProperties() {
    }

    /**
     * Get the fqdn property: The Fully Qualified Domain Name of the DNS record associated to a Traffic Controller
     * frontend.
     * 
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Get the securityPolicyConfigurations property: Frontend Security Policy Configuration.
     * 
     * @return the securityPolicyConfigurations value.
     */
    public SecurityPolicyConfigurations securityPolicyConfigurations() {
        return this.securityPolicyConfigurations;
    }

    /**
     * Set the securityPolicyConfigurations property: Frontend Security Policy Configuration.
     * 
     * @param securityPolicyConfigurations the securityPolicyConfigurations value to set.
     * @return the FrontendProperties object itself.
     */
    public FrontendProperties
        withSecurityPolicyConfigurations(SecurityPolicyConfigurations securityPolicyConfigurations) {
        this.securityPolicyConfigurations = securityPolicyConfigurations;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning State of Traffic Controller Frontend Resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (securityPolicyConfigurations() != null) {
            securityPolicyConfigurations().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("securityPolicyConfigurations", this.securityPolicyConfigurations);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FrontendProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FrontendProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the FrontendProperties.
     */
    public static FrontendProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FrontendProperties deserializedFrontendProperties = new FrontendProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("fqdn".equals(fieldName)) {
                    deserializedFrontendProperties.fqdn = reader.getString();
                } else if ("securityPolicyConfigurations".equals(fieldName)) {
                    deserializedFrontendProperties.securityPolicyConfigurations
                        = SecurityPolicyConfigurations.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedFrontendProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFrontendProperties;
        });
    }
}
