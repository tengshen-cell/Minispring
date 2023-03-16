package org.minis.beans.factory;

import org.minis.beans.BeansException;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/15 14:23
 */
public interface BeanFactory {
    Object getBean(String beanName) throws BeansException;
    Boolean containBean(String name);
    void registerBean(String beanName, Object obj);
}
