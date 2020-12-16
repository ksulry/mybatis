package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 产品中的机构管理
 **/
@SuppressWarnings("serial")
public class CommDeptBean implements Serializable {

	/** 唯一编号 **/
	private String uid;

	/** 父部门编号 **/
	private String puid;

	/** 组织机构代码 **/
	private String orgNo;

	/** 部门名称 **/
	private String name;

	/** 部门全称 **/
	private String fullname;

	/** 邮编 **/
	private String postcode;

	/** 详细地址 **/
	private String address;

	/** 负责人 **/
	private String chargeman;

	/** 联系电话 **/
	private String tel;

	/** 传真 **/
	private String fax;

	/** 职责：1:管理,2:职能,3:押犯,4:法院,5:检察院 **/
	private Integer type;

	/** 展示级别 **/
	private Integer level;

	/** 同级排序 **/
	private Integer sn;

	/** 对应中等法院 **/
	private String secondcourt;

	/** 对应高等法院 **/
	private String supercourt;

	/** 对应检察院 **/
	private String procuratorate;

	/** 备注 **/
	private String remark;

	/** 更新人 **/
	private String upid;

	/** 更新时间 **/
	private Date uptime;

	/** 删除标志,1:已删除,0:未删除 **/
	private Integer isdel;

	/** 所属监狱 **/
	private String jail;



	/**
	 * 
	 * 设置唯一编号
	 * @param uid 唯一编号
	 **/
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * 获取唯一编号
	 * @return uid 唯一编号
	 **/
	public String getUid() {
		return this.uid;
	}

	/**
	 * 
	 * 设置父部门编号
	 * @param puid 父部门编号
	 **/
	public void setPuid(String puid) {
		this.puid = puid;
	}

	/**
	 * 获取父部门编号
	 * @return puid 父部门编号
	 **/
	public String getPuid() {
		return this.puid;
	}

	/**
	 * 
	 * 设置组织机构代码
	 * @param orgNo 组织机构代码
	 **/
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	/**
	 * 获取组织机构代码
	 * @return orgNo 组织机构代码
	 **/
	public String getOrgNo() {
		return this.orgNo;
	}

	/**
	 * 
	 * 设置部门名称
	 * @param name 部门名称
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取部门名称
	 * @return name 部门名称
	 **/
	public String getName() {
		return this.name;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	/**
	 * 
	 * 设置邮编
	 * @param postcode 邮编
	 **/
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**
	 * 获取邮编
	 * @return postcode 邮编
	 **/
	public String getPostcode() {
		return this.postcode;
	}

	/**
	 * 
	 * 设置详细地址
	 * @param address 详细地址
	 **/
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * 获取详细地址
	 * @return address 详细地址
	 **/
	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * 设置负责人
	 * @param chargeman 负责人
	 **/
	public void setChargeman(String chargeman) {
		this.chargeman = chargeman;
	}

	/**
	 * 获取负责人
	 * @return chargeman 负责人
	 **/
	public String getChargeman() {
		return this.chargeman;
	}

	/**
	 * 
	 * 设置联系电话
	 * @param tel 联系电话
	 **/
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * 获取联系电话
	 * @return tel 联系电话
	 **/
	public String getTel() {
		return this.tel;
	}

	/**
	 * 
	 * 设置传真
	 * @param fax 传真
	 **/
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * 获取传真
	 * @return fax 传真
	 **/
	public String getFax() {
		return this.fax;
	}

	/**
	 * 
	 * 设置职责：1:管理,2:职能,3:押犯,4:法院,5:检察院
	 * @param type 职责：1:管理,2:职能,3:押犯,4:法院,5:检察院
	 **/
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * 获取职责：1:管理,2:职能,3:押犯,4:法院,5:检察院
	 * @return type 职责：1:管理,2:职能,3:押犯,4:法院,5:检察院
	 **/
	public Integer getType() {
		return this.type;
	}

	/**
	 * 
	 * 设置展示级别
	 * @param level 展示级别
	 **/
	public void setLevel(Integer level) {
		this.level = level;
	}

	/**
	 * 获取展示级别
	 * @return level 展示级别
	 **/
	public Integer getLevel() {
		return this.level;
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
	 * 设置对应中等法院
	 * @param secondcourt 对应中等法院
	 **/
	public void setSecondcourt(String secondcourt) {
		this.secondcourt = secondcourt;
	}

	/**
	 * 获取对应中等法院
	 * @return secondcourt 对应中等法院
	 **/
	public String getSecondcourt() {
		return this.secondcourt;
	}

	/**
	 * 
	 * 设置对应高等法院
	 * @param supercourt 对应高等法院
	 **/
	public void setSupercourt(String supercourt) {
		this.supercourt = supercourt;
	}

	/**
	 * 获取对应高等法院
	 * @return supercourt 对应高等法院
	 **/
	public String getSupercourt() {
		return this.supercourt;
	}

	/**
	 * 
	 * 设置对应检察院
	 * @param procuratorate 对应检察院
	 **/
	public void setProcuratorate(String procuratorate) {
		this.procuratorate = procuratorate;
	}

	/**
	 * 获取对应检察院
	 * @return procuratorate 对应检察院
	 **/
	public String getProcuratorate() {
		return this.procuratorate;
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

	public String getJail() {
		return jail;
	}

	public void setJail(String jail) {
		this.jail = jail;
	}
}
