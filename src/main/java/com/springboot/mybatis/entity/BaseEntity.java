package com.springboot.mybatis.entity;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import java.beans.Transient;

/**
 * @author ln
 * @Description: ${todo}
 * @date 2020/8/27  9:17
 */
public class BaseEntity {

    @Min(value = 1,message = "必须大于0")
    private Integer pageSize=1;

    @Range(min = 1,max = 1000,message = "一次性获取最大列表数不能超过1000")
    private Integer pageNum=10;

    @Transient
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Transient
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
