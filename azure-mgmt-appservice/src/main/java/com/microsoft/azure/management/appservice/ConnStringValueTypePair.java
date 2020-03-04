/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Database connection string value to type pair.
 */
public class ConnStringValueTypePair {
    /**
     * Value of pair.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Type of database. Possible values include: 'MySql', 'SQLServer',
     * 'SQLAzure', 'Custom', 'NotificationHub', 'ServiceBus', 'EventHub',
     * 'ApiHub', 'DocDb', 'RedisCache', 'PostgreSQL'.
     */
    @JsonProperty(value = "type", required = true)
    private ConnectionStringType type;

    /**
     * Get value of pair.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set value of pair.
     *
     * @param value the value value to set
     * @return the ConnStringValueTypePair object itself.
     */
    public ConnStringValueTypePair withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get type of database. Possible values include: 'MySql', 'SQLServer', 'SQLAzure', 'Custom', 'NotificationHub', 'ServiceBus', 'EventHub', 'ApiHub', 'DocDb', 'RedisCache', 'PostgreSQL'.
     *
     * @return the type value
     */
    public ConnectionStringType type() {
        return this.type;
    }

    /**
     * Set type of database. Possible values include: 'MySql', 'SQLServer', 'SQLAzure', 'Custom', 'NotificationHub', 'ServiceBus', 'EventHub', 'ApiHub', 'DocDb', 'RedisCache', 'PostgreSQL'.
     *
     * @param type the type value to set
     * @return the ConnStringValueTypePair object itself.
     */
    public ConnStringValueTypePair withType(ConnectionStringType type) {
        this.type = type;
        return this;
    }

}