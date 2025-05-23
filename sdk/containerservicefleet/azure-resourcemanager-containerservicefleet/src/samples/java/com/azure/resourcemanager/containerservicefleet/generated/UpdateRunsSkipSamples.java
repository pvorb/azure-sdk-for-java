// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.resourcemanager.containerservicefleet.models.SkipProperties;
import com.azure.resourcemanager.containerservicefleet.models.SkipTarget;
import com.azure.resourcemanager.containerservicefleet.models.TargetType;
import java.util.Arrays;

/**
 * Samples for UpdateRuns Skip.
 */
public final class UpdateRunsSkipSamples {
    /*
     * x-ms-original-file: 2025-03-01/UpdateRuns_Skip_MaximumSet_Gen.json
     */
    /**
     * Sample code: Skips one or more member/group/stage/afterStageWait(s) of an UpdateRun. - generated by [MaximumSet]
     * rule.
     * 
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void skipsOneOrMoreMemberGroupStageAfterStageWaitSOfAnUpdateRunGeneratedByMaximumSetRule(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.updateRuns()
            .skip("rgfleets", "fleet1", "fleet1",
                new SkipProperties()
                    .withTargets(Arrays.asList(new SkipTarget().withType(TargetType.MEMBER).withName("member-one"),
                        new SkipTarget().withType(TargetType.AFTER_STAGE_WAIT).withName("stage1"))),
                "rncfubdzrhcihvpqflbsjvoau", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: 2025-03-01/UpdateRuns_Skip.json
     */
    /**
     * Sample code: Skips one or more member/group/stage/afterStageWait(s) of an UpdateRun.
     * 
     * @param manager Entry point to ContainerServiceFleetManager.
     */
    public static void skipsOneOrMoreMemberGroupStageAfterStageWaitSOfAnUpdateRun(
        com.azure.resourcemanager.containerservicefleet.ContainerServiceFleetManager manager) {
        manager.updateRuns()
            .skip("rg1", "fleet1", "run1",
                new SkipProperties()
                    .withTargets(Arrays.asList(new SkipTarget().withType(TargetType.MEMBER).withName("member-one"),
                        new SkipTarget().withType(TargetType.AFTER_STAGE_WAIT).withName("stage1"))),
                null, com.azure.core.util.Context.NONE);
    }
}
