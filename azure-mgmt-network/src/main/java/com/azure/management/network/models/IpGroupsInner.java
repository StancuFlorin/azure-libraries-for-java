// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.management.network.ErrorException;
import com.azure.management.network.TagsObject;
import com.azure.management.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.management.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.management.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * IpGroups.
 */
public final class IpGroupsInner implements InnerSupportsGet<IpGroupInner>, InnerSupportsListing<IpGroupInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private IpGroupsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of IpGroupsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public IpGroupsInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(IpGroupsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientIpGroups to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientIpGroups")
    private interface IpGroupsService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ipGroups/{ipGroupsName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<IpGroupInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("ipGroupsName") String ipGroupsName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("$expand") String expand, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ipGroups/{ipGroupsName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("ipGroupsName") String ipGroupsName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") IpGroupInner parameters, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ipGroups/{ipGroupsName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<IpGroupInner>> updateGroups(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("ipGroupsName") String ipGroupsName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") TagsObject parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ipGroups/{ipGroupsName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("ipGroupsName") String ipGroupsName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ipGroups")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<IpGroupListResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/ipGroups")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<IpGroupListResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ipGroups/{ipGroupsName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<IpGroupInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("ipGroupsName") String ipGroupsName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json") IpGroupInner parameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/ipGroups/{ipGroupsName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("ipGroupsName") String ipGroupsName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<IpGroupListResultInner>> listByResourceGroupNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<IpGroupListResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Gets the specified ipGroups.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<IpGroupInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String ipGroupsName, String expand) {
        final String apiVersion = "2019-11-01";
        return service.getByResourceGroup(this.client.getHost(), resourceGroupName, ipGroupsName, this.client.getSubscriptionId(), expand, apiVersion);
    }

    /**
     * Gets the specified ipGroups.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpGroupInner> getByResourceGroupAsync(String resourceGroupName, String ipGroupsName, String expand) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, ipGroupsName, expand)
            .flatMap((SimpleResponse<IpGroupInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified ipGroups.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpGroupInner> getByResourceGroupAsync(String resourceGroupName, String ipGroupsName) {
        final String expand = null;
        final String apiVersion = "2019-11-01";
        return getByResourceGroupWithResponseAsync(resourceGroupName, ipGroupsName, expand)
            .flatMap((SimpleResponse<IpGroupInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gets the specified ipGroups.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @param expand 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IpGroupInner getByResourceGroup(String resourceGroupName, String ipGroupsName, String expand) {
        return getByResourceGroupAsync(resourceGroupName, ipGroupsName, expand).block();
    }

    /**
     * Gets the specified ipGroups.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IpGroupInner getByResourceGroup(String resourceGroupName, String ipGroupsName) {
        final String expand = null;
        final String apiVersion = "2019-11-01";
        return getByResourceGroupAsync(resourceGroupName, ipGroupsName, expand).block();
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @param parameters The IpGroups resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String ipGroupsName, IpGroupInner parameters) {
        final String apiVersion = "2019-11-01";
        return service.createOrUpdate(this.client.getHost(), resourceGroupName, ipGroupsName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @param parameters The IpGroups resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpGroupInner> createOrUpdateAsync(String resourceGroupName, String ipGroupsName, IpGroupInner parameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, ipGroupsName, parameters);
        return client.<IpGroupInner, IpGroupInner>getLroResultAsync(response, client.getHttpPipeline(), IpGroupInner.class, IpGroupInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @param parameters The IpGroups resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IpGroupInner createOrUpdate(String resourceGroupName, String ipGroupsName, IpGroupInner parameters) {
        return createOrUpdateAsync(resourceGroupName, ipGroupsName, parameters).block();
    }

    /**
     * Updates tags of an IpGroups resource.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<IpGroupInner>> updateGroupsWithResponseAsync(String resourceGroupName, String ipGroupsName, Map<String, String> tags) {
        final String apiVersion = "2019-11-01";
        TagsObject parameters = new TagsObject();
        parameters.withTags(tags);
        return service.updateGroups(this.client.getHost(), resourceGroupName, ipGroupsName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Updates tags of an IpGroups resource.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpGroupInner> updateGroupsAsync(String resourceGroupName, String ipGroupsName, Map<String, String> tags) {
        return updateGroupsWithResponseAsync(resourceGroupName, ipGroupsName, tags)
            .flatMap((SimpleResponse<IpGroupInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates tags of an IpGroups resource.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IpGroupInner updateGroups(String resourceGroupName, String ipGroupsName, Map<String, String> tags) {
        return updateGroupsAsync(resourceGroupName, ipGroupsName, tags).block();
    }

    /**
     * Deletes the specified ipGroups.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String ipGroupsName) {
        final String apiVersion = "2019-11-01";
        return service.delete(this.client.getHost(), resourceGroupName, ipGroupsName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified ipGroups.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String ipGroupsName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, ipGroupsName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes the specified ipGroups.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String ipGroupsName) {
        deleteAsync(resourceGroupName, ipGroupsName).block();
    }

    /**
     * Gets all IpGroups in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<IpGroupInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2019-11-01";
        return service.listByResourceGroup(this.client.getHost(), resourceGroupName, this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all IpGroups in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<IpGroupInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listByResourceGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all IpGroups in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<IpGroupInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Gets all IpGroups in a subscription.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<IpGroupInner>> listSinglePageAsync() {
        final String apiVersion = "2019-11-01";
        return service.list(this.client.getHost(), this.client.getSubscriptionId(), apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Gets all IpGroups in a subscription.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<IpGroupInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Gets all IpGroups in a subscription.
     * 
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<IpGroupInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @param parameters The IpGroups resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<IpGroupInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String ipGroupsName, IpGroupInner parameters) {
        final String apiVersion = "2019-11-01";
        return service.beginCreateOrUpdate(this.client.getHost(), resourceGroupName, ipGroupsName, this.client.getSubscriptionId(), parameters, apiVersion);
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @param parameters The IpGroups resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<IpGroupInner> beginCreateOrUpdateAsync(String resourceGroupName, String ipGroupsName, IpGroupInner parameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, ipGroupsName, parameters)
            .flatMap((SimpleResponse<IpGroupInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates or updates an ipGroups in a specified resource group.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @param parameters The IpGroups resource information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public IpGroupInner beginCreateOrUpdate(String resourceGroupName, String ipGroupsName, IpGroupInner parameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, ipGroupsName, parameters).block();
    }

    /**
     * Deletes the specified ipGroups.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String ipGroupsName) {
        final String apiVersion = "2019-11-01";
        return service.beginDelete(this.client.getHost(), resourceGroupName, ipGroupsName, this.client.getSubscriptionId(), apiVersion);
    }

    /**
     * Deletes the specified ipGroups.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String ipGroupsName) {
        return beginDeleteWithResponseAsync(resourceGroupName, ipGroupsName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes the specified ipGroups.
     * 
     * @param resourceGroupName 
     * @param ipGroupsName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String ipGroupsName) {
        beginDeleteAsync(resourceGroupName, ipGroupsName).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<IpGroupInner>> listByResourceGroupNextSinglePageAsync(String nextLink) {
        return service.listByResourceGroupNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<IpGroupInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}