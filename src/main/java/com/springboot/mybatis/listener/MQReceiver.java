package com.springboot.mybatis.listener;

import com.springboot.mybatis.configuration.MQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

//@Service
public class MQReceiver {

    @RabbitListener(queues = MQConfig.QUEUE_NAME)
    public void receiver(String message){
        System.out.println("receiveMessage:"+message);
    }
}
