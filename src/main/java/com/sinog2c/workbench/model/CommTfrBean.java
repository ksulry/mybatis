package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 管理租户的模板、表单、报表
 * 
 **/
@SuppressWarnings("serial")
public class CommTfrBean implements Serializable {

	/** 唯一主键 **/
	private String uid;

	/** 产品主键 **/
	private String product;

	/** 租户主键 **/
	private String tenant;

	/** 模板代码 **/
	private String code;

	/** 模板名称 **/
	private String name;

	/** 状态：1:在用，0：停用 **/
	private Integer state;

	/** 类型：1:模板,2:表单,3:报表 **/
	private Integer type;

	/** 模板内容 **/
	private String content;

	/** 查询方案,以逗号分隔多个 **/
	private String solution;

	/** 表单、报表的文件路径 **/
	private String file;

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

	private int isChecked;

	public int getIsChecked() {
		return isChecked;
	}

	public void setIsChecked(int isChecked) {
		this.isChecked = isChecked;
	}

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
	 * 设置产品主键
	 * @param product 产品主键
	 **/
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * 获取产品主键
	 * @return product 产品主键
	 **/
	public String getProduct() {
		return this.product;
	}

	/**
	 * 
	 * 设置租户主键
	 * @param tenant 租户主键
	 **/
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	/**
	 * 获取租户主键
	 * @return tenant 租户主键
	 **/
	public String getTenant() {
		return this.tenant;
	}

	/**
	 * 
	 * 设置模板代码
	 * @param code 模板代码
	 **/
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 获取模板代码
	 * @return code 模板代码
	 **/
	public String getCode() {
		return this.code;
	}

	/**
	 * 
	 * 设置模板名称
	 * @param name 模板名称
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取模板名称
	 * @return name 模板名称
	 **/
	public String getName() {
		return this.name;
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
	 * 设置类型：1:模板,2:表单,3:报表
	 * @param type 类型：1:模板,2:表单,3:报表
	 **/
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * 获取类型：1:模板,2:表单,3:报表
	 * @return type 类型：1:模板,2:表单,3:报表
	 **/
	public Integer getType() {
		return this.type;
	}

	/**
	 * 
	 * 设置模板内容
	 * @param content 模板内容
	 **/
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 获取模板内容
	 * @return content 模板内容
	 **/
	public String getContent() {
		return this.content;
	}

	/**
	 * 
	 * 设置查询方案,以逗号分隔多个
	 * @param solution 查询方案,以逗号分隔多个
	 **/
	public void setSolution(String solution) {
		this.solution = solution;
	}

	/**
	 * 获取查询方案,以逗号分隔多个
	 * @return solution 查询方案,以逗号分隔多个
	 **/
	public String getSolution() {
		return this.solution;
	}

	/**
	 * 
	 * 设置表单、报表的文件路径
	 * @param file 表单、报表的文件路径
	 **/
	public void setFile(String file) {
		this.file = file;
	}

	/**
	 * 获取表单、报表的文件路径
	 * @return file 表单、报表的文件路径
	 **/
	public String getFile() {
		return this.file;
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
