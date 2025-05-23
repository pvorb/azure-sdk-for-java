// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.peering.fluent.models.PeeringInner;
import com.azure.resourcemanager.peering.models.Kind;
import com.azure.resourcemanager.peering.models.Peering;
import com.azure.resourcemanager.peering.models.PeeringPropertiesDirect;
import com.azure.resourcemanager.peering.models.PeeringPropertiesExchange;
import com.azure.resourcemanager.peering.models.PeeringSku;
import com.azure.resourcemanager.peering.models.ProvisioningState;
import com.azure.resourcemanager.peering.models.ResourceTags;
import java.util.Collections;
import java.util.Map;

public final class PeeringImpl implements Peering, Peering.Definition, Peering.Update {
    private PeeringInner innerObject;

    private final com.azure.resourcemanager.peering.PeeringManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public PeeringSku sku() {
        return this.innerModel().sku();
    }

    public Kind kind() {
        return this.innerModel().kind();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public PeeringPropertiesDirect direct() {
        return this.innerModel().direct();
    }

    public PeeringPropertiesExchange exchange() {
        return this.innerModel().exchange();
    }

    public String peeringLocation() {
        return this.innerModel().peeringLocation();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PeeringInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.peering.PeeringManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String peeringName;

    private ResourceTags updateTags;

    public PeeringImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Peering create() {
        this.innerObject = serviceManager.serviceClient()
            .getPeerings()
            .createOrUpdateWithResponse(resourceGroupName, peeringName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public Peering create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPeerings()
            .createOrUpdateWithResponse(resourceGroupName, peeringName, this.innerModel(), context)
            .getValue();
        return this;
    }

    PeeringImpl(String name, com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerObject = new PeeringInner();
        this.serviceManager = serviceManager;
        this.peeringName = name;
    }

    public PeeringImpl update() {
        this.updateTags = new ResourceTags();
        return this;
    }

    public Peering apply() {
        this.innerObject = serviceManager.serviceClient()
            .getPeerings()
            .updateWithResponse(resourceGroupName, peeringName, updateTags, Context.NONE)
            .getValue();
        return this;
    }

    public Peering apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPeerings()
            .updateWithResponse(resourceGroupName, peeringName, updateTags, context)
            .getValue();
        return this;
    }

    PeeringImpl(PeeringInner innerObject, com.azure.resourcemanager.peering.PeeringManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.peeringName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "peerings");
    }

    public Peering refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getPeerings()
            .getByResourceGroupWithResponse(resourceGroupName, peeringName, Context.NONE)
            .getValue();
        return this;
    }

    public Peering refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPeerings()
            .getByResourceGroupWithResponse(resourceGroupName, peeringName, context)
            .getValue();
        return this;
    }

    public PeeringImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PeeringImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PeeringImpl withSku(PeeringSku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public PeeringImpl withKind(Kind kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public PeeringImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateTags.withTags(tags);
            return this;
        }
    }

    public PeeringImpl withDirect(PeeringPropertiesDirect direct) {
        this.innerModel().withDirect(direct);
        return this;
    }

    public PeeringImpl withExchange(PeeringPropertiesExchange exchange) {
        this.innerModel().withExchange(exchange);
        return this;
    }

    public PeeringImpl withPeeringLocation(String peeringLocation) {
        this.innerModel().withPeeringLocation(peeringLocation);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
