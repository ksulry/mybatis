package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 只有表单用这张表，用于配置某节点可否编辑
 * 
 **/
@SuppressWarnings("serial")
public class CommFormItemBean implements Serializable {

	/** 表单主键 **/
	private String form;

	/** 节点id **/
	private String code;

	/** 节点名称 **/
	private String name;

	/** 更新人 **/
	private String upid;

	/** 更新时间 **/
	private Date uptime;

	/** 删除标志,1:已删除,0:未删除 **/
	private Integer isdel;



	/**
	 * 
	 * 设置表单主键
	 * @param form 表单主键
	 **/
	public void setForm(String form) {
		this.form = form;
	}

	/**
	 * 获取表单主键
	 * @return form 表单主键
	 **/
	public String getForm() {
		return this.form;
	}

	/**
	 * 
	 * 设置节点id
	 * @param code 节点id
	 **/
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取节点id
	 * @return code 节点id
	 **/
	public String getCode() {
		return this.code;
	}

	/**
	 * 
	 * 设置节点名称
	 * @param name 节点名称
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取节点名称
	 * @return name 节点名称
	 **/
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * 设置更新人
	 * @param upid 更新人
	 **/
	public void setUpid(String upid) {
		this.upid = upid;
	}

	/**
	 * 获取更新人
	 * @return upid 更新人
	 **/
	public String getUpid() {
		return this.upid;
	}

	/**
	 * 
	 * 设置更新时间
	 * @param uptime 更新时间
	 **/
	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}

	/**
	 * 获取更新时间
	 * @return uptime 更新时间
	 **/
	public Date getUptime() {
		return this.uptime;
	}

	/**
	 * 
	 * 设置删除标志,1:已删除,0:未删除
	 * @param isdel 删除标志,1:已删除,0:未删除
	 **/
	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
	}

	/**
	 * 获取删除标志,1:已删除,0:未删除
	 * @return isdel 删除标志,1:已删除,0:未删除
	 **/
	public Integer getIsdel() {
		return this.isdel;
	}

}
