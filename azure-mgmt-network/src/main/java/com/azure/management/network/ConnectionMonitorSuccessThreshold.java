// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ConnectionMonitorSuccessThreshold model.
 */
@Fluent
public final class ConnectionMonitorSuccessThreshold {
    /*
     * The maximum percentage of failed checks permitted for a test to evaluate
     * as successful.
     */
    @JsonProperty(value = "checksFailedPercent")
    private Integer checksFailedPercent;

    /*
     * The maximum round-trip time in milliseconds permitted for a test to
     * evaluate as successful.
     */
    @JsonProperty(value = "roundTripTimeMs")
    private Integer roundTripTimeMs;

    /**
     * Get the checksFailedPercent property: The maximum percentage of failed
     * checks permitted for a test to evaluate as successful.
     * 
     * @return the checksFailedPercent value.
     */
    public Integer checksFailedPercent() {
        return this.checksFailedPercent;
    }

    /**
     * Set the checksFailedPercent property: The maximum percentage of failed
     * checks permitted for a test to evaluate as successful.
     * 
     * @param checksFailedPercent the checksFailedPercent value to set.
     * @return the ConnectionMonitorSuccessThreshold object itself.
     */
    public ConnectionMonitorSuccessThreshold withChecksFailedPercent(Integer checksFailedPercent) {
        this.checksFailedPercent = checksFailedPercent;
        return this;
    }

    /**
     * Get the roundTripTimeMs property: The maximum round-trip time in
     * milliseconds permitted for a test to evaluate as successful.
     * 
     * @return the roundTripTimeMs value.
     */
    public Integer roundTripTimeMs() {
        return this.roundTripTimeMs;
    }

    /**
     * Set the roundTripTimeMs property: The maximum round-trip time in
     * milliseconds permitted for a test to evaluate as successful.
     * 
     * @param roundTripTimeMs the roundTripTimeMs value to set.
     * @return the ConnectionMonitorSuccessThreshold object itself.
     */
    public ConnectionMonitorSuccessThreshold withRoundTripTimeMs(Integer roundTripTimeMs) {
        this.roundTripTimeMs = roundTripTimeMs;
        return this;
    }
}