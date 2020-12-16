/*
package com.springboot.mybatis.listener;

import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.common.UtilAll;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.apache.rocketmq.spring.core.RocketMQPushConsumerLifecycleListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

*/
/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/10  16:58
 *//*

@Service
@RocketMQMessageListener(consumerGroup = "my-consumer_test-topic", topic = "test-topic", selectorExpression = "tag")
public class RocketConsumer implements RocketMQListener<Message>,RocketMQPushConsumerLifecycleListener {

    @Override
    public void onMessage(Message message) {
        System.err.println("接收到消息：" + message.getPayload());
    }
    //设置从当前时间点开始消费消息
    @Override
    public void prepareStart(DefaultMQPushConsumer consumer) {
        consumer.setConsumeFromWhere(ConsumeFromWhere.CONSUME_FROM_TIMESTAMP);
        consumer.setConsumeTimestamp(UtilAll.timeMillisToHumanString3(System.currentTimeMillis()));
    }
}
*/
