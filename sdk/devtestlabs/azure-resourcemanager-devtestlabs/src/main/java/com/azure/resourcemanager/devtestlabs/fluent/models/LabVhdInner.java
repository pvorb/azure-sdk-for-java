// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties of a VHD in the lab.
 */
@Fluent
public final class LabVhdInner implements JsonSerializable<LabVhdInner> {
    /*
     * The URI to the VHD.
     */
    private String id;

    /**
     * Creates an instance of LabVhdInner class.
     */
    public LabVhdInner() {
    }

    /**
     * Get the id property: The URI to the VHD.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The URI to the VHD.
     * 
     * @param id the id value to set.
     * @return the LabVhdInner object itself.
     */
    public LabVhdInner withId(String id) {
        this.id = id;
        return this;
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
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LabVhdInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LabVhdInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the LabVhdInner.
     */
    public static LabVhdInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LabVhdInner deserializedLabVhdInner = new LabVhdInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedLabVhdInner.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLabVhdInner;
        });
    }
}
