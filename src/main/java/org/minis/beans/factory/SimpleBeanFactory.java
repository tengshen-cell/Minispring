package org.minis.beans.factory;

import org.minis.beans.BeanDefinition;
import org.minis.beans.BeansException;
import org.minis.beans.factory.support.DefaultSingletonBeanRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 滕广银
 * @description 实现 BeanFactory扩展
 * @date 2023/3/15 15:46
 */
public class SimpleBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    private Map<String, BeanDefinition> beanDefinitions = new ConcurrentHashMap<>();
    private Map<String, Object> singletons = new HashMap<>();

    public SimpleBeanFactory() {

    }

    @Override
    public Object getBean(String beanName) throws BeansException {
        Object singleton = singletons.get(beanName);
        if (singleton == null) {
            BeanDefinition beanDefinition = beanDefinitions.get(beanName);
            if (beanDefinition == null) {
                throw new BeansException("No bean.");
            }
            try {
                singleton = Class.forName(beanDefinition.getClassName()).newInstance();
                this.registerSingleton(beanName, singleton);
            } catch (Exception e) {

            }

    }

        return singleton;
}

    @Override
    public void registerBeanDefinition(BeanDefinition beanDefinition) {
       this.beanDefinitions.put(beanDefinition.getId(), beanDefinition);
    }

    public Boolean containBean(String name) {
        return containsSingleton(name);
    }

    @Override
    public void registerBean(String beanName, Object obj) {
        this.registerSingleton(beanName, obj);
    }
}
