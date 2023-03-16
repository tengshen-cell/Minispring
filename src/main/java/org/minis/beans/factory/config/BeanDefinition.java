package org.minis.beans.factory.config;

import org.minis.beans.ArgumentValues;
import org.minis.beans.PropertyValues;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/14 11:34
 */
public class BeanDefinition {

    String SCOPE_SINGLETON = "singleton";
    String SCOPE_PROTOTYPE = "prototype";

    public boolean isLazyInit() {
        return lazyInit;
    }

    public void setLazyInit(boolean lazyInit) {
        this.lazyInit = lazyInit;
    }

    private boolean lazyInit = false;

    private String[] dependsOn;

    private ArgumentValues constructorArgumentValues;

    private PropertyValues propertyValues;

    private String initMethodName;

    private volatile Object beanClass;

    private String id;

    private String className;

    private String scope = SCOPE_SINGLETON;



    public BeanDefinition(String id, String className) {
        this.id = id;
        this.className = className;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public boolean isSingleton() {
        return SCOPE_SINGLETON.equals(scope);
    }

    public boolean isPrototype() {
        return SCOPE_PROTOTYPE.equals(scope);
    }
}
