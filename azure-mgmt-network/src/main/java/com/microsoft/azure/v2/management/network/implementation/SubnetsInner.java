/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.microsoft.azure.v2.AzureProxy;
import com.microsoft.azure.v2.CloudException;
import com.microsoft.azure.v2.OperationStatus;
import com.microsoft.azure.v2.Page;
import com.microsoft.azure.v2.PagedList;
import com.microsoft.azure.v2.util.ServiceFutureUtil;
import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.OperationDescription;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.Validator;
import com.microsoft.rest.v2.VoidResponse;
import com.microsoft.rest.v2.annotations.BodyParam;
import com.microsoft.rest.v2.annotations.DELETE;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.PUT;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.ResumeOperation;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * Subnets.
 */
public final class SubnetsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private SubnetsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of SubnetsInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public SubnetsInner(NetworkManagementClientImpl client) {
        this.service = AzureProxy.create(SubnetsService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for Subnets to be used by the
     * proxy service to perform REST calls.
     */
    @Host("https://management.azure.com")
    private interface SubnetsService {
        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Observable<OperationStatus<Void>> beginDelete(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("subnetName") String subnetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<VoidResponse> delete(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("subnetName") String subnetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @DELETE("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        @ResumeOperation
        Observable<OperationStatus<Void>> resumeDelete(OperationDescription operationDescription);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<SubnetInner>> get(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("subnetName") String subnetName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @QueryParam("$expand") String expand, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Observable<OperationStatus<SubnetInner>> beginCreateOrUpdate(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("subnetName") String subnetName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json; charset=utf-8") SubnetInner subnetParameters, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<SubnetInner>> createOrUpdate(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("subnetName") String subnetName, @PathParam("subscriptionId") String subscriptionId, @BodyParam("application/json; charset=utf-8") SubnetInner subnetParameters, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets/{subnetName}")
        @ExpectedResponses({200, 201, 202, 204})
        @UnexpectedResponseExceptionType(CloudException.class)
        @ResumeOperation
        Observable<OperationStatus<SubnetInner>> resumeCreateOrUpdate(OperationDescription operationDescription);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{virtualNetworkName}/subnets")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<PageImpl<SubnetInner>>> list(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualNetworkName") String virtualNetworkName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @GET("{nextUrl}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<PageImpl<SubnetInner>>> listNext(@PathParam(value = "nextUrl", encoded = true) String nextUrl, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void beginDelete(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName) {
        beginDeleteAsync(resourceGroupName, virtualNetworkName, subnetName).blockingLast();
    }

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;Void&gt; object.
     */
    public ServiceFuture<Void> beginDeleteAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName, ServiceCallback<Void> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginDeleteAsync(resourceGroupName, virtualNetworkName, subnetName), serviceCallback);
    }

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> beginDeleteAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (subnetName == null) {
            throw new IllegalArgumentException("Parameter subnetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.beginDelete(resourceGroupName, virtualNetworkName, subnetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    public void delete(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName) {
        deleteAsync(resourceGroupName, virtualNetworkName, subnetName).blockingAwait();
    }

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<Void> deleteAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName, ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromBody(deleteAsync(resourceGroupName, virtualNetworkName, subnetName), serviceCallback);
    }

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<VoidResponse> deleteWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (subnetName == null) {
            throw new IllegalArgumentException("Parameter subnetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.delete(resourceGroupName, virtualNetworkName, subnetName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Completable deleteAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName) {
        return deleteWithRestResponseAsync(resourceGroupName, virtualNetworkName, subnetName)
            .toCompletable();
    }

    /**
     * Deletes the specified subnet. (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<Void>> resumeDelete(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeDelete(operationDescription);
    }

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SubnetInner object if successful.
     */
    public SubnetInner get(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName) {
        return getAsync(resourceGroupName, virtualNetworkName, subnetName).blockingGet();
    }

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<SubnetInner> getAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName, ServiceCallback<SubnetInner> serviceCallback) {
        return ServiceFuture.fromBody(getAsync(resourceGroupName, virtualNetworkName, subnetName), serviceCallback);
    }

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<SubnetInner>> getWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (subnetName == null) {
            throw new IllegalArgumentException("Parameter subnetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        final String expand = null;
        return service.get(resourceGroupName, virtualNetworkName, subnetName, this.client.subscriptionId(), apiVersion, expand, this.client.acceptLanguage());
    }

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<SubnetInner> getAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName) {
        return getWithRestResponseAsync(resourceGroupName, virtualNetworkName, subnetName)
            .flatMapMaybe((BodyResponse<SubnetInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SubnetInner object if successful.
     */
    public SubnetInner get(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName, String expand) {
        return getAsync(resourceGroupName, virtualNetworkName, subnetName, expand).blockingGet();
    }

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param expand Expands referenced resources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<SubnetInner> getAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName, String expand, ServiceCallback<SubnetInner> serviceCallback) {
        return ServiceFuture.fromBody(getAsync(resourceGroupName, virtualNetworkName, subnetName, expand), serviceCallback);
    }

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<SubnetInner>> getWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName, String expand) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (subnetName == null) {
            throw new IllegalArgumentException("Parameter subnetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.get(resourceGroupName, virtualNetworkName, subnetName, this.client.subscriptionId(), apiVersion, expand, this.client.acceptLanguage());
    }

    /**
     * Gets the specified subnet by virtual network and resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param expand Expands referenced resources.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<SubnetInner> getAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName, String expand) {
        return getWithRestResponseAsync(resourceGroupName, virtualNetworkName, subnetName, expand)
            .flatMapMaybe((BodyResponse<SubnetInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SubnetInner object if successful.
     */
    public SubnetInner beginCreateOrUpdate(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName, @NonNull SubnetInner subnetParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, virtualNetworkName, subnetName, subnetParameters).blockingLast().result();
    }

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the ServiceFuture&lt;SubnetInner&gt; object.
     */
    public ServiceFuture<SubnetInner> beginCreateOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName, @NonNull SubnetInner subnetParameters, ServiceCallback<SubnetInner> serviceCallback) {
        return ServiceFutureUtil.fromLRO(beginCreateOrUpdateAsync(resourceGroupName, virtualNetworkName, subnetName, subnetParameters), serviceCallback);
    }

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<SubnetInner>> beginCreateOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName, @NonNull SubnetInner subnetParameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (subnetName == null) {
            throw new IllegalArgumentException("Parameter subnetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (subnetParameters == null) {
            throw new IllegalArgumentException("Parameter subnetParameters is required and cannot be null.");
        }
        Validator.validate(subnetParameters);
        final String apiVersion = "2018-06-01";
        return service.beginCreateOrUpdate(resourceGroupName, virtualNetworkName, subnetName, this.client.subscriptionId(), subnetParameters, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the SubnetInner object if successful.
     */
    public SubnetInner createOrUpdate(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName, @NonNull SubnetInner subnetParameters) {
        return createOrUpdateAsync(resourceGroupName, virtualNetworkName, subnetName, subnetParameters).blockingGet();
    }

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<SubnetInner> createOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName, @NonNull SubnetInner subnetParameters, ServiceCallback<SubnetInner> serviceCallback) {
        return ServiceFuture.fromBody(createOrUpdateAsync(resourceGroupName, virtualNetworkName, subnetName, subnetParameters), serviceCallback);
    }

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<SubnetInner>> createOrUpdateWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName, @NonNull SubnetInner subnetParameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (subnetName == null) {
            throw new IllegalArgumentException("Parameter subnetName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (subnetParameters == null) {
            throw new IllegalArgumentException("Parameter subnetParameters is required and cannot be null.");
        }
        Validator.validate(subnetParameters);
        final String apiVersion = "2018-06-01";
        return service.createOrUpdate(resourceGroupName, virtualNetworkName, subnetName, this.client.subscriptionId(), subnetParameters, apiVersion, this.client.acceptLanguage());
    }

    /**
     * Creates or updates a subnet in the specified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create or update subnet operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<SubnetInner> createOrUpdateAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName, @NonNull String subnetName, @NonNull SubnetInner subnetParameters) {
        return createOrUpdateWithRestResponseAsync(resourceGroupName, virtualNetworkName, subnetName, subnetParameters)
            .flatMapMaybe((BodyResponse<SubnetInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Creates or updates a subnet in the specified virtual network. (resume watch).
     *
     * @param operationDescription The OperationDescription object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable for the request.
     */
    public Observable<OperationStatus<SubnetInner>> resumeCreateOrUpdate(OperationDescription operationDescription) {
        if (operationDescription == null) {
            throw new IllegalArgumentException("Parameter operationDescription is required and cannot be null.");
        }
        return service.resumeCreateOrUpdate(operationDescription);
    }

    /**
     * Gets all subnets in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;SubnetInner&gt; object if successful.
     */
    public PagedList<SubnetInner> list(@NonNull String resourceGroupName, @NonNull String virtualNetworkName) {
        Page<SubnetInner> response = listSinglePageAsync(resourceGroupName, virtualNetworkName).blockingGet();
        return new PagedList<SubnetInner>(response) {
            @Override
            public Page<SubnetInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * Gets all subnets in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable to the PagedList&lt;SubnetInner&gt; object.
     */
    public Observable<Page<SubnetInner>> listAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName) {
        return listSinglePageAsync(resourceGroupName, virtualNetworkName)
            .toObservable()
            .concatMap((Page<SubnetInner> page) -> {
                String nextPageLink = page.nextPageLink();
                if (nextPageLink == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listNextAsync(nextPageLink));
            });
    }

    /**
     * Gets all subnets in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the Single&lt;Page&lt;SubnetInner&gt;&gt; object if successful.
     */
    public Single<Page<SubnetInner>> listSinglePageAsync(@NonNull String resourceGroupName, @NonNull String virtualNetworkName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (virtualNetworkName == null) {
            throw new IllegalArgumentException("Parameter virtualNetworkName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.list(resourceGroupName, virtualNetworkName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<SubnetInner>> res) -> res.body());
    }

    /**
     * Gets all subnets in a virtual network.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;SubnetInner&gt; object if successful.
     */
    public PagedList<SubnetInner> listNext(@NonNull String nextPageLink) {
        Page<SubnetInner> response = listNextSinglePageAsync(nextPageLink).blockingGet();
        return new PagedList<SubnetInner>(response) {
            @Override
            public Page<SubnetInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * Gets all subnets in a virtual network.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable to the PagedList&lt;SubnetInner&gt; object.
     */
    public Observable<Page<SubnetInner>> listNextAsync(@NonNull String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .toObservable()
            .concatMap((Page<SubnetInner> page) -> {
                String nextPageLink1 = page.nextPageLink();
                if (nextPageLink1 == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listNextAsync(nextPageLink1));
            });
    }

    /**
     * Gets all subnets in a virtual network.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the Single&lt;Page&lt;SubnetInner&gt;&gt; object if successful.
     */
    public Single<Page<SubnetInner>> listNextSinglePageAsync(@NonNull String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<SubnetInner>> res) -> res.body());
    }
}
