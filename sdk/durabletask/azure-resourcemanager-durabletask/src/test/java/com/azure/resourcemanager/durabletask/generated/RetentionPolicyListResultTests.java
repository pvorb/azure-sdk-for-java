// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.durabletask.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.durabletask.implementation.models.RetentionPolicyListResult;
import com.azure.resourcemanager.durabletask.models.PurgeableOrchestrationState;
import org.junit.jupiter.api.Assertions;

public final class RetentionPolicyListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RetentionPolicyListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Canceled\",\"retentionPolicies\":[{\"retentionPeriodInDays\":1939362977,\"orchestrationState\":\"Canceled\"},{\"retentionPeriodInDays\":917498996,\"orchestrationState\":\"Terminated\"}]},\"id\":\"aoyfhrtxilnerkuj\",\"name\":\"s\",\"type\":\"l\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"retentionPolicies\":[{\"retentionPeriodInDays\":1398747720,\"orchestrationState\":\"Canceled\"},{\"retentionPeriodInDays\":1479576759,\"orchestrationState\":\"Canceled\"},{\"retentionPeriodInDays\":1113809263,\"orchestrationState\":\"Failed\"}]},\"id\":\"prbnwbxgjvtbv\",\"name\":\"ysszdnrujqguh\",\"type\":\"uouq\"}],\"nextLink\":\"rwzwbng\"}")
            .toObject(RetentionPolicyListResult.class);
        Assertions.assertEquals(1939362977,
            model.value().get(0).properties().retentionPolicies().get(0).retentionPeriodInDays());
        Assertions.assertEquals(PurgeableOrchestrationState.CANCELED,
            model.value().get(0).properties().retentionPolicies().get(0).orchestrationState());
        Assertions.assertEquals("rwzwbng", model.nextLink());
    }
}
