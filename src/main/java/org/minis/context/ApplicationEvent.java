package org.minis.context;

import java.util.EventObject;

/**
 * @author 滕广银
 * @description TODO
 * @date 2023/3/16 9:47
 */
public class ApplicationEvent extends EventObject {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
