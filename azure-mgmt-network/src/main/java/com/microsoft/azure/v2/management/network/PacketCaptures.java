/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.v2.management.network;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.v2.management.network.implementation.PacketCapturesInner;
import com.microsoft.azure.v2.management.resources.fluentcore.arm.collection.SupportsGettingByNameAsync;
import com.microsoft.azure.v2.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.v2.management.resources.fluentcore.collection.SupportsDeletingByName;
import com.microsoft.azure.v2.management.resources.fluentcore.collection.SupportsListing;
import com.microsoft.azure.v2.management.resources.fluentcore.model.HasInner;
import com.microsoft.rest.v2.annotations.Beta;

/**
 * Entry point to packet captures management API in Azure.
 */
@Fluent
@Beta
public interface PacketCaptures extends
        SupportsCreating<PacketCapture.DefinitionStages.WithTarget>,
        SupportsListing<PacketCapture>,
        SupportsGettingByNameAsync<PacketCapture>,
        SupportsDeletingByName,
        HasInner<PacketCapturesInner> {
}
