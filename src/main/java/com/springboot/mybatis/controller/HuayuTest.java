package com.springboot.mybatis.controller;

import com.alibaba.fastjson.JSON;
import com.springboot.mybatis.entity.NpWritBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/7/7  18:36
 */
@Controller
public class HuayuTest {
    @RequestMapping(value = "/huayuTest",method = RequestMethod.POST)
    @ResponseBody
    public Map huayuTest(){
        /*Date data = npwritbean.getDCprq();*/
      /*  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String time=sdf.format(data);//将Date对象转化为yyyy-MM-dd形式的字符串
        System.out.println(time);//输出字符串*/
        HashMap map = new HashMap();
        map.put("isSuccess","1");
        return map;
    }

    @RequestMapping(value = "/huayu",method = RequestMethod.POST)
    @ResponseBody
    public String huayu(){
        HashMap map = new HashMap();
        map.put("isSuccess","1");
        return JSON.toJSONString(map);

    }
}
