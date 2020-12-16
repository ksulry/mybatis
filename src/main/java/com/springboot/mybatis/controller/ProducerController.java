/*
package com.springboot.mybatis.controller;

import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.apache.rocketmq.spring.support.RocketMQHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;

*/
/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/10  16:57
 *//*

@RestController
public class ProducerController {

    @Resource
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping("/send")
    public String send(String msg) throws UnsupportedEncodingException {
        //6.创建消息对象，指定主题Topic、Tag和消息体 String topic, String tags, String keys, byte[] body
        Message message = new Message("Topic_transaction_demo", //主题
                "Tags", //主要用于消息过滤
                "Key_1", //消息唯一值
                ("hello-transaction").getBytes(RemotingHelper.DEFAULT_CHARSET));

  */
/*      rocketMQTemplate.asyncSend("test-topic1:tag1", rocketMsg, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                System.out.println("async onSucess SendResult=" + sendResult.toString());
            }

            @Override
            public void onException(Throwable throwable) {
                System.out.println("异步消息发送失败！！！");
            }
        });*//*

        //发送事务消息
        //rocketMQTemplate.sendMessageInTransaction();
        return "success";
    }
}
*/
