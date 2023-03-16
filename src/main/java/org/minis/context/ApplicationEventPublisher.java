package org.minis.context;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/16 9:44
 */
public interface ApplicationEventPublisher {
    void publishEvent(ApplicationEvent event);
}
