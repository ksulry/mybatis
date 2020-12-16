package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 用户权限信息
 * 
 **/
@SuppressWarnings("serial")
public class CommUserFuncBean implements Serializable {

	/** 工作台帐号 **/
	private String userid;

	/** 功能 **/
	private String func;

	/** 更新人 **/
	private String upid;

	/** 更新时间 **/
	private Date uptime;

	/**
	 * 获取工作台账号
	 * @return
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * 设置工作台账号
	 * @param userid
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * 获取功能名称
	 * @return
	 */
	public String getFunc() {
		return func;
	}

	/**
	 * 设置功能名称
	 * @param func
	 */
	public void setFunc(String func) {
		this.func = func;
	}

	/**
	 * 获取更新人id
	 * @return
	 */
	public String getUpid() {
		return upid;
	}

	/**
	 * 设置更新人id
	 * @param upid
	 */
	public void setUpid(String upid) {
		this.upid = upid;
	}

	/**
	 * 获取更新时间
	 * @return
	 */
	public Date getUptime() {
		return uptime;
	}

	/**
	 * 设置更新时间
	 * @param uptime
	 */
	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}
}
