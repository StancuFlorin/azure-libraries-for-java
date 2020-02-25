// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The P2SVpnConnectionHealth model.
 */
@Fluent
public final class P2SVpnConnectionHealthInner {
    /*
     * Returned sas url of the blob to which the p2s vpn connection detailed
     * health will be written.
     */
    @JsonProperty(value = "sasUrl")
    private String sasUrl;

    /**
     * Get the sasUrl property: Returned sas url of the blob to which the p2s
     * vpn connection detailed health will be written.
     * 
     * @return the sasUrl value.
     */
    public String sasUrl() {
        return this.sasUrl;
    }

    /**
     * Set the sasUrl property: Returned sas url of the blob to which the p2s
     * vpn connection detailed health will be written.
     * 
     * @param sasUrl the sasUrl value to set.
     * @return the P2SVpnConnectionHealthInner object itself.
     */
    public P2SVpnConnectionHealthInner withSasUrl(String sasUrl) {
        this.sasUrl = sasUrl;
        return this;
    }
}