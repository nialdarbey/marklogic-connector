
package com.mulesoft.marklogic.adapters;

import javax.annotation.Generated;
import com.mulesoft.marklogic.MarkLogic;
import org.mule.api.MetadataAware;


/**
 * A <code>MarkLogicMetadataAdapater</code> is a wrapper around {@link MarkLogic } that adds support for querying metadata about the extension.
 * 
 */
@Generated(value = "Mule DevKit Version 3.3.1", date = "2012-09-19T03:49:43-03:00", comments = "Build UNNAMED.1297.150f2c9")
public class MarkLogicMetadataAdapater
    extends MarkLogicCapabilitiesAdapter
    implements MetadataAware
{

    private final static String MODULE_NAME = "MarkLogic";
    private final static String MODULE_VERSION = "1.0-SNAPSHOT";
    private final static String DEVKIT_VERSION = "3.3.1";
    private final static String DEVKIT_BUILD = "UNNAMED.1297.150f2c9";

    public String getModuleName() {
        return MODULE_NAME;
    }

    public String getModuleVersion() {
        return MODULE_VERSION;
    }

    public String getDevkitVersion() {
        return DEVKIT_VERSION;
    }

    public String getDevkitBuild() {
        return DEVKIT_BUILD;
    }

}
