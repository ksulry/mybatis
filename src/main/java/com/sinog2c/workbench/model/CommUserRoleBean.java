package com.sinog2c.workbench.model;

import java.io.Serializable;

/**
 * 
 * 给用户分配角色
 * 
 **/
@SuppressWarnings("serial")
public class CommUserRoleBean implements Serializable {

	/** 用户帐号 **/
	private String userid;

	/** 角色主键 **/
	private String role;



	/**
	 * 
	 * 设置用户帐号
	 * @param userid 用户帐号
	 **/
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * 获取用户帐号
	 * @return userid 用户帐号
	 **/
	public String getUserid() {
		return this.userid;
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

}
