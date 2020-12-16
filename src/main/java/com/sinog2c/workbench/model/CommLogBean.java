package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 后台、工作台、前台的操作日志
 * 
 **/
@SuppressWarnings("serial")

public class CommLogBean implements Serializable {

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
	private Date buzitime;

	/** 内容描述 **/
	private String remark;

	/** 入库时间 **/
	private Date uptime;



	/**
	 * 
	 * 设置产品，参照产品代码
	 * @param product 产品，参照产品代码
	 **/
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * 获取产品，参照产品代码
	 * @return product 产品，参照产品代码
	 **/
	public String getProduct() {
		return this.product;
	}

	/**
	 * 
	 * 设置租户
	 * @param tenant 租户
	 **/
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	/**
	 * 获取租户
	 * @return tenant 租户
	 **/
	public String getTenant() {
		return this.tenant;
	}

	/**
	 * 
	 * 设置类型,参照字典表GK0003
	 * @param type 类型,参照字典表GK0003
	 **/
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 获取类型,参照字典表GK0003
	 * @return type 类型,参照字典表GK0003
	 **/
	public String getType() {
		return this.type;
	}

	/**
	 * 
	 * 设置操作帐号
	 * @param userid 操作帐号
	 **/
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * 获取操作帐号
	 * @return userid 操作帐号
	 **/
	public String getUserid() {
		return this.userid;
	}

	/**
	 * 
	 * 设置操作人姓名
	 * @param name 操作人姓名
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取操作人姓名
	 * @return name 操作人姓名
	 **/
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * 设置IP地址
	 * @param ip IP地址
	 **/
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * 获取IP地址
	 * @return ip IP地址
	 **/
	public String getIp() {
		return this.ip;
	}

	/**
	 * 
	 * 设置操作时间
	 * @param buzitime 操作时间
	 **/
	public void setBuzitime(Date buzitime) {
		this.buzitime = buzitime;
	}

	/**
	 * 获取操作时间
	 * @return buzitime 操作时间
	 **/
	public Date getBuzitime() {
		return this.buzitime;
	}

	/**
	 * 
	 * 设置内容描述
	 * @param remark 内容描述
	 **/
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获取内容描述
	 * @return remark 内容描述
	 **/
	public String getRemark() {
		return this.remark;
	}

	/**
	 * 
	 * 设置入库时间
	 * @param uptime 入库时间
	 **/
	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}

	/**
	 * 获取入库时间
	 * @return uptime 入库时间
	 **/
	public Date getUptime() {
		return this.uptime;
	}

}
