package com.springboot.mybatis.controller;

import com.springboot.mybatis.entity.Salaries;
import com.springboot.mybatis.entity.User;
import com.springboot.mybatis.service.SalariesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private SalariesService salariesService;

    @GetMapping("/get/{key}")
    public String getRedis(@PathVariable(name="key") String key){

        return stringRedisTemplate.opsForValue().get(key);
    }

    @PostMapping("/set/{key}/{value}")
    public String getRedis(@PathVariable(name="key")String key,@PathVariable(name="value")String value){
        stringRedisTemplate.opsForValue().set(key,value);
        return "SUCCESS";
    }


    @GetMapping("/postEntity")
    public String postEntity(User user){
        redisTemplate.opsForValue().set(user.getId(),user);
        return "SUCCESS";
    }

    @GetMapping("/getEntity/{key}")
    public Object getEntity(@PathVariable(name="key")String key){
        return redisTemplate.opsForValue().get(key);
    }

    @GetMapping("/mPostEntitys")
    public String getEntity(){
        System.out.println("开始执行:");
        long start = System.currentTimeMillis();
        List<Salaries> salariesList = salariesService.getSalariesList();
        System.out.println(salariesList.get(0).getToDate());
        long end1 = System.currentTimeMillis();
        System.out.println("查询所用时长:" + (end1 - start)/1000 + "秒");
        for (int i = 0; i < salariesList.size(); i++) {
            redisTemplate.opsForHash().put("salaries","salaries_" + i ,salariesList.get(i) );
        }
        long end = System.currentTimeMillis();
        System.out.println("redis所用时长:" + (end - end1)/1000 + "秒");
        return "success";
    }
    /*//这个bug后期处理
    @GetMapping("/mPostDB")
    public String mPostDB(){
        long salaries = 0;
        try {
            List<Object> list = new LinkedList<>();
            salaries = redisTemplate.opsForHash().size("salaries");

            Cursor<Map.Entry<Object,Object>> cursor = redisTemplate.opsForHash().scan("salaries",
                    ScanOptions.scanOptions().match("*").count(1000).build());
            while (cursor.hasNext()) {
                Object key = cursor.next().getKey();
                Object valueSet = cursor.next().getValue();
                list.add(valueSet);
                System.out.println(list.size());
            }
            System.out.println("sssss");
            //关闭cursor
            cursor.close();
            System.out.println("***********" + list.size());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("长度为:" + salaries);
            //return "false";
        }
        return "success";
    }*/
    @GetMapping("/mPostDB")
    public String mPostDB() {
        long salaries = 0;
        long start = System.currentTimeMillis();
        try {
            List<Object> list = new LinkedList<>();
            salaries = redisTemplate.opsForHash().size("salaries");
            List<Salaries> salariesList = redisTemplate.opsForHash().values("salaries");
            salariesList.forEach((salarie) -> {
                System.out.println(salarie.getSalary());
                System.out.println(salarie.getToDate());
                salariesService.insert(salarie);
            });
        } catch (Exception e) {
            e.printStackTrace();
           // System.out.println("长度为:" + salaries);
            //return "false";
        }
        long end = System.currentTimeMillis();
        System.out.println("运行总时长为:" + (end - start) / 1000 + "秒");
        return "success";
    }

    @RequestMapping ("/inserta")
    public String insert(){
        salariesService.get();
        return "su";
    }
}

