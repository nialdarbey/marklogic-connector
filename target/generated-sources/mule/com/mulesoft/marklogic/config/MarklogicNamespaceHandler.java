
package com.mulesoft.marklogic.config;

import javax.annotation.Generated;
import org.springframework.beans.factory.xml.NamespaceHandlerSupport;


/**
 * Registers bean definitions parsers for handling elements in <code>http://www.mulesoft.org/schema/mule/marklogic</code>.
 * 
 */
@Generated(value = "Mule DevKit Version 3.3.1", date = "2012-09-19T03:49:43-03:00", comments = "Build UNNAMED.1297.150f2c9")
public class MarklogicNamespaceHandler
    extends NamespaceHandlerSupport
{


    /**
     * Invoked by the {@link DefaultBeanDefinitionDocumentReader} after construction but before any custom elements are parsed. 
     * @see NamespaceHandlerSupport#registerBeanDefinitionParser(String, BeanDefinitionParser)
     * 
     */
    public void init() {
        registerBeanDefinitionParser("config", new MarkLogicConfigDefinitionParser());
        registerBeanDefinitionParser("single-statement", new SingleStatementDefinitionParser());
        registerBeanDefinitionParser("begin-transaction", new BeginTransactionDefinitionParser());
        registerBeanDefinitionParser("multi-statement", new MultiStatementDefinitionParser());
        registerBeanDefinitionParser("commit-transaction", new CommitTransactionDefinitionParser());
        registerBeanDefinitionParser("rollback-transaction", new RollbackTransactionDefinitionParser());
    }

}
