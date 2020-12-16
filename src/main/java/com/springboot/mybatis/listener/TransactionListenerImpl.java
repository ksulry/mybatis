/*
package com.springboot.mybatis.listener;

import org.apache.rocketmq.spring.annotation.RocketMQTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQLocalTransactionListener;
import org.apache.rocketmq.spring.core.RocketMQLocalTransactionState;
import org.springframework.messaging.Message;

*/
/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/13  17:53
 *//*

@RocketMQTransactionListener(txProducerGroup = "TX_PGROUP_NAME")

public class TransactionListenerImpl implements RocketMQLocalTransactionListener {


    @Override
    public RocketMQLocalTransactionState executeLocalTransaction(Message message, Object o) {
        System.out.println("打印一下收到的消息executeLocalTransaction:" + message.toString());
        return RocketMQLocalTransactionState.COMMIT;
    }

    @Override
    public RocketMQLocalTransactionState checkLocalTransaction(Message message) {
        System.out.println("打印一下收到的消息checkLocalTransaction:" + message.toString());
        return null;
    }
}

*/
