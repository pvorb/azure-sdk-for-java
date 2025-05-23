// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.migration.assessment.MigrationAssessmentManager;
import com.azure.resourcemanager.migration.assessment.models.AssessmentProject;
import com.azure.resourcemanager.migration.assessment.models.ProjectProperties;
import com.azure.resourcemanager.migration.assessment.models.ProjectStatus;
import com.azure.resourcemanager.migration.assessment.models.ProvisioningState;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class AssessmentProjectsOperationsCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr
            = "{\"properties\":{\"createdTimestamp\":\"2021-12-08T22:47:10Z\",\"updatedTimestamp\":\"2021-05-04T10:08:41Z\",\"serviceEndpoint\":\"e\",\"assessmentSolutionId\":\"exkxbhx\",\"projectStatus\":\"Inactive\",\"customerWorkspaceId\":\"ulgm\",\"customerWorkspaceLocation\":\"jevdyznf\",\"publicNetworkAccess\":\"svkskmqoz\",\"privateEndpointConnections\":[{\"properties\":{\"groupIds\":[\"jrliiz\",\"ixlqfhefkwabsolr\",\"nqqlmgnl\",\"xsjxtelexhvuqboz\"],\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Creating\"},\"id\":\"ocarkuzlbcnndt\",\"name\":\"nx\",\"type\":\"wqy\"},{\"properties\":{\"groupIds\":[\"dyz\"],\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Creating\"},\"id\":\"exn\",\"name\":\"akckywym\",\"type\":\"gaabjkdtf\"},{\"properties\":{\"groupIds\":[\"ogzvk\",\"wrsiwdyjqurykc\"],\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Creating\"},\"id\":\"ekcsueh\",\"name\":\"gdda\",\"type\":\"bcbgydlqidywmhm\"},{\"properties\":{\"groupIds\":[\"ilkfbnrqqxv\"],\"privateEndpoint\":{},\"privateLinkServiceConnectionState\":{},\"provisioningState\":\"Deleting\"},\"id\":\"fnqt\",\"name\":\"jtoma\",\"type\":\"swbnfddepldwqjns\"}],\"customerStorageAccountArmId\":\"ygleexa\",\"provisioningState\":\"Succeeded\"},\"location\":\"whsbrcary\",\"tags\":{\"yvoaqajuvehzp\":\"j\",\"mpfu\":\"dmkrrb\",\"mpzkrvfyifkd\":\"ubefgybpmfbfunu\",\"tnkjjwgcwnphb\":\"chlzvfi\"},\"id\":\"gfyrtogmhmjpjsc\",\"name\":\"fp\",\"type\":\"qwtygevgwmseharx\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MigrationAssessmentManager manager = MigrationAssessmentManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        AssessmentProject response = manager.assessmentProjectsOperations()
            .define("bjqvls")
            .withRegion("sbzxl")
            .withExistingResourceGroup("vxisimjcea")
            .withTags(mapOf("zacn", "omeikjcl", "qbxyxoyfpuqqi", "wpfsuqtaaz", "wvpsoz", "ezxlhdjzqdca", "pnx",
                "iihjriybmrzo"))
            .withProperties(new ProjectProperties().withProvisioningState(ProvisioningState.ACCEPTED)
                .withAssessmentSolutionId("puby")
                .withProjectStatus(ProjectStatus.ACTIVE)
                .withCustomerWorkspaceId("k")
                .withCustomerWorkspaceLocation("eebgvopemtuoqu")
                .withPublicNetworkAccess("yegq")
                .withCustomerStorageAccountArmId("xuwwkp"))
            .create();

        Assertions.assertEquals("whsbrcary", response.location());
        Assertions.assertEquals("j", response.tags().get("yvoaqajuvehzp"));
        Assertions.assertEquals(ProvisioningState.SUCCEEDED, response.properties().provisioningState());
        Assertions.assertEquals("exkxbhx", response.properties().assessmentSolutionId());
        Assertions.assertEquals(ProjectStatus.INACTIVE, response.properties().projectStatus());
        Assertions.assertEquals("ulgm", response.properties().customerWorkspaceId());
        Assertions.assertEquals("jevdyznf", response.properties().customerWorkspaceLocation());
        Assertions.assertEquals("svkskmqoz", response.properties().publicNetworkAccess());
        Assertions.assertEquals("ygleexa", response.properties().customerStorageAccountArmId());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
