package com.springboot.mybatis.controller;

import com.springboot.mybatis.entity.BaseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/27  9:20
 */
@RestController
public class ValidatorController {
    @RequestMapping(value = "articleList")
    @ResponseBody
    public Map<String,String> articleList(@Valid BaseEntity article){
        Map<String,String> map = new HashMap<>();
        map.put("result","success");
        return map;
    }
}
