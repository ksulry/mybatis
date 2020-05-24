package com.springboot.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
@Setter
@Getter
public class Salaries implements Serializable {
    private int empNo;
    private int salary;
    //@JSONField(deserializeUsing=DateExtraProcessor.class)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date fromDate;
    //@JSONField(deserializeUsing=DateExtraProcessor.class)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date toDate;
}
