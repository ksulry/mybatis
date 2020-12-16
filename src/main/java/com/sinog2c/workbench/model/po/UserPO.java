package com.sinog2c.workbench.model.po;

import java.io.Serializable;

/**
 * 用户管理：新增、编辑的PO
 *
 * @author 齐红德
 * @date 2020/1/15 9:36
 */
@SuppressWarnings("serial")
public class UserPO implements Serializable {
    /**
     * 租户标识
     */
    private String tenant;
    /**
     * 用户帐号
     */
    private String userid;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private String sex;
    /**
     * 所属部门
     */
    private String dept;
    /**
     * 职务
     */
    private String duty;
    /**
     * 电话
     */
    private String tel;
    /**
     * 警号
     */
    private String police;
    /**
     * 勾选的角色
     */
    private String roles[];
    /**
     * 业务权限
     */
    private String buziDept;

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPolice() {
        return police;
    }

    public void setPolice(String police) {
        this.police = police;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String getBuziDept() {
        return buziDept;
    }

    public void setBuziDept(String buziDept) {
        this.buziDept = buziDept;
    }
}
