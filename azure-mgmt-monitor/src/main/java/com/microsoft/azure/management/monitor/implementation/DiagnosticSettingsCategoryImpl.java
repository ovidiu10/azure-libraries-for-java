/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.monitor.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.monitor.CategoryType;
import com.microsoft.azure.management.monitor.DiagnosticSettingsCategory;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.WrapperImpl;

/**
 * The Azure {@link DiagnosticSettingsCategory} wrapper class implementation.
 */
@LangDefinition(ContainerName = "/Microsoft.Azure.Management.Monitor.Fluent.Models")
class DiagnosticSettingsCategoryImpl
        extends WrapperImpl<DiagnosticSettingsCategoryResourceInner> implements DiagnosticSettingsCategory {

    DiagnosticSettingsCategoryImpl(DiagnosticSettingsCategoryResourceInner innerObject) {
        super(innerObject);
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public CategoryType type() {
        return this.inner().categoryType();
    }
}
