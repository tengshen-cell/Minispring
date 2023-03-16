package org.minis.beans.factory.support;

import org.minis.beans.factory.config.BeanDefinition;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/16 15:52
 */
public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String name, BeanDefinition bd);

    void removeBeanDefinition(String name);

    BeanDefinition getBeanDefinition(String name);

    boolean containBeanDefinition(String name);
}
