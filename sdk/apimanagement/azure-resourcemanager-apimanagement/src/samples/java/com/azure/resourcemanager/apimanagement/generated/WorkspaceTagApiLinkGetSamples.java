// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

/**
 * Samples for WorkspaceTagApiLink Get.
 */
public final class WorkspaceTagApiLinkGetSamples {
    /*
     * x-ms-original-file:
     * specification/apimanagement/resource-manager/Microsoft.ApiManagement/stable/2024-05-01/examples/
     * ApiManagementGetWorkspaceTagApiLink.json
     */
    /**
     * Sample code: ApiManagementGetWorkspaceTagApiLink.
     * 
     * @param manager Entry point to ApiManagementManager.
     */
    public static void
        apiManagementGetWorkspaceTagApiLink(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.workspaceTagApiLinks()
            .getWithResponse("rg1", "apimService1", "wks1", "tag1", "link1", com.azure.core.util.Context.NONE);
    }
}
