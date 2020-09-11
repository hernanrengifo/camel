
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
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.message.Feedback
 */
@ApiParams(apiName = "message-feedback", apiMethods = "creator")
@UriParams
@Configurer
public final class MessageFeedbackEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(apiMethods = "creator", description = "The SID of the Account that will create the resource")
    private String pathAccountSid;
    @UriParam
    @ApiParam(apiMethods = "creator", description = "The SID of the Message resource for which the feedback was provided")
    private String pathMessageSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathMessageSid() {
        return pathMessageSid;
    }

    public void setPathMessageSid(String pathMessageSid) {
        this.pathMessageSid = pathMessageSid;
    }
}
