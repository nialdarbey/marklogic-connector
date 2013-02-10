
package com.mulesoft.marklogic.adapters;

import javax.annotation.Generated;
import com.mulesoft.marklogic.MarkLogic;
import org.mule.api.MuleEvent;
import org.mule.api.process.ProcessAdapter;
import org.mule.api.process.ProcessCallback;
import org.mule.api.process.ProcessTemplate;
import org.mule.api.process.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;


/**
 * A <code>MarkLogicProcessAdapter</code> is a wrapper around {@link MarkLogic } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.3.1", date = "2012-09-19T03:49:43-03:00", comments = "Build UNNAMED.1297.150f2c9")
public class MarkLogicProcessAdapter
    extends MarkLogicLifecycleAdapter
    implements ProcessAdapter<MarkLogicCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, MarkLogicCapabilitiesAdapter> getProcessTemplate() {
        final MarkLogicCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,MarkLogicCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, MarkLogicCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
