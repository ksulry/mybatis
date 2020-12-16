package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/12/15  16:40
 */

@Repository
public interface ItemRepository extends ElasticsearchRepository<Item,Long> {
}
