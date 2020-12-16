package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 工作台、前台用户反馈问题给后台
 * 
 **/
@SuppressWarnings("serial")
public class CommFeedbackBean implements Serializable {

	/** 唯一主键 **/
	private String uid;

	/** 产品编号 **/
	private String product;

	/** 反馈的类型,字典表GK0004 **/
	private String type;

	/** 租户 **/
	private String tenant;

	/** 反馈人【来自界面】 **/
	private String febakMan;

	/** 联系电话【来自界面】 **/
	private String tel;

	/** 问题描述【来自界面】 **/
	private String remark;

	/** 答复人 **/
	private String replyman;

	/** 答复时间 **/
	private Date replaytime;

	/** 解决方案 **/
	private String solution;

	/** 状态：0:反馈,1:收到(已读)2:解答 **/
	private Integer state;

	/** 创建人 **/
	private String crid;

	/** 创建时间 **/
	private Date crtime;

	/** 更新人 **/
	private String upid;

	/** 更新时间 **/
	private Date uptime;



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
	 * 设置产品编号
	 * @param product 产品编号
	 **/
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * 获取产品编号
	 * @return product 产品编号
	 **/
	public String getProduct() {
		return this.product;
	}

	/**
	 * 
	 * 设置反馈的类型,字典表GK0004
	 * @param type 反馈的类型,字典表GK0004
	 **/
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 获取反馈的类型,字典表GK0004
	 * @return type 反馈的类型,字典表GK0004
	 **/
	public String getType() {
		return this.type;
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
	 * 设置反馈人【来自界面】
	 * @param febakMan 反馈人【来自界面】
	 **/
	public void setFebakMan(String febakMan) {
		this.febakMan = febakMan;
	}

	/**
	 * 获取反馈人【来自界面】
	 * @return febakMan 反馈人【来自界面】
	 **/
	public String getFebakMan() {
		return this.febakMan;
	}

	/**
	 * 
	 * 设置联系电话【来自界面】
	 * @param tel 联系电话【来自界面】
	 **/
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * 获取联系电话【来自界面】
	 * @return tel 联系电话【来自界面】
	 **/
	public String getTel() {
		return this.tel;
	}

	/**
	 * 
	 * 设置问题描述【来自界面】
	 * @param remark 问题描述【来自界面】
	 **/
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获取问题描述【来自界面】
	 * @return remark 问题描述【来自界面】
	 **/
	public String getRemark() {
		return this.remark;
	}

	/**
	 * 
	 * 设置答复人
	 * @param replyman 答复人
	 **/
	public void setReplyman(String replyman) {
		this.replyman = replyman;
	}

	/**
	 * 获取答复人
	 * @return replyman 答复人
	 **/
	public String getReplyman() {
		return this.replyman;
	}

	/**
	 * 
	 * 设置答复时间
	 * @param replaytime 答复时间
	 **/
	public void setReplaytime(Date replaytime) {
		this.replaytime = replaytime;
	}

	/**
	 * 获取答复时间
	 * @return replaytime 答复时间
	 **/
	public Date getReplaytime() {
		return this.replaytime;
	}

	/**
	 * 
	 * 设置解决方案
	 * @param solution 解决方案
	 **/
	public void setSolution(String solution) {
		this.solution = solution;
	}

	/**
	 * 获取解决方案
	 * @return solution 解决方案
	 **/
	public String getSolution() {
		return this.solution;
	}

	/**
	 * 
	 * 设置状态：0:反馈,1:收到(已读)2:解答
	 * @param state 状态：0:反馈,1:收到(已读)2:解答
	 **/
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * 获取状态：0:反馈,1:收到(已读)2:解答
	 * @return state 状态：0:反馈,1:收到(已读)2:解答
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

}
