package org.minis.beans.factory.xml;

import org.dom4j.Element;
import org.minis.beans.BeanDefinition;
import org.minis.beans.factory.SimpleBeanFactory;
import org.minis.core.Resource;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/15 15:17
 */
public class XmlBeanDefinitionReader {
    SimpleBeanFactory simpleBeanFactory;

    public XmlBeanDefinitionReader(SimpleBeanFactory simpleBeanFactory) {
        this.simpleBeanFactory = simpleBeanFactory;
    }

    public void loadBeanDefinition(Resource resource) {
        while (resource.hasNext()) {
            Element element = (Element) resource.next();
            String beanID = element.attributeValue("id");
            String beanClassName = element.attributeValue("class");
            BeanDefinition beanDefinition = new BeanDefinition(beanID, beanClassName);
            this.simpleBeanFactory.registerBeanDefinition(beanDefinition);
        }
    }
}
