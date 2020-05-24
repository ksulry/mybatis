package com.springboot.mybatis.configuration;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.text.SimpleDateFormat;


@Configuration
public class RedisConfiguration {

    @Bean
    public RedisTemplate<Object, Object> redisTemplate(
            RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<Object, Object> template = new RedisTemplate<>();
        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
        /**
         * om.setDateFormat(DateFormat.getDateTimeInstance());//格式化时间
         * 直接使用这种方式格式化时间的话，在Windows和在Linux上格式化后的时间格式是不一样的，
         * 因为DateFormat.getDateTimeInstance()具有默认语言环境的默认格式化风格。
         * Windows：2017-8-30 12:00:00
         * Linux：Aug 30, 2017 12:00:00 PM
         * 这样会出现这种情况：
         *      在Windows上序列化之后，在Linux上反序列化时识别不了，导致反序列化失败
         *      提示如下：
         *      org.springframework.data.redis.serializer.SerializationException: Could not read JSON: Can not deserialize value of type java.util.Date from String "2017-8-30 12:00:00":
         *           not a valid representation (error: Failed to parse Date value '2017-8-30 12:00:00': Unparseable date: "2017-8-30 12:00:00")
         *  解决办法：
         *  om.setDateFormat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
         */
//        om.setDateFormat(DateFormat.getDateTimeInstance());//格式化时间
        om.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        jackson2JsonRedisSerializer.setObjectMapper(om);


        // value值的序列化采用fastJsonRedisSerializer
        template.setValueSerializer(jackson2JsonRedisSerializer);
        template.setHashValueSerializer(jackson2JsonRedisSerializer);
        // key的序列化采用StringRedisSerializer
        template.setKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new StringRedisSerializer());
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }
}
