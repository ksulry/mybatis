package com.springboot.mybatis.disruptor;

import com.lmax.disruptor.EventFactory;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/19  19:08
 */
public class HelloEventFactory implements EventFactory<MessageModel> {
    @Override
    public MessageModel newInstance() {
        return new MessageModel();
    }
}
