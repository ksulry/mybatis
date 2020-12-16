package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 租户申请产品的信息
 * 
 **/
@SuppressWarnings("serial")
public class CommProductApplyModuleBean implements Serializable {

	/** 相同的为一次申请 **/
	private String UID;

	/** 功能模块 **/
	private String module;

	/** 创建人 **/
	private String CRID;

	/** 创建时间 **/
	private Date CRTIME;



	/**
	 * 
	 * 设置相同的为一次申请
	 * @param UID 相同的为一次申请
	 **/
	public void setUID(String UID) {
		this.UID = UID;
	}

	/**
	 * 获取相同的为一次申请
	 * @return UID 相同的为一次申请
	 **/
	public String getUID() {
		return this.UID;
	}

	/**
	 * 
	 * 设置功能模块
	 * @param module 功能模块
	 **/
	public void setModule(String module) {
		this.module = module;
	}

	/**
	 * 获取功能模块
	 * @return module 功能模块
	 **/
	public String getModule() {
		return this.module;
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

}
