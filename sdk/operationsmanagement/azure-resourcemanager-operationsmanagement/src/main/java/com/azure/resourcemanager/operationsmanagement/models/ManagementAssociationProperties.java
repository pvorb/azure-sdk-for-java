// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * ManagementAssociation properties supported by the OperationsManagement resource provider.
 */
@Fluent
public final class ManagementAssociationProperties implements JsonSerializable<ManagementAssociationProperties> {
    /*
     * The applicationId of the appliance for this association.
     */
    private String applicationId;

    /**
     * Creates an instance of ManagementAssociationProperties class.
     */
    public ManagementAssociationProperties() {
    }

    /**
     * Get the applicationId property: The applicationId of the appliance for this association.
     * 
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: The applicationId of the appliance for this association.
     * 
     * @param applicationId the applicationId value to set.
     * @return the ManagementAssociationProperties object itself.
     */
    public ManagementAssociationProperties withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (applicationId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property applicationId in model ManagementAssociationProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagementAssociationProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("applicationId", this.applicationId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagementAssociationProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagementAssociationProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagementAssociationProperties.
     */
    public static ManagementAssociationProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagementAssociationProperties deserializedManagementAssociationProperties
                = new ManagementAssociationProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("applicationId".equals(fieldName)) {
                    deserializedManagementAssociationProperties.applicationId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagementAssociationProperties;
        });
    }
}
