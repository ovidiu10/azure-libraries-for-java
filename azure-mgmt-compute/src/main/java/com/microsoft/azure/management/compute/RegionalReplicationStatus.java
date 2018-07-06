/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the regional replication status.
 */
public class RegionalReplicationStatus {
    /**
     * The region where the gallery image version is published to.
     */
    @JsonProperty(value = "region", access = JsonProperty.Access.WRITE_ONLY)
    private String region;

    /**
     * This is the regional replication state. Possible values include:
     * 'Unknown', 'Replicating', 'Completed', 'Failed'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private ReplicationState state;

    /**
     * The details of the replication status.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private String details;

    /**
     * It indicates progress of the replication job.
     */
    @JsonProperty(value = "progress", access = JsonProperty.Access.WRITE_ONLY)
    private Integer progress;

    /**
     * Get the region where the gallery image version is published to.
     *
     * @return the region value
     */
    public String region() {
        return this.region;
    }

    /**
     * Get this is the regional replication state. Possible values include: 'Unknown', 'Replicating', 'Completed', 'Failed'.
     *
     * @return the state value
     */
    public ReplicationState state() {
        return this.state;
    }

    /**
     * Get the details of the replication status.
     *
     * @return the details value
     */
    public String details() {
        return this.details;
    }

    /**
     * Get it indicates progress of the replication job.
     *
     * @return the progress value
     */
    public Integer progress() {
        return this.progress;
    }

}
