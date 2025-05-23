// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationProtectionContainersClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ProtectionContainerInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.DiscoverProtectableItemRequest;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ProtectionContainer;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationProtectionContainers;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SwitchClusterProtectionInput;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.SwitchProtectionInput;

public final class ReplicationProtectionContainersImpl implements ReplicationProtectionContainers {
    private static final ClientLogger LOGGER = new ClientLogger(ReplicationProtectionContainersImpl.class);

    private final ReplicationProtectionContainersClient innerClient;

    private final com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager;

    public ReplicationProtectionContainersImpl(ReplicationProtectionContainersClient innerClient,
        com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ProtectionContainer> listByReplicationFabrics(String resourceGroupName, String resourceName,
        String fabricName) {
        PagedIterable<ProtectionContainerInner> inner
            = this.serviceClient().listByReplicationFabrics(resourceGroupName, resourceName, fabricName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ProtectionContainerImpl(inner1, this.manager()));
    }

    public PagedIterable<ProtectionContainer> listByReplicationFabrics(String resourceGroupName, String resourceName,
        String fabricName, Context context) {
        PagedIterable<ProtectionContainerInner> inner
            = this.serviceClient().listByReplicationFabrics(resourceGroupName, resourceName, fabricName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ProtectionContainerImpl(inner1, this.manager()));
    }

    public Response<ProtectionContainer> getWithResponse(String resourceGroupName, String resourceName,
        String fabricName, String protectionContainerName, Context context) {
        Response<ProtectionContainerInner> inner = this.serviceClient()
            .getWithResponse(resourceGroupName, resourceName, fabricName, protectionContainerName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ProtectionContainerImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ProtectionContainer get(String resourceGroupName, String resourceName, String fabricName,
        String protectionContainerName) {
        ProtectionContainerInner inner
            = this.serviceClient().get(resourceGroupName, resourceName, fabricName, protectionContainerName);
        if (inner != null) {
            return new ProtectionContainerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ProtectionContainer discoverProtectableItem(String resourceGroupName, String resourceName, String fabricName,
        String protectionContainerName, DiscoverProtectableItemRequest discoverProtectableItemRequest) {
        ProtectionContainerInner inner = this.serviceClient()
            .discoverProtectableItem(resourceGroupName, resourceName, fabricName, protectionContainerName,
                discoverProtectableItemRequest);
        if (inner != null) {
            return new ProtectionContainerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ProtectionContainer discoverProtectableItem(String resourceGroupName, String resourceName, String fabricName,
        String protectionContainerName, DiscoverProtectableItemRequest discoverProtectableItemRequest,
        Context context) {
        ProtectionContainerInner inner = this.serviceClient()
            .discoverProtectableItem(resourceGroupName, resourceName, fabricName, protectionContainerName,
                discoverProtectableItemRequest, context);
        if (inner != null) {
            return new ProtectionContainerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String resourceName, String fabricName,
        String protectionContainerName) {
        this.serviceClient().delete(resourceGroupName, resourceName, fabricName, protectionContainerName);
    }

    public void delete(String resourceGroupName, String resourceName, String fabricName, String protectionContainerName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, resourceName, fabricName, protectionContainerName, context);
    }

    public ProtectionContainer switchClusterProtection(String resourceGroupName, String resourceName, String fabricName,
        String protectionContainerName, SwitchClusterProtectionInput switchInput) {
        ProtectionContainerInner inner = this.serviceClient()
            .switchClusterProtection(resourceGroupName, resourceName, fabricName, protectionContainerName, switchInput);
        if (inner != null) {
            return new ProtectionContainerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ProtectionContainer switchClusterProtection(String resourceGroupName, String resourceName, String fabricName,
        String protectionContainerName, SwitchClusterProtectionInput switchInput, Context context) {
        ProtectionContainerInner inner = this.serviceClient()
            .switchClusterProtection(resourceGroupName, resourceName, fabricName, protectionContainerName, switchInput,
                context);
        if (inner != null) {
            return new ProtectionContainerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ProtectionContainer switchProtection(String resourceGroupName, String resourceName, String fabricName,
        String protectionContainerName, SwitchProtectionInput switchInput) {
        ProtectionContainerInner inner = this.serviceClient()
            .switchProtection(resourceGroupName, resourceName, fabricName, protectionContainerName, switchInput);
        if (inner != null) {
            return new ProtectionContainerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ProtectionContainer switchProtection(String resourceGroupName, String resourceName, String fabricName,
        String protectionContainerName, SwitchProtectionInput switchInput, Context context) {
        ProtectionContainerInner inner = this.serviceClient()
            .switchProtection(resourceGroupName, resourceName, fabricName, protectionContainerName, switchInput,
                context);
        if (inner != null) {
            return new ProtectionContainerImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ProtectionContainer> list(String resourceGroupName, String resourceName) {
        PagedIterable<ProtectionContainerInner> inner = this.serviceClient().list(resourceGroupName, resourceName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ProtectionContainerImpl(inner1, this.manager()));
    }

    public PagedIterable<ProtectionContainer> list(String resourceGroupName, String resourceName, Context context) {
        PagedIterable<ProtectionContainerInner> inner
            = this.serviceClient().list(resourceGroupName, resourceName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ProtectionContainerImpl(inner1, this.manager()));
    }

    public ProtectionContainer getById(String id) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = ResourceManagerUtils.getValueFromIdByName(id, "vaults");
        if (resourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String fabricName = ResourceManagerUtils.getValueFromIdByName(id, "replicationFabrics");
        if (fabricName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'replicationFabrics'.", id)));
        }
        String protectionContainerName
            = ResourceManagerUtils.getValueFromIdByName(id, "replicationProtectionContainers");
        if (protectionContainerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String.format(
                "The resource ID '%s' is not valid. Missing path segment 'replicationProtectionContainers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, resourceName, fabricName, protectionContainerName, Context.NONE)
            .getValue();
    }

    public Response<ProtectionContainer> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = ResourceManagerUtils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String resourceName = ResourceManagerUtils.getValueFromIdByName(id, "vaults");
        if (resourceName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String fabricName = ResourceManagerUtils.getValueFromIdByName(id, "replicationFabrics");
        if (fabricName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'replicationFabrics'.", id)));
        }
        String protectionContainerName
            = ResourceManagerUtils.getValueFromIdByName(id, "replicationProtectionContainers");
        if (protectionContainerName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(String.format(
                "The resource ID '%s' is not valid. Missing path segment 'replicationProtectionContainers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, resourceName, fabricName, protectionContainerName, context);
    }

    private ReplicationProtectionContainersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager manager() {
        return this.serviceManager;
    }

    public ProtectionContainerImpl define(String name) {
        return new ProtectionContainerImpl(name, this.manager());
    }
}
