
package com.mulesoft.marklogic.config;

import javax.annotation.Generated;
import com.mulesoft.marklogic.adapters.MarkLogicProcessAdapter;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@Generated(value = "Mule DevKit Version 3.3.1", date = "2012-09-19T03:49:43-03:00", comments = "Build UNNAMED.1297.150f2c9")
public class MarkLogicConfigDefinitionParser
    extends AbstractDefinitionParser
{


    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.rootBeanDefinition(MarkLogicProcessAdapter.class.getName());
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        setInitMethodIfNeeded(builder, MarkLogicProcessAdapter.class);
        setDestroyMethodIfNeeded(builder, MarkLogicProcessAdapter.class);
        parseProperty(builder, element, "server", "server");
        parseProperty(builder, element, "port", "port");
        parseProperty(builder, element, "database", "database");
        parseProperty(builder, element, "username", "username");
        parseProperty(builder, element, "password", "password");
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

}
