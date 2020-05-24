package com.springboot.mybatis.configuration;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.AbstractDateDeserializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DateExtraProcessor extends AbstractDateDeserializer {

    private   DateTimeFormatter pattern = DateTimeFormat.forPattern("MM-dd/yyyy");

    @Override
    protected <T> T cast(DefaultJSONParser parser, Type clazz, Object fieldName, Object value) {
        Object object = parser.input;//此处得到是前端传来的所有数据的原始格式字符串

        Map map = JSON.parseObject(String.valueOf(object),Map.class);//将json字符串转为map，方便后续操作

        String timestr =(String) map.get(String.valueOf(fieldName));//获取对应参数值（ps:不明白参数类型为什么是Object）
        if(log.isDebugEnabled()){
            log.debug("time is  {}",timestr);
        }

        Date date = parseStr2Date(timestr);//格式化成日期
        return (T)date;
    }

    private  Date parseStr2Date(String source) {
        return DateTime.parse(source, pattern).toDate();//使用joda的日期操作类
    }

    @Override
    public int getFastMatchToken() {

        return JSONToken.LITERAL_STRING;
    }

}

