// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ConnectionMonitorTestConfiguration model.
 */
@Fluent
public final class ConnectionMonitorTestConfiguration {
    /*
     * The name of the connection monitor test configuration.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The frequency of test evaluation, in seconds.
     */
    @JsonProperty(value = "testFrequencySec")
    private Integer testFrequencySec;

    /*
     * The protocol to use in test evaluation.
     */
    @JsonProperty(value = "protocol", required = true)
    private ConnectionMonitorTestConfigurationProtocol protocol;

    /*
     * The preferred IP version to use in test evaluation. The connection
     * monitor may choose to use a different version depending on other
     * parameters.
     */
    @JsonProperty(value = "preferredIPVersion")
    private PreferredIPVersion preferredIPVersion;

    /*
     * Describes the HTTP configuration.
     */
    @JsonProperty(value = "httpConfiguration")
    private ConnectionMonitorHttpConfiguration httpConfiguration;

    /*
     * Describes the TCP configuration.
     */
    @JsonProperty(value = "tcpConfiguration")
    private ConnectionMonitorTcpConfiguration tcpConfiguration;

    /*
     * Describes the ICMP configuration.
     */
    @JsonProperty(value = "icmpConfiguration")
    private ConnectionMonitorIcmpConfiguration icmpConfiguration;

    /*
     * Describes the threshold for declaring a test successful.
     */
    @JsonProperty(value = "successThreshold")
    private ConnectionMonitorSuccessThreshold successThreshold;

    /**
     * Get the name property: The name of the connection monitor test
     * configuration.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the connection monitor test
     * configuration.
     * 
     * @param name the name value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the testFrequencySec property: The frequency of test evaluation, in
     * seconds.
     * 
     * @return the testFrequencySec value.
     */
    public Integer testFrequencySec() {
        return this.testFrequencySec;
    }

    /**
     * Set the testFrequencySec property: The frequency of test evaluation, in
     * seconds.
     * 
     * @param testFrequencySec the testFrequencySec value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withTestFrequencySec(Integer testFrequencySec) {
        this.testFrequencySec = testFrequencySec;
        return this;
    }

    /**
     * Get the protocol property: The protocol to use in test evaluation.
     * 
     * @return the protocol value.
     */
    public ConnectionMonitorTestConfigurationProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol to use in test evaluation.
     * 
     * @param protocol the protocol value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withProtocol(ConnectionMonitorTestConfigurationProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the preferredIPVersion property: The preferred IP version to use in
     * test evaluation. The connection monitor may choose to use a different
     * version depending on other parameters.
     * 
     * @return the preferredIPVersion value.
     */
    public PreferredIPVersion preferredIPVersion() {
        return this.preferredIPVersion;
    }

    /**
     * Set the preferredIPVersion property: The preferred IP version to use in
     * test evaluation. The connection monitor may choose to use a different
     * version depending on other parameters.
     * 
     * @param preferredIPVersion the preferredIPVersion value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withPreferredIPVersion(PreferredIPVersion preferredIPVersion) {
        this.preferredIPVersion = preferredIPVersion;
        return this;
    }

    /**
     * Get the httpConfiguration property: Describes the HTTP configuration.
     * 
     * @return the httpConfiguration value.
     */
    public ConnectionMonitorHttpConfiguration httpConfiguration() {
        return this.httpConfiguration;
    }

    /**
     * Set the httpConfiguration property: Describes the HTTP configuration.
     * 
     * @param httpConfiguration the httpConfiguration value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withHttpConfiguration(ConnectionMonitorHttpConfiguration httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
        return this;
    }

    /**
     * Get the tcpConfiguration property: Describes the TCP configuration.
     * 
     * @return the tcpConfiguration value.
     */
    public ConnectionMonitorTcpConfiguration tcpConfiguration() {
        return this.tcpConfiguration;
    }

    /**
     * Set the tcpConfiguration property: Describes the TCP configuration.
     * 
     * @param tcpConfiguration the tcpConfiguration value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withTcpConfiguration(ConnectionMonitorTcpConfiguration tcpConfiguration) {
        this.tcpConfiguration = tcpConfiguration;
        return this;
    }

    /**
     * Get the icmpConfiguration property: Describes the ICMP configuration.
     * 
     * @return the icmpConfiguration value.
     */
    public ConnectionMonitorIcmpConfiguration icmpConfiguration() {
        return this.icmpConfiguration;
    }

    /**
     * Set the icmpConfiguration property: Describes the ICMP configuration.
     * 
     * @param icmpConfiguration the icmpConfiguration value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withIcmpConfiguration(ConnectionMonitorIcmpConfiguration icmpConfiguration) {
        this.icmpConfiguration = icmpConfiguration;
        return this;
    }

    /**
     * Get the successThreshold property: Describes the threshold for declaring
     * a test successful.
     * 
     * @return the successThreshold value.
     */
    public ConnectionMonitorSuccessThreshold successThreshold() {
        return this.successThreshold;
    }

    /**
     * Set the successThreshold property: Describes the threshold for declaring
     * a test successful.
     * 
     * @param successThreshold the successThreshold value to set.
     * @return the ConnectionMonitorTestConfiguration object itself.
     */
    public ConnectionMonitorTestConfiguration withSuccessThreshold(ConnectionMonitorSuccessThreshold successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }
}