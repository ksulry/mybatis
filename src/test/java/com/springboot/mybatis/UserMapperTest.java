package com.springboot.mybatis;

import com.alibaba.fastjson.JSON;
import com.springboot.mybatis.entity.Persion;
import com.springboot.mybatis.entity.User;
import com.springboot.mybatis.mapper.test1.PersionMapper;
import com.springboot.mybatis.mapper.test1.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/20  18:39
 */
@SpringBootTest(classes = MybatisApplication.class)
@RunWith(SpringRunner.class)
public class UserMapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        List<User> select = userMapper.select(1);
        System.out.println(select.size());
    }
    @Autowired
    private PersionMapper personMapper;

    @Test
    public void testUserCollection(){
        //Persion persion = personMapper.selectPersion();
        List<Persion> userList = personMapper.selectPersion();
        String json = JSON.toJSONString(userList);

        System.out.println("persion:" + json);
    }
}
