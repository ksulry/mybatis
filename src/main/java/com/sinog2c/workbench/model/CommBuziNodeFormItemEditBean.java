package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 流程节点方案对应表单的可编辑域
 * 
 **/
@SuppressWarnings("serial")
public class CommBuziNodeFormItemEditBean implements Serializable {

	/** 主键 **/
	private String uid;

	/** 流程节点id **/
	private String node;

	/** 业务id **/
	private String buzi;

	/** 租户 **/
	private String tenant;

	/** 表单主键 **/
	private String form;

	/** 表单节点id **/
	private String code;

	/** 更新人 **/
	private String upid;

	/** 更新时间 **/
	private Date uptime;

	/** 流程定义id **/
	private String processDefId;

	public String getProcessDefId() {
		return processDefId;
	}

	public void setProcessDefId(String processDefId) {
		this.processDefId = processDefId;
	}

	/**
	 * 
	 * 设置主键
	 * @param uid 主键
	 **/
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * 获取主键
	 * @return uid 主键
	 **/
	public String getUid() {
		return this.uid;
	}

	/**
	 * 
	 * 设置流程节点id
	 * @param node 流程节点id
	 **/
	public void setNode(String node) {
		this.node = node;
	}

	/**
	 * 获取流程节点id
	 * @return node 流程节点id
	 **/
	public String getNode() {
		return this.node;
	}

	/**
	 * 
	 * 设置业务id
	 * @param buzi 业务id
	 **/
	public void setBuzi(String buzi) {
		this.buzi = buzi;
	}

	/**
	 * 获取业务id
	 * @return buzi 业务id
	 **/
	public String getBuzi() {
		return this.buzi;
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
	 * 设置表单节点id
	 * @param code 表单节点id
	 **/
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取表单节点id
	 * @return code 表单节点id
	 **/
	public String getCode() {
		return this.code;
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
