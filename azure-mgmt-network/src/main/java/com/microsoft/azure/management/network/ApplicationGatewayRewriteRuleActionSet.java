/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Set of actions in the Rewrite Rule in Application Gateway.
 */
public class ApplicationGatewayRewriteRuleActionSet {
    /**
     * Request Header Actions in the Action Set.
     */
    @JsonProperty(value = "requestHeaderConfigurations")
    private List<ApplicationGatewayHeaderConfiguration> requestHeaderConfigurations;

    /**
     * Response Header Actions in the Action Set.
     */
    @JsonProperty(value = "responseHeaderConfigurations")
    private List<ApplicationGatewayHeaderConfiguration> responseHeaderConfigurations;

    /**
     * Get request Header Actions in the Action Set.
     *
     * @return the requestHeaderConfigurations value
     */
    public List<ApplicationGatewayHeaderConfiguration> requestHeaderConfigurations() {
        return this.requestHeaderConfigurations;
    }

    /**
     * Set request Header Actions in the Action Set.
     *
     * @param requestHeaderConfigurations the requestHeaderConfigurations value to set
     * @return the ApplicationGatewayRewriteRuleActionSet object itself.
     */
    public ApplicationGatewayRewriteRuleActionSet withRequestHeaderConfigurations(List<ApplicationGatewayHeaderConfiguration> requestHeaderConfigurations) {
        this.requestHeaderConfigurations = requestHeaderConfigurations;
        return this;
    }

    /**
     * Get response Header Actions in the Action Set.
     *
     * @return the responseHeaderConfigurations value
     */
    public List<ApplicationGatewayHeaderConfiguration> responseHeaderConfigurations() {
        return this.responseHeaderConfigurations;
    }

    /**
     * Set response Header Actions in the Action Set.
     *
     * @param responseHeaderConfigurations the responseHeaderConfigurations value to set
     * @return the ApplicationGatewayRewriteRuleActionSet object itself.
     */
    public ApplicationGatewayRewriteRuleActionSet withResponseHeaderConfigurations(List<ApplicationGatewayHeaderConfiguration> responseHeaderConfigurations) {
        this.responseHeaderConfigurations = responseHeaderConfigurations;
        return this;
    }

}
