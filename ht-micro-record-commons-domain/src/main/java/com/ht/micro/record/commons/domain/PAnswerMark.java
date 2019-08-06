package com.ht.micro.record.commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "p_answer_mark")
public class PAnswerMark {
    @Id
    @Column(name = "JJBH")
    private String jjbh;

    @Column(name = "CJBH")
    private String cjbh;

    /**
     * 接警日期
     */
    @Column(name = "JJRQSJ")
    private Date jjrqsj;

    /**
     * 处警时间
     */
    @Column(name = "CJSJ")
    private Date cjsj;

    /**
     * 处警类别
     */
    @Column(name = "CJLB")
    private String cjlb;

    /**
     * 审批时间
     */
    @Column(name = "SPSJ")
    private Date spsj;

    /**
     * 24小时反馈标识
     */
    @Column(name = "JQFKBS")
    private String jqfkbs;

    /**
     * 两抢反馈标识
     */
    @Column(name = "LQFKBS")
    private String lqfkbs;

    /**
     * 24小时审批标识 1
     */
    @Column(name = "JQSPBS")
    private String jqspbs;

    /**
     * 报警类别
     */
    @Column(name = "BJLX")
    private String bjlx;

    /**
     * 接警同步时间
     */
    @Column(name = "JJCITGCTIME")
    private Date jjcitgctime;

    /**
     * 处警同步时间
     */
    @Column(name = "CJCITGCTIME")
    private Date cjcitgctime;

    /**
     * 报警电话时间
     */
    @Column(name = "BJDHSJ")
    private Date bjdhsj;

    /**
     * @return JJBH
     */
    public String getJjbh() {
        return jjbh;
    }

    /**
     * @param jjbh
     */
    public void setJjbh(String jjbh) {
        this.jjbh = jjbh;
    }

    /**
     * @return CJBH
     */
    public String getCjbh() {
        return cjbh;
    }

    /**
     * @param cjbh
     */
    public void setCjbh(String cjbh) {
        this.cjbh = cjbh;
    }

    /**
     * 获取接警日期
     *
     * @return JJRQSJ - 接警日期
     */
    public Date getJjrqsj() {
        return jjrqsj;
    }

    /**
     * 设置接警日期
     *
     * @param jjrqsj 接警日期
     */
    public void setJjrqsj(Date jjrqsj) {
        this.jjrqsj = jjrqsj;
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
     * 获取处警类别
     *
     * @return CJLB - 处警类别
     */
    public String getCjlb() {
        return cjlb;
    }

    /**
     * 设置处警类别
     *
     * @param cjlb 处警类别
     */
    public void setCjlb(String cjlb) {
        this.cjlb = cjlb;
    }

    /**
     * 获取审批时间
     *
     * @return SPSJ - 审批时间
     */
    public Date getSpsj() {
        return spsj;
    }

    /**
     * 设置审批时间
     *
     * @param spsj 审批时间
     */
    public void setSpsj(Date spsj) {
        this.spsj = spsj;
    }

    /**
     * 获取24小时反馈标识
     *
     * @return JQFKBS - 24小时反馈标识
     */
    public String getJqfkbs() {
        return jqfkbs;
    }

    /**
     * 设置24小时反馈标识
     *
     * @param jqfkbs 24小时反馈标识
     */
    public void setJqfkbs(String jqfkbs) {
        this.jqfkbs = jqfkbs;
    }

    /**
     * 获取两抢反馈标识
     *
     * @return LQFKBS - 两抢反馈标识
     */
    public String getLqfkbs() {
        return lqfkbs;
    }

    /**
     * 设置两抢反馈标识
     *
     * @param lqfkbs 两抢反馈标识
     */
    public void setLqfkbs(String lqfkbs) {
        this.lqfkbs = lqfkbs;
    }

    /**
     * 获取24小时审批标识 1
     *
     * @return JQSPBS - 24小时审批标识 1
     */
    public String getJqspbs() {
        return jqspbs;
    }

    /**
     * 设置24小时审批标识 1
     *
     * @param jqspbs 24小时审批标识 1
     */
    public void setJqspbs(String jqspbs) {
        this.jqspbs = jqspbs;
    }

    /**
     * 获取报警类别
     *
     * @return BJLX - 报警类别
     */
    public String getBjlx() {
        return bjlx;
    }

    /**
     * 设置报警类别
     *
     * @param bjlx 报警类别
     */
    public void setBjlx(String bjlx) {
        this.bjlx = bjlx;
    }

    /**
     * 获取接警同步时间
     *
     * @return JJCITGCTIME - 接警同步时间
     */
    public Date getJjcitgctime() {
        return jjcitgctime;
    }

    /**
     * 设置接警同步时间
     *
     * @param jjcitgctime 接警同步时间
     */
    public void setJjcitgctime(Date jjcitgctime) {
        this.jjcitgctime = jjcitgctime;
    }

    /**
     * 获取处警同步时间
     *
     * @return CJCITGCTIME - 处警同步时间
     */
    public Date getCjcitgctime() {
        return cjcitgctime;
    }

    /**
     * 设置处警同步时间
     *
     * @param cjcitgctime 处警同步时间
     */
    public void setCjcitgctime(Date cjcitgctime) {
        this.cjcitgctime = cjcitgctime;
    }

    /**
     * 获取报警电话时间
     *
     * @return BJDHSJ - 报警电话时间
     */
    public Date getBjdhsj() {
        return bjdhsj;
    }

    /**
     * 设置报警电话时间
     *
     * @param bjdhsj 报警电话时间
     */
    public void setBjdhsj(Date bjdhsj) {
        this.bjdhsj = bjdhsj;
    }
}