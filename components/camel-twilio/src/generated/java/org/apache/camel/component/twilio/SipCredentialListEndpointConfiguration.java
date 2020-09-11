
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.sip.CredentialList
 */
@ApiParams(apiName = "sip-credential-list", apiMethods = "creator,deleter,fetcher,reader,updater")
@UriParams
@Configurer
public final class SipCredentialListEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = "creator,updater", description = "Human readable descriptive text")
    private String friendlyName;
    @UriParam
    @ApiParam(apiMethods = "creator,deleter,fetcher,reader,updater", description = "The unique id of the Account that is responsible for this resource")
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = "deleter,fetcher,updater", description = "Delete by unique credential list Sid")
    private String pathSid;

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
