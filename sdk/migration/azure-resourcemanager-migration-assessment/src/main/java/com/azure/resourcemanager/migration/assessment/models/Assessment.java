// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.migration.assessment.fluent.models.AssessmentInner;

/**
 * An immutable client-side representation of Assessment.
 */
public interface Assessment {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    MachineAssessmentProperties properties();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the inner com.azure.resourcemanager.migration.assessment.fluent.models.AssessmentInner object.
     * 
     * @return the inner object.
     */
    AssessmentInner innerModel();

    /**
     * The entirety of the Assessment definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The Assessment definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the Assessment definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the Assessment definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, projectName, groupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param projectName Assessment Project Name.
             * @param groupName Group ARM name.
             * @return the next definition stage.
             */
            WithCreate withExistingGroup(String resourceGroupName, String projectName, String groupName);
        }

        /**
         * The stage of the Assessment definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithProperties {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            Assessment create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Assessment create(Context context);
        }

        /**
         * The stage of the Assessment definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The resource-specific properties for this resource..
             * 
             * @param properties The resource-specific properties for this resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(MachineAssessmentProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    Assessment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Assessment refresh(Context context);

    /**
     * Get download URL for the assessment report.
     * 
     * Get the URL for downloading the assessment in a report format.
     * 
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the URL for downloading the assessment in a report format.
     */
    DownloadUrl downloadUrl(Object body);

    /**
     * Get download URL for the assessment report.
     * 
     * Get the URL for downloading the assessment in a report format.
     * 
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the URL for downloading the assessment in a report format.
     */
    DownloadUrl downloadUrl(Object body, Context context);
}
