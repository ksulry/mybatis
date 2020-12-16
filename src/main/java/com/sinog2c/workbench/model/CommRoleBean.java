package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 角色管理
 * 
 **/
@SuppressWarnings("serial")
public class CommRoleBean implements Serializable {

	/** 唯一主键 **/
	private String role;

	/** 产品主键 **/
	private String product;

	/** 角色名称 **/
	private String name;

	/** 备注 **/
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

	/** 租户 **/
	private String tenant;

	/** 角色功能关系 **/
	private String[] func;

	/**
	 * 
	 * 设置唯一主键
	 * @param role 唯一主键
	 **/
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * 获取唯一主键
	 * @return role 唯一主键
	 **/
	public String getRole() {
		return this.role;
	}

	/**
	 * 
	 * 设置产品主键
	 * @param product 产品主键
	 **/
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * 获取产品主键
	 * @return product 产品主键
	 **/
	public String getProduct() {
		return this.product;
	}

	/**
	 * 
	 * 设置角色名称
	 * @param name 角色名称
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取角色名称
	 * @return name 角色名称
	 **/
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * 设置备注
	 * @param remark 备注
	 **/
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获取备注
	 * @return remark 备注
	 **/
	public String getRemark() {
		return this.remark;
	}

	/**
	 * 
	 * 设置创建人
	 * @param crid 创建人
	 **/
	public void setCrid(String crid) {
		this.crid = crid;
	}

	/**
	 * 获取创建人
	 * @return crid 创建人
	 **/
	public String getCrid() {
		return this.crid;
	}

	/**
	 * 
	 * 设置创建时间
	 * @param crtime 创建时间
	 **/
	public void setCrtime(Date crtime) {
		this.crtime = crtime;
	}

	/**
	 * 获取创建时间
	 * @return crtime 创建时间
	 **/
	public Date getCrtime() {
		return this.crtime;
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

	public String[] getFunc() {
		return func;
	}

	public void setFunc(String[] func) {
		this.func = func;
	}
}
