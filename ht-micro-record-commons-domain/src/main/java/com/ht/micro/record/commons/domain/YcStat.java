package com.ht.micro.record.commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "yc_stat")
public class YcStat {
    /**
     * 接警编号
     */
    @Id
    @Column(name = "JJBH")
    private String jjbh;

    /**
     * 接警日期时间
     */
    @Column(name = "JJRQSJ")
    private Date jjrqsj;

    /**
     * 修改时间
     */
    @Column(name = "XGSJ")
    private Date xgsj;

    /**
     * 处警标号
     */
    @Column(name = "CJBH")
    private String cjbh;

    /**
     * 处警时间
     */
    @Column(name = "CJSJ")
    private Date cjsj;

    /**
     * 两抢反馈标识
     */
    @Column(name = "LQFKBS")
    private Integer lqfkbs;

    /**
     * 警情反馈标识
     */
    @Column(name = "JQFKBS")
    private Integer jqfkbs;

    /**
     * 审批标识
     */
    @Column(name = "SPBS")
    private Integer spbs;

    /**
     * 违改非
     */
    @Column(name = "WGFBS")
    private Integer wgfbs;

    /**
     * 处警修改时间
     */
    @Column(name = "PHAXGSJ")
    private Date phaxgsj;

    /**
     * 接警同步时间
     */
    @Column(name = "CITGC_TIME")
    private Date citgcTime;

    /**
     * 处警同步时间
     */
    @Column(name = "PHA_CITGC_TIME")
    private Date phaCitgcTime;

    @Column(name = "JJDW")
    private String jjdw;

    @Column(name = "CJDW")
    private String cjdw;

    @Column(name = "CJLB")
    private String cjlb;

    @Column(name = "CJJG")
    private String cjjg;

    @Column(name = "CJJGNR")
    private String cjjgnr;

    @Column(name = "BJLX")
    private String bjlx;

    @Column(name = "CJFKSJ")
    private Date cjfksj;

    @Column(name = "CJLB_NAME")
    private String cjlbName;

    @Column(name = "CJJG_NAME")
    private String cjjgName;

    @Column(name = "BJNR")
    private String bjnr;

    /**
     * 获取接警编号
     *
     * @return JJBH - 接警编号
     */
    public String getJjbh() {
        return jjbh;
    }

    /**
     * 设置接警编号
     *
     * @param jjbh 接警编号
     */
    public void setJjbh(String jjbh) {
        this.jjbh = jjbh;
    }

    /**
     * 获取接警日期时间
     *
     * @return JJRQSJ - 接警日期时间
     */
    public Date getJjrqsj() {
        return jjrqsj;
    }

    /**
     * 设置接警日期时间
     *
     * @param jjrqsj 接警日期时间
     */
    public void setJjrqsj(Date jjrqsj) {
        this.jjrqsj = jjrqsj;
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
     * 获取处警标号
     *
     * @return CJBH - 处警标号
     */
    public String getCjbh() {
        return cjbh;
    }

    /**
     * 设置处警标号
     *
     * @param cjbh 处警标号
     */
    public void setCjbh(String cjbh) {
        this.cjbh = cjbh;
    }

    /**
     * 获取处警时间
     *
     * @return CJSJ - 处警时间
     */
    public Date getCjsj() {
        return cjsj;
    }

    /**
     * 设置处警时间
     *
     * @param cjsj 处警时间
     */
    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    /**
     * 获取两抢反馈标识
     *
     * @return LQFKBS - 两抢反馈标识
     */
    public Integer getLqfkbs() {
        return lqfkbs;
    }

    /**
     * 设置两抢反馈标识
     *
     * @param lqfkbs 两抢反馈标识
     */
    public void setLqfkbs(Integer lqfkbs) {
        this.lqfkbs = lqfkbs;
    }

    /**
     * 获取警情反馈标识
     *
     * @return JQFKBS - 警情反馈标识
     */
    public Integer getJqfkbs() {
        return jqfkbs;
    }

    /**
     * 设置警情反馈标识
     *
     * @param jqfkbs 警情反馈标识
     */
    public void setJqfkbs(Integer jqfkbs) {
        this.jqfkbs = jqfkbs;
    }

    /**
     * 获取审批标识
     *
     * @return SPBS - 审批标识
     */
    public Integer getSpbs() {
        return spbs;
    }

    /**
     * 设置审批标识
     *
     * @param spbs 审批标识
     */
    public void setSpbs(Integer spbs) {
        this.spbs = spbs;
    }

    /**
     * 获取违改非
     *
     * @return WGFBS - 违改非
     */
    public Integer getWgfbs() {
        return wgfbs;
    }

    /**
     * 设置违改非
     *
     * @param wgfbs 违改非
     */
    public void setWgfbs(Integer wgfbs) {
        this.wgfbs = wgfbs;
    }

    /**
     * 获取处警修改时间
     *
     * @return PHAXGSJ - 处警修改时间
     */
    public Date getPhaxgsj() {
        return phaxgsj;
    }

    /**
     * 设置处警修改时间
     *
     * @param phaxgsj 处警修改时间
     */
    public void setPhaxgsj(Date phaxgsj) {
        this.phaxgsj = phaxgsj;
    }

    /**
     * 获取接警同步时间
     *
     * @return CITGC_TIME - 接警同步时间
     */
    public Date getCitgcTime() {
        return citgcTime;
    }

    /**
     * 设置接警同步时间
     *
     * @param citgcTime 接警同步时间
     */
    public void setCitgcTime(Date citgcTime) {
        this.citgcTime = citgcTime;
    }

    /**
     * 获取处警同步时间
     *
     * @return PHA_CITGC_TIME - 处警同步时间
     */
    public Date getPhaCitgcTime() {
        return phaCitgcTime;
    }

    /**
     * 设置处警同步时间
     *
     * @param phaCitgcTime 处警同步时间
     */
    public void setPhaCitgcTime(Date phaCitgcTime) {
        this.phaCitgcTime = phaCitgcTime;
    }

    /**
     * @return JJDW
     */
    public String getJjdw() {
        return jjdw;
    }

    /**
     * @param jjdw
     */
    public void setJjdw(String jjdw) {
        this.jjdw = jjdw;
    }

    /**
     * @return CJDW
     */
    public String getCjdw() {
        return cjdw;
    }

    /**
     * @param cjdw
     */
    public void setCjdw(String cjdw) {
        this.cjdw = cjdw;
    }

    /**
     * @return CJLB
     */
    public String getCjlb() {
        return cjlb;
    }

    /**
     * @param cjlb
     */
    public void setCjlb(String cjlb) {
        this.cjlb = cjlb;
    }

    /**
     * @return CJJG
     */
    public String getCjjg() {
        return cjjg;
    }

    /**
     * @param cjjg
     */
    public void setCjjg(String cjjg) {
        this.cjjg = cjjg;
    }

    /**
     * @return CJJGNR
     */
    public String getCjjgnr() {
        return cjjgnr;
    }

    /**
     * @param cjjgnr
     */
    public void setCjjgnr(String cjjgnr) {
        this.cjjgnr = cjjgnr;
    }

    /**
     * @return BJLX
     */
    public String getBjlx() {
        return bjlx;
    }

    /**
     * @param bjlx
     */
    public void setBjlx(String bjlx) {
        this.bjlx = bjlx;
    }

    /**
     * @return CJFKSJ
     */
    public Date getCjfksj() {
        return cjfksj;
    }

    /**
     * @param cjfksj
     */
    public void setCjfksj(Date cjfksj) {
        this.cjfksj = cjfksj;
    }

    /**
     * @return CJLB_NAME
     */
    public String getCjlbName() {
        return cjlbName;
    }

    /**
     * @param cjlbName
     */
    public void setCjlbName(String cjlbName) {
        this.cjlbName = cjlbName;
    }

    /**
     * @return CJJG_NAME
     */
    public String getCjjgName() {
        return cjjgName;
    }

    /**
     * @param cjjgName
     */
    public void setCjjgName(String cjjgName) {
        this.cjjgName = cjjgName;
    }

    /**
     * @return BJNR
     */
    public String getBjnr() {
        return bjnr;
    }

    /**
     * @param bjnr
     */
    public void setBjnr(String bjnr) {
        this.bjnr = bjnr;
    }
}