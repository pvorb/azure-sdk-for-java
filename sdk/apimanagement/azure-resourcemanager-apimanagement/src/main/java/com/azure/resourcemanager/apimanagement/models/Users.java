// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Users.
 */
public interface Users {
    /**
     * Lists a collection of registered users in the specified service instance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Users list representation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<UserContract> listByService(String resourceGroupName, String serviceName);

    /**
     * Lists a collection of registered users in the specified service instance.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param filter | Field | Usage | Supported operators | Supported functions
     * |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| name | filter | ge, le, eq, ne,
     * gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;| firstName | filter | ge, le, eq, ne, gt, lt |
     * substringof, contains, startswith, endswith |&lt;/br&gt;| lastName | filter | ge, le, eq, ne, gt, lt |
     * substringof, contains, startswith, endswith |&lt;/br&gt;| email | filter | ge, le, eq, ne, gt, lt | substringof,
     * contains, startswith, endswith |&lt;/br&gt;| state | filter | eq | |&lt;/br&gt;| registrationDate | filter | ge,
     * le, eq, ne, gt, lt | |&lt;/br&gt;| note | filter | ge, le, eq, ne, gt, lt | substringof, contains, startswith,
     * endswith |&lt;/br&gt;| groups | expand | | |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param expandGroups Detailed Group in response.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged Users list representation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<UserContract> listByService(String resourceGroupName, String serviceName, String filter, Integer top,
        Integer skip, Boolean expandGroups, Context context);

    /**
     * Gets the entity state (Etag) version of the user specified by its identifier.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the entity state (Etag) version of the user specified by its identifier.
     */
    UsersGetEntityTagResponse getEntityTagWithResponse(String resourceGroupName, String serviceName, String userId,
        Context context);

    /**
     * Gets the entity state (Etag) version of the user specified by its identifier.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getEntityTag(String resourceGroupName, String serviceName, String userId);

    /**
     * Gets the details of the user specified by its identifier.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the user specified by its identifier.
     */
    Response<UserContract> getWithResponse(String resourceGroupName, String serviceName, String userId,
        Context context);

    /**
     * Gets the details of the user specified by its identifier.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the user specified by its identifier.
     */
    UserContract get(String resourceGroupName, String serviceName, String userId);

    /**
     * Deletes specific user.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     * request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String userId, String ifMatch);

    /**
     * Deletes specific user.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     * request or it should be * for unconditional update.
     * @param deleteSubscriptions Whether to delete user's subscription or not.
     * @param notify Send an Account Closed Email notification to the User.
     * @param appType Determines the type of application which send the create user request. Default is legacy publisher
     * portal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, String userId, String ifMatch,
        Boolean deleteSubscriptions, Boolean notify, AppType appType, Context context);

    /**
     * Retrieves a redirection URL containing an authentication token for signing a given user into the developer
     * portal.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return generate SSO Url operations response details along with {@link Response}.
     */
    Response<GenerateSsoUrlResult> generateSsoUrlWithResponse(String resourceGroupName, String serviceName,
        String userId, Context context);

    /**
     * Retrieves a redirection URL containing an authentication token for signing a given user into the developer
     * portal.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return generate SSO Url operations response details.
     */
    GenerateSsoUrlResult generateSsoUrl(String resourceGroupName, String serviceName, String userId);

    /**
     * Gets the Shared Access Authorization Token for the User.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param parameters Create Authorization Token parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Shared Access Authorization Token for the User along with {@link Response}.
     */
    Response<UserTokenResult> getSharedAccessTokenWithResponse(String resourceGroupName, String serviceName,
        String userId, UserTokenParameters parameters, Context context);

    /**
     * Gets the Shared Access Authorization Token for the User.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param userId User identifier. Must be unique in the current API Management service instance.
     * @param parameters Create Authorization Token parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Shared Access Authorization Token for the User.
     */
    UserTokenResult getSharedAccessToken(String resourceGroupName, String serviceName, String userId,
        UserTokenParameters parameters);

    /**
     * Gets the details of the user specified by its identifier.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the user specified by its identifier.
     */
    UserContract getById(String id);

    /**
     * Gets the details of the user specified by its identifier.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the user specified by its identifier.
     */
    Response<UserContract> getByIdWithResponse(String id, Context context);

    /**
     * Deletes specific user.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes specific user.
     * 
     * @param id the resource ID.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     * request or it should be * for unconditional update.
     * @param deleteSubscriptions Whether to delete user's subscription or not.
     * @param notify Send an Account Closed Email notification to the User.
     * @param appType Determines the type of application which send the create user request. Default is legacy publisher
     * portal.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, String ifMatch, Boolean deleteSubscriptions, Boolean notify, AppType appType,
        Context context);

    /**
     * Begins definition for a new UserContract resource.
     * 
     * @param name resource name.
     * @return the first stage of the new UserContract definition.
     */
    UserContract.DefinitionStages.Blank define(String name);
}
