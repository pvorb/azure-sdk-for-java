// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for ProductApi ListByProduct.
 */
public final class ProductApiListByProductSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementListProductApis.json
     */
    /**
     * Sample code: ApiManagementListProductApis.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementListProductApis(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.productApis()
            .listByProduct("rg1", "apimService1", "5768181ea40f7eb6c49f6ac7", null, null, null,
                com.azure.core.util.Context.NONE);
    }
}
