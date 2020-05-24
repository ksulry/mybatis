package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.Salaries;
import com.springboot.mybatis.mapper.test2.SalariesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class SalariesService {
    @Autowired
    private SalariesMapper salariesMapper;
    public List<Salaries> getSalariesList(){
        int salariesCount = salariesMapper.getSalariesCount();
        System.out.println("数据总数为：" + salariesCount);
        List<Salaries> salariesList = salariesMapper.getSalariesList();
        System.out.println(salariesList.get(0).getEmpNo() + "," + salariesList.get(0).getToDate());
        return salariesList;
    }
    @Transactional(value = "transactionManagerTest2")
    public void insert(Salaries salaries){
        salariesMapper.insert(salaries);
    }

    public void get(){
        Salaries salaries = new Salaries();
        salaries.setEmpNo(10);
        salaries.setFromDate(new Date());
        System.out.println(new Date());
        salaries.setSalary(100);
        salaries.setToDate(new Date());
        salariesMapper.insert(salaries);
    }
}
