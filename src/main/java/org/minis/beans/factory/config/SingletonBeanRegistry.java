package org.minis.beans.factory.config;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/15 17:20
 */
public interface SingletonBeanRegistry {
    void registerSingleton(String beanName, Object singletonObject);
    Object getSingleton(String beanName);
    boolean containsSingleton(String beanName);
    String[] getSingletonNames();
}
