// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.logic.models.KeyVaultReference;
import org.junit.jupiter.api.Assertions;

public final class KeyVaultReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KeyVaultReference model
            = BinaryData.fromString("{\"id\":\"id\",\"name\":\"qfkuvscxkdmli\",\"type\":\"vibrxkpmloazuruo\"}")
                .toObject(KeyVaultReference.class);
        Assertions.assertEquals("id", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KeyVaultReference model = new KeyVaultReference().withId("id");
        model = BinaryData.fromObject(model).toObject(KeyVaultReference.class);
        Assertions.assertEquals("id", model.id());
    }
}
