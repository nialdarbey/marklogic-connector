
package com.mulesoft.marklogic.adapters;

import javax.annotation.Generated;
import com.mulesoft.marklogic.MarkLogic;
import org.mule.api.Capabilities;
import org.mule.api.Capability;


/**
 * A <code>MarkLogicCapabilitiesAdapter</code> is a wrapper around {@link MarkLogic } that implements {@link org.mule.api.Capabilities} interface.
 * 
 */
@Generated(value = "Mule DevKit Version 3.3.1", date = "2012-09-19T03:49:43-03:00", comments = "Build UNNAMED.1297.150f2c9")
public class MarkLogicCapabilitiesAdapter
    extends MarkLogic
    implements Capabilities
{


    /**
     * Returns true if this module implements such capability
     * 
     */
    public boolean isCapableOf(Capability capability) {
        if (capability == Capability.LIFECYCLE_CAPABLE) {
            return true;
        }
        return false;
    }

}
