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
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
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
 * VpnServerConfigurations.
 */
public final class VpnServerConfigurationsInner implements InnerSupportsGet<VpnServerConfigurationInner>, InnerSupportsListing<VpnServerConfigurationInner>, InnerSupportsDelete<Void> {
    /**
     * The proxy service used to perform REST calls.
     */
    private VpnServerConfigurationsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnServerConfigurationsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public VpnServerConfigurationsInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(VpnServerConfigurationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientVpnServerConfigurations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientVpnServerConfigurations")
    private interface VpnServerConfigurationsService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnServerConfigurations/{vpnServerConfigurationName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VpnServerConfigurationInner>> getByResourceGroup(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vpnServerConfigurationName") String vpnServerConfigurationName, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnServerConfigurations/{vpnServerConfigurationName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vpnServerConfigurationName") String vpnServerConfigurationName, @BodyParam("application/json") VpnServerConfigurationInner vpnServerConfigurationParameters, @QueryParam("api-version") String apiVersion);

        @Patch("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnServerConfigurations/{vpnServerConfigurationName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VpnServerConfigurationInner>> updateTags(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vpnServerConfigurationName") String vpnServerConfigurationName, @BodyParam("application/json") TagsObject vpnServerConfigurationParameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnServerConfigurations/{vpnServerConfigurationName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vpnServerConfigurationName") String vpnServerConfigurationName, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnServerConfigurations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ListVpnServerConfigurationsResultInner>> listByResourceGroup(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Network/vpnServerConfigurations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ListVpnServerConfigurationsResultInner>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnServerConfigurations/{vpnServerConfigurationName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VpnServerConfigurationInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vpnServerConfigurationName") String vpnServerConfigurationName, @BodyParam("application/json") VpnServerConfigurationInner vpnServerConfigurationParameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/vpnServerConfigurations/{vpnServerConfigurationName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("vpnServerConfigurationName") String vpnServerConfigurationName, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ListVpnServerConfigurationsResultInner>> listByResourceGroupNext(@PathParam(value = "nextLink", encoded = true) String nextLink);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<ListVpnServerConfigurationsResultInner>> listNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Retrieves the details of a VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VpnServerConfigurationInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String vpnServerConfigurationName) {
        final String apiVersion = "2019-11-01";
        return service.getByResourceGroup(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, vpnServerConfigurationName, apiVersion);
    }

    /**
     * Retrieves the details of a VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationInner> getByResourceGroupAsync(String resourceGroupName, String vpnServerConfigurationName) {
        return getByResourceGroupWithResponseAsync(resourceGroupName, vpnServerConfigurationName)
            .flatMap((SimpleResponse<VpnServerConfigurationInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Retrieves the details of a VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnServerConfigurationInner getByResourceGroup(String resourceGroupName, String vpnServerConfigurationName) {
        return getByResourceGroupAsync(resourceGroupName, vpnServerConfigurationName).block();
    }

    /**
     * Creates a VpnServerConfiguration resource if it doesn't exist else updates the existing VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @param vpnServerConfigurationParameters VpnServerConfiguration Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String vpnServerConfigurationName, VpnServerConfigurationInner vpnServerConfigurationParameters) {
        final String apiVersion = "2019-11-01";
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, vpnServerConfigurationName, vpnServerConfigurationParameters, apiVersion);
    }

    /**
     * Creates a VpnServerConfiguration resource if it doesn't exist else updates the existing VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @param vpnServerConfigurationParameters VpnServerConfiguration Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationInner> createOrUpdateAsync(String resourceGroupName, String vpnServerConfigurationName, VpnServerConfigurationInner vpnServerConfigurationParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, vpnServerConfigurationName, vpnServerConfigurationParameters);
        return client.<VpnServerConfigurationInner, VpnServerConfigurationInner>getLroResultAsync(response, client.getHttpPipeline(), VpnServerConfigurationInner.class, VpnServerConfigurationInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates a VpnServerConfiguration resource if it doesn't exist else updates the existing VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @param vpnServerConfigurationParameters VpnServerConfiguration Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnServerConfigurationInner createOrUpdate(String resourceGroupName, String vpnServerConfigurationName, VpnServerConfigurationInner vpnServerConfigurationParameters) {
        return createOrUpdateAsync(resourceGroupName, vpnServerConfigurationName, vpnServerConfigurationParameters).block();
    }

    /**
     * Updates VpnServerConfiguration tags.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VpnServerConfigurationInner>> updateTagsWithResponseAsync(String resourceGroupName, String vpnServerConfigurationName, Map<String, String> tags) {
        final String apiVersion = "2019-11-01";
        TagsObject vpnServerConfigurationParameters = new TagsObject();
        vpnServerConfigurationParameters.withTags(tags);
        return service.updateTags(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, vpnServerConfigurationName, vpnServerConfigurationParameters, apiVersion);
    }

    /**
     * Updates VpnServerConfiguration tags.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationInner> updateTagsAsync(String resourceGroupName, String vpnServerConfigurationName, Map<String, String> tags) {
        return updateTagsWithResponseAsync(resourceGroupName, vpnServerConfigurationName, tags)
            .flatMap((SimpleResponse<VpnServerConfigurationInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Updates VpnServerConfiguration tags.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @param tags Resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnServerConfigurationInner updateTags(String resourceGroupName, String vpnServerConfigurationName, Map<String, String> tags) {
        return updateTagsAsync(resourceGroupName, vpnServerConfigurationName, tags).block();
    }

    /**
     * Deletes a VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String vpnServerConfigurationName) {
        final String apiVersion = "2019-11-01";
        return service.delete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, vpnServerConfigurationName, apiVersion);
    }

    /**
     * Deletes a VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String vpnServerConfigurationName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, vpnServerConfigurationName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes a VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String vpnServerConfigurationName) {
        deleteAsync(resourceGroupName, vpnServerConfigurationName).block();
    }

    /**
     * Lists all the vpnServerConfigurations in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VpnServerConfigurationInner>> listByResourceGroupSinglePageAsync(String resourceGroupName) {
        final String apiVersion = "2019-11-01";
        return service.listByResourceGroup(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Lists all the vpnServerConfigurations in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VpnServerConfigurationInner> listByResourceGroupAsync(String resourceGroupName) {
        return new PagedFlux<>(
            () -> listByResourceGroupSinglePageAsync(resourceGroupName),
            nextLink -> listByResourceGroupNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all the vpnServerConfigurations in a resource group.
     * 
     * @param resourceGroupName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VpnServerConfigurationInner> listByResourceGroup(String resourceGroupName) {
        return new PagedIterable<>(listByResourceGroupAsync(resourceGroupName));
    }

    /**
     * Lists all the VpnServerConfigurations in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VpnServerConfigurationInner>> listSinglePageAsync() {
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
     * Lists all the VpnServerConfigurations in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<VpnServerConfigurationInner> listAsync() {
        return new PagedFlux<>(
            () -> listSinglePageAsync(),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all the VpnServerConfigurations in a subscription.
     * 
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<VpnServerConfigurationInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Creates a VpnServerConfiguration resource if it doesn't exist else updates the existing VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @param vpnServerConfigurationParameters VpnServerConfiguration Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VpnServerConfigurationInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String vpnServerConfigurationName, VpnServerConfigurationInner vpnServerConfigurationParameters) {
        final String apiVersion = "2019-11-01";
        return service.beginCreateOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, vpnServerConfigurationName, vpnServerConfigurationParameters, apiVersion);
    }

    /**
     * Creates a VpnServerConfiguration resource if it doesn't exist else updates the existing VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @param vpnServerConfigurationParameters VpnServerConfiguration Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationInner> beginCreateOrUpdateAsync(String resourceGroupName, String vpnServerConfigurationName, VpnServerConfigurationInner vpnServerConfigurationParameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, vpnServerConfigurationName, vpnServerConfigurationParameters)
            .flatMap((SimpleResponse<VpnServerConfigurationInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates a VpnServerConfiguration resource if it doesn't exist else updates the existing VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @param vpnServerConfigurationParameters VpnServerConfiguration Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnServerConfigurationInner beginCreateOrUpdate(String resourceGroupName, String vpnServerConfigurationName, VpnServerConfigurationInner vpnServerConfigurationParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, vpnServerConfigurationName, vpnServerConfigurationParameters).block();
    }

    /**
     * Deletes a VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String vpnServerConfigurationName) {
        final String apiVersion = "2019-11-01";
        return service.beginDelete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, vpnServerConfigurationName, apiVersion);
    }

    /**
     * Deletes a VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String vpnServerConfigurationName) {
        return beginDeleteWithResponseAsync(resourceGroupName, vpnServerConfigurationName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a VpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param vpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String vpnServerConfigurationName) {
        beginDeleteAsync(resourceGroupName, vpnServerConfigurationName).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VpnServerConfigurationInner>> listByResourceGroupNextSinglePageAsync(String nextLink) {
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
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<VpnServerConfigurationInner>> listNextSinglePageAsync(String nextLink) {
        return service.listNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}