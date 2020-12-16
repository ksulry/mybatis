package com.springboot.mybatis.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * @author ln
 * @Description: 文书上网数据传递
 * @String 2020/6/11  15:31
 */
public class NpWritBean  {
    @JsonProperty("CAh")
    private String CAh; //案号
    @JsonProperty("CAjbh")
    private String CAjbh;//案件编号
    private String CAjmc;//案件名称
    private String CAjsjMc;//案件涉及（名称拼串）多个用
    private String CAy;//案由
    private String CAymc;//案由名称
    private String CCbbmid;//承办部门id
    private String CCbr;//承办人id
    private String CDocFtp;//FTP上的原文书路径
    private String CDsr;//当事人名称
    private String CFybh;//法院编号
    private String CJafsMc;//结案方式名称
    private String CSjy;//书记员名称
    private String CSpry;//审判人员名称
    private String CWritBh;//文书编号，需保持唯一
    private String CWsmc;//文书名称
    private String CYwlbMC;//业务类别名称
    private String DAjsxrq;//案件生效日期
    @JsonProperty("DCprq")
    private Date DCprq;//裁判日期
    private String DJarq; //结案日期
    private String NAjlx;//案件类型编码
    private String NAjsfsx;//案件是否生效  1：生效 2：未生效
    private String NJafs;//结案方式代码
    private String NSensitive;//是否为敏感文书 1：敏感 0非敏感
    private String NSfSsOrKs;//是否上诉或抗诉 1：是 2：否
    private String NSfssgsl;//是否涉三股势力
    private String NSpcx;//审判程序
    private String NSsmzwsyylx; //少数民族语言类型 蒙文：1;藏文：2;维文：3;空 汉语
    private String NWslx;//文书类型  1：判决书 2裁定书 3调解书 4决定书 6通知书 7批复 8答复 9函 10令 255其他
    private String NWsly;//文书来源  4：减刑假释
    private String NYwlb;// 业务类别 (可为空)
    private String NZscq;//是否知识产权，0 否 1 是
    private List<String> bgrList; //被告人名称列表
    private List<String> bhrList; //被害人名称列表
    private Date dtUpdateTime;//更新时间

    public String getCAh() {
        return this.CAh;
    }

    public void setCAh(String CAh) {
        this.CAh = CAh;
    }

    public String getCAjbh() {
        return this.CAjbh;
    }

    public void setCAjbh(String CAjbh) {
        this.CAjbh = CAjbh;
    }

    public String getCAjmc() {
        return this.CAjmc;
    }

    public void setCAjmc(String CAjmc) {
        this.CAjmc = CAjmc;
    }

    public String getCAjsjMc() {
        return this.CAjsjMc;
    }

    public void setCAjsjMc(String CAjsjMc) {
        this.CAjsjMc = CAjsjMc;
    }

    public String getCAy() {
        return this.CAy;
    }

    public void setCAy(String CAy) {
        this.CAy = CAy;
    }

    public String getCAymc() {
        return this.CAymc;
    }

    public void setCAymc(String CAymc) {
        this.CAymc = CAymc;
    }

    public String getCCbbmid() {
        return this.CCbbmid;
    }

    public void setCCbbmid(String CCbbmid) {
        this.CCbbmid = CCbbmid;
    }

    public String getCCbr() {
        return this.CCbr;
    }

    public void setCCbr(String CCbr) {
        this.CCbr = CCbr;
    }

    public String getCDocFtp() {
        return this.CDocFtp;
    }

    public void setCDocFtp(String CDocFtp) {
        this.CDocFtp = CDocFtp;
    }

    public String getCDsr() {
        return this.CDsr;
    }

    public void setCDsr(String CDsr) {
        this.CDsr = CDsr;
    }

    public String getCFybh() {
        return this.CFybh;
    }

    public void setCFybh(String CFybh) {
        this.CFybh = CFybh;
    }

    public String getCJafsMc() {
        return this.CJafsMc;
    }

    public void setCJafsMc(String CJafsMc) {
        this.CJafsMc = CJafsMc;
    }

    public String getCSjy() {
        return this.CSjy;
    }

    public void setCSjy(String CSjy) {
        this.CSjy = CSjy;
    }

    public String getCSpry() {
        return this.CSpry;
    }

    public void setCSpry(String CSpry) {
        this.CSpry = CSpry;
    }

    public String getCWritBh() {
        return this.CWritBh;
    }

    public void setCWritBh(String CWritBh) {
        this.CWritBh = CWritBh;
    }

    public String getCWsmc() {
        return this.CWsmc;
    }

    public void setCWsmc(String CWsmc) {
        this.CWsmc = CWsmc;
    }

    public String getCYwlbMC() {
        return this.CYwlbMC;
    }

    public void setCYwlbMC(String CYwlbMC) {
        this.CYwlbMC = CYwlbMC;
    }

    public String getDAjsxrq() {
        return this.DAjsxrq;
    }

    public void setDAjsxrq(String DAjsxrq) {
        this.DAjsxrq = DAjsxrq;
    }

    public Date getDCprq() {
        return this.DCprq;
    }

    public void setDCprq(Date DCprq) {
        this.DCprq = DCprq;
    }

    public String getDJarq() {
        return this.DJarq;
    }

    public void setDJarq(String DJarq) {
        this.DJarq = DJarq;
    }

    public String getNAjlx() {
        return this.NAjlx;
    }

    public void setNAjlx(String NAjlx) {
        this.NAjlx = NAjlx;
    }

    public String getNAjsfsx() {
        return this.NAjsfsx;
    }

    public void setNAjsfsx(String NAjsfsx) {
        this.NAjsfsx = NAjsfsx;
    }

    public String getNJafs() {
        return this.NJafs;
    }

    public void setNJafs(String NJafs) {
        this.NJafs = NJafs;
    }

    public String getNSensitive() {
        return this.NSensitive;
    }

    public void setNSensitive(String NSensitive) {
        this.NSensitive = NSensitive;
    }

    public String getNSfSsOrKs() {
        return this.NSfSsOrKs;
    }

    public void setNSfSsOrKs(String NSfSsOrKs) {
        this.NSfSsOrKs = NSfSsOrKs;
    }

    public String getNSfssgsl() {
        return this.NSfssgsl;
    }

    public void setNSfssgsl(String NSfssgsl) {
        this.NSfssgsl = NSfssgsl;
    }

    public String getNSpcx() {
        return this.NSpcx;
    }

    public void setNSpcx(String NSpcx) {
        this.NSpcx = NSpcx;
    }

    public String getNSsmzwsyylx() {
        return this.NSsmzwsyylx;
    }

    public void setNSsmzwsyylx(String NSsmzwsyylx) {
        this.NSsmzwsyylx = NSsmzwsyylx;
    }

    public String getNWslx() {
        return this.NWslx;
    }

    public void setNWslx(String NWslx) {
        this.NWslx = NWslx;
    }

    public String getNWsly() {
        return this.NWsly;
    }

    public void setNWsly(String NWsly) {
        this.NWsly = NWsly;
    }

    public String getNYwlb() {
        return this.NYwlb;
    }

    public void setNYwlb(String NYwlb) {
        this.NYwlb = NYwlb;
    }

    public String getNZscq() {
        return this.NZscq;
    }

    public void setNZscq(String NZscq) {
        this.NZscq = NZscq;
    }

    public List<String> getBgrList() {
        return this.bgrList;
    }

    public void setBgrList(List<String> bgrList) {
        this.bgrList = bgrList;
    }

    public List<String> getBhrList() {
        return this.bhrList;
    }

    public void setBhrList(List<String> bhrList) {
        this.bhrList = bhrList;
    }

    public Date getDtUpdateTime() {
        return this.dtUpdateTime;
    }

    public void setDtUpdateTime(Date dtUpdateTime) {
        this.dtUpdateTime = dtUpdateTime;
    }

}
