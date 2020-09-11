
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
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.usage.Trigger
 */
@ApiParams(apiName = "usage-trigger", apiMethods = "creator,deleter,fetcher,reader,updater")
@UriParams
@Configurer
public final class UsageTriggerEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = "creator", description = "The URL we call when the trigger fires")
    private java.net.URI callbackUrl;
    @UriParam
    @ApiParam(apiMethods = "creator,deleter,fetcher,reader,updater", description = "The SID of the Account that will create the resource")
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = "deleter,fetcher,updater", description = "The unique string that identifies the resource")
    private String pathSid;
    @UriParam
    @ApiParam(apiMethods = "creator", description = "The usage value at which the trigger should fire")
    private String triggerValue;
    @UriParam
    @ApiParam(apiMethods = "creator", description = "The usage category the trigger watches")
    private com.twilio.rest.api.v2010.account.usage.Trigger.UsageCategory usageCategory;

    public java.net.URI getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(java.net.URI callbackUrl) {
        this.callbackUrl = callbackUrl;
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

    public String getTriggerValue() {
        return triggerValue;
    }

    public void setTriggerValue(String triggerValue) {
        this.triggerValue = triggerValue;
    }

    public com.twilio.rest.api.v2010.account.usage.Trigger.UsageCategory getUsageCategory() {
        return usageCategory;
    }

    public void setUsageCategory(com.twilio.rest.api.v2010.account.usage.Trigger.UsageCategory usageCategory) {
        this.usageCategory = usageCategory;
    }
}
