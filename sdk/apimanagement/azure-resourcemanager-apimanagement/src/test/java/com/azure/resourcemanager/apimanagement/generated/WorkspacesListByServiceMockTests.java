// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.apimanagement.ApiManagementManager;
import com.azure.resourcemanager.apimanagement.models.WorkspaceContract;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class WorkspacesListByServiceMockTests {
    @Test
    public void testListByService() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"displayName\":\"fvyriawfwwsgdkbd\",\"description\":\"s\"},\"id\":\"pfwmfcorto\",\"name\":\"sthjyyirybuqmkm\",\"type\":\"dok\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ApiManagementManager manager = ApiManagementManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<WorkspaceContract> response = manager.workspaces()
            .listByService("chphovu", "r", "czwcxlnc", 1471596884, 1106011415, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("fvyriawfwwsgdkbd", response.iterator().next().displayName());
        Assertions.assertEquals("s", response.iterator().next().description());
    }
}
