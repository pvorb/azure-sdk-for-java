// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.AzureToAzureNetworkMappingSettings;
import org.junit.jupiter.api.Assertions;

public final class AzureToAzureNetworkMappingSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureToAzureNetworkMappingSettings model = BinaryData.fromString(
            "{\"instanceType\":\"AzureToAzure\",\"primaryFabricLocation\":\"mgok\",\"recoveryFabricLocation\":\"gjqafkmkrokzr\"}")
            .toObject(AzureToAzureNetworkMappingSettings.class);
        Assertions.assertEquals("mgok", model.primaryFabricLocation());
        Assertions.assertEquals("gjqafkmkrokzr", model.recoveryFabricLocation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureToAzureNetworkMappingSettings model
            = new AzureToAzureNetworkMappingSettings().withPrimaryFabricLocation("mgok")
                .withRecoveryFabricLocation("gjqafkmkrokzr");
        model = BinaryData.fromObject(model).toObject(AzureToAzureNetworkMappingSettings.class);
        Assertions.assertEquals("mgok", model.primaryFabricLocation());
        Assertions.assertEquals("gjqafkmkrokzr", model.recoveryFabricLocation());
    }
}
