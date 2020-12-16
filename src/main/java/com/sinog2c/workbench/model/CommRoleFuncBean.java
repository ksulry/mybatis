package com.sinog2c.workbench.model;

import java.io.Serializable;

/**
 * 
 * 角色下包含的功能清单
 * 
 **/
@SuppressWarnings("serial")
public class CommRoleFuncBean implements Serializable {

	/** 唯一主键 **/
	private String uid;

	/** 角色主键 **/
	private String role;

	/** 功能主键 **/
	private String func;



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
	 * 设置角色主键
	 * @param role 角色主键
	 **/
	public void setRole(String role) {
		this.role = role;
	}

	/**
	 * 获取角色主键
	 * @return role 角色主键
	 **/
	public String getRole() {
		return this.role;
	}

	/**
	 * 
	 * 设置功能主键
	 * @param func 功能主键
	 **/
	public void setFunc(String func) {
		this.func = func;
	}

	/**
	 * 获取功能主键
	 * @return func 功能主键
	 **/
	public String getFunc() {
		return this.func;
	}

}
