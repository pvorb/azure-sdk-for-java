// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The object that represents the operation.
 */
@Immutable
public final class OperationDisplay implements JsonSerializable<OperationDisplay> {
    /*
     * Service provider: Microsoft DigitalTwins.
     */
    private String provider;

    /*
     * Resource Type: DigitalTwinsInstances.
     */
    private String resource;

    /*
     * Name of the operation.
     */
    private String operation;

    /*
     * Friendly description for the operation.
     */
    private String description;

    /**
     * Creates an instance of OperationDisplay class.
     */
    public OperationDisplay() {
    }

    /**
     * Get the provider property: Service provider: Microsoft DigitalTwins.
     * 
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get the resource property: Resource Type: DigitalTwinsInstances.
     * 
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Get the operation property: Name of the operation.
     * 
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the description property: Friendly description for the operation.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of OperationDisplay from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationDisplay if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationDisplay.
     */
    public static OperationDisplay fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationDisplay deserializedOperationDisplay = new OperationDisplay();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provider".equals(fieldName)) {
                    deserializedOperationDisplay.provider = reader.getString();
                } else if ("resource".equals(fieldName)) {
                    deserializedOperationDisplay.resource = reader.getString();
                } else if ("operation".equals(fieldName)) {
                    deserializedOperationDisplay.operation = reader.getString();
                } else if ("description".equals(fieldName)) {
                    deserializedOperationDisplay.description = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationDisplay;
        });
    }
}
