package com.springboot.mybatis.mapper.test2;

import com.springboot.mybatis.entity.Salaries;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SalariesMapper {
    @Select("select * from salaries")
    List<Salaries> getSalariesList();

    @Select("select count(1) from salaries")
    int getSalariesCount();

    @Insert("insert into salaries(emp_no, salary, from_date, to_date) values(#{empNo}, #{salary}, #{fromDate, jdbcType=DATE}, #{toDate, jdbcType=DATE})")
    void insert(Salaries salaries);

    @Select("select * from salaries where emp_no = 10000")
    Salaries getSalarie();
}
