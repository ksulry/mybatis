package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 记录租户购买或试用产品中的功能，用于角色分配时
 * 
 **/
@SuppressWarnings("serial")
public class CommProductTenantFuncBean implements Serializable {

	/** 租户 **/
	private String tenant;

	/** 产品 **/
	private String product;

	/** 功能 **/
	private String func;

	/** 创建人 **/
	private String crid;

	/** 创建时间 **/
	private Date crtime;



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
	 * 设置产品
	 * @param product 产品
	 **/
	public void setProduct(String product) {
		this.product = product;
	}

	/**
	 * 获取产品
	 * @return product 产品
	 **/
	public String getProduct() {
		return this.product;
	}

	/**
	 * 
	 * 设置功能
	 * @param func 功能
	 **/
	public void setFunc(String func) {
		this.func = func;
	}

	/**
	 * 获取功能
	 * @return func 功能
	 **/
	public String getFunc() {
		return this.func;
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

}
