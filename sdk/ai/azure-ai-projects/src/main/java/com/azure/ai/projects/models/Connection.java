// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.projects.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Response from the list and get connections operations.
 */
@Immutable
public final class Connection implements JsonSerializable<Connection> {

    /*
     * The friendly name of the connection, provided by the user.
     */
    @Generated
    private String name;

    /*
     * A unique identifier for the connection, generated by the service
     */
    @Generated
    private String id;

    /*
     * Category of the connection
     */
    @Generated
    private ConnectionType type;

    /*
     * The connection URL to be used for this service
     */
    @Generated
    private String target;

    /*
     * Whether the connection is tagged as the default connection of its type
     */
    @Generated
    private boolean isDefault;

    /*
     * The credentials used by the connection
     */
    @Generated
    private BaseCredentials credentials;

    /*
     * Metadata of the connection
     */
    @Generated
    private Map<String, String> metadata;

    /**
     * Creates an instance of Connection class.
     */
    @Generated
    private Connection() {
    }

    /**
     * Get the name property: The friendly name of the connection, provided by the user.
     *
     * @return the name value.
     */
    @Generated
    public String getName() {
        return this.name;
    }

    /**
     * Get the id property: A unique identifier for the connection, generated by the service.
     *
     * @return the id value.
     */
    @Generated
    public String getId() {
        return this.id;
    }

    /**
     * Get the type property: Category of the connection.
     *
     * @return the type value.
     */
    @Generated
    public ConnectionType getType() {
        return this.type;
    }

    /**
     * Get the target property: The connection URL to be used for this service.
     *
     * @return the target value.
     */
    @Generated
    public String getTarget() {
        return this.target;
    }

    /**
     * Get the isDefault property: Whether the connection is tagged as the default connection of its type.
     *
     * @return the isDefault value.
     */
    @Generated
    public boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Get the credentials property: The credentials used by the connection.
     *
     * @return the credentials value.
     */
    @Generated
    public BaseCredentials getCredentials() {
        return this.credentials;
    }

    /**
     * Get the metadata property: Metadata of the connection.
     *
     * @return the metadata value.
     */
    @Generated
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Connection from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of Connection if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the Connection.
     */
    @Generated
    public static Connection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Connection deserializedConnection = new Connection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("name".equals(fieldName)) {
                    deserializedConnection.name = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedConnection.id = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedConnection.type = ConnectionType.fromString(reader.getString());
                } else if ("target".equals(fieldName)) {
                    deserializedConnection.target = reader.getString();
                } else if ("isDefault".equals(fieldName)) {
                    deserializedConnection.isDefault = reader.getBoolean();
                } else if ("credentials".equals(fieldName)) {
                    deserializedConnection.credentials = BaseCredentials.fromJson(reader);
                } else if ("metadata".equals(fieldName)) {
                    Map<String, String> metadata = reader.readMap(reader1 -> reader1.getString());
                    deserializedConnection.metadata = metadata;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedConnection;
        });
    }
}
