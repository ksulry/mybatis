package com.sinog2c.workbench.model.po;

import java.io.Serializable;

/**
 * @author 齐红德
 * @date 2020/3/13 16:57
 */
@SuppressWarnings("serial")
public class Log4EsBean implements Serializable {
    /** 产品，参照产品代码 **/
    private String product;

    /** 租户 **/
    private String tenant;

    /** 类型,参照字典表GK0003 **/
    private String type;

    /** 操作帐号 **/
    private String userid;

    /** 操作人姓名 **/
    private String name;

    /** IP地址 **/
    private String ip;

    /** 操作时间 **/
    private String buzitime;

    /** 内容描述 **/
    private String remark;

    /** 入库时间 **/
    private String uptime;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBuzitime() {
        return buzitime;
    }

    public void setBuzitime(String buzitime) {
        this.buzitime = buzitime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime;
    }
}
