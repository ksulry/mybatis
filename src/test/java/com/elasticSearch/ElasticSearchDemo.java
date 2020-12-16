package com.elasticSearch;

import com.springboot.mybatis.MybatisApplication;
import com.springboot.mybatis.entity.Item;
import com.springboot.mybatis.service.ItemRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/12/15  15:33
 */
@SpringBootTest(classes = MybatisApplication.class)
@RunWith(SpringRunner.class)
public class ElasticSearchDemo {
    //如果ElasticsearchTemplate 依赖注入不了，大概率是在配置文件中没有配置Elasticsearch
    //或者配置出错
    @Autowired
    private ElasticsearchTemplate esTemplate;
    @Autowired
    private ItemRepository itemRepository;
    public ElasticSearchDemo(){
        //在构造函数上写上这个
        System.setProperty("es.set.netty.runtime.available.processors","false");
    }
    @Test
    public void createIndex() {

        // 创建索引，会根据Item类的@Document注解信息来创建
        esTemplate.createIndex(Item.class);
        // 配置映射，会根据Item类中的id、Field等字段来自动完成映射
        esTemplate.putMapping(Item.class);
    }
    @Test
    public void deleteIndex() {
        esTemplate.deleteIndex(Item.class);
        // 根据索引名字删除
        //esTemplate.deleteIndex("item1");
    }


    @Test
    public void index() {
        Item item = new Item(1L, "小米手机7", " 手机",
                "小米", 3499.00, "http://image.baidu.com/13123.jpg");
        itemRepository.save(item);
    }

}
