package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 日常业务中的成功案例，用于分享
 * 
 **/
@SuppressWarnings("serial")
public class CommCaseBean implements Serializable {

	/** 唯一主键 **/
	private String uid;

	/** 租户 **/
	private String tenant;

	/** 案例类型,参照字典表GK0002 **/
	private String type;

	/** 案例名称 **/
	private String title;

	/** 简述 **/
	private String remark;

	/** 内容,对应mongo中的主键 **/
	private String content;

	/** 状态：1:在用，0：停用 **/
	private Integer state;

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



	/**
	 * 
	 * 设置唯一主键
	 * @param uid 唯一主键
	 **/
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * 获取唯一主键
	 * @return uid 唯一主键
	 **/
	public String getUid() {
		return this.uid;
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
	 * 设置案例类型,参照字典表GK0002
	 * @param type 案例类型,参照字典表GK0002
	 **/
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 获取案例类型,参照字典表GK0002
	 * @return type 案例类型,参照字典表GK0002
	 **/
	public String getType() {
		return this.type;
	}

	/**
	 * 
	 * 设置案例名称
	 * @param title 案例名称
	 **/
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 获取案例名称
	 * @return title 案例名称
	 **/
	public String getTitle() {
		return this.title;
	}

	/**
	 * 
	 * 设置简述
	 * @param remark 简述
	 **/
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获取简述
	 * @return remark 简述
	 **/
	public String getRemark() {
		return this.remark;
	}

	/**
	 * 
	 * 设置内容,对应mongo中的主键
	 * @param content 内容,对应mongo中的主键
	 **/
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 获取内容,对应mongo中的主键
	 * @return content 内容,对应mongo中的主键
	 **/
	public String getContent() {
		return this.content;
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

}
