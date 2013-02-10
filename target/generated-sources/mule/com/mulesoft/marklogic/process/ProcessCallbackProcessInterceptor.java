
package com.mulesoft.marklogic.process;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.process.ProcessCallback;
import org.mule.api.process.ProcessInterceptor;
import org.mule.api.processor.MessageProcessor;

@Generated(value = "Mule DevKit Version 3.3.1", date = "2012-09-19T03:49:43-03:00", comments = "Build UNNAMED.1297.150f2c9")
public class ProcessCallbackProcessInterceptor<T, O >implements ProcessInterceptor<T, O>
{


    public T execute(ProcessCallback<T, O> processCallback, O object, MessageProcessor messageProcessor, MuleEvent event)
        throws Exception
    {
        return processCallback.process(object);
    }

}
