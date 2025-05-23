// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.datafactory.fluent.models.AzureMLBatchExecutionActivityTypeProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Azure ML Batch Execution activity.
 */
@Fluent
public final class AzureMLBatchExecutionActivity extends ExecutionActivity {
    /*
     * Type of activity.
     */
    private String type = "AzureMLBatchExecution";

    /*
     * Azure ML Batch Execution activity properties.
     */
    private AzureMLBatchExecutionActivityTypeProperties innerTypeProperties
        = new AzureMLBatchExecutionActivityTypeProperties();

    /**
     * Creates an instance of AzureMLBatchExecutionActivity class.
     */
    public AzureMLBatchExecutionActivity() {
    }

    /**
     * Get the type property: Type of activity.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Azure ML Batch Execution activity properties.
     * 
     * @return the innerTypeProperties value.
     */
    AzureMLBatchExecutionActivityTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withPolicy(ActivityPolicy policy) {
        super.withPolicy(policy);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withState(ActivityState state) {
        super.withState(state);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withOnInactiveMarkAs(ActivityOnInactiveMarkAs onInactiveMarkAs) {
        super.withOnInactiveMarkAs(onInactiveMarkAs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withDependsOn(List<ActivityDependency> dependsOn) {
        super.withDependsOn(dependsOn);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureMLBatchExecutionActivity withUserProperties(List<UserProperty> userProperties) {
        super.withUserProperties(userProperties);
        return this;
    }

    /**
     * Get the globalParameters property: Key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint.
     * Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be
     * passed in the GlobalParameters property of the Azure ML batch execution request.
     * 
     * @return the globalParameters value.
     */
    public Map<String, Object> globalParameters() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().globalParameters();
    }

    /**
     * Set the globalParameters property: Key,Value pairs to be passed to the Azure ML Batch Execution Service endpoint.
     * Keys must match the names of web service parameters defined in the published Azure ML web service. Values will be
     * passed in the GlobalParameters property of the Azure ML batch execution request.
     * 
     * @param globalParameters the globalParameters value to set.
     * @return the AzureMLBatchExecutionActivity object itself.
     */
    public AzureMLBatchExecutionActivity withGlobalParameters(Map<String, Object> globalParameters) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureMLBatchExecutionActivityTypeProperties();
        }
        this.innerTypeProperties().withGlobalParameters(globalParameters);
        return this;
    }

    /**
     * Get the webServiceOutputs property: Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Outputs
     * to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the
     * WebServiceOutputs property of the Azure ML batch execution request.
     * 
     * @return the webServiceOutputs value.
     */
    public Map<String, AzureMLWebServiceFile> webServiceOutputs() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().webServiceOutputs();
    }

    /**
     * Set the webServiceOutputs property: Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Outputs
     * to AzureMLWebServiceFile objects specifying the output Blob locations. This information will be passed in the
     * WebServiceOutputs property of the Azure ML batch execution request.
     * 
     * @param webServiceOutputs the webServiceOutputs value to set.
     * @return the AzureMLBatchExecutionActivity object itself.
     */
    public AzureMLBatchExecutionActivity withWebServiceOutputs(Map<String, AzureMLWebServiceFile> webServiceOutputs) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureMLBatchExecutionActivityTypeProperties();
        }
        this.innerTypeProperties().withWebServiceOutputs(webServiceOutputs);
        return this;
    }

    /**
     * Get the webServiceInputs property: Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Inputs
     * to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the
     * WebServiceInputs property of the Azure ML batch execution request.
     * 
     * @return the webServiceInputs value.
     */
    public Map<String, AzureMLWebServiceFile> webServiceInputs() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().webServiceInputs();
    }

    /**
     * Set the webServiceInputs property: Key,Value pairs, mapping the names of Azure ML endpoint's Web Service Inputs
     * to AzureMLWebServiceFile objects specifying the input Blob locations.. This information will be passed in the
     * WebServiceInputs property of the Azure ML batch execution request.
     * 
     * @param webServiceInputs the webServiceInputs value to set.
     * @return the AzureMLBatchExecutionActivity object itself.
     */
    public AzureMLBatchExecutionActivity withWebServiceInputs(Map<String, AzureMLWebServiceFile> webServiceInputs) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureMLBatchExecutionActivityTypeProperties();
        }
        this.innerTypeProperties().withWebServiceInputs(webServiceInputs);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model AzureMLBatchExecutionActivity"));
        } else {
            innerTypeProperties().validate();
        }
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model AzureMLBatchExecutionActivity"));
        }
        if (dependsOn() != null) {
            dependsOn().forEach(e -> e.validate());
        }
        if (userProperties() != null) {
            userProperties().forEach(e -> e.validate());
        }
        if (linkedServiceName() != null) {
            linkedServiceName().validate();
        }
        if (policy() != null) {
            policy().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureMLBatchExecutionActivity.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeStringField("description", description());
        jsonWriter.writeStringField("state", state() == null ? null : state().toString());
        jsonWriter.writeStringField("onInactiveMarkAs",
            onInactiveMarkAs() == null ? null : onInactiveMarkAs().toString());
        jsonWriter.writeArrayField("dependsOn", dependsOn(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("userProperties", userProperties(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("linkedServiceName", linkedServiceName());
        jsonWriter.writeJsonField("policy", policy());
        jsonWriter.writeJsonField("typeProperties", this.innerTypeProperties);
        jsonWriter.writeStringField("type", this.type);
        if (additionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureMLBatchExecutionActivity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureMLBatchExecutionActivity if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureMLBatchExecutionActivity.
     */
    public static AzureMLBatchExecutionActivity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureMLBatchExecutionActivity deserializedAzureMLBatchExecutionActivity
                = new AzureMLBatchExecutionActivity();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedAzureMLBatchExecutionActivity.withName(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedAzureMLBatchExecutionActivity.withDescription(reader.getString());
                } else if ("state".equals(fieldName)) {
                    deserializedAzureMLBatchExecutionActivity.withState(ActivityState.fromString(reader.getString()));
                } else if ("onInactiveMarkAs".equals(fieldName)) {
                    deserializedAzureMLBatchExecutionActivity
                        .withOnInactiveMarkAs(ActivityOnInactiveMarkAs.fromString(reader.getString()));
                } else if ("dependsOn".equals(fieldName)) {
                    List<ActivityDependency> dependsOn
                        = reader.readArray(reader1 -> ActivityDependency.fromJson(reader1));
                    deserializedAzureMLBatchExecutionActivity.withDependsOn(dependsOn);
                } else if ("userProperties".equals(fieldName)) {
                    List<UserProperty> userProperties = reader.readArray(reader1 -> UserProperty.fromJson(reader1));
                    deserializedAzureMLBatchExecutionActivity.withUserProperties(userProperties);
                } else if ("linkedServiceName".equals(fieldName)) {
                    deserializedAzureMLBatchExecutionActivity
                        .withLinkedServiceName(LinkedServiceReference.fromJson(reader));
                } else if ("policy".equals(fieldName)) {
                    deserializedAzureMLBatchExecutionActivity.withPolicy(ActivityPolicy.fromJson(reader));
                } else if ("typeProperties".equals(fieldName)) {
                    deserializedAzureMLBatchExecutionActivity.innerTypeProperties
                        = AzureMLBatchExecutionActivityTypeProperties.fromJson(reader);
                } else if ("type".equals(fieldName)) {
                    deserializedAzureMLBatchExecutionActivity.type = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedAzureMLBatchExecutionActivity.withAdditionalProperties(additionalProperties);

            return deserializedAzureMLBatchExecutionActivity;
        });
    }
}
