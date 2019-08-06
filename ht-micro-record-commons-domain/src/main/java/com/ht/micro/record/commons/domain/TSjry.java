package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_sjry")
public class TSjry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 数据来源
     */
    @Column(name = "CITGC_SOURCE")
    private String citgcSource;

    /**
     * 同步时间
     */
    @Column(name = "CITGC_TIME")
    private Date citgcTime;

    /**
     * 登记单位
     */
    @Column(name = "DJDW")
    private String djdw;

    /**
     * 登记单位名称
     */
    @Column(name = "DJDWMC")
    private String djdwmc;

    /**
     * 登记人代码
     */
    @Column(name = "DJR")
    private String djr;

    /**
     * 登记人
     */
    @Column(name = "DJRXM")
    private String djrxm;

    /**
     * 登记时间
     */
    @Column(name = "DJSJ")
    private Date djsj;

    /**
     * 涉警人员接警编号
     */
    @Column(name = "JJBH")
    private String jjbh;

    /**
     * 涉警人员记录编号
     */
    @Column(name = "JLBH")
    private String jlbh;

    /**
     * RAS
     */
    @Column(name = "RAS")
    private String ras;

    /**
     * 涉警人员人员编号
     */
    @Column(name = "RYBH")
    private String rybh;

    /**
     * 涉警人员涉警类别
     */
    @Column(name = "SJLB")
    private String sjlb;

    /**
     * 修改单位
     */
    @Column(name = "XGDW")
    private String xgdw;

    /**
     * 修改单位名称
     */
    @Column(name = "XGDWMC")
    private String xgdwmc;

    /**
     * 修改人
     */
    @Column(name = "XGR")
    private String xgr;

    /**
     * 修改人姓名
     */
    @Column(name = "XGRXM")
    private String xgrxm;

    /**
     * 修改时间
     */
    @Column(name = "XGSJ")
    private Date xgsj;

    /**
     * 涉警人员现住址
     */
    @Column(name = "XZZ")
    private String xzz;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取数据来源
     *
     * @return CITGC_SOURCE - 数据来源
     */
    public String getCitgcSource() {
        return citgcSource;
    }

    /**
     * 设置数据来源
     *
     * @param citgcSource 数据来源
     */
    public void setCitgcSource(String citgcSource) {
        this.citgcSource = citgcSource;
    }

    /**
     * 获取同步时间
     *
     * @return CITGC_TIME - 同步时间
     */
    public Date getCitgcTime() {
        return citgcTime;
    }

    /**
     * 设置同步时间
     *
     * @param citgcTime 同步时间
     */
    public void setCitgcTime(Date citgcTime) {
        this.citgcTime = citgcTime;
    }

    /**
     * 获取登记单位
     *
     * @return DJDW - 登记单位
     */
    public String getDjdw() {
        return djdw;
    }

    /**
     * 设置登记单位
     *
     * @param djdw 登记单位
     */
    public void setDjdw(String djdw) {
        this.djdw = djdw;
    }

    /**
     * 获取登记单位名称
     *
     * @return DJDWMC - 登记单位名称
     */
    public String getDjdwmc() {
        return djdwmc;
    }

    /**
     * 设置登记单位名称
     *
     * @param djdwmc 登记单位名称
     */
    public void setDjdwmc(String djdwmc) {
        this.djdwmc = djdwmc;
    }

    /**
     * 获取登记人代码
     *
     * @return DJR - 登记人代码
     */
    public String getDjr() {
        return djr;
    }

    /**
     * 设置登记人代码
     *
     * @param djr 登记人代码
     */
    public void setDjr(String djr) {
        this.djr = djr;
    }

    /**
     * 获取登记人
     *
     * @return DJRXM - 登记人
     */
    public String getDjrxm() {
        return djrxm;
    }

    /**
     * 设置登记人
     *
     * @param djrxm 登记人
     */
    public void setDjrxm(String djrxm) {
        this.djrxm = djrxm;
    }

    /**
     * 获取登记时间
     *
     * @return DJSJ - 登记时间
     */
    public Date getDjsj() {
        return djsj;
    }

    /**
     * 设置登记时间
     *
     * @param djsj 登记时间
     */
    public void setDjsj(Date djsj) {
        this.djsj = djsj;
    }

    /**
     * 获取涉警人员接警编号
     *
     * @return JJBH - 涉警人员接警编号
     */
    public String getJjbh() {
        return jjbh;
    }

    /**
     * 设置涉警人员接警编号
     *
     * @param jjbh 涉警人员接警编号
     */
    public void setJjbh(String jjbh) {
        this.jjbh = jjbh;
    }

    /**
     * 获取涉警人员记录编号
     *
     * @return JLBH - 涉警人员记录编号
     */
    public String getJlbh() {
        return jlbh;
    }

    /**
     * 设置涉警人员记录编号
     *
     * @param jlbh 涉警人员记录编号
     */
    public void setJlbh(String jlbh) {
        this.jlbh = jlbh;
    }

    /**
     * 获取RAS
     *
     * @return RAS - RAS
     */
    public String getRas() {
        return ras;
    }

    /**
     * 设置RAS
     *
     * @param ras RAS
     */
    public void setRas(String ras) {
        this.ras = ras;
    }

    /**
     * 获取涉警人员人员编号
     *
     * @return RYBH - 涉警人员人员编号
     */
    public String getRybh() {
        return rybh;
    }

    /**
     * 设置涉警人员人员编号
     *
     * @param rybh 涉警人员人员编号
     */
    public void setRybh(String rybh) {
        this.rybh = rybh;
    }

    /**
     * 获取涉警人员涉警类别
     *
     * @return SJLB - 涉警人员涉警类别
     */
    public String getSjlb() {
        return sjlb;
    }

    /**
     * 设置涉警人员涉警类别
     *
     * @param sjlb 涉警人员涉警类别
     */
    public void setSjlb(String sjlb) {
        this.sjlb = sjlb;
    }

    /**
     * 获取修改单位
     *
     * @return XGDW - 修改单位
     */
    public String getXgdw() {
        return xgdw;
    }

    /**
     * 设置修改单位
     *
     * @param xgdw 修改单位
     */
    public void setXgdw(String xgdw) {
        this.xgdw = xgdw;
    }

    /**
     * 获取修改单位名称
     *
     * @return XGDWMC - 修改单位名称
     */
    public String getXgdwmc() {
        return xgdwmc;
    }

    /**
     * 设置修改单位名称
     *
     * @param xgdwmc 修改单位名称
     */
    public void setXgdwmc(String xgdwmc) {
        this.xgdwmc = xgdwmc;
    }

    /**
     * 获取修改人
     *
     * @return XGR - 修改人
     */
    public String getXgr() {
        return xgr;
    }

    /**
     * 设置修改人
     *
     * @param xgr 修改人
     */
    public void setXgr(String xgr) {
        this.xgr = xgr;
    }

    /**
     * 获取修改人姓名
     *
     * @return XGRXM - 修改人姓名
     */
    public String getXgrxm() {
        return xgrxm;
    }

    /**
     * 设置修改人姓名
     *
     * @param xgrxm 修改人姓名
     */
    public void setXgrxm(String xgrxm) {
        this.xgrxm = xgrxm;
    }

    /**
     * 获取修改时间
     *
     * @return XGSJ - 修改时间
     */
    public Date getXgsj() {
        return xgsj;
    }

    /**
     * 设置修改时间
     *
     * @param xgsj 修改时间
     */
    public void setXgsj(Date xgsj) {
        this.xgsj = xgsj;
    }

    /**
     * 获取涉警人员现住址
     *
     * @return XZZ - 涉警人员现住址
     */
    public String getXzz() {
        return xzz;
    }

    /**
     * 设置涉警人员现住址
     *
     * @param xzz 涉警人员现住址
     */
    public void setXzz(String xzz) {
        this.xzz = xzz;
    }
}