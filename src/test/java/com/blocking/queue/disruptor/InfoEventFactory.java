package com.blocking.queue.disruptor;

import com.blocking.queue.InfoEvent;
import com.lmax.disruptor.EventFactory;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/24  19:21
 */
public class InfoEventFactory implements EventFactory<InfoEvent> {
    public InfoEvent newInstance() {
        return new InfoEvent();
    }

}
