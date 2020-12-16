package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 接口管理中包含的基本信息
 * 
 **/
@SuppressWarnings("serial")
public class CommInterfaceManagementBean implements Serializable {

	/**  **/
	private String uid;

	/**  **/
	private String type;

	/**  **/
	private String name;

	/**  **/
	private String remark;

	/**  **/
	private String content;

	/**  **/
	private Integer state;

	/**  **/
	private String filepath;

	/**  **/
	private String crid;

	/**  **/
	private Date crtime;

	/**  **/
	private String upid;

	/**  **/
	private Date uptime;

	/**  **/
	private Integer isdel;

	/**  **/
	private String filename;



	/**
	 * 
	 * 设置
	 * @param uid 
	 **/
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * 获取
	 * @return uid 
	 **/
	public String getUid() {
		return this.uid;
	}

	/**
	 * 
	 * 设置
	 * @param type 
	 **/
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 获取
	 * @return type 
	 **/
	public String getType() {
		return this.type;
	}

	/**
	 * 
	 * 设置
	 * @param name 
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取
	 * @return name 
	 **/
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * 设置
	 * @param remark 
	 **/
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获取
	 * @return remark 
	 **/
	public String getRemark() {
		return this.remark;
	}

	/**
	 * 
	 * 设置
	 * @param content 
	 **/
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 获取
	 * @return content 
	 **/
	public String getContent() {
		return this.content;
	}

	/**
	 * 
	 * 设置
	 * @param state 
	 **/
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * 获取
	 * @return state 
	 **/
	public Integer getState() {
		return this.state;
	}

	/**
	 * 
	 * 设置
	 * @param filepath 
	 **/
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * 获取
	 * @return filepath 
	 **/
	public String getFilepath() {
		return this.filepath;
	}

	/**
	 * 
	 * 设置
	 * @param crid 
	 **/
	public void setCrid(String crid) {
		this.crid = crid;
	}

	/**
	 * 获取
	 * @return crid 
	 **/
	public String getCrid() {
		return this.crid;
	}

	/**
	 * 
	 * 设置
	 * @param crtime 
	 **/
	public void setCrtime(Date crtime) {
		this.crtime = crtime;
	}

	/**
	 * 获取
	 * @return crtime 
	 **/
	public Date getCrtime() {
		return this.crtime;
	}

	/**
	 * 
	 * 设置
	 * @param upid 
	 **/
	public void setUpid(String upid) {
		this.upid = upid;
	}

	/**
	 * 获取
	 * @return upid 
	 **/
	public String getUpid() {
		return this.upid;
	}

	/**
	 * 
	 * 设置
	 * @param uptime 
	 **/
	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}

	/**
	 * 获取
	 * @return uptime 
	 **/
	public Date getUptime() {
		return this.uptime;
	}

	/**
	 * 
	 * 设置
	 * @param isdel 
	 **/
	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
	}

	/**
	 * 获取
	 * @return isdel 
	 **/
	public Integer getIsdel() {
		return this.isdel;
	}

	/**
	 * 
	 * 设置
	 * @param filename 
	 **/
	public void setFilename(String filename) {
		this.filename = filename;
	}

	/**
	 * 获取
	 * @return filename 
	 **/
	public String getFilename() {
		return this.filename;
	}

}
