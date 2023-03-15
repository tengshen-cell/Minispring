package org.minis.beans;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/14 11:34
 */
public class BeanDefinition {
    private String id;

    private String className;

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
}
