// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ID of the subscriptions that is being renamed.
 */
@Immutable
public final class RenamedSubscriptionIdInner implements JsonSerializable<RenamedSubscriptionIdInner> {
    /*
     * The ID of the subscriptions that is being renamed
     */
    private String subscriptionId;

    /**
     * Creates an instance of RenamedSubscriptionIdInner class.
     */
    public RenamedSubscriptionIdInner() {
    }

    /**
     * Get the subscriptionId property: The ID of the subscriptions that is being renamed.
     * 
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
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
     * Reads an instance of RenamedSubscriptionIdInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RenamedSubscriptionIdInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RenamedSubscriptionIdInner.
     */
    public static RenamedSubscriptionIdInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RenamedSubscriptionIdInner deserializedRenamedSubscriptionIdInner = new RenamedSubscriptionIdInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("subscriptionId".equals(fieldName)) {
                    deserializedRenamedSubscriptionIdInner.subscriptionId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRenamedSubscriptionIdInner;
        });
    }
}
