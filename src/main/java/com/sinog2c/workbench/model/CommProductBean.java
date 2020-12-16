package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 管理大平台中的各产品
 * 
 **/
@SuppressWarnings("serial")
public class CommProductBean implements Serializable {

	/** 唯一主键，产品代码：界面输入 **/
	private String uid;

	/** 名称 **/
	private String name;

	/** 当前版本号 **/
	private String version;

	/** 当前logo，图片路径 **/
	private String logo;

	/** 产品图片1 **/
	private String path1;

	/** 产品图片2 **/
	private String path2;

	/** 产品图片3 **/
	private String path3;

	/** 产品图片4 **/
	private String path4;

	/** 产品图片5 **/
	private String path5;

	/** 展示序号 **/
	private Integer sn;

	/** 状态：1:上线,0:下线 **/
	private Integer state;

	/** 产品描述 **/
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
	 * 设置唯一主键，产品代码：界面输入
	 * @param uid 唯一主键，产品代码：界面输入
	 **/
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * 获取唯一主键，产品代码：界面输入
	 * @return uid 唯一主键，产品代码：界面输入
	 **/
	public String getUid() {
		return this.uid;
	}

	/**
	 * 
	 * 设置名称
	 * @param name 名称
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取名称
	 * @return name 名称
	 **/
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * 设置当前版本号
	 * @param version 当前版本号
	 **/
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * 获取当前版本号
	 * @return version 当前版本号
	 **/
	public String getVersion() {
		return this.version;
	}

	/**
	 * 
	 * 设置当前logo，图片路径
	 * @param logo 当前logo，图片路径
	 **/
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * 获取当前logo，图片路径
	 * @return logo 当前logo，图片路径
	 **/
	public String getLogo() {
		return this.logo;
	}

	/**
	 * 
	 * 设置产品图片1
	 * @param path1 产品图片1
	 **/
	public void setPath1(String path1) {
		this.path1 = path1;
	}

	/**
	 * 获取产品图片1
	 * @return path1 产品图片1
	 **/
	public String getPath1() {
		return this.path1;
	}

	/**
	 * 
	 * 设置产品图片2
	 * @param path2 产品图片2
	 **/
	public void setPath2(String path2) {
		this.path2 = path2;
	}

	/**
	 * 获取产品图片2
	 * @return path2 产品图片2
	 **/
	public String getPath2() {
		return this.path2;
	}

	/**
	 * 
	 * 设置产品图片3
	 * @param path3 产品图片3
	 **/
	public void setPath3(String path3) {
		this.path3 = path3;
	}

	/**
	 * 获取产品图片3
	 * @return path3 产品图片3
	 **/
	public String getPath3() {
		return this.path3;
	}

	/**
	 * 
	 * 设置产品图片4
	 * @param path4 产品图片4
	 **/
	public void setPath4(String path4) {
		this.path4 = path4;
	}

	/**
	 * 获取产品图片4
	 * @return path4 产品图片4
	 **/
	public String getPath4() {
		return this.path4;
	}

	/**
	 * 
	 * 设置产品图片5
	 * @param path5 产品图片5
	 **/
	public void setPath5(String path5) {
		this.path5 = path5;
	}

	/**
	 * 获取产品图片5
	 * @return path5 产品图片5
	 **/
	public String getPath5() {
		return this.path5;
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
	 * 设置状态：1:上线,0:下线
	 * @param state 状态：1:上线,0:下线
	 **/
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * 获取状态：1:上线,0:下线
	 * @return state 状态：1:上线,0:下线
	 **/
	public Integer getState() {
		return this.state;
	}

	/**
	 * 
	 * 设置产品描述
	 * @param remark 产品描述
	 **/
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * 获取产品描述
	 * @return remark 产品描述
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
