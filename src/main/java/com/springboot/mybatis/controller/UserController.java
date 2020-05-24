package com.springboot.mybatis.controller;

import com.springboot.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //声明为一个Restful的Controller
public class UserController {
    @Autowired //注入userService
    private UserService userService;

    //显示
    @RequestMapping(value = "/show")
    public String show() {
        return userService.show();
    }

    //插入用户
    @RequestMapping(value="/insert")
    public String insert(String name, int age) {
        return userService.insert(name, age);
    }

    //根据年龄查询用户
    @RequestMapping(value = "/select")
    public Object select(int age) {
        return userService.select(age);
    }

    //根据年龄删除用户(二级索引)
    @RequestMapping(value = "/delete")
    public Object delete(int age) {
        return userService.delete(age);
    }

    //根据年龄删除用户(二级索引)
    @RequestMapping(value = "/trx/delete")
    public Object deleteTrx(int age,int age2) {
        return userService.deleteTrx(age,age2);
    }

    //删除主键
    @RequestMapping(value = "/id/delete")
    public Object deleteId(int id,int id2) {
        return userService.deleteId(id,id2);
    }


}
