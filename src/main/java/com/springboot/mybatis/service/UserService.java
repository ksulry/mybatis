package com.springboot.mybatis.service;


import com.springboot.mybatis.entity.User;
import com.springboot.mybatis.mapper.test1.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service //声明为服务
public class UserService {

    @Autowired //注入userMapper
    private UserMapper userMapper;

    public String show() {
        return "Hello World!";
    }

    //插入用户
    public String insert(String name, int age) { //插入一条记录
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userMapper.insert(user);
        return "Insert ( \""+name+"\", age"+age+") OK!";
    }

    //根据年龄查询用户
    public List<User> select(int age) {
        return userMapper.select(age);
    }

    public int delete(int age) {
         userMapper.delete(age);
         return 0;
    }
    @Transactional("transactionManagerTest1")
    public int deleteTrx(int age,int age2) {
        try {
            userMapper.delete(age);
            System.out.println("开始睡眠!" + System.currentTimeMillis());
            Thread.sleep(12000);
            System.out.println("睡眠结束!" + System.currentTimeMillis());
            userMapper.delete(age2);
       } catch (Exception e) {
            System.out.println("出现异常:");
            e.printStackTrace();
        }
        return 0;
    }

    @Transactional
    public int deleteId(int id,int id2) {
        try {
            userMapper.deleteId(id);
            System.out.println("开始睡眠!" + System.currentTimeMillis());
            Thread.sleep(22000);
            System.out.println("睡眠结束!" + System.currentTimeMillis());
            userMapper.deleteId(id2);
        } catch (Exception e) {
            System.out.println("出现异常:");
            e.printStackTrace();
        }
        return 0;
    }
}


