/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure Blob Storage Container mounting configuration.
 */
public class AzureBlobFileSystemReference {
    /**
     * Account name.
     * Name of the Azure storage account.
     */
    @JsonProperty(value = "accountName", required = true)
    private String accountName;

    /**
     * Container name.
     * Name of the Azure Blob Storage container to mount on the cluster.
     */
    @JsonProperty(value = "containerName", required = true)
    private String containerName;

    /**
     * Credentials.
     * Information about the Azure storage credentials.
     */
    @JsonProperty(value = "credentials", required = true)
    private AzureStorageCredentialsInfo credentials;

    /**
     * Relative mount path.
     * The relative path on the compute node where the Azure File container
     * will be mounted. Note that all cluster level containers will be mounted
     * under $AZ_BATCHAI_MOUNT_ROOT location and all job level containers will
     * be mounted under $AZ_BATCHAI_JOB_MOUNT_ROOT.
     */
    @JsonProperty(value = "relativeMountPath", required = true)
    private String relativeMountPath;

    /**
     * Mount options.
     * Mount options for mounting blobfuse file system.
     */
    @JsonProperty(value = "mountOptions")
    private String mountOptions;

    /**
     * Get name of the Azure storage account.
     *
     * @return the accountName value
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set name of the Azure storage account.
     *
     * @param accountName the accountName value to set
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get name of the Azure Blob Storage container to mount on the cluster.
     *
     * @return the containerName value
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set name of the Azure Blob Storage container to mount on the cluster.
     *
     * @param containerName the containerName value to set
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get information about the Azure storage credentials.
     *
     * @return the credentials value
     */
    public AzureStorageCredentialsInfo credentials() {
        return this.credentials;
    }

    /**
     * Set information about the Azure storage credentials.
     *
     * @param credentials the credentials value to set
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withCredentials(AzureStorageCredentialsInfo credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * Get the relative path on the compute node where the Azure File container will be mounted. Note that all cluster level containers will be mounted under $AZ_BATCHAI_MOUNT_ROOT location and all job level containers will be mounted under $AZ_BATCHAI_JOB_MOUNT_ROOT.
     *
     * @return the relativeMountPath value
     */
    public String relativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * Set the relative path on the compute node where the Azure File container will be mounted. Note that all cluster level containers will be mounted under $AZ_BATCHAI_MOUNT_ROOT location and all job level containers will be mounted under $AZ_BATCHAI_JOB_MOUNT_ROOT.
     *
     * @param relativeMountPath the relativeMountPath value to set
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withRelativeMountPath(String relativeMountPath) {
        this.relativeMountPath = relativeMountPath;
        return this;
    }

    /**
     * Get mount options for mounting blobfuse file system.
     *
     * @return the mountOptions value
     */
    public String mountOptions() {
        return this.mountOptions;
    }

    /**
     * Set mount options for mounting blobfuse file system.
     *
     * @param mountOptions the mountOptions value to set
     * @return the AzureBlobFileSystemReference object itself.
     */
    public AzureBlobFileSystemReference withMountOptions(String mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }

}