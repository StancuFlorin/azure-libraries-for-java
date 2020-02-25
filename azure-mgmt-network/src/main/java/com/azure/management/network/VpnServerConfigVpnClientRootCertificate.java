// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The VpnServerConfigVpnClientRootCertificate model.
 */
@Fluent
public final class VpnServerConfigVpnClientRootCertificate {
    /*
     * The certificate name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The certificate public data.
     */
    @JsonProperty(value = "publicCertData")
    private String publicCertData;

    /**
     * Get the name property: The certificate name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The certificate name.
     * 
     * @param name the name value to set.
     * @return the VpnServerConfigVpnClientRootCertificate object itself.
     */
    public VpnServerConfigVpnClientRootCertificate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the publicCertData property: The certificate public data.
     * 
     * @return the publicCertData value.
     */
    public String publicCertData() {
        return this.publicCertData;
    }

    /**
     * Set the publicCertData property: The certificate public data.
     * 
     * @param publicCertData the publicCertData value to set.
     * @return the VpnServerConfigVpnClientRootCertificate object itself.
     */
    public VpnServerConfigVpnClientRootCertificate withPublicCertData(String publicCertData) {
        this.publicCertData = publicCertData;
        return this;
    }
}