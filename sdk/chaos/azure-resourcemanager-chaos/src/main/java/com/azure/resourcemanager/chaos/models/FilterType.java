// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.chaos.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Enum that discriminates between filter types. Currently only `Simple` type is supported.
 */
public final class FilterType extends ExpandableStringEnum<FilterType> {
    /**
     * Simple filter type.
     */
    public static final FilterType SIMPLE = fromString("Simple");

    /**
     * Creates a new instance of FilterType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FilterType() {
    }

    /**
     * Creates or finds a FilterType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FilterType.
     */
    public static FilterType fromString(String name) {
        return fromString(name, FilterType.class);
    }

    /**
     * Gets known FilterType values.
     * 
     * @return known FilterType values.
     */
    public static Collection<FilterType> values() {
        return values(FilterType.class);
    }
}
