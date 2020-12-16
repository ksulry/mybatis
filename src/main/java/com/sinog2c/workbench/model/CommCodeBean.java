package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * 系统的字典信息
 *
 **/
@SuppressWarnings("serial")
public class CommCodeBean implements Serializable {
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


	private String remark;


	/** 创建人 **/
	private String crid;

	/** 创建时间 **/
	private Date crtime;

	/** 更新人 **/
	private String upid;

	/** 更新时间 **/
	private Date uptime;

	/** 删除标志,1:已删除,0:未删除 **/
	private Integer isdel;

	private String tenant;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 *
	 * 设置父代码,0为顶级代码
	 * @param pcode 父代码,0为顶级代码
	 **/
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	/**
	 * 获取父代码,0为顶级代码
	 * @return pcode 父代码,0为顶级代码
	 **/
	public String getPcode() {
		return this.pcode;
	}

	/**
	 *
	 * 设置代码code
	 * @param code 代码code
	 **/
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取代码code
	 * @return code 代码code
	 **/
	public String getCode() {
		return this.code;
	}

	/**
	 *
	 * 设置字典名称(简)
	 * @param name 字典名称(简)
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取字典名称(简)
	 * @return name 字典名称(简)
	 **/
	public String getName() {
		return this.name;
	}

	/**
	 *
	 * 设置字典名称(全)
	 * @param fullname 字典名称(全)
	 **/
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/**
	 * 获取字典名称(全)
	 * @return fullname 字典名称(全)
	 **/
	public String getFullname() {
		return this.fullname;
	}

	/**
	 *
	 * 设置查询代码
	 * @param search 查询代码
	 **/
	public void setSearch(String search) {
		this.search = search;
	}

	/**
	 * 获取查询代码
	 * @return search 查询代码
	 **/
	public String getSearch() {
		return this.search;
	}

	/**
	 *
	 * 设置展示序号
	 * @param sn 展示序号
	 **/
	public void setSn(Integer sn) {
		this.sn = sn;
	}

	/**
	 * 获取展示序号
	 * @return sn 展示序号
	 **/
	public Integer getSn() {
		return this.sn;
	}

	/**
	 *
	 * 设置状态：1:在用，0：停用
	 * @param state 状态：1:在用，0：停用
	 **/
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * 获取状态：1:在用，0：停用
	 * @return state 状态：1:在用，0：停用
	 **/
	public Integer getState() {
		return this.state;
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

	public String getCrid() {
		return crid;
	}

	public void setCrid(String crid) {
		this.crid = crid;
	}

	public Date getCrtime() {
		return crtime;
	}

	public void setCrtime(Date crtime) {
		this.crtime = crtime;
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

	public Integer getIsdel() {
		return isdel;
	}

	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
	}

	public String getTenant() {
		return tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	@Override
	public String toString() {
		return "CommCodeBean{" +
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
				", crid='" + crid + '\'' +
				", crtime=" + crtime +
				", upid='" + upid + '\'' +
				", uptime=" + uptime +
				", isdel=" + isdel +
				", tenant='" + tenant + '\'' +
				'}';
	}
}
