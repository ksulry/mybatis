package com.springboot.mybatis.controller;

import com.alibaba.fastjson.JSON;
import com.springboot.mybatis.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/6/7  11:02
 */
@Controller
public class JRebelTestController {
    @RequestMapping("/jrebelt")
    @ResponseBody
    public String send() {
        return "hello JRebel";
    }
}
