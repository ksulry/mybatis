package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 各产品的功能，包含工作台，不包含后台
 * 
 **/
@SuppressWarnings("serial")
public class CommFuncBean implements Serializable {

	/** 唯一主键 **/
	private String func;

	/** 父菜单 **/
	private String pfunc;

	/** 功能菜单名称 **/
	private String name;

	/** 路径 **/
	private String url;

	/** 图标 **/
	private String icon;

	/** 同级排序 **/
	private Integer sn;

	/** 权限代码 **/
	private String code;

	/** 产品ID **/
	private String product;

	/** 类型：1:模块,2:界面,3:按钮,4:元素 **/
	private Integer type;

	/** 状态：1:正常,0:禁用 **/
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
	 * @param func 唯一主键
	 **/
	public void setFunc(String func) {
		this.func = func;
	}

	/**
	 * 获取唯一主键
	 * @return func 唯一主键
	 **/
	public String getFunc() {
		return this.func;
	}

	/**
	 * 
	 * 设置父菜单
	 * @param pfunc 父菜单
	 **/
	public void setPfunc(String pfunc) {
		this.pfunc = pfunc;
	}

	/**
	 * 获取父菜单
	 * @return pfunc 父菜单
	 **/
	public String getPfunc() {
		return this.pfunc;
	}

	/**
	 * 
	 * 设置功能菜单名称
	 * @param name 功能菜单名称
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取功能菜单名称
	 * @return name 功能菜单名称
	 **/
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * 设置路径
	 * @param url 路径
	 **/
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * 获取路径
	 * @return url 路径
	 **/
	public String getUrl() {
		return this.url;
	}

	/**
	 * 
	 * 设置图标
	 * @param icon 图标
	 **/
	public void setIcon(String icon) {
		this.icon = icon;
	}

	/**
	 * 获取图标
	 * @return icon 图标
	 **/
	public String getIcon() {
		return this.icon;
	}

	/**
	 * 
	 * 设置同级排序
	 * @param sn 同级排序
	 **/
	public void setSn(Integer sn) {
		this.sn = sn;
	}

	/**
	 * 获取同级排序
	 * @return sn 同级排序
	 **/
	public Integer getSn() {
		return this.sn;
	}

	/**
	 * 
	 * 设置权限代码
	 * @param code 权限代码
	 **/
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取权限代码
	 * @return code 权限代码
	 **/
	public String getCode() {
		return this.code;
	}

	/**
	 * 
	 * 设置产品ID
	 * @param product 产品ID
	 **/
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * 获取产品ID
	 * @return product 产品ID
	 **/
	public String getProduct() {
		return this.product;
	}

	/**
	 * 
	 * 设置类型：1:模块,2:界面,3:按钮,4:元素
	 * @param type 类型：1:模块,2:界面,3:按钮,4:元素
	 **/
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * 获取类型：1:模块,2:界面,3:按钮,4:元素
	 * @return type 类型：1:模块,2:界面,3:按钮,4:元素
	 **/
	public Integer getType() {
		return this.type;
	}

	/**
	 * 
	 * 设置状态：1:正常,0:禁用
	 * @param state 状态：1:正常,0:禁用
	 **/
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * 获取状态：1:正常,0:禁用
	 * @return state 状态：1:正常,0:禁用
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
