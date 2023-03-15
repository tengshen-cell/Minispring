package org.minis.beans;

/**
 * @author 滕广银
 * @description 自定义异常
 * @date 2023/3/15 14:19
 */
public class BeansException extends Exception {
    public BeansException() {
        super();
    }
    public BeansException(String msg) {
        super(msg);
    }
}
