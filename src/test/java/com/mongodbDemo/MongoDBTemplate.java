package com.mongodbDemo;

import com.mongodb.client.result.UpdateResult;
import com.sinog2c.workbench.model.CommFormItemBean;
import com.springboot.mybatis.MybatisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/9/11  17:11
 */
@SpringBootTest(classes = MybatisApplication.class)
@RunWith(SpringRunner.class)
public class MongoDBTemplate {
    @Autowired
    private MongoTemplate mongoTemp;

    @Test
    public void query(){
        Query query = new Query(Criteria.where("uid").is("hello"));
        CommFormItemBean bean = mongoTemp.findOne(query,CommFormItemBean.class,"datacontent");
        System.out.println("打印bean是否为空:" + bean == null);
    }

    @Test
    public void insertOrUpdate(){
        CommFormItemBean formItemModel = new CommFormItemBean();
        formItemModel.setCode("code02");
        formItemModel.setForm("a2");
        formItemModel.setName("ln");
        formItemModel.setUpid("userid02");
        formItemModel.setUptime(new Date());
        formItemModel.setIsdel(0);
        //将数据插入mongodb,主要是保存表单大字段
        Query query = new Query(Criteria.where("code").is(formItemModel.getCode()));
        CommFormItemBean bean = mongoTemp.findOne(query,CommFormItemBean.class,"datacontent");
        System.out.println("upid的值为:" + bean.getUpid());
        if(null != bean){
            Update data = new Update().setOnInsert("upid01",10).set("upid","jjj");
            UpdateResult updateResult = mongoTemp.updateFirst(query, data, "datacontent");
        }else{
            mongoTemp.insert(formItemModel, "datacontent");
        }
    }
}
