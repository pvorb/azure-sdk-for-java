// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.AuthorizationProviderContractInner;
import com.azure.resourcemanager.apimanagement.models.AuthorizationProviderContract;
import com.azure.resourcemanager.apimanagement.models.AuthorizationProviderOAuth2Settings;

public final class AuthorizationProviderContractImpl implements AuthorizationProviderContract,
    AuthorizationProviderContract.Definition, AuthorizationProviderContract.Update {
    private AuthorizationProviderContractInner innerObject;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String identityProvider() {
        return this.innerModel().identityProvider();
    }

    public AuthorizationProviderOAuth2Settings oauth2() {
        return this.innerModel().oauth2();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AuthorizationProviderContractInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    private String authorizationProviderId;

    private String createIfMatch;

    private String updateIfMatch;

    public AuthorizationProviderContractImpl withExistingService(String resourceGroupName, String serviceName) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        return this;
    }

    public AuthorizationProviderContract create() {
        this.innerObject = serviceManager.serviceClient()
            .getAuthorizationProviders()
            .createOrUpdateWithResponse(resourceGroupName, serviceName, authorizationProviderId, this.innerModel(),
                createIfMatch, Context.NONE)
            .getValue();
        return this;
    }

    public AuthorizationProviderContract create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAuthorizationProviders()
            .createOrUpdateWithResponse(resourceGroupName, serviceName, authorizationProviderId, this.innerModel(),
                createIfMatch, context)
            .getValue();
        return this;
    }

    AuthorizationProviderContractImpl(String name,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = new AuthorizationProviderContractInner();
        this.serviceManager = serviceManager;
        this.authorizationProviderId = name;
        this.createIfMatch = null;
    }

    public AuthorizationProviderContractImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public AuthorizationProviderContract apply() {
        this.innerObject = serviceManager.serviceClient()
            .getAuthorizationProviders()
            .createOrUpdateWithResponse(resourceGroupName, serviceName, authorizationProviderId, this.innerModel(),
                updateIfMatch, Context.NONE)
            .getValue();
        return this;
    }

    public AuthorizationProviderContract apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAuthorizationProviders()
            .createOrUpdateWithResponse(resourceGroupName, serviceName, authorizationProviderId, this.innerModel(),
                updateIfMatch, context)
            .getValue();
        return this;
    }

    AuthorizationProviderContractImpl(AuthorizationProviderContractInner innerObject,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "service");
        this.authorizationProviderId
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "authorizationProviders");
    }

    public AuthorizationProviderContract refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getAuthorizationProviders()
            .getWithResponse(resourceGroupName, serviceName, authorizationProviderId, Context.NONE)
            .getValue();
        return this;
    }

    public AuthorizationProviderContract refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getAuthorizationProviders()
            .getWithResponse(resourceGroupName, serviceName, authorizationProviderId, context)
            .getValue();
        return this;
    }

    public AuthorizationProviderContractImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public AuthorizationProviderContractImpl withIdentityProvider(String identityProvider) {
        this.innerModel().withIdentityProvider(identityProvider);
        return this;
    }

    public AuthorizationProviderContractImpl withOauth2(AuthorizationProviderOAuth2Settings oauth2) {
        this.innerModel().withOauth2(oauth2);
        return this;
    }

    public AuthorizationProviderContractImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
