package com.sinog2c.workbench.model.po;

import java.io.Serializable;
import java.util.Date;

/**
 * 字典管理：编辑的PO
 *
 * @author wangchong
 * @date 2020/8/18 9:36
 */
public class CodePO implements Serializable {
    /** 字典类型 **/
    private String type;

    /** 父代码,0为顶级代码 **/
    private String pcode;

    /** 代码code **/
    private String code;

    /** 字典名称(简) **/
    private String name;

    /** 字典名称(全) **/
    private String fullname;

    /** 查询代码 **/
    private String search;

    /** 展示序号 **/
    private Integer sn;

    /** 状态：1:在用，0：停用 **/
    private Integer state;

    /** 可否扩展 1：可 0：否 **/
    private Integer extend;

    /** 可否编辑 1：可 0：否 **/
    private Integer edit;

    /** 备注 **/

    private String remark;

    /** 原字典类型 **/
    private String extype;

    /** 原父代码,0为顶级代码 **/
    private String expcode;

    /** 原代码code **/
    private String excode;

    /** 更新人 **/
    private String upid;

    /** 更新时间 **/
    private Date uptime;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public Integer getSn() {
        return sn;
    }

    public void setSn(Integer sn) {
        this.sn = sn;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getExtend() {
        return extend;
    }

    public void setExtend(Integer extend) {
        this.extend = extend;
    }

    public Integer getEdit() {
        return edit;
    }

    public void setEdit(Integer edit) {
        this.edit = edit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getExtype() {
        return extype;
    }

    public void setExtype(String extype) {
        this.extype = extype;
    }

    public String getExpcode() {
        return expcode;
    }

    public void setExpcode(String expcode) {
        this.expcode = expcode;
    }

    public String getExcode() {
        return excode;
    }

    public void setExcode(String excode) {
        this.excode = excode;
    }

    public String getUpid() {
        return upid;
    }

    public void setUpid(String upid) {
        this.upid = upid;
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    @Override
    public String toString() {
        return "CodePO{" +
                "type='" + type + '\'' +
                ", pcode='" + pcode + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", fullname='" + fullname + '\'' +
                ", search='" + search + '\'' +
                ", sn=" + sn +
                ", state=" + state +
                ", extend=" + extend +
                ", edit=" + edit +
                ", remark='" + remark + '\'' +
                ", extype='" + extype + '\'' +
                ", expcode='" + expcode + '\'' +
                ", excode='" + excode + '\'' +
                ", upid='" + upid + '\'' +
                ", uptime=" + uptime +
                '}';
    }
}
