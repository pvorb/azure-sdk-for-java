// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Defines the asset endpoint profile status properties.
 */
@Immutable
public final class AssetEndpointProfileStatus implements JsonSerializable<AssetEndpointProfileStatus> {
    /*
     * Array object to transfer and persist errors that originate from the Edge.
     */
    private List<AssetEndpointProfileStatusError> errors;

    /**
     * Creates an instance of AssetEndpointProfileStatus class.
     */
    private AssetEndpointProfileStatus() {
    }

    /**
     * Get the errors property: Array object to transfer and persist errors that originate from the Edge.
     * 
     * @return the errors value.
     */
    public List<AssetEndpointProfileStatusError> errors() {
        return this.errors;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errors() != null) {
            errors().forEach(e -> e.validate());
        }
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
     * Reads an instance of AssetEndpointProfileStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssetEndpointProfileStatus if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AssetEndpointProfileStatus.
     */
    public static AssetEndpointProfileStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AssetEndpointProfileStatus deserializedAssetEndpointProfileStatus = new AssetEndpointProfileStatus();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("errors".equals(fieldName)) {
                    List<AssetEndpointProfileStatusError> errors
                        = reader.readArray(reader1 -> AssetEndpointProfileStatusError.fromJson(reader1));
                    deserializedAssetEndpointProfileStatus.errors = errors;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAssetEndpointProfileStatus;
        });
    }
}
