package com.springboot.mybatis.mapper.test1;

import com.springboot.mybatis.entity.Persion;
import com.springboot.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface PersionMapper {

    List<Persion> selectPersion();

   /* List<User> selectUserList();*/
}



