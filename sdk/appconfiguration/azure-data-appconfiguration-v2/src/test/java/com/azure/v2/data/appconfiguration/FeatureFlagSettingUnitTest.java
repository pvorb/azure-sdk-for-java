// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.data.appconfiguration;

import com.azure.v2.data.appconfiguration.models.FeatureFlagConfigurationSetting;
import com.azure.v2.data.appconfiguration.models.FeatureFlagFilter;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.azure.v2.data.appconfiguration.models.FeatureFlagConfigurationSetting.KEY_PREFIX;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FeatureFlagSettingUnitTest {
    // Original value
    static final String NEW_KEY = "newKey";
    static final String DESCRIPTION_VALUE = "newDescription";
    static final String DISPLAY_NAME_VALUE = "newDisplayName";
    static final String FILTER_NAME = "Microsoft.Percentage";
    static final boolean IS_ENABLED = false;
    // Updated value
    static final String UPDATED_KEY = "updatedKey";
    static final String UPDATED_DESCRIPTION_VALUE = "updatedDescription";
    static final String UPDATED_DISPLAY_NAME_VALUE = "updatedDisplayName";
    static final boolean UPDATED_IS_ENABLED = true;

    @Test
    public void accessingStronglyTypedPropertiesAfterSettingDifferentFeatureFlagJSON() {
        // Create a new feature flag configuration setting,
        final List<FeatureFlagFilter> featureFlagFilters
            = Arrays.asList(getFlagFilter(FILTER_NAME, getFilterParameters()));
        FeatureFlagConfigurationSetting setting = getFeatureFlagConfigurationSetting(NEW_KEY, DESCRIPTION_VALUE,
            DISPLAY_NAME_VALUE, IS_ENABLED, featureFlagFilters);
        String expectedNewSettingValue
            = getFeatureFlagConfigurationSettingValue(NEW_KEY, DESCRIPTION_VALUE, DISPLAY_NAME_VALUE, IS_ENABLED);
        assertEquals(expectedNewSettingValue, setting.getValue());

        String expectedUpdatedSettingValue = getFeatureFlagConfigurationSettingValue(UPDATED_KEY,
            UPDATED_DESCRIPTION_VALUE, UPDATED_DISPLAY_NAME_VALUE, UPDATED_IS_ENABLED);
        // Set the Value to some pre-populated
        setting.setValue(expectedUpdatedSettingValue);
        // Access strongly-typed property values
        assertEquals(expectedUpdatedSettingValue, setting.getValue());
        assertEquals(UPDATED_KEY, setting.getFeatureId());
        assertEquals(UPDATED_DISPLAY_NAME_VALUE, setting.getDisplayName());
        assertEquals(UPDATED_DESCRIPTION_VALUE, setting.getDescription());
        assertEquals(UPDATED_IS_ENABLED, setting.isEnabled());
    }

    @Test
    public void accessingValueAfterChangingStronglyTypedProperties() {
        FeatureFlagConfigurationSetting setting = createFeatureFlagConfigurationSetting();
        String expectedNewSettingValue
            = getFeatureFlagConfigurationSettingValue(NEW_KEY, DESCRIPTION_VALUE, DISPLAY_NAME_VALUE, IS_ENABLED);
        // Test getValue()
        assertEquals(expectedNewSettingValue, setting.getValue());
        // Update strongly-type properties.
        setting.setFeatureId(UPDATED_KEY);
        setting.setDescription(UPDATED_DESCRIPTION_VALUE);
        setting.setDisplayName(UPDATED_DISPLAY_NAME_VALUE);
        setting.setEnabled(UPDATED_IS_ENABLED);

        String expectedUpdatedSettingValue = getFeatureFlagConfigurationSettingValue(UPDATED_KEY,
            UPDATED_DESCRIPTION_VALUE, UPDATED_DISPLAY_NAME_VALUE, UPDATED_IS_ENABLED);
        // make sure the value reflect to the changes
        assertEquals(KEY_PREFIX + UPDATED_KEY, setting.getKey());
        assertEquals(expectedUpdatedSettingValue, setting.getValue());
    }

    @Test
    public void throwExceptionWhenInvalidNonJsonFeatureFlagValue() {
        FeatureFlagConfigurationSetting setting = createFeatureFlagConfigurationSetting();
        String expectedValue
            = getFeatureFlagConfigurationSettingValue(NEW_KEY, DESCRIPTION_VALUE, DISPLAY_NAME_VALUE, IS_ENABLED);

        String originalValue = setting.getValue();
        assertEquals(expectedValue, originalValue);

        assertThrows(IllegalArgumentException.class, () -> setting.setValue("invalidValueForFeatureFlagSetting"));
        assertEquals(expectedValue, setting.getValue());
        assertThrows(IllegalArgumentException.class, () -> setting.getFeatureId());
        assertThrows(IllegalArgumentException.class, () -> setting.getDescription());
        assertThrows(IllegalArgumentException.class, () -> setting.getDisplayName());
        assertThrows(IllegalArgumentException.class, () -> setting.isEnabled());
        assertThrows(IllegalArgumentException.class, () -> setting.getClientFilters());
    }

    @Test
    public void reserveUnknownPropertiesTest() {
        FeatureFlagConfigurationSetting setting = createFeatureFlagConfigurationSetting();
        String newSettingValueJSON = getUnknownPropertiesFeatureFlagConfigurationSettingValue(UPDATED_KEY,
            UPDATED_DESCRIPTION_VALUE, UPDATED_DISPLAY_NAME_VALUE, UPDATED_IS_ENABLED);

        setting.setValue(newSettingValueJSON);
        assertEquals(newSettingValueJSON, setting.getValue());
        assertEquals(UPDATED_KEY, setting.getFeatureId());
        assertEquals(UPDATED_DESCRIPTION_VALUE, setting.getDescription());
        assertEquals(UPDATED_DISPLAY_NAME_VALUE, setting.getDisplayName());
        assertEquals(UPDATED_IS_ENABLED, setting.isEnabled());
    }

    @Test
    public void addFilter() {
        FeatureFlagConfigurationSetting setting = new FeatureFlagConfigurationSetting("featureID", true);
        assertEquals(0, setting.getClientFilters().size());
        setting.addClientFilter(new FeatureFlagFilter("filterName"));
        assertEquals(1, setting.getClientFilters().size());
    }

    @Test
    public void setKeyShowFeatureFlagPrefix() {
        String keyWithPrefix = KEY_PREFIX + "key";
        FeatureFlagConfigurationSetting setting = new FeatureFlagConfigurationSetting("featureID", true);
        setting.setKey("key");
        assertEquals(keyWithPrefix, setting.getKey());

        FeatureFlagConfigurationSetting settingWithPrefix = new FeatureFlagConfigurationSetting("featureID", true);
        settingWithPrefix.setKey(keyWithPrefix);
        assertEquals(keyWithPrefix, settingWithPrefix.getKey());
    }

    private FeatureFlagConfigurationSetting createFeatureFlagConfigurationSetting() {
        // Create a new feature flag configuration setting,
        final List<FeatureFlagFilter> featureFlagFilters
            = Arrays.asList(getFlagFilter(FILTER_NAME, getFilterParameters()));
        return getFeatureFlagConfigurationSetting(NEW_KEY, DESCRIPTION_VALUE, DISPLAY_NAME_VALUE, IS_ENABLED,
            featureFlagFilters);
    }

    private String getFeatureFlagConfigurationSettingValue(String id, String description, String displayName,
        boolean isEnabled) {
        return String.format(
            "{\"id\":\"%s\",\"description\":\"%s\",\"display_name\":\"%s\"," + "\"enabled\":%s,"
                + "\"conditions\":{\"client_filters\":"
                + "[{\"name\":\"Microsoft.Percentage\",\"parameters\":{\"Value\":30}}]" + "}}",
            id, description, displayName, isEnabled);
    }

    private String getUnknownPropertiesFeatureFlagConfigurationSettingValue(String id, String description,
        String displayName, boolean isEnabled) {
        return String.format(
            "{\"id\":\"%s\",\"additional_field_1\":\"additional_value_1\",\"description\":\"%s\",\"display_name\":\"%s\",\"enabled\":%s,"
                + "\"conditions\":{\"requirement_type\":\"All\",\"client_filters\":"
                + "[{\"name\":\"Microsoft.Percentage\",\"parameters\":{\"Value\":30}}]"
                + "},\"objectFiledName\":{\"unknown\":\"unknown\",\"unknown2\":\"unknown2\"},"
                + "\"arrayFieldName\":[{\"name\":\"Microsoft.Percentage\",\"parameters\":{\"Value\":30}}]}",
            id, description, displayName, isEnabled);
    }

    private FeatureFlagConfigurationSetting getFeatureFlagConfigurationSetting(String id, String description,
        String displayName, boolean isEnabled, List<FeatureFlagFilter> filters) {
        return new FeatureFlagConfigurationSetting(id, isEnabled).setDescription(description)
            .setDisplayName(displayName)
            .setClientFilters(filters);
    }

    private FeatureFlagFilter getFlagFilter(String filterName, Map<String, Object> filterParameters) {
        return new FeatureFlagFilter(filterName).setParameters(filterParameters);
    }

    private Map<String, Object> getFilterParameters() {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("Value", 30);
        return parameters;
    }
}
