/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.implementation;

import com.microsoft.azure.management.monitor.Enabled;
import org.joda.time.DateTime;
import com.microsoft.azure.management.monitor.ProvisioningState;
import com.microsoft.azure.management.monitor.Source;
import com.microsoft.azure.management.monitor.Schedule;
import com.microsoft.azure.management.monitor.Action;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * The Log Search Rule resource.
 */
@JsonFlatten
public class LogSearchRuleResourceInner extends Resource {
    /**
     * The description of the Log Search rule.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * The flag which indicates whether the Log Search rule is enabled. Value
     * should be true or false. Possible values include: 'true', 'false'.
     */
    @JsonProperty(value = "properties.enabled")
    private Enabled enabled;

    /**
     * Last time the rule was updated in IS08601 format.
     */
    @JsonProperty(value = "properties.lastUpdatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastUpdatedTime;

    /**
     * Provisioning state of the scheduledquery rule. Possible values include:
     * 'Succeeded', 'Deploying', 'Canceled', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Data Source against which rule will Query Data.
     */
    @JsonProperty(value = "properties.source", required = true)
    private Source source;

    /**
     * Schedule (Frequnecy, Time Window) for rule.
     */
    @JsonProperty(value = "properties.schedule", required = true)
    private Schedule schedule;

    /**
     * Action needs to be taken on rule execution.
     */
    @JsonProperty(value = "properties.action", required = true)
    private Action action;

    /**
     * Get the description of the Log Search rule.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description of the Log Search rule.
     *
     * @param description the description value to set
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the flag which indicates whether the Log Search rule is enabled. Value should be true or false. Possible values include: 'true', 'false'.
     *
     * @return the enabled value
     */
    public Enabled enabled() {
        return this.enabled;
    }

    /**
     * Set the flag which indicates whether the Log Search rule is enabled. Value should be true or false. Possible values include: 'true', 'false'.
     *
     * @param enabled the enabled value to set
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withEnabled(Enabled enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get last time the rule was updated in IS08601 format.
     *
     * @return the lastUpdatedTime value
     */
    public DateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Get provisioning state of the scheduledquery rule. Possible values include: 'Succeeded', 'Deploying', 'Canceled', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get data Source against which rule will Query Data.
     *
     * @return the source value
     */
    public Source source() {
        return this.source;
    }

    /**
     * Set data Source against which rule will Query Data.
     *
     * @param source the source value to set
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withSource(Source source) {
        this.source = source;
        return this;
    }

    /**
     * Get schedule (Frequnecy, Time Window) for rule.
     *
     * @return the schedule value
     */
    public Schedule schedule() {
        return this.schedule;
    }

    /**
     * Set schedule (Frequnecy, Time Window) for rule.
     *
     * @param schedule the schedule value to set
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withSchedule(Schedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * Get action needs to be taken on rule execution.
     *
     * @return the action value
     */
    public Action action() {
        return this.action;
    }

    /**
     * Set action needs to be taken on rule execution.
     *
     * @param action the action value to set
     * @return the LogSearchRuleResourceInner object itself.
     */
    public LogSearchRuleResourceInner withAction(Action action) {
        this.action = action;
        return this;
    }

}
