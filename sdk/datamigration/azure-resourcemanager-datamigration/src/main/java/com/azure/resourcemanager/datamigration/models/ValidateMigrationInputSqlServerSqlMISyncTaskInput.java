// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Input for task that migrates SQL Server databases to Azure SQL Database Managed Instance online scenario.
 */
@Fluent
public final class ValidateMigrationInputSqlServerSqlMISyncTaskInput extends SqlServerSqlMISyncTaskInput {
    /**
     * Creates an instance of ValidateMigrationInputSqlServerSqlMISyncTaskInput class.
     */
    public ValidateMigrationInputSqlServerSqlMISyncTaskInput() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ValidateMigrationInputSqlServerSqlMISyncTaskInput
        withSelectedDatabases(List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases) {
        super.withSelectedDatabases(selectedDatabases);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ValidateMigrationInputSqlServerSqlMISyncTaskInput withBackupFileShare(FileShare backupFileShare) {
        super.withBackupFileShare(backupFileShare);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ValidateMigrationInputSqlServerSqlMISyncTaskInput withStorageResourceId(String storageResourceId) {
        super.withStorageResourceId(storageResourceId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ValidateMigrationInputSqlServerSqlMISyncTaskInput
        withSourceConnectionInfo(SqlConnectionInfo sourceConnectionInfo) {
        super.withSourceConnectionInfo(sourceConnectionInfo);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ValidateMigrationInputSqlServerSqlMISyncTaskInput
        withTargetConnectionInfo(MiSqlConnectionInfo targetConnectionInfo) {
        super.withTargetConnectionInfo(targetConnectionInfo);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ValidateMigrationInputSqlServerSqlMISyncTaskInput withAzureApp(AzureActiveDirectoryApp azureApp) {
        super.withAzureApp(azureApp);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (selectedDatabases() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property selectedDatabases in model ValidateMigrationInputSqlServerSqlMISyncTaskInput"));
        } else {
            selectedDatabases().forEach(e -> e.validate());
        }
        if (backupFileShare() != null) {
            backupFileShare().validate();
        }
        if (storageResourceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property storageResourceId in model ValidateMigrationInputSqlServerSqlMISyncTaskInput"));
        }
        if (sourceConnectionInfo() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property sourceConnectionInfo in model ValidateMigrationInputSqlServerSqlMISyncTaskInput"));
        } else {
            sourceConnectionInfo().validate();
        }
        if (targetConnectionInfo() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property targetConnectionInfo in model ValidateMigrationInputSqlServerSqlMISyncTaskInput"));
        } else {
            targetConnectionInfo().validate();
        }
        if (azureApp() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property azureApp in model ValidateMigrationInputSqlServerSqlMISyncTaskInput"));
        } else {
            azureApp().validate();
        }
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(ValidateMigrationInputSqlServerSqlMISyncTaskInput.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("selectedDatabases", selectedDatabases(),
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("storageResourceId", storageResourceId());
        jsonWriter.writeJsonField("sourceConnectionInfo", sourceConnectionInfo());
        jsonWriter.writeJsonField("targetConnectionInfo", targetConnectionInfo());
        jsonWriter.writeJsonField("azureApp", azureApp());
        jsonWriter.writeJsonField("backupFileShare", backupFileShare());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ValidateMigrationInputSqlServerSqlMISyncTaskInput from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ValidateMigrationInputSqlServerSqlMISyncTaskInput if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ValidateMigrationInputSqlServerSqlMISyncTaskInput.
     */
    public static ValidateMigrationInputSqlServerSqlMISyncTaskInput fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ValidateMigrationInputSqlServerSqlMISyncTaskInput deserializedValidateMigrationInputSqlServerSqlMISyncTaskInput
                = new ValidateMigrationInputSqlServerSqlMISyncTaskInput();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("selectedDatabases".equals(fieldName)) {
                    List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases
                        = reader.readArray(reader1 -> MigrateSqlServerSqlMIDatabaseInput.fromJson(reader1));
                    deserializedValidateMigrationInputSqlServerSqlMISyncTaskInput
                        .withSelectedDatabases(selectedDatabases);
                } else if ("storageResourceId".equals(fieldName)) {
                    deserializedValidateMigrationInputSqlServerSqlMISyncTaskInput
                        .withStorageResourceId(reader.getString());
                } else if ("sourceConnectionInfo".equals(fieldName)) {
                    deserializedValidateMigrationInputSqlServerSqlMISyncTaskInput
                        .withSourceConnectionInfo(SqlConnectionInfo.fromJson(reader));
                } else if ("targetConnectionInfo".equals(fieldName)) {
                    deserializedValidateMigrationInputSqlServerSqlMISyncTaskInput
                        .withTargetConnectionInfo(MiSqlConnectionInfo.fromJson(reader));
                } else if ("azureApp".equals(fieldName)) {
                    deserializedValidateMigrationInputSqlServerSqlMISyncTaskInput
                        .withAzureApp(AzureActiveDirectoryApp.fromJson(reader));
                } else if ("backupFileShare".equals(fieldName)) {
                    deserializedValidateMigrationInputSqlServerSqlMISyncTaskInput
                        .withBackupFileShare(FileShare.fromJson(reader));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedValidateMigrationInputSqlServerSqlMISyncTaskInput;
        });
    }
}
