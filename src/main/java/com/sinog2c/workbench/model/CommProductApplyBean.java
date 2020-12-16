package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 租户申请产品的信息
 * 
 **/
@SuppressWarnings("serial")
public class CommProductApplyBean implements Serializable {

	/** 唯一主键 **/
	private String UID;

	/** 租户 **/
	private String tenant;

	/** 产品 **/
	private String product;

	/** 申请单位名称 **/
	private String applyDept;

	/** 联系人 **/
	private String CHARGEMAN;

	/** 联系方式 **/
	private String TEL;

	/** 状态：0:未读,1:已读 **/
	private Integer STATE;

	/** 创建人 **/
	private String CRID;

	/** 创建时间 **/
	private Date CRTIME;

	/** 接收人 **/
	private String receiveID;

	/** 接收时间 **/
	private Date receiveTIME;



	/**
	 * 
	 * 设置唯一主键
	 * @param UID 唯一主键
	 **/
	public void setUID(String UID) {
		this.UID = UID;
	}

	/**
	 * 获取唯一主键
	 * @return UID 唯一主键
	 **/
	public String getUID() {
		return this.UID;
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
	 * 设置产品
	 * @param product 产品
	 **/
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * 获取产品
	 * @return product 产品
	 **/
	public String getProduct() {
		return this.product;
	}

	/**
	 * 
	 * 设置申请单位名称
	 * @param applyDept 申请单位名称
	 **/
	public void setApplyDept(String applyDept) {
		this.applyDept = applyDept;
	}

	/**
	 * 获取申请单位名称
	 * @return applyDept 申请单位名称
	 **/
	public String getApplyDept() {
		return this.applyDept;
	}

	/**
	 * 
	 * 设置联系人
	 * @param CHARGEMAN 联系人
	 **/
	public void setCHARGEMAN(String CHARGEMAN) {
		this.CHARGEMAN = CHARGEMAN;
	}

	/**
	 * 获取联系人
	 * @return CHARGEMAN 联系人
	 **/
	public String getCHARGEMAN() {
		return this.CHARGEMAN;
	}

	/**
	 * 
	 * 设置联系方式
	 * @param TEL 联系方式
	 **/
	public void setTEL(String TEL) {
		this.TEL = TEL;
	}

	/**
	 * 获取联系方式
	 * @return TEL 联系方式
	 **/
	public String getTEL() {
		return this.TEL;
	}

	/**
	 * 
	 * 设置状态：0:未读,1:已读
	 * @param STATE 状态：0:未读,1:已读
	 **/
	public void setSTATE(Integer STATE) {
		this.STATE = STATE;
	}

	/**
	 * 获取状态：0:未读,1:已读
	 * @return STATE 状态：0:未读,1:已读
	 **/
	public Integer getSTATE() {
		return this.STATE;
	}

	/**
	 * 
	 * 设置创建人
	 * @param CRID 创建人
	 **/
	public void setCRID(String CRID) {
		this.CRID = CRID;
	}

	/**
	 * 获取创建人
	 * @return CRID 创建人
	 **/
	public String getCRID() {
		return this.CRID;
	}

	/**
	 * 
	 * 设置创建时间
	 * @param CRTIME 创建时间
	 **/
	public void setCRTIME(Date CRTIME) {
		this.CRTIME = CRTIME;
	}

	/**
	 * 获取创建时间
	 * @return CRTIME 创建时间
	 **/
	public Date getCRTIME() {
		return this.CRTIME;
	}

	/**
	 * 
	 * 设置接收人
	 * @param receiveID 接收人
	 **/
	public void setReceiveID(String receiveID) {
		this.receiveID = receiveID;
	}

	/**
	 * 获取接收人
	 * @return receiveID 接收人
	 **/
	public String getReceiveID() {
		return this.receiveID;
	}

	/**
	 * 
	 * 设置接收时间
	 * @param receiveTIME 接收时间
	 **/
	public void setReceiveTIME(Date receiveTIME) {
		this.receiveTIME = receiveTIME;
	}

	/**
	 * 获取接收时间
	 * @return receiveTIME 接收时间
	 **/
	public Date getReceiveTIME() {
		return this.receiveTIME;
	}

}
