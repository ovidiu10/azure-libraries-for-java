/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * HTTP configuration of the connectivity check.
 */
public final class HTTPConfiguration {
    /**
     * HTTP method. Possible values include: 'Get'.
     */
    @JsonProperty(value = "method")
    private HTTPMethod method;

    /**
     * List of HTTP headers.
     */
    @JsonProperty(value = "headers")
    private List<HTTPHeader> headers;

    /**
     * Valid status codes.
     */
    @JsonProperty(value = "validStatusCodes")
    private List<Integer> validStatusCodes;

    /**
     * Get the method value.
     *
     * @return the method value.
     */
    public HTTPMethod method() {
        return this.method;
    }

    /**
     * Set the method value.
     *
     * @param method the method value to set.
     * @return the HTTPConfiguration object itself.
     */
    public HTTPConfiguration withMethod(HTTPMethod method) {
        this.method = method;
        return this;
    }

    /**
     * Get the headers value.
     *
     * @return the headers value.
     */
    public List<HTTPHeader> headers() {
        return this.headers;
    }

    /**
     * Set the headers value.
     *
     * @param headers the headers value to set.
     * @return the HTTPConfiguration object itself.
     */
    public HTTPConfiguration withHeaders(List<HTTPHeader> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * Get the validStatusCodes value.
     *
     * @return the validStatusCodes value.
     */
    public List<Integer> validStatusCodes() {
        return this.validStatusCodes;
    }

    /**
     * Set the validStatusCodes value.
     *
     * @param validStatusCodes the validStatusCodes value to set.
     * @return the HTTPConfiguration object itself.
     */
    public HTTPConfiguration withValidStatusCodes(List<Integer> validStatusCodes) {
        this.validStatusCodes = validStatusCodes;
        return this;
    }
}
