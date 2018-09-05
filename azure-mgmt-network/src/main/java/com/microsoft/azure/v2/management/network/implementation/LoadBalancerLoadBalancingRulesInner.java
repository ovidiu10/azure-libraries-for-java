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
import com.microsoft.azure.v2.Page;
import com.microsoft.azure.v2.PagedList;
import com.microsoft.rest.v2.BodyResponse;
import com.microsoft.rest.v2.ServiceCallback;
import com.microsoft.rest.v2.ServiceFuture;
import com.microsoft.rest.v2.annotations.ExpectedResponses;
import com.microsoft.rest.v2.annotations.GET;
import com.microsoft.rest.v2.annotations.HeaderParam;
import com.microsoft.rest.v2.annotations.Host;
import com.microsoft.rest.v2.annotations.PathParam;
import com.microsoft.rest.v2.annotations.QueryParam;
import com.microsoft.rest.v2.annotations.UnexpectedResponseExceptionType;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.annotations.NonNull;

/**
 * An instance of this class provides access to all the operations defined in
 * LoadBalancerLoadBalancingRules.
 */
public final class LoadBalancerLoadBalancingRulesInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private LoadBalancerLoadBalancingRulesService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of LoadBalancerLoadBalancingRulesInner.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public LoadBalancerLoadBalancingRulesInner(NetworkManagementClientImpl client) {
        this.service = AzureProxy.create(LoadBalancerLoadBalancingRulesService.class, client);
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * LoadBalancerLoadBalancingRules to be used by the proxy service to
     * perform REST calls.
     */
    @Host("https://management.azure.com")
    private interface LoadBalancerLoadBalancingRulesService {
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/loadBalancingRules")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<PageImpl<LoadBalancingRuleInner>>> list(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("loadBalancerName") String loadBalancerName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/loadBalancingRules/{loadBalancingRuleName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<LoadBalancingRuleInner>> get(@PathParam("resourceGroupName") String resourceGroupName, @PathParam("loadBalancerName") String loadBalancerName, @PathParam("loadBalancingRuleName") String loadBalancingRuleName, @PathParam("subscriptionId") String subscriptionId, @QueryParam("api-version") String apiVersion, @HeaderParam("accept-language") String acceptLanguage);

        @GET("{nextUrl}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(CloudException.class)
        Single<BodyResponse<PageImpl<LoadBalancingRuleInner>>> listNext(@PathParam(value = "nextUrl", encoded = true) String nextUrl, @HeaderParam("accept-language") String acceptLanguage);
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;LoadBalancingRuleInner&gt; object if successful.
     */
    public PagedList<LoadBalancingRuleInner> list(@NonNull String resourceGroupName, @NonNull String loadBalancerName) {
        Page<LoadBalancingRuleInner> response = listSinglePageAsync(resourceGroupName, loadBalancerName).blockingGet();
        return new PagedList<LoadBalancingRuleInner>(response) {
            @Override
            public Page<LoadBalancingRuleInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable to the PagedList&lt;LoadBalancingRuleInner&gt; object.
     */
    public Observable<Page<LoadBalancingRuleInner>> listAsync(@NonNull String resourceGroupName, @NonNull String loadBalancerName) {
        return listSinglePageAsync(resourceGroupName, loadBalancerName)
            .toObservable()
            .concatMap((Page<LoadBalancingRuleInner> page) -> {
                String nextPageLink = page.nextPageLink();
                if (nextPageLink == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listNextAsync(nextPageLink));
            });
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the Single&lt;Page&lt;LoadBalancingRuleInner&gt;&gt; object if successful.
     */
    public Single<Page<LoadBalancingRuleInner>> listSinglePageAsync(@NonNull String resourceGroupName, @NonNull String loadBalancerName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (loadBalancerName == null) {
            throw new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.list(resourceGroupName, loadBalancerName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<LoadBalancingRuleInner>> res) -> res.body());
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the LoadBalancingRuleInner object if successful.
     */
    public LoadBalancingRuleInner get(@NonNull String resourceGroupName, @NonNull String loadBalancerName, @NonNull String loadBalancingRuleName) {
        return getAsync(resourceGroupName, loadBalancerName, loadBalancingRuleName).blockingGet();
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a ServiceFuture which will be completed with the result of the network request.
     */
    public ServiceFuture<LoadBalancingRuleInner> getAsync(@NonNull String resourceGroupName, @NonNull String loadBalancerName, @NonNull String loadBalancingRuleName, ServiceCallback<LoadBalancingRuleInner> serviceCallback) {
        return ServiceFuture.fromBody(getAsync(resourceGroupName, loadBalancerName, loadBalancingRuleName), serviceCallback);
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Single<BodyResponse<LoadBalancingRuleInner>> getWithRestResponseAsync(@NonNull String resourceGroupName, @NonNull String loadBalancerName, @NonNull String loadBalancingRuleName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (loadBalancerName == null) {
            throw new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null.");
        }
        if (loadBalancingRuleName == null) {
            throw new IllegalArgumentException("Parameter loadBalancingRuleName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2018-06-01";
        return service.get(resourceGroupName, loadBalancerName, loadBalancingRuleName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage());
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return a Single which performs the network request upon subscription.
     */
    public Maybe<LoadBalancingRuleInner> getAsync(@NonNull String resourceGroupName, @NonNull String loadBalancerName, @NonNull String loadBalancingRuleName) {
        return getWithRestResponseAsync(resourceGroupName, loadBalancerName, loadBalancingRuleName)
            .flatMapMaybe((BodyResponse<LoadBalancingRuleInner> res) -> res.body() == null ? Maybe.empty() : Maybe.just(res.body()));
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the PagedList&lt;LoadBalancingRuleInner&gt; object if successful.
     */
    public PagedList<LoadBalancingRuleInner> listNext(@NonNull String nextPageLink) {
        Page<LoadBalancingRuleInner> response = listNextSinglePageAsync(nextPageLink).blockingGet();
        return new PagedList<LoadBalancingRuleInner>(response) {
            @Override
            public Page<LoadBalancingRuleInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).blockingGet();
            }
        };
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the observable to the PagedList&lt;LoadBalancingRuleInner&gt; object.
     */
    public Observable<Page<LoadBalancingRuleInner>> listNextAsync(@NonNull String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .toObservable()
            .concatMap((Page<LoadBalancingRuleInner> page) -> {
                String nextPageLink1 = page.nextPageLink();
                if (nextPageLink1 == null) {
                    return Observable.just(page);
                }
                return Observable.just(page).concatWith(listNextAsync(nextPageLink1));
            });
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @return the Single&lt;Page&lt;LoadBalancingRuleInner&gt;&gt; object if successful.
     */
    public Single<Page<LoadBalancingRuleInner>> listNextSinglePageAsync(@NonNull String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage())
            .map((BodyResponse<PageImpl<LoadBalancingRuleInner>> res) -> res.body());
    }
}
