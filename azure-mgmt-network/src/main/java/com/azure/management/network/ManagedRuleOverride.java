// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ManagedRuleOverride model.
 */
@Fluent
public final class ManagedRuleOverride {
    /*
     * Identifier for the managed rule.
     */
    @JsonProperty(value = "ruleId", required = true)
    private String ruleId;

    /*
     * The state of the managed rule. Defaults to Disabled if not specified.
     */
    @JsonProperty(value = "state")
    private String state;

    /**
     * Creates an instance of ManagedRuleOverride class.
     */
    public ManagedRuleOverride() {
        state = "Disabled";
    }

    /**
     * Get the ruleId property: Identifier for the managed rule.
     * 
     * @return the ruleId value.
     */
    public String ruleId() {
        return this.ruleId;
    }

    /**
     * Set the ruleId property: Identifier for the managed rule.
     * 
     * @param ruleId the ruleId value to set.
     * @return the ManagedRuleOverride object itself.
     */
    public ManagedRuleOverride withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * Get the state property: The state of the managed rule. Defaults to
     * Disabled if not specified.
     * 
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: The state of the managed rule. Defaults to
     * Disabled if not specified.
     * 
     * @param state the state value to set.
     * @return the ManagedRuleOverride object itself.
     */
    public ManagedRuleOverride withState(String state) {
        this.state = state;
        return this;
    }
}