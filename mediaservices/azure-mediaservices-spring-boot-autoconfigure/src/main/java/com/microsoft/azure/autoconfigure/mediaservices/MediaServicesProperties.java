/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */

package com.microsoft.azure.autoconfigure.mediaservices;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Validated
@ConfigurationProperties("azure.mediaservices")
public class MediaServicesProperties {
    /**
     * Media service account name.
     */
    @NotEmpty
    private String accountName;

    /**
     * Media service account key.
     */
    @NotEmpty
    private String accountKey;

    /**
     * Proxy host if to use proxy.
     */
    private String proxyHost;

    /**
     * Proxy port if to use proxy.
     */
    private String proxyPort;

    /**
     * Proxy scheme if to use proxy. Default is http.
     */
    private String proxyScheme = "http";

    /**
     * Media service configuration URI.
     */
    private String mediaServiceUri = "https://media.windows.net/API/";

    /**
     * Media service OAuth configuration URI.
     */
    private String oAuthUri = "https://wamsprodglobal001acs.accesscontrol.windows.net/v2/OAuth2-13";

    /**
     * Media service scope sent to OAuth.
     */
    private String scope = "urn:WindowsAzureMediaServices";

    /**
     * @return the mediaServiceUri
     */
    public String getMediaServiceUri() {
        return mediaServiceUri;
    }

    /**
     * @param mediaServiceUri the mediaServiceUri to set
     */
    public void setMediaServiceUri(String mediaServiceUri) {
        this.mediaServiceUri = mediaServiceUri;
    }

    /**
     * @return the oAuthUri
     */
    public String getoAuthUri() {
        return oAuthUri;
    }

    /**
     * @param oAuthUri the oAuthUri to set
     */
    public void setoAuthUri(String oAuthUri) {
        this.oAuthUri = oAuthUri;
    }

    /**
     * @return the accountName
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param accountName the accountName to set
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    /**
     * @return the accountKey
     */
    public String getAccountKey() {
        return accountKey;
    }

    /**
     * @param accountKey the accountKey to set
     */
    public void setAccountKey(String accountKey) {
        this.accountKey = accountKey;
    }

    /**
     * @return the scope
     */
    public String getScope() {
        return scope;
    }

    /**
     * @param scope the scope to set
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * @return the proxyHost
     */
    public String getProxyHost() {
        return proxyHost;
    }

    /**
     * @param proxyHost the proxyHost to set
     */
    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    /**
     * @return the proxyPort
     */
    public String getProxyPort() {
        return proxyPort;
    }

    /**
     * @param proxyPort the proxyPort to set
     */
    public void setProxyPort(String proxyPort) {
        this.proxyPort = proxyPort;
    }

    /**
     * @return the proxyScheme
     */
    public String getProxyScheme() {
        return proxyScheme;
    }

    /**
     * @param proxyScheme the proxyScheme to set
     */
    public void setProxyScheme(String proxyScheme) {
        this.proxyScheme = proxyScheme;
    }

}
