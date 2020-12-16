package com.sinog2c.workbench.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * 各级用户，参照用户标识
 * 
 **/
@SuppressWarnings("serial")
public class CommUserBean implements Serializable {

	/** 帐号，具有唯一性 **/
	private String userid;

	/** 姓名 **/
	private String name;

	/** 密码：加盐后的hash值 **/
	private String pwd;

	/** 警号 **/
	private String police;

	/** 性别： 1:男,2:女 **/
	private Integer sex;

	/** 职务-汉字说明 **/
	private String duty;

	/**  **/
	private String tel;

	/**  **/
	private String fax;

	/**  **/
	private String email;

	/** 所在部门 **/
	private String dept;

	/** 租户为管理局、法院代码。以后也可用于分区或分散部署 **/
	private String tenant;

	/** 同级排序 **/
	private Integer sn;

	/** 系统标识，mng:后台管理,wkb:工作台,portal:前端 **/
	private String sysflag;

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

	/** 业务部门 **/
	private String buziDept;

	/** 密码尝试次数，最多5次，即限定1小时不可登录 **/
	private Integer pwdcnt;

	/** 初次登录时间 **/
	private Date pwdcnttime;

	/** 上次修改密码的时间 **/
	private Date pwduptime;

	/** 审批状态 **/
	private Integer approvalstate;

	/** 审批人 **/
	private String approvalid;

	/** 审批时间 **/
	private Date approvaltime;




	/**
	 * 
	 * 设置帐号，具有唯一性
	 * @param userid 帐号，具有唯一性
	 **/
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * 获取帐号，具有唯一性
	 * @return userid 帐号，具有唯一性
	 **/
	public String getUserid() {
		return this.userid;
	}

	/**
	 * 
	 * 设置姓名
	 * @param name 姓名
	 **/
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取姓名
	 * @return name 姓名
	 **/
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * 设置密码：加盐后的hash值
	 * @param pwd 密码：加盐后的hash值
	 **/
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * 获取密码：加盐后的hash值
	 * @return pwd 密码：加盐后的hash值
	 **/
	public String getPwd() {
		return this.pwd;
	}

	/**
	 * 
	 * 设置警号
	 * @param police 警号
	 **/
	public void setPolice(String police) {
		this.police = police;
	}

	/**
	 * 获取警号
	 * @return police 警号
	 **/
	public String getPolice() {
		return this.police;
	}

	/**
	 * 
	 * 设置性别： 1:男,2:女
	 * @param sex 性别： 1:男,2:女
	 **/
	public void setSex(Integer sex) {
		this.sex = sex;
	}

	/**
	 * 获取性别： 1:男,2:女
	 * @return sex 性别： 1:男,2:女
	 **/
	public Integer getSex() {
		return this.sex;
	}

	/**
	 * 
	 * 设置职务-汉字说明
	 * @param duty 职务-汉字说明
	 **/
	public void setDuty(String duty) {
		this.duty = duty;
	}

	/**
	 * 获取职务-汉字说明
	 * @return duty 职务-汉字说明
	 **/
	public String getDuty() {
		return this.duty;
	}

	/**
	 * 
	 * 设置
	 * @param tel 
	 **/
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * 获取
	 * @return tel 
	 **/
	public String getTel() {
		return this.tel;
	}

	/**
	 * 
	 * 设置
	 * @param fax 
	 **/
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * 获取
	 * @return fax 
	 **/
	public String getFax() {
		return this.fax;
	}

	/**
	 * 
	 * 设置
	 * @param email 
	 **/
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 获取
	 * @return email 
	 **/
	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * 设置所在部门
	 * @param dept 所在部门
	 **/
	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * 获取所在部门
	 * @return dept 所在部门
	 **/
	public String getDept() {
		return this.dept;
	}

	/**
	 * 
	 * 设置租户为管理局、法院代码。以后也可用于分区或分散部署
	 * @param tenant 租户为管理局、法院代码。以后也可用于分区或分散部署
	 **/
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

	/**
	 * 获取租户为管理局、法院代码。以后也可用于分区或分散部署
	 * @return tenant 租户为管理局、法院代码。以后也可用于分区或分散部署
	 **/
	public String getTenant() {
		return this.tenant;
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
	 * 设置系统标识，mng:后台管理,wkb:工作台,portal:前端
	 * @param sysflag 系统标识，mng:后台管理,wkb:工作台,portal:前端
	 **/
	public void setSysflag(String sysflag) {
		this.sysflag = sysflag;
	}

	/**
	 * 获取系统标识，mng:后台管理,wkb:工作台,portal:前端
	 * @return sysflag 系统标识，mng:后台管理,wkb:工作台,portal:前端
	 **/
	public String getSysflag() {
		return this.sysflag;
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

	/**
	 * 
	 * 设置业务部门
	 * @param buziDept 业务部门
	 **/
	public void setBuziDept(String buziDept) {
		this.buziDept = buziDept;
	}

	/**
	 * 获取业务部门
	 * @return buziDept 业务部门
	 **/
	public String getBuziDept() {
		return this.buziDept;
	}

	/**
	 *
	 * 设置密码尝试次数，最多5次，即限定1小时不可登录
	 * @param pwdcnt 密码尝试次数，最多5次，即限定1小时不可登录
	 **/
	public void setPwdcnt(Integer pwdcnt) {
		this.pwdcnt = pwdcnt;
	}

	/**
	 * 获取密码尝试次数，最多5次，即限定1小时不可登录
	 * @return pwdcnt 密码尝试次数，最多5次，即限定1小时不可登录
	 **/
	public Integer getPwdcnt() {
		return this.pwdcnt;
	}

	/**
	 *
	 * 设置初次登录时间
	 * @param pwdcnttime 初次登录时间
	 **/
	public void setPwdcnttime(Date pwdcnttime) {
		this.pwdcnttime = pwdcnttime;
	}

	/**
	 * 获取初次登录时间
	 * @return pwdcnttime 初次登录时间
	 **/
	public Date getPwdcnttime() {
		return this.pwdcnttime;
	}

	/**
	 *
	 * 设置上次修改密码的时间
	 * @param pwduptime 上次修改密码的时间
	 **/
	public void setPwduptime(Date pwduptime) {
		this.pwduptime = pwduptime;
	}

	/**
	 * 获取上次修改密码的时间
	 * @return pwduptime 上次修改密码的时间
	 **/
	public Date getPwduptime() {
		return this.pwduptime;
	}

	public Integer getApprovalstate() {
		return approvalstate;
	}

	public void setApprovalstate(Integer approvalstate) {
		this.approvalstate = approvalstate;
	}

	public String getApprovalid() {
		return approvalid;
	}

	public void setApprovalid(String approvalid) {
		this.approvalid = approvalid;
	}

	public Date getApprovaltime() {
		return approvaltime;
	}

	public void setApprovaltime(Date approvaltime) {
		this.approvaltime = approvaltime;
	}
}
