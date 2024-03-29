
package com.mulesoft.marklogic.processors;

import java.util.Map;
import javax.annotation.Generated;
import org.mule.DefaultMuleEvent;
import org.mule.DefaultMuleMessage;
import org.mule.MessageExchangePattern;
import org.mule.RequestContext;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.MuleSession;
import org.mule.api.callback.SourceCallback;
import org.mule.api.processor.MessageProcessor;
import org.mule.session.DefaultMuleSession;

@Generated(value = "Mule DevKit Version 3.3.1", date = "2012-09-19T03:49:43-03:00", comments = "Build UNNAMED.1297.150f2c9")
public abstract class AbstractListeningMessageProcessor<O >
    extends AbstractMessageProcessor<O>
    implements SourceCallback
{

    /**
     * Message processor that will get called for processing incoming events
     * 
     */
    private MessageProcessor messageProcessor;

    /**
     * Retrieves messageProcessor
     * 
     */
    public MessageProcessor getMessageProcessor() {
        return this.messageProcessor;
    }

    /**
     * Sets the message processor that will "listen" the events generated by this message source
     * 
     * @param listener Message processor
     */
    public void setListener(MessageProcessor listener) {
        this.messageProcessor = listener;
    }

    /**
     * Implements {@link SourceCallback#process(org.mule.api.MuleEvent)}. This message source will be passed on to the actual pojo's method as a callback mechanism.
     * 
     */
    public Object process(Object message)
        throws Exception
    {
        MuleMessage muleMessage;
        muleMessage = new DefaultMuleMessage(message, getMuleContext());
        MuleSession muleSession;
        muleSession = new DefaultMuleSession(getFlowConstruct(), getMuleContext());
        MuleEvent muleEvent;
        muleEvent = new DefaultMuleEvent(muleMessage, MessageExchangePattern.ONE_WAY, muleSession);
        try {
            MuleEvent responseEvent;
            responseEvent = messageProcessor.process(muleEvent);
            if ((responseEvent!= null)&&(responseEvent.getMessage()!= null)) {
                return responseEvent.getMessage().getPayload();
            }
        } catch (Exception e) {
            throw e;
        }
        return null;
    }

    /**
     * Implements {@link SourceCallback#process(org.mule.api.MuleEvent)}. This message source will be passed on to the actual pojo's method as a callback mechanism.
     * 
     */
    public Object process(Object message, Map<String, Object> properties)
        throws Exception
    {
        MuleMessage muleMessage;
        muleMessage = new DefaultMuleMessage(message, properties, null, null, getMuleContext());
        MuleSession muleSession;
        muleSession = new DefaultMuleSession(getFlowConstruct(), getMuleContext());
        MuleEvent muleEvent;
        muleEvent = new DefaultMuleEvent(muleMessage, MessageExchangePattern.ONE_WAY, muleSession);
        try {
            MuleEvent responseEvent;
            responseEvent = messageProcessor.process(muleEvent);
            if ((responseEvent!= null)&&(responseEvent.getMessage()!= null)) {
                return responseEvent.getMessage().getPayload();
            }
        } catch (Exception e) {
            throw e;
        }
        return null;
    }

    /**
     * Implements {@link SourceCallback#process()}. This message source will be passed on to the actual pojo's method as a callback mechanism.
     * 
     */
    public Object process()
        throws Exception
    {
        try {
            MuleEvent responseEvent;
            responseEvent = messageProcessor.process(RequestContext.getEvent());
            if ((responseEvent!= null)&&(responseEvent.getMessage()!= null)) {
                return responseEvent.getMessage().getPayload();
            }
        } catch (Exception e) {
            throw e;
        }
        return null;
    }

}
