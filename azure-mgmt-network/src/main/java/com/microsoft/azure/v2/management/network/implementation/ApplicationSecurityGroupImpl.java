/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.v2.management.network.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.v2.management.network.ApplicationSecurityGroup;
import com.microsoft.azure.v2.management.resources.fluentcore.arm.models.implementation.GroupableResourceImpl;
import io.reactivex.Maybe;
import io.reactivex.Observable;

/**
 *  Implementation for ApplicationSecurityGroup and its create and update interfaces.
 */
@LangDefinition
class ApplicationSecurityGroupImpl
        extends GroupableResourceImpl<
                ApplicationSecurityGroup,
                ApplicationSecurityGroupInner,
                ApplicationSecurityGroupImpl,
                NetworkManager>
        implements
        ApplicationSecurityGroup,
        ApplicationSecurityGroup.Definition,
        ApplicationSecurityGroup.Update {

    ApplicationSecurityGroupImpl(
            final String name,
            final ApplicationSecurityGroupInner innerModel,
            final NetworkManager networkManager) {
        super(name, innerModel, networkManager);
    }

    @Override
    protected Maybe<ApplicationSecurityGroupInner> getInnerAsync() {
        return this.manager().inner().applicationSecurityGroups().getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public Observable<ApplicationSecurityGroup> createResourceAsync() {
        return this.manager().inner().applicationSecurityGroups().createOrUpdateAsync(resourceGroupName(), name(), inner())
                .map(innerToFluentMap(this))
                .toObservable();
    }

    @Override
    public String resourceGuid() {
        return inner().resourceGuid();
    }

    @Override
    public String provisioningState() {
        return inner().provisioningState();
    }
}
