package com.springboot.mybatis.controller;

import com.alibaba.fastjson.JSON;
import com.springboot.mybatis.entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class RabbitmqController {
    @Autowired
    private AmqpTemplate amqpTemplate;

    @RequestMapping("/mq/sent")
    public void send(){
        User user = new User();
        user.setAge(10);
        user.setId(UUID.randomUUID().hashCode());
        user.setName(UUID.randomUUID().toString());
        amqpTemplate.convertAndSend("TestDirectExchange", "TestDirectRouting", JSON.toJSONString(user));
        //System.out.println("send message:"+ );
    }
}
