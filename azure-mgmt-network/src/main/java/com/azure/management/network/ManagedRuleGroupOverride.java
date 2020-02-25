// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ManagedRuleGroupOverride model.
 */
@Fluent
public final class ManagedRuleGroupOverride {
    /*
     * The managed rule group to override.
     */
    @JsonProperty(value = "ruleGroupName", required = true)
    private String ruleGroupName;

    /*
     * List of rules that will be disabled. If none specified, all rules in the
     * group will be disabled.
     */
    @JsonProperty(value = "rules")
    private List<ManagedRuleOverride> rules;

    /**
     * Get the ruleGroupName property: The managed rule group to override.
     * 
     * @return the ruleGroupName value.
     */
    public String ruleGroupName() {
        return this.ruleGroupName;
    }

    /**
     * Set the ruleGroupName property: The managed rule group to override.
     * 
     * @param ruleGroupName the ruleGroupName value to set.
     * @return the ManagedRuleGroupOverride object itself.
     */
    public ManagedRuleGroupOverride withRuleGroupName(String ruleGroupName) {
        this.ruleGroupName = ruleGroupName;
        return this;
    }

    /**
     * Get the rules property: List of rules that will be disabled. If none
     * specified, all rules in the group will be disabled.
     * 
     * @return the rules value.
     */
    public List<ManagedRuleOverride> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: List of rules that will be disabled. If none
     * specified, all rules in the group will be disabled.
     * 
     * @param rules the rules value to set.
     * @return the ManagedRuleGroupOverride object itself.
     */
    public ManagedRuleGroupOverride withRules(List<ManagedRuleOverride> rules) {
        this.rules = rules;
        return this;
    }
}