/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL type item.
 */
public class USqlType extends CatalogItem {
    /**
     * the name of the database.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /**
     * the name of the schema associated with this table and database.
     */
    @JsonProperty(value = "schemaName")
    private String schemaName;

    /**
     * the name of type for this type.
     */
    @JsonProperty(value = "typeName")
    private String name;

    /**
     * the type family for this type.
     */
    @JsonProperty(value = "typeFamily")
    private String typeFamily;

    /**
     * the C# name for this type.
     */
    @JsonProperty(value = "cSharpName")
    private String cSharpName;

    /**
     * the fully qualified C# name for this type.
     */
    @JsonProperty(value = "fullCSharpName")
    private String fullCSharpName;

    /**
     * the system type ID for this type.
     */
    @JsonProperty(value = "systemTypeId")
    private Integer systemTypeId;

    /**
     * the user type ID for this type.
     */
    @JsonProperty(value = "userTypeId")
    private Integer userTypeId;

    /**
     * the schema ID for this type.
     */
    @JsonProperty(value = "schemaId")
    private Integer schemaId;

    /**
     * the principal ID for this type.
     */
    @JsonProperty(value = "principalId")
    private Integer principalId;

    /**
     * the the switch indicating if this type is nullable.
     */
    @JsonProperty(value = "isNullable")
    private Boolean isNullable;

    /**
     * the the switch indicating if this type is user defined.
     */
    @JsonProperty(value = "isUserDefined")
    private Boolean isUserDefined;

    /**
     * the the switch indicating if this type is an assembly type.
     */
    @JsonProperty(value = "isAssemblyType")
    private Boolean isAssemblyType;

    /**
     * the the switch indicating if this type is a table type.
     */
    @JsonProperty(value = "isTableType")
    private Boolean isTableType;

    /**
     * the the switch indicating if this type is a complex type.
     */
    @JsonProperty(value = "isComplexType")
    private Boolean isComplexType;

    /**
     * Get the name of the database.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the name of the database.
     *
     * @param databaseName the databaseName value to set
     * @return the USqlType object itself.
     */
    public USqlType withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the name of the schema associated with this table and database.
     *
     * @return the schemaName value
     */
    public String schemaName() {
        return this.schemaName;
    }

    /**
     * Set the name of the schema associated with this table and database.
     *
     * @param schemaName the schemaName value to set
     * @return the USqlType object itself.
     */
    public USqlType withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * Get the name of type for this type.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of type for this type.
     *
     * @param name the name value to set
     * @return the USqlType object itself.
     */
    public USqlType withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type family for this type.
     *
     * @return the typeFamily value
     */
    public String typeFamily() {
        return this.typeFamily;
    }

    /**
     * Set the type family for this type.
     *
     * @param typeFamily the typeFamily value to set
     * @return the USqlType object itself.
     */
    public USqlType withTypeFamily(String typeFamily) {
        this.typeFamily = typeFamily;
        return this;
    }

    /**
     * Get the C# name for this type.
     *
     * @return the cSharpName value
     */
    public String cSharpName() {
        return this.cSharpName;
    }

    /**
     * Set the C# name for this type.
     *
     * @param cSharpName the cSharpName value to set
     * @return the USqlType object itself.
     */
    public USqlType withCSharpName(String cSharpName) {
        this.cSharpName = cSharpName;
        return this;
    }

    /**
     * Get the fully qualified C# name for this type.
     *
     * @return the fullCSharpName value
     */
    public String fullCSharpName() {
        return this.fullCSharpName;
    }

    /**
     * Set the fully qualified C# name for this type.
     *
     * @param fullCSharpName the fullCSharpName value to set
     * @return the USqlType object itself.
     */
    public USqlType withFullCSharpName(String fullCSharpName) {
        this.fullCSharpName = fullCSharpName;
        return this;
    }

    /**
     * Get the system type ID for this type.
     *
     * @return the systemTypeId value
     */
    public Integer systemTypeId() {
        return this.systemTypeId;
    }

    /**
     * Set the system type ID for this type.
     *
     * @param systemTypeId the systemTypeId value to set
     * @return the USqlType object itself.
     */
    public USqlType withSystemTypeId(Integer systemTypeId) {
        this.systemTypeId = systemTypeId;
        return this;
    }

    /**
     * Get the user type ID for this type.
     *
     * @return the userTypeId value
     */
    public Integer userTypeId() {
        return this.userTypeId;
    }

    /**
     * Set the user type ID for this type.
     *
     * @param userTypeId the userTypeId value to set
     * @return the USqlType object itself.
     */
    public USqlType withUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
        return this;
    }

    /**
     * Get the schema ID for this type.
     *
     * @return the schemaId value
     */
    public Integer schemaId() {
        return this.schemaId;
    }

    /**
     * Set the schema ID for this type.
     *
     * @param schemaId the schemaId value to set
     * @return the USqlType object itself.
     */
    public USqlType withSchemaId(Integer schemaId) {
        this.schemaId = schemaId;
        return this;
    }

    /**
     * Get the principal ID for this type.
     *
     * @return the principalId value
     */
    public Integer principalId() {
        return this.principalId;
    }

    /**
     * Set the principal ID for this type.
     *
     * @param principalId the principalId value to set
     * @return the USqlType object itself.
     */
    public USqlType withPrincipalId(Integer principalId) {
        this.principalId = principalId;
        return this;
    }

    /**
     * Get the the switch indicating if this type is nullable.
     *
     * @return the isNullable value
     */
    public Boolean isNullable() {
        return this.isNullable;
    }

    /**
     * Set the the switch indicating if this type is nullable.
     *
     * @param isNullable the isNullable value to set
     * @return the USqlType object itself.
     */
    public USqlType withIsNullable(Boolean isNullable) {
        this.isNullable = isNullable;
        return this;
    }

    /**
     * Get the the switch indicating if this type is user defined.
     *
     * @return the isUserDefined value
     */
    public Boolean isUserDefined() {
        return this.isUserDefined;
    }

    /**
     * Set the the switch indicating if this type is user defined.
     *
     * @param isUserDefined the isUserDefined value to set
     * @return the USqlType object itself.
     */
    public USqlType withIsUserDefined(Boolean isUserDefined) {
        this.isUserDefined = isUserDefined;
        return this;
    }

    /**
     * Get the the switch indicating if this type is an assembly type.
     *
     * @return the isAssemblyType value
     */
    public Boolean isAssemblyType() {
        return this.isAssemblyType;
    }

    /**
     * Set the the switch indicating if this type is an assembly type.
     *
     * @param isAssemblyType the isAssemblyType value to set
     * @return the USqlType object itself.
     */
    public USqlType withIsAssemblyType(Boolean isAssemblyType) {
        this.isAssemblyType = isAssemblyType;
        return this;
    }

    /**
     * Get the the switch indicating if this type is a table type.
     *
     * @return the isTableType value
     */
    public Boolean isTableType() {
        return this.isTableType;
    }

    /**
     * Set the the switch indicating if this type is a table type.
     *
     * @param isTableType the isTableType value to set
     * @return the USqlType object itself.
     */
    public USqlType withIsTableType(Boolean isTableType) {
        this.isTableType = isTableType;
        return this;
    }

    /**
     * Get the the switch indicating if this type is a complex type.
     *
     * @return the isComplexType value
     */
    public Boolean isComplexType() {
        return this.isComplexType;
    }

    /**
     * Set the the switch indicating if this type is a complex type.
     *
     * @param isComplexType the isComplexType value to set
     * @return the USqlType object itself.
     */
    public USqlType withIsComplexType(Boolean isComplexType) {
        this.isComplexType = isComplexType;
        return this;
    }

}