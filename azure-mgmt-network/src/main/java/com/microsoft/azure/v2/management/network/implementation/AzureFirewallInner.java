/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.Resource;
import com.microsoft.azure.v2.management.network.AzureFirewallApplicationRuleCollection;
import com.microsoft.azure.v2.management.network.AzureFirewallIPConfiguration;
import com.microsoft.azure.v2.management.network.AzureFirewallNetworkRuleCollection;
import com.microsoft.azure.v2.management.network.ProvisioningState;
import com.microsoft.rest.v2.annotations.SkipParentValidation;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.List;

/**
 * Azure Firewall resource.
 */
@JsonFlatten
@SkipParentValidation
public class AzureFirewallInner extends Resource {
    /**
     * Collection of application rule collections used by a Azure Firewall.
     */
    @JsonProperty(value = "properties.applicationRuleCollections")
    private List<AzureFirewallApplicationRuleCollection> applicationRuleCollections;

    /**
     * Collection of network rule collections used by a Azure Firewall.
     */
    @JsonProperty(value = "properties.networkRuleCollections")
    private List<AzureFirewallNetworkRuleCollection> networkRuleCollections;

    /**
     * IP configuration of the Azure Firewall resource.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<AzureFirewallIPConfiguration> ipConfigurations;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the applicationRuleCollections value.
     *
     * @return the applicationRuleCollections value.
     */
    public List<AzureFirewallApplicationRuleCollection> applicationRuleCollections() {
        return this.applicationRuleCollections;
    }

    /**
     * Set the applicationRuleCollections value.
     *
     * @param applicationRuleCollections the applicationRuleCollections value
     * to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withApplicationRuleCollections(List<AzureFirewallApplicationRuleCollection> applicationRuleCollections) {
        this.applicationRuleCollections = applicationRuleCollections;
        return this;
    }

    /**
     * Get the networkRuleCollections value.
     *
     * @return the networkRuleCollections value.
     */
    public List<AzureFirewallNetworkRuleCollection> networkRuleCollections() {
        return this.networkRuleCollections;
    }

    /**
     * Set the networkRuleCollections value.
     *
     * @param networkRuleCollections the networkRuleCollections value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withNetworkRuleCollections(List<AzureFirewallNetworkRuleCollection> networkRuleCollections) {
        this.networkRuleCollections = networkRuleCollections;
        return this;
    }

    /**
     * Get the ipConfigurations value.
     *
     * @return the ipConfigurations value.
     */
    public List<AzureFirewallIPConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations value.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withIpConfigurations(List<AzureFirewallIPConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id value.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set.
     * @return the AzureFirewallInner object itself.
     */
    public AzureFirewallInner withId(String id) {
        this.id = id;
        return this;
    }
}
