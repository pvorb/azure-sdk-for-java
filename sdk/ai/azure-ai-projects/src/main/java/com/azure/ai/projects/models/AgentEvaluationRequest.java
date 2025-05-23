// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.projects.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Evaluation request for agent run.
 */
@Fluent
public final class AgentEvaluationRequest implements JsonSerializable<AgentEvaluationRequest> {

    /*
     * Identifier of the agent run.
     */
    @Generated
    private final String runId;

    /*
     * Identifier of the agent thread. This field is mandatory currently, but it will be optional in the future.
     */
    @Generated
    private String threadId;

    /*
     * Evaluators to be used for the evaluation.
     */
    @Generated
    private final Map<String, EvaluatorConfiguration> evaluators;

    /*
     * Sampling configuration for the evaluation.
     */
    @Generated
    private AgentEvaluationSamplingConfiguration samplingConfiguration;

    /*
     * Redaction configuration for the evaluation.
     */
    @Generated
    private AgentEvaluationRedactionConfiguration redactionConfiguration;

    /*
     * Pass the AppInsights connection string to the agent evaluation for the evaluation results and the errors logs.
     */
    @Generated
    private final String appInsightsConnectionString;

    /**
     * Creates an instance of AgentEvaluationRequest class.
     *
     * @param runId the runId value to set.
     * @param evaluators the evaluators value to set.
     * @param appInsightsConnectionString the appInsightsConnectionString value to set.
     */
    @Generated
    public AgentEvaluationRequest(String runId, Map<String, EvaluatorConfiguration> evaluators,
        String appInsightsConnectionString) {
        this.runId = runId;
        this.evaluators = evaluators;
        this.appInsightsConnectionString = appInsightsConnectionString;
    }

    /**
     * Get the runId property: Identifier of the agent run.
     *
     * @return the runId value.
     */
    @Generated
    public String getRunId() {
        return this.runId;
    }

    /**
     * Get the threadId property: Identifier of the agent thread. This field is mandatory currently, but it will be
     * optional in the future.
     *
     * @return the threadId value.
     */
    @Generated
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * Set the threadId property: Identifier of the agent thread. This field is mandatory currently, but it will be
     * optional in the future.
     *
     * @param threadId the threadId value to set.
     * @return the AgentEvaluationRequest object itself.
     */
    @Generated
    public AgentEvaluationRequest setThreadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * Get the evaluators property: Evaluators to be used for the evaluation.
     *
     * @return the evaluators value.
     */
    @Generated
    public Map<String, EvaluatorConfiguration> getEvaluators() {
        return this.evaluators;
    }

    /**
     * Get the samplingConfiguration property: Sampling configuration for the evaluation.
     *
     * @return the samplingConfiguration value.
     */
    @Generated
    public AgentEvaluationSamplingConfiguration getSamplingConfiguration() {
        return this.samplingConfiguration;
    }

    /**
     * Set the samplingConfiguration property: Sampling configuration for the evaluation.
     *
     * @param samplingConfiguration the samplingConfiguration value to set.
     * @return the AgentEvaluationRequest object itself.
     */
    @Generated
    public AgentEvaluationRequest setSamplingConfiguration(AgentEvaluationSamplingConfiguration samplingConfiguration) {
        this.samplingConfiguration = samplingConfiguration;
        return this;
    }

    /**
     * Get the redactionConfiguration property: Redaction configuration for the evaluation.
     *
     * @return the redactionConfiguration value.
     */
    @Generated
    public AgentEvaluationRedactionConfiguration getRedactionConfiguration() {
        return this.redactionConfiguration;
    }

    /**
     * Set the redactionConfiguration property: Redaction configuration for the evaluation.
     *
     * @param redactionConfiguration the redactionConfiguration value to set.
     * @return the AgentEvaluationRequest object itself.
     */
    @Generated
    public AgentEvaluationRequest
        setRedactionConfiguration(AgentEvaluationRedactionConfiguration redactionConfiguration) {
        this.redactionConfiguration = redactionConfiguration;
        return this;
    }

    /**
     * Get the appInsightsConnectionString property: Pass the AppInsights connection string to the agent evaluation for
     * the evaluation results and the errors logs.
     *
     * @return the appInsightsConnectionString value.
     */
    @Generated
    public String getAppInsightsConnectionString() {
        return this.appInsightsConnectionString;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("runId", this.runId);
        jsonWriter.writeMapField("evaluators", this.evaluators, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("appInsightsConnectionString", this.appInsightsConnectionString);
        jsonWriter.writeStringField("threadId", this.threadId);
        jsonWriter.writeJsonField("samplingConfiguration", this.samplingConfiguration);
        jsonWriter.writeJsonField("redactionConfiguration", this.redactionConfiguration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AgentEvaluationRequest from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of AgentEvaluationRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AgentEvaluationRequest.
     */
    @Generated
    public static AgentEvaluationRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String runId = null;
            Map<String, EvaluatorConfiguration> evaluators = null;
            String appInsightsConnectionString = null;
            String threadId = null;
            AgentEvaluationSamplingConfiguration samplingConfiguration = null;
            AgentEvaluationRedactionConfiguration redactionConfiguration = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("runId".equals(fieldName)) {
                    runId = reader.getString();
                } else if ("evaluators".equals(fieldName)) {
                    evaluators = reader.readMap(reader1 -> EvaluatorConfiguration.fromJson(reader1));
                } else if ("appInsightsConnectionString".equals(fieldName)) {
                    appInsightsConnectionString = reader.getString();
                } else if ("threadId".equals(fieldName)) {
                    threadId = reader.getString();
                } else if ("samplingConfiguration".equals(fieldName)) {
                    samplingConfiguration = AgentEvaluationSamplingConfiguration.fromJson(reader);
                } else if ("redactionConfiguration".equals(fieldName)) {
                    redactionConfiguration = AgentEvaluationRedactionConfiguration.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            AgentEvaluationRequest deserializedAgentEvaluationRequest
                = new AgentEvaluationRequest(runId, evaluators, appInsightsConnectionString);
            deserializedAgentEvaluationRequest.threadId = threadId;
            deserializedAgentEvaluationRequest.samplingConfiguration = samplingConfiguration;
            deserializedAgentEvaluationRequest.redactionConfiguration = redactionConfiguration;
            return deserializedAgentEvaluationRequest;
        });
    }
}
