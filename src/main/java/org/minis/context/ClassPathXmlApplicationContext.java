package org.minis.context;

import org.minis.beans.BeansException;
import org.minis.beans.factory.BeanFactory;
import org.minis.core.ClassPathXmlResource;
import org.minis.core.Resource;


/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/14 11:48
 */
public class ClassPathXmlApplicationContext implements BeanFactory, ApplicationEventPublisher
{
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
    public boolean isSingleton(String name) {
        return false;
    }

    @Override
    public boolean isPrototype(String name) {
        return false;
    }

    @Override
    public Class<?> getType(String name) {
        return null;
    }

    @Override
    public void registerBean(String beanName, Object obj) {
        this.beanFactory.registerBean(beanName, obj);
    }

    @Override
    public void publishEvent(ApplicationEvent event) {

    }
}
