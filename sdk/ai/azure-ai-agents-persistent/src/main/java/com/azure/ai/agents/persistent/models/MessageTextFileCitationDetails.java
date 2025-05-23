// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.agents.persistent.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A representation of a file-based text citation, as used in a file-based annotation of text thread message content.
 */
@Immutable
public final class MessageTextFileCitationDetails implements JsonSerializable<MessageTextFileCitationDetails> {

    /*
     * The ID of the file associated with this citation.
     */
    @Generated
    private final String fileId;

    /*
     * The specific quote cited in the associated file.
     */
    @Generated
    private final String quote;

    /**
     * Creates an instance of MessageTextFileCitationDetails class.
     *
     * @param fileId the fileId value to set.
     * @param quote the quote value to set.
     */
    @Generated
    private MessageTextFileCitationDetails(String fileId, String quote) {
        this.fileId = fileId;
        this.quote = quote;
    }

    /**
     * Get the fileId property: The ID of the file associated with this citation.
     *
     * @return the fileId value.
     */
    @Generated
    public String getFileId() {
        return this.fileId;
    }

    /**
     * Get the quote property: The specific quote cited in the associated file.
     *
     * @return the quote value.
     */
    @Generated
    public String getQuote() {
        return this.quote;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("file_id", this.fileId);
        jsonWriter.writeStringField("quote", this.quote);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageTextFileCitationDetails from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageTextFileCitationDetails if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageTextFileCitationDetails.
     */
    @Generated
    public static MessageTextFileCitationDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String fileId = null;
            String quote = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("file_id".equals(fieldName)) {
                    fileId = reader.getString();
                } else if ("quote".equals(fieldName)) {
                    quote = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new MessageTextFileCitationDetails(fileId, quote);
        });
    }
}
