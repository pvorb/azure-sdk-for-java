// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.fluidrelay.models;

import com.azure.resourcemanager.fluidrelay.fluent.models.OperationResultInner;

/**
 * An immutable client-side representation of OperationResult.
 */
public interface OperationResult {
    /**
     * Gets the name property: Operation name: {provider}/{resource}/{operation}.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the display property: The object that represents the operation.
     * 
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * Gets the isDataAction property: Indicates whether the operation is a data action.
     * 
     * @return the isDataAction value.
     */
    Boolean isDataAction();

    /**
     * Gets the inner com.azure.resourcemanager.fluidrelay.fluent.models.OperationResultInner object.
     * 
     * @return the inner object.
     */
    OperationResultInner innerModel();
}
