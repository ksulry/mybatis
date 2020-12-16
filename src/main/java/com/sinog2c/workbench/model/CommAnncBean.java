package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * null
 * 
 **/
@SuppressWarnings("serial")
public class CommAnncBean implements Serializable {

	/** 唯一主键 **/
	private String uid;

	/** wkb:工作台消息，portal:前台消息 **/
	private String target;

	/** 公告类型,字典表GK0005 **/
	private String type;

	/** 推向某用户 **/
	private String userid;

	/** 公告内容 **/
	private String content;

	/** 状态：0:新增,1:收到(已读) **/
	private Integer state;

	/** 创建人 **/
	private String crid;

	/** 创建时间 **/
	private Date crtime;

	/** 删除标志,1:已删除,0:未删除 **/
	private Integer isdel;

	/** 阅读时间 **/
	private Date readtime;

	/** 消息对应的产品 **/
	private String product;

	/** 产品升级版本号 **/
	private String version;


	/**
	 *
	 * 设置产品升级版本号
	 * @param version 产品升级版本号
	 **/
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * 获取产品升级版本号
	 * @return version 产品升级版本号
	 **/
	public String getVersion() {
		return this.version;
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
	 * 设置wkb:工作台消息，portal:前台消息
	 * @param target wkb:工作台消息，portal:前台消息
	 **/
	public void setTarget(String target) {
		this.target = target;
	}

	/**
	 * 获取wkb:工作台消息，portal:前台消息
	 * @return target wkb:工作台消息，portal:前台消息
	 **/
	public String getTarget() {
		return this.target;
	}

	/**
	 *
	 * 设置公告类型,字典表GK0005
	 * @param type 公告类型,字典表GK0005
	 **/
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 获取公告类型,字典表GK0005
	 * @return type 公告类型,字典表GK0005
	 **/
	public String getType() {
		return this.type;
	}

	/**
	 *
	 * 设置推向某用户
	 * @param userid 推向某用户
	 **/
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * 获取推向某用户
	 * @return userid 推向某用户
	 **/
	public String getUserid() {
		return this.userid;
	}

	/**
	 *
	 * 设置公告内容
	 * @param content 公告内容
	 **/
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * 获取公告内容
	 * @return content 公告内容
	 **/
	public String getContent() {
		return this.content;
	}

	/**
	 *
	 * 设置状态：0:新增,1:收到(已读)
	 * @param state 状态：0:新增,1:收到(已读)
	 **/
	public void setState(Integer state) {
		this.state = state;
	}

	/**
	 * 获取状态：0:新增,1:收到(已读)
	 * @return state 状态：0:新增,1:收到(已读)
	 **/
	public Integer getState() {
		return this.state;
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

	/**
	 *
	 * 设置阅读时间
	 * @param readtime 阅读时间
	 **/
	public void setReadtime(Date readtime) {
		this.readtime = readtime;
	}

	/**
	 * 获取阅读时间
	 * @return readtime 阅读时间
	 **/
	public Date getReadtime() {
		return this.readtime;
	}

	/**
	 *
	 * 设置消息对应的产品
	 * @param product 消息对应的产品
	 **/
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * 获取消息对应的产品
	 * @return product 消息对应的产品
	 **/
	public String getProduct() {
		return this.product;
	}

}

