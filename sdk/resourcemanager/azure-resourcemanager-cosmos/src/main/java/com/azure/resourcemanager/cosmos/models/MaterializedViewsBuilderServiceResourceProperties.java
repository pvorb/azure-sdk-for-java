// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Properties for MaterializedViewsBuilderServiceResource.
 */
@Fluent
public final class MaterializedViewsBuilderServiceResourceProperties extends ServiceResourceProperties {
    /*
     * ServiceType for the service.
     */
    private ServiceType serviceType = ServiceType.MATERIALIZED_VIEWS_BUILDER;

    /*
     * An array that contains all of the locations for the service.
     */
    private List<MaterializedViewsBuilderRegionalServiceResource> locations;

    /**
     * Creates an instance of MaterializedViewsBuilderServiceResourceProperties class.
     */
    public MaterializedViewsBuilderServiceResourceProperties() {
    }

    /**
     * Get the serviceType property: ServiceType for the service.
     * 
     * @return the serviceType value.
     */
    @Override
    public ServiceType serviceType() {
        return this.serviceType;
    }

    /**
     * Get the locations property: An array that contains all of the locations for the service.
     * 
     * @return the locations value.
     */
    public List<MaterializedViewsBuilderRegionalServiceResource> locations() {
        return this.locations;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaterializedViewsBuilderServiceResourceProperties withInstanceSize(ServiceSize instanceSize) {
        super.withInstanceSize(instanceSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaterializedViewsBuilderServiceResourceProperties withInstanceCount(Integer instanceCount) {
        super.withInstanceCount(instanceCount);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("instanceSize", instanceSize() == null ? null : instanceSize().toString());
        jsonWriter.writeNumberField("instanceCount", instanceCount());
        jsonWriter.writeStringField("serviceType", this.serviceType == null ? null : this.serviceType.toString());
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MaterializedViewsBuilderServiceResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MaterializedViewsBuilderServiceResourceProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MaterializedViewsBuilderServiceResourceProperties.
     */
    public static MaterializedViewsBuilderServiceResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MaterializedViewsBuilderServiceResourceProperties deserializedMaterializedViewsBuilderServiceResourceProperties
                = new MaterializedViewsBuilderServiceResourceProperties();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("creationTime".equals(fieldName)) {
                    deserializedMaterializedViewsBuilderServiceResourceProperties.withCreationTime(reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString())));
                } else if ("instanceSize".equals(fieldName)) {
                    deserializedMaterializedViewsBuilderServiceResourceProperties
                        .withInstanceSize(ServiceSize.fromString(reader.getString()));
                } else if ("instanceCount".equals(fieldName)) {
                    deserializedMaterializedViewsBuilderServiceResourceProperties
                        .withInstanceCount(reader.getNullable(JsonReader::getInt));
                } else if ("status".equals(fieldName)) {
                    deserializedMaterializedViewsBuilderServiceResourceProperties
                        .withStatus(ServiceStatus.fromString(reader.getString()));
                } else if ("serviceType".equals(fieldName)) {
                    deserializedMaterializedViewsBuilderServiceResourceProperties.serviceType
                        = ServiceType.fromString(reader.getString());
                } else if ("locations".equals(fieldName)) {
                    List<MaterializedViewsBuilderRegionalServiceResource> locations = reader
                        .readArray(reader1 -> MaterializedViewsBuilderRegionalServiceResource.fromJson(reader1));
                    deserializedMaterializedViewsBuilderServiceResourceProperties.locations = locations;
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMaterializedViewsBuilderServiceResourceProperties
                .withAdditionalProperties(additionalProperties);

            return deserializedMaterializedViewsBuilderServiceResourceProperties;
        });
    }
}
