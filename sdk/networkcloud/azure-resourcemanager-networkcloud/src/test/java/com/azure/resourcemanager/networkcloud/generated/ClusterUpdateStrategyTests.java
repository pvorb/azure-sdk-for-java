// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.ClusterUpdateStrategy;
import com.azure.resourcemanager.networkcloud.models.ClusterUpdateStrategyType;
import com.azure.resourcemanager.networkcloud.models.ValidationThresholdType;
import org.junit.jupiter.api.Assertions;

public final class ClusterUpdateStrategyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterUpdateStrategy model = BinaryData.fromString(
            "{\"maxUnavailable\":2482302250486318586,\"strategyType\":\"Rack\",\"thresholdType\":\"PercentSuccess\",\"thresholdValue\":6369380004296885865,\"waitTimeMinutes\":6903848945185645363}")
            .toObject(ClusterUpdateStrategy.class);
        Assertions.assertEquals(2482302250486318586L, model.maxUnavailable());
        Assertions.assertEquals(ClusterUpdateStrategyType.RACK, model.strategyType());
        Assertions.assertEquals(ValidationThresholdType.PERCENT_SUCCESS, model.thresholdType());
        Assertions.assertEquals(6369380004296885865L, model.thresholdValue());
        Assertions.assertEquals(6903848945185645363L, model.waitTimeMinutes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterUpdateStrategy model = new ClusterUpdateStrategy().withMaxUnavailable(2482302250486318586L)
            .withStrategyType(ClusterUpdateStrategyType.RACK)
            .withThresholdType(ValidationThresholdType.PERCENT_SUCCESS)
            .withThresholdValue(6369380004296885865L)
            .withWaitTimeMinutes(6903848945185645363L);
        model = BinaryData.fromObject(model).toObject(ClusterUpdateStrategy.class);
        Assertions.assertEquals(2482302250486318586L, model.maxUnavailable());
        Assertions.assertEquals(ClusterUpdateStrategyType.RACK, model.strategyType());
        Assertions.assertEquals(ValidationThresholdType.PERCENT_SUCCESS, model.thresholdType());
        Assertions.assertEquals(6369380004296885865L, model.thresholdValue());
        Assertions.assertEquals(6903848945185645363L, model.waitTimeMinutes());
    }
}
