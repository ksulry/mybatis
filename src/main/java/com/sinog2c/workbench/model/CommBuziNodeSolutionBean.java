package com.sinog2c.workbench.model;

import com.alibaba.fastjson.JSONArray;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 配置浏览中每个节点为的方案，用到的表单、报表
 * 
 **/
@SuppressWarnings("serial")
public class CommBuziNodeSolutionBean implements Serializable {

	/** 节点为ID **/
	private String node;

	/** 业务ID **/
	private String buzi;

	/** 租户 **/
	private String tenant;

	/** 流程方案类型 **/
	private String code;

	/** 方案内容 **/
	private String content;

	private JSONArray contents;

	/** 表单 **/
	private String form;

	/** 报表 **/
	private String rdp;

	/** 模板 **/
	private String template;

	/** 更新人 **/
	private String upid;

	/** 更新时间 **/
	private Date uptime;

	/** 流程节点id **/
	private String id;

	/** 流程定义id **/
	private String processDefId;

	public String getProcessDefId() {
		return processDefId;
	}

	public void setProcessDefId(String processDefId) {
		this.processDefId = processDefId;
	}

	public JSONArray getContents() {
		return contents;
	}

	public void setContents(JSONArray contents) {
		this.contents = contents;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * 设置节点为ID
	 * @param node 节点为ID
	 **/
	public void setNode(String node) {
		this.node = node;
	}

	/**
	 * 获取节点为ID
	 * @return node 节点为ID
	 **/
	public String getNode() {
		return this.node;
	}

	/**
	 * 
	 * 设置业务ID
	 * @param buzi 业务ID
	 **/
	public void setBuzi(String buzi) {
		this.buzi = buzi;
	}

	/**
	 * 获取业务ID
	 * @return buzi 业务ID
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
	 * 设置流程方案类型
	 * @param code 流程方案类型
	 **/
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取流程方案类型
	 * @return code 流程方案类型
	 **/
	public String getCode() {
		return this.code;
	}

	/**
	 * 
	 * 设置方案内容
	 * @param content 方案内容
	 **/
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 获取方案内容
	 * @return content 方案内容
	 **/
	public String getContent() {
		return this.content;
	}

	/**
	 * 
	 * 设置表单
	 * @param form 表单
	 **/
	public void setForm(String form) {
		this.form = form;
	}

	/**
	 * 获取表单
	 * @return form 表单
	 **/
	public String getForm() {
		return this.form;
	}

	/**
	 * 
	 * 设置报表
	 * @param rdp 报表
	 **/
	public void setRdp(String rdp) {
		this.rdp = rdp;
	}

	/**
	 * 获取报表
	 * @return rdp 报表
	 **/
	public String getRdp() {
		return this.rdp;
	}

	/**
	 * 
	 * 设置模板
	 * @param template 模板
	 **/
	public void setTemplate(String template) {
		this.template = template;
	}

	/**
	 * 获取模板
	 * @return template 模板
	 **/
	public String getTemplate() {
		return this.template;
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
