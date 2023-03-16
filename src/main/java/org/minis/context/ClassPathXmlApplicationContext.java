package org.minis.context;

import org.minis.beans.BeanDefinition;
import org.minis.beans.BeansException;
import org.minis.beans.factory.BeanFactory;
import org.minis.core.ClassPathXmlResource;
import org.minis.core.Resource;


/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/14 11:48
 */
public class ClassPathXmlApplicationContext implements BeanFactory {
    BeanFactory beanFactory;

    public ClassPathXmlApplicationContext(String fileName) {
        Resource resource = new ClassPathXmlResource(fileName);
    }

    @Override
    public Object getBean(String beanName) throws BeansException {
        return null;
    }

    @Override
    public Boolean containBean(String name) {
        return null;
    }

    @Override
    public void registerBean(String beanName, Object obj) {
        this.beanFactory.registerBean(beanName, obj);
    }
}
