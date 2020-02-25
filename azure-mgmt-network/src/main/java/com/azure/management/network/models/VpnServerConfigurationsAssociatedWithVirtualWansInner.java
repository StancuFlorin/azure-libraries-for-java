// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.management.CloudException;
import com.azure.core.util.polling.AsyncPollResponse;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * VpnServerConfigurationsAssociatedWithVirtualWans.
 */
public final class VpnServerConfigurationsAssociatedWithVirtualWansInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private VpnServerConfigurationsAssociatedWithVirtualWansService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of VpnServerConfigurationsAssociatedWithVirtualWansInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public VpnServerConfigurationsAssociatedWithVirtualWansInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(VpnServerConfigurationsAssociatedWithVirtualWansService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientVpnServerConfigurationsAssociatedWithVirtualWans
     * to be used by the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientVpnServerConfigurationsAssociatedWithVirtualWans")
    private interface VpnServerConfigurationsAssociatedWithVirtualWansService {
        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans/{virtualWANName}/vpnServerConfigurations")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> list(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualWANName") String virtualWANName, @QueryParam("api-version") String apiVersion);

        @Post("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans/{virtualWANName}/vpnServerConfigurations")
        @ExpectedResponses({200, 202})
        @UnexpectedResponseExceptionType(CloudException.class)
        Mono<SimpleResponse<VpnServerConfigurationsResponseInner>> beginList(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualWANName") String virtualWANName, @QueryParam("api-version") String apiVersion);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     * 
     * @param resourceGroupName 
     * @param virtualWANName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> listWithResponseAsync(String resourceGroupName, String virtualWANName) {
        final String apiVersion = "2019-11-01";
        return service.list(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualWANName, apiVersion);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     * 
     * @param resourceGroupName 
     * @param virtualWANName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationsResponseInner> listAsync(String resourceGroupName, String virtualWANName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = listWithResponseAsync(resourceGroupName, virtualWANName);
        return client.<VpnServerConfigurationsResponseInner, VpnServerConfigurationsResponseInner>getLroResultAsync(response, client.getHttpPipeline(), VpnServerConfigurationsResponseInner.class, VpnServerConfigurationsResponseInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     * 
     * @param resourceGroupName 
     * @param virtualWANName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnServerConfigurationsResponseInner list(String resourceGroupName, String virtualWANName) {
        return listAsync(resourceGroupName, virtualWANName).block();
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     * 
     * @param resourceGroupName 
     * @param virtualWANName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<VpnServerConfigurationsResponseInner>> beginListWithResponseAsync(String resourceGroupName, String virtualWANName) {
        final String apiVersion = "2019-11-01";
        return service.beginList(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualWANName, apiVersion);
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     * 
     * @param resourceGroupName 
     * @param virtualWANName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<VpnServerConfigurationsResponseInner> beginListAsync(String resourceGroupName, String virtualWANName) {
        return beginListWithResponseAsync(resourceGroupName, virtualWANName)
            .flatMap((SimpleResponse<VpnServerConfigurationsResponseInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Gives the list of VpnServerConfigurations associated with Virtual Wan in a resource group.
     * 
     * @param resourceGroupName 
     * @param virtualWANName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public VpnServerConfigurationsResponseInner beginList(String resourceGroupName, String virtualWANName) {
        return beginListAsync(resourceGroupName, virtualWANName).block();
    }
}