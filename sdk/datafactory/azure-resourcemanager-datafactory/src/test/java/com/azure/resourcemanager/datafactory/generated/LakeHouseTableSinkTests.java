// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.LakeHouseTableSink;

public final class LakeHouseTableSinkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LakeHouseTableSink model = BinaryData.fromString(
            "{\"type\":\"LakeHouseTableSink\",\"tableActionOption\":\"dataulmzxhgwz\",\"partitionOption\":\"datastw\",\"partitionNameList\":\"datawehn\",\"writeBatchSize\":\"datassjbpnatpym\",\"writeBatchTimeout\":\"dataichzcajityjz\",\"sinkRetryCount\":\"dataryouujqyey\",\"sinkRetryWait\":\"dataivincni\",\"maxConcurrentConnections\":\"datawvhcgcmuasu\",\"disableMetricsCollection\":\"datahmilhzytdjcjunsd\",\"\":{\"mxgajyracelnlwg\":\"datarhmpokfxcbb\",\"ins\":\"dataeouhjetxupxe\"}}")
            .toObject(LakeHouseTableSink.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LakeHouseTableSink model = new LakeHouseTableSink().withWriteBatchSize("datassjbpnatpym")
            .withWriteBatchTimeout("dataichzcajityjz")
            .withSinkRetryCount("dataryouujqyey")
            .withSinkRetryWait("dataivincni")
            .withMaxConcurrentConnections("datawvhcgcmuasu")
            .withDisableMetricsCollection("datahmilhzytdjcjunsd")
            .withTableActionOption("dataulmzxhgwz")
            .withPartitionOption("datastw")
            .withPartitionNameList("datawehn");
        model = BinaryData.fromObject(model).toObject(LakeHouseTableSink.class);
    }
}
