package org.minis.beans.factory.xml;

import org.dom4j.Element;
import org.minis.beans.BeanDefinition;
import org.minis.beans.factory.BeanFactory;
import org.minis.core.Resource;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/15 15:17
 */
public class XmlBeanDefinitionReader {
    BeanFactory beanFactory;
    public XmlBeanDefinitionReader(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public void loadBeanDefinition(Resource resource) {
        while (resource.hasNext()) {
            Element element = (Element) resource.next();
            String beanID = element.attributeValue("id");
            String beanClassName = element.attributeValue("class");
            BeanDefinition beanDefinition = new BeanDefinition(beanID, beanClassName);
            this.beanFactory.registerBeanDefinition(beanDefinition);
        }
    }
}
