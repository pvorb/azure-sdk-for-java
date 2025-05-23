// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.migration.assessment.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for AzureVmSuitabilityExplanation.
 */
public final class AzureVmSuitabilityExplanation extends ExpandableStringEnum<AzureVmSuitabilityExplanation> {
    /**
     * Static value Unknown for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation UNKNOWN = fromString("Unknown");

    /**
     * Static value NotApplicable for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation NOT_APPLICABLE = fromString("NotApplicable");

    /**
     * Static value GuestOperatingSystemArchitectureNotSupported for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation GUEST_OPERATING_SYSTEM_ARCHITECTURE_NOT_SUPPORTED
        = fromString("GuestOperatingSystemArchitectureNotSupported");

    /**
     * Static value GuestOperatingSystemNotSupported for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation GUEST_OPERATING_SYSTEM_NOT_SUPPORTED
        = fromString("GuestOperatingSystemNotSupported");

    /**
     * Static value BootTypeNotSupported for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation BOOT_TYPE_NOT_SUPPORTED = fromString("BootTypeNotSupported");

    /**
     * Static value MoreDisksThanSupported for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation MORE_DISKS_THAN_SUPPORTED = fromString("MoreDisksThanSupported");

    /**
     * Static value NoSuitableVmSizeFound for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation NO_SUITABLE_VM_SIZE_FOUND = fromString("NoSuitableVmSizeFound");

    /**
     * Static value OneOrMoreDisksNotSuitable for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation ONE_OR_MORE_DISKS_NOT_SUITABLE
        = fromString("OneOrMoreDisksNotSuitable");

    /**
     * Static value OneOrMoreAdaptersNotSuitable for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation ONE_OR_MORE_ADAPTERS_NOT_SUITABLE
        = fromString("OneOrMoreAdaptersNotSuitable");

    /**
     * Static value InternalErrorOccurredDuringComputeEvaluation for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation INTERNAL_ERROR_OCCURRED_DURING_COMPUTE_EVALUATION
        = fromString("InternalErrorOccurredDuringComputeEvaluation");

    /**
     * Static value InternalErrorOccurredDuringStorageEvaluation for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation INTERNAL_ERROR_OCCURRED_DURING_STORAGE_EVALUATION
        = fromString("InternalErrorOccurredDuringStorageEvaluation");

    /**
     * Static value InternalErrorOccurredDuringNetworkEvaluation for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation INTERNAL_ERROR_OCCURRED_DURING_NETWORK_EVALUATION
        = fromString("InternalErrorOccurredDuringNetworkEvaluation");

    /**
     * Static value NoVmSizeSupportsStoragePerformance for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation NO_VM_SIZE_SUPPORTS_STORAGE_PERFORMANCE
        = fromString("NoVmSizeSupportsStoragePerformance");

    /**
     * Static value NoVmSizeSupportsNetworkPerformance for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation NO_VM_SIZE_SUPPORTS_NETWORK_PERFORMANCE
        = fromString("NoVmSizeSupportsNetworkPerformance");

    /**
     * Static value NoVmSizeForSelectedPricingTier for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation NO_VM_SIZE_FOR_SELECTED_PRICING_TIER
        = fromString("NoVmSizeForSelectedPricingTier");

    /**
     * Static value NoVmSizeForSelectedAzureLocation for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation NO_VM_SIZE_FOR_SELECTED_AZURE_LOCATION
        = fromString("NoVmSizeForSelectedAzureLocation");

    /**
     * Static value CheckRedHatLinuxVersion for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation CHECK_RED_HAT_LINUX_VERSION
        = fromString("CheckRedHatLinuxVersion");

    /**
     * Static value CheckOpenSuseLinuxVersion for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation CHECK_OPEN_SUSE_LINUX_VERSION
        = fromString("CheckOpenSuseLinuxVersion");

    /**
     * Static value CheckWindowsServer2008R2Version for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation CHECK_WINDOWS_SERVER2008R2VERSION
        = fromString("CheckWindowsServer2008R2Version");

    /**
     * Static value CheckCentOsVersion for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation CHECK_CENT_OS_VERSION = fromString("CheckCentOsVersion");

    /**
     * Static value CheckDebianLinuxVersion for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation CHECK_DEBIAN_LINUX_VERSION
        = fromString("CheckDebianLinuxVersion");

    /**
     * Static value CheckSuseLinuxVersion for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation CHECK_SUSE_LINUX_VERSION = fromString("CheckSuseLinuxVersion");

    /**
     * Static value CheckOracleLinuxVersion for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation CHECK_ORACLE_LINUX_VERSION
        = fromString("CheckOracleLinuxVersion");

    /**
     * Static value CheckUbuntuLinuxVersion for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation CHECK_UBUNTU_LINUX_VERSION
        = fromString("CheckUbuntuLinuxVersion");

    /**
     * Static value CheckCoreOsLinuxVersion for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation CHECK_CORE_OS_LINUX_VERSION
        = fromString("CheckCoreOsLinuxVersion");

    /**
     * Static value WindowsServerVersionConditionallySupported for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation WINDOWS_SERVER_VERSION_CONDITIONALLY_SUPPORTED
        = fromString("WindowsServerVersionConditionallySupported");

    /**
     * Static value NoGuestOperatingSystemConditionallySupported for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation NO_GUEST_OPERATING_SYSTEM_CONDITIONALLY_SUPPORTED
        = fromString("NoGuestOperatingSystemConditionallySupported");

    /**
     * Static value WindowsClientVersionsConditionallySupported for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation WINDOWS_CLIENT_VERSIONS_CONDITIONALLY_SUPPORTED
        = fromString("WindowsClientVersionsConditionallySupported");

    /**
     * Static value BootTypeUnknown for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation BOOT_TYPE_UNKNOWN = fromString("BootTypeUnknown");

    /**
     * Static value GuestOperatingSystemUnknown for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation GUEST_OPERATING_SYSTEM_UNKNOWN
        = fromString("GuestOperatingSystemUnknown");

    /**
     * Static value WindowsServerVersionsSupportedWithCaveat for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation WINDOWS_SERVER_VERSIONS_SUPPORTED_WITH_CAVEAT
        = fromString("WindowsServerVersionsSupportedWithCaveat");

    /**
     * Static value WindowsOSNoLongerUnderMSSupport for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation WINDOWS_OSNO_LONGER_UNDER_MSSUPPORT
        = fromString("WindowsOSNoLongerUnderMSSupport");

    /**
     * Static value EndorsedWithConditionsLinuxDistributions for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation ENDORSED_WITH_CONDITIONS_LINUX_DISTRIBUTIONS
        = fromString("EndorsedWithConditionsLinuxDistributions");

    /**
     * Static value UnendorsedLinuxDistributions for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation UNENDORSED_LINUX_DISTRIBUTIONS
        = fromString("UnendorsedLinuxDistributions");

    /**
     * Static value NoVmSizeForStandardPricingTier for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation NO_VM_SIZE_FOR_STANDARD_PRICING_TIER
        = fromString("NoVmSizeForStandardPricingTier");

    /**
     * Static value NoVmSizeForBasicPricingTier for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation NO_VM_SIZE_FOR_BASIC_PRICING_TIER
        = fromString("NoVmSizeForBasicPricingTier");

    /**
     * Static value NoVmSizeInSelectedFamilyFound for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation NO_VM_SIZE_IN_SELECTED_FAMILY_FOUND
        = fromString("NoVmSizeInSelectedFamilyFound");

    /**
     * Static value NoEaPriceFoundForVmSize for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation NO_EA_PRICE_FOUND_FOR_VM_SIZE
        = fromString("NoEaPriceFoundForVmSize");

    /**
     * Static value NoVmSizeFoundForOfferCurrencyReservedInstance for AzureVmSuitabilityExplanation.
     */
    public static final AzureVmSuitabilityExplanation NO_VM_SIZE_FOUND_FOR_OFFER_CURRENCY_RESERVED_INSTANCE
        = fromString("NoVmSizeFoundForOfferCurrencyReservedInstance");

    /**
     * Creates a new instance of AzureVmSuitabilityExplanation value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AzureVmSuitabilityExplanation() {
    }

    /**
     * Creates or finds a AzureVmSuitabilityExplanation from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding AzureVmSuitabilityExplanation.
     */
    public static AzureVmSuitabilityExplanation fromString(String name) {
        return fromString(name, AzureVmSuitabilityExplanation.class);
    }

    /**
     * Gets known AzureVmSuitabilityExplanation values.
     * 
     * @return known AzureVmSuitabilityExplanation values.
     */
    public static Collection<AzureVmSuitabilityExplanation> values() {
        return values(AzureVmSuitabilityExplanation.class);
    }
}
