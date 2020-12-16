package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 业务流程方案，用于流程配置
 * 
 **/
@SuppressWarnings("serial")
public class CommBuziSolutionBean implements Serializable {

	/** 唯一主键 **/
	private String code;

	/** 方案名称 **/
	private String name;

	/** 展示序号 **/
	private Integer sn;

	/** 状态：1:在用，0：停用 **/
	private Integer state;

	/** 备注 **/
	private String remark;

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
	 * @param code 唯一主键
	 **/
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取唯一主键
	 * @return code 唯一主键
	 **/
	public String getCode() {
		return this.code;
	}

	/**
	 * 
	 * 设置方案名称
	 * @param name 方案名称
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取方案名称
	 * @return name 方案名称
	 **/
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * 设置展示序号
	 * @param sn 展示序号
	 **/
	public void setSn(Integer sn) {
		this.sn = sn;
	}

	/**
	 * 获取展示序号
	 * @return sn 展示序号
	 **/
	public Integer getSn() {
		return this.sn;
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
	 * 设置备注
	 * @param remark 备注
	 **/
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获取备注
	 * @return remark 备注
	 **/
	public String getRemark() {
		return this.remark;
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
