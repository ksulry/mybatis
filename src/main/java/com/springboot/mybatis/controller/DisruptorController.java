package com.springboot.mybatis.controller;

import com.springboot.mybatis.disruptor.DisruptorMqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/19  19:17
 */
@RestController
public class DisruptorController {
    @Autowired
    private DisruptorMqService service;

    @GetMapping("/sendDisruptorMes")
    public String sendDisruptorMes(String msg){
        service.sayHelloMq(msg);
        return "success";
    }
}
