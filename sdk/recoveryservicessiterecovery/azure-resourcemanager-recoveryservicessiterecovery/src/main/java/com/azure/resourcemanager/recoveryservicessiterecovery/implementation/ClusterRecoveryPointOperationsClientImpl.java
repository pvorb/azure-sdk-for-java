// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ClusterRecoveryPointOperationsClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.ClusterRecoveryPointInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in ClusterRecoveryPointOperationsClient.
 */
public final class ClusterRecoveryPointOperationsClientImpl implements ClusterRecoveryPointOperationsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final ClusterRecoveryPointOperationsService service;

    /**
     * The service client containing this operation class.
     */
    private final SiteRecoveryManagementClientImpl client;

    /**
     * Initializes an instance of ClusterRecoveryPointOperationsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    ClusterRecoveryPointOperationsClientImpl(SiteRecoveryManagementClientImpl client) {
        this.service = RestProxy.create(ClusterRecoveryPointOperationsService.class, client.getHttpPipeline(),
            client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SiteRecoveryManagementClientClusterRecoveryPointOperations to be used
     * by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SiteRecoveryManageme")
    public interface ClusterRecoveryPointOperationsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{resourceName}/replicationFabrics/{fabricName}/replicationProtectionContainers/{protectionContainerName}/replicationProtectionClusters/{replicationProtectionClusterName}/recoveryPoints/{recoveryPointName}")
        @ExpectedResponses({ 200 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ClusterRecoveryPointInner>> get(@HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion, @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("resourceName") String resourceName, @PathParam("subscriptionId") String subscriptionId,
            @PathParam("fabricName") String fabricName,
            @PathParam("protectionContainerName") String protectionContainerName,
            @PathParam("replicationProtectionClusterName") String replicationProtectionClusterName,
            @PathParam("recoveryPointName") String recoveryPointName, @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets a recovery point.
     * 
     * Get the details of specified recovery point.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceName The name of the recovery services vault.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param replicationProtectionClusterName Replication protection cluster name.
     * @param recoveryPointName The recovery point name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of specified recovery point along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterRecoveryPointInner>> getWithResponseAsync(String resourceGroupName,
        String resourceName, String fabricName, String protectionContainerName, String replicationProtectionClusterName,
        String recoveryPointName) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (protectionContainerName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter protectionContainerName is required and cannot be null."));
        }
        if (replicationProtectionClusterName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter replicationProtectionClusterName is required and cannot be null."));
        }
        if (recoveryPointName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recoveryPointName is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getApiVersion(),
                resourceGroupName, resourceName, this.client.getSubscriptionId(), fabricName, protectionContainerName,
                replicationProtectionClusterName, recoveryPointName, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets a recovery point.
     * 
     * Get the details of specified recovery point.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceName The name of the recovery services vault.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param replicationProtectionClusterName Replication protection cluster name.
     * @param recoveryPointName The recovery point name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of specified recovery point along with {@link Response} on successful completion of
     * {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<ClusterRecoveryPointInner>> getWithResponseAsync(String resourceGroupName,
        String resourceName, String fabricName, String protectionContainerName, String replicationProtectionClusterName,
        String recoveryPointName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (resourceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (fabricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter fabricName is required and cannot be null."));
        }
        if (protectionContainerName == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter protectionContainerName is required and cannot be null."));
        }
        if (replicationProtectionClusterName == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter replicationProtectionClusterName is required and cannot be null."));
        }
        if (recoveryPointName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter recoveryPointName is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getApiVersion(), resourceGroupName, resourceName,
            this.client.getSubscriptionId(), fabricName, protectionContainerName, replicationProtectionClusterName,
            recoveryPointName, accept, context);
    }

    /**
     * Gets a recovery point.
     * 
     * Get the details of specified recovery point.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceName The name of the recovery services vault.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param replicationProtectionClusterName Replication protection cluster name.
     * @param recoveryPointName The recovery point name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of specified recovery point on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<ClusterRecoveryPointInner> getAsync(String resourceGroupName, String resourceName, String fabricName,
        String protectionContainerName, String replicationProtectionClusterName, String recoveryPointName) {
        return getWithResponseAsync(resourceGroupName, resourceName, fabricName, protectionContainerName,
            replicationProtectionClusterName, recoveryPointName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Gets a recovery point.
     * 
     * Get the details of specified recovery point.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceName The name of the recovery services vault.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param replicationProtectionClusterName Replication protection cluster name.
     * @param recoveryPointName The recovery point name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of specified recovery point along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ClusterRecoveryPointInner> getWithResponse(String resourceGroupName, String resourceName,
        String fabricName, String protectionContainerName, String replicationProtectionClusterName,
        String recoveryPointName, Context context) {
        return getWithResponseAsync(resourceGroupName, resourceName, fabricName, protectionContainerName,
            replicationProtectionClusterName, recoveryPointName, context).block();
    }

    /**
     * Gets a recovery point.
     * 
     * Get the details of specified recovery point.
     * 
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param resourceName The name of the recovery services vault.
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @param replicationProtectionClusterName Replication protection cluster name.
     * @param recoveryPointName The recovery point name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of specified recovery point.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ClusterRecoveryPointInner get(String resourceGroupName, String resourceName, String fabricName,
        String protectionContainerName, String replicationProtectionClusterName, String recoveryPointName) {
        return getWithResponse(resourceGroupName, resourceName, fabricName, protectionContainerName,
            replicationProtectionClusterName, recoveryPointName, Context.NONE).getValue();
    }
}
