package com.ht.micro.record.commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "p_answer_alarm")
public class PAnswerAlarm {
    /**
     * 接警编号
     */
    @Id
    @Column(name = "JJBH")
    private String jjbh;

    /**
     * 接警补充接警内容
     */
    @Column(name = "BCJJNR")
    private String bcjjnr;

    /**
     * 接警处警意见
     */
    @Column(name = "BJCJYJ")
    private String bjcjyj;

    /**
     * 接警报警电话
     */
    @Column(name = "BJDH")
    private String bjdh;

    /**
     * 接警报警电话用户地址
     */
    @Column(name = "BJDHDZ")
    private String bjdhdz;

    /**
     * 接警报警电话用户姓名
     */
    @Column(name = "BJDHHM")
    private String bjdhhm;

    /**
     * 接警报警时间
     */
    @Column(name = "BJDHSJ")
    private Date bjdhsj;

    /**
     * 接警报警类型
     */
    @Column(name = "BJLX")
    private String bjlx;

    /**
     * 接警报警内容
     */
    @Column(name = "BJNR")
    private String bjnr;

    /**
     * 接警报警人
     */
    @Column(name = "BJR")
    private String bjr;

    /**
     * 接警报警人性别
     */
    @Column(name = "BJRXB")
    private String bjrxb;

    /**
     * 接警退单原因
     */
    @Column(name = "BJTDYY")
    private String bjtdyy;

    /**
     * 接警报警方式
     */
    @Column(name = "BJXS")
    private String bjxs;

    /**
     * 接警毗领情况
     */
    @Column(name = "BLQK")
    private String blqk;

    /**
     * 接警建(构)筑物情况
     */
    @Column(name = "BZWQK")
    private String bzwqk;

    /**
     * 出动车辆编码
     */
    @Column(name = "CDCLBM")
    private String cdclbm;

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
     * 接警处警标识
     */
    @Column(name = "CJBS")
    private String cjbs;

    /**
     * 接警车辆类型
     */
    @Column(name = "CLLX")
    private String cllx;

    /**
     * 接警车辆去向
     */
    @Column(name = "CLQX")
    private String clqx;

    /**
     * 接警登记单位
     */
    @Column(name = "DJDW")
    private String djdw;

    /**
     * 接警登记单位名称
     */
    @Column(name = "DJDWMC")
    private String djdwmc;

    /**
     * 接警登记人
     */
    @Column(name = "DJR")
    private String djr;

    /**
     * 接警登记人姓名
     */
    @Column(name = "DJRXM")
    private String djrxm;

    /**
     * 接警登记时间
     */
    @Column(name = "DJSJ")
    private Date djsj;

    /**
     * 二级接警单位到达时间
     */
    @Column(name = "EJDDSJ")
    private Date ejddsj;

    /**
     * 二级接警单位
     */
    @Column(name = "EJJSDW")
    private String ejjsdw;

    /**
     * 二级接警单位名称
     */
    @Column(name = "EJJSDWMC")
    private String ejjsdwmc;

    /**
     * 二级接警单位接收人
     */
    @Column(name = "EJJSR")
    private String ejjsr;

    /**
     * 二级接警单位接收人姓名
     */
    @Column(name = "EJJSRXM")
    private String ejjsrxm;

    /**
     * 二级接警单位接收时间
     */
    @Column(name = "EJJSSJ")
    private Date ejjssj;

    /**
     * 二级接警单位下发时间
     */
    @Column(name = "EJXFSJ")
    private Date ejxfsj;

    /**
     * 反馈要求
     */
    @Column(name = "FKYQ")
    private String fkyq;

    /**
     * 接警X坐标
     */
    @Column(name = "GIS_X")
    private String gisX;

    /**
     * 接警Y坐标
     */
    @Column(name = "GIS_Y")
    private String gisY;

    /**
     * 接警关联接警编号
     */
    @Column(name = "GLJJDBH")
    private String gljjdbh;

    /**
     * 接警火灾等级
     */
    @Column(name = "HZDJ")
    private String hzdj;

    /**
     * 接警接警单号
     */
    @Column(name = "JJDBH")
    private String jjdbh;

    /**
     * 接警单位
     */
    @Column(name = "JJDW")
    private String jjdw;

    /**
     * 接警单位名称
     */
    @Column(name = "JJDWMC")
    private String jjdwmc;

    /**
     * 交警短信内容
     */
    @Column(name = "JJDXNR")
    private String jjdxnr;

    /**
     * 交警短信发送时间
     */
    @Column(name = "JJDXSJ")
    private Date jjdxsj;

    /**
     * 接警管辖单位
     */
    @Column(name = "JJGXDW")
    private String jjgxdw;

    @Column(name = "JJLX")
    private String jjlx;

    /**
     * 接警接警录音编号
     */
    @Column(name = "JJLYH")
    private String jjlyh;

    /**
     * 接警人
     */
    @Column(name = "JJR")
    private String jjr;

    /**
     * 接警日期时间
     */
    @Column(name = "JJRQSJ")
    private Date jjrqsj;

    /**
     * 接警人姓名
     */
    @Column(name = "JJRXM")
    private String jjrxm;

    /**
     * 接警行政区划
     */
    @Column(name = "JJXZQH")
    private String jjxzqh;

    /**
     * 接警员姓名
     */
    @Column(name = "JJYXM")
    private String jjyxm;

    /**
     * 接警建筑结构
     */
    @Column(name = "JZJG")
    private String jzjg;

    /**
     * 接警建筑类别
     */
    @Column(name = "JZLB")
    private String jzlb;

    /**
     * 接警路灯杆编号
     */
    @Column(name = "LDGBH")
    private String ldgbh;

    /**
     * 接警来话类别
     */
    @Column(name = "LHLBDM")
    private String lhlbdm;

    /**
     * 接警报警人联系电话
     */
    @Column(name = "LXDH")
    private String lxdh;

    /**
     * 接警派警录音编号
     */
    @Column(name = "PJLYH")
    private String pjlyh;

    /**
     * 接警处警单派警时间
     */
    @Column(name = "PJSJ")
    private Date pjsj;

    /**
     * 接警派警员姓名
     */
    @Column(name = "PJYXM")
    private String pjyxm;

    /**
     * 接警起火场所
     */
    @Column(name = "QHCS")
    private String qhcs;

    /**
     * 接警燃烧物性质
     */
    @Column(name = "RSWXZ")
    private String rswxz;

    /**
     * 上报内容
     */
    @Column(name = "SBNR")
    private String sbnr;

    /**
     * 上报时间
     */
    @Column(name = "SBSJ")
    private Date sbsj;

    /**
     * 是否拨打电话
     */
    @Column(name = "SFBDDH")
    private String sfbddh;

    /**
     * 接警事发部位
     */
    @Column(name = "SFBW")
    private String sfbw;

    /**
     * 接警事发地址
     */
    @Column(name = "SFDD")
    private String sfdd;

    /**
     * 是否已发交通事故自处告知短信
     */
    @Column(name = "SFYFDX")
    private String sfyfdx;

    /**
     * 接警是否重点单位
     */
    @Column(name = "SFZDDW")
    private String sfzddw;

    /**
     * 接警是否符合自行协商处理
     */
    @Column(name = "SFZXXS")
    private String sfzxxs;

    /**
     * 接警涉警车牌
     */
    @Column(name = "SJCPH")
    private String sjcph;

    /**
     * 三级接警单位到达时间
     */
    @Column(name = "SJDDSJ")
    private Date sjddsj;

    /**
     * 三级接警单位
     */
    @Column(name = "SJJSD")
    private String sjjsd;

    /**
     * 三级接警单位名称
     */
    @Column(name = "SJJSDWMC")
    private String sjjsdwmc;

    /**
     * 三级接警单位接收人
     */
    @Column(name = "SJJSR")
    private String sjjsr;

    /**
     * 三级接警单位接收人姓名
     */
    @Column(name = "SJJSRXM")
    private String sjjsrxm;

    /**
     * 三级接警单位接收时间
     */
    @Column(name = "SJJSSJ")
    private Date sjjssj;

    @Column(name = "STRKSJ")
    private String strksj;

    @Column(name = "STXGSJ")
    private String stxgsj;

    /**
     * 接警伤员去向
     */
    @Column(name = "SYQX")
    private String syqx;

    /**
     * 接警通话时长
     */
    @Column(name = "THSC")
    private String thsc;

    /**
     * 接警修改单位
     */
    @Column(name = "XGDW")
    private String xgdw;

    /**
     * 接警修改单位名称
     */
    @Column(name = "XGDWMC")
    private String xgdwmc;

    /**
     * 接警修改人
     */
    @Column(name = "XGR")
    private String xgr;

    /**
     * 接警修改人姓名
     */
    @Column(name = "XGRXM")
    private String xgrxm;

    /**
     * 接警修改时间
     */
    @Column(name = "XGSJ")
    private Date xgsj;

    /**
     * 接警有否逃逸
     */
    @Column(name = "YFTY")
    private String yfty;

    /**
     * 接警有否危险物质
     */
    @Column(name = "YFWXWZ")
    private String yfwxwz;

    /**
     * 接警移交单位
     */
    @Column(name = "YJDW")
    private String yjdw;

    /**
     * 接警移交人
     */
    @Column(name = "YJR")
    private String yjr;

    /**
     * 接警移交时间
     */
    @Column(name = "YJSJ")
    private Date yjsj;

    /**
     * 接警移交说明
     */
    @Column(name = "YJSM")
    private String yjsm;

    /**
     * 接警有无被困人员
     */
    @Column(name = "YWBKRY")
    private String ywbkry;

    /**
     * 接警有无爆炸/泄漏
     */
    @Column(name = "YWBZXL")
    private String ywbzxl;

    /**
     * 接警重点单位编码
     */
    @Column(name = "ZDDWBM")
    private String zddwbm;

    @Column(name = "ZDYJDW")
    private String zdyjdw;

    @Column(name = "ZDYJR")
    private String zdyjr;

    @Column(name = "ZDYJSJ")
    private String zdyjsj;

    @Column(name = "ZDYJSM")
    private String zdyjsm;

    /**
     * PJDBH
     */
    @Column(name = "PJDBH")
    private String pjdbh;

    @Column(name = "CJSJ")
    private Date cjsj;

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
     * 获取接警补充接警内容
     *
     * @return BCJJNR - 接警补充接警内容
     */
    public String getBcjjnr() {
        return bcjjnr;
    }

    /**
     * 设置接警补充接警内容
     *
     * @param bcjjnr 接警补充接警内容
     */
    public void setBcjjnr(String bcjjnr) {
        this.bcjjnr = bcjjnr;
    }

    /**
     * 获取接警处警意见
     *
     * @return BJCJYJ - 接警处警意见
     */
    public String getBjcjyj() {
        return bjcjyj;
    }

    /**
     * 设置接警处警意见
     *
     * @param bjcjyj 接警处警意见
     */
    public void setBjcjyj(String bjcjyj) {
        this.bjcjyj = bjcjyj;
    }

    /**
     * 获取接警报警电话
     *
     * @return BJDH - 接警报警电话
     */
    public String getBjdh() {
        return bjdh;
    }

    /**
     * 设置接警报警电话
     *
     * @param bjdh 接警报警电话
     */
    public void setBjdh(String bjdh) {
        this.bjdh = bjdh;
    }

    /**
     * 获取接警报警电话用户地址
     *
     * @return BJDHDZ - 接警报警电话用户地址
     */
    public String getBjdhdz() {
        return bjdhdz;
    }

    /**
     * 设置接警报警电话用户地址
     *
     * @param bjdhdz 接警报警电话用户地址
     */
    public void setBjdhdz(String bjdhdz) {
        this.bjdhdz = bjdhdz;
    }

    /**
     * 获取接警报警电话用户姓名
     *
     * @return BJDHHM - 接警报警电话用户姓名
     */
    public String getBjdhhm() {
        return bjdhhm;
    }

    /**
     * 设置接警报警电话用户姓名
     *
     * @param bjdhhm 接警报警电话用户姓名
     */
    public void setBjdhhm(String bjdhhm) {
        this.bjdhhm = bjdhhm;
    }

    /**
     * 获取接警报警时间
     *
     * @return BJDHSJ - 接警报警时间
     */
    public Date getBjdhsj() {
        return bjdhsj;
    }

    /**
     * 设置接警报警时间
     *
     * @param bjdhsj 接警报警时间
     */
    public void setBjdhsj(Date bjdhsj) {
        this.bjdhsj = bjdhsj;
    }

    /**
     * 获取接警报警类型
     *
     * @return BJLX - 接警报警类型
     */
    public String getBjlx() {
        return bjlx;
    }

    /**
     * 设置接警报警类型
     *
     * @param bjlx 接警报警类型
     */
    public void setBjlx(String bjlx) {
        this.bjlx = bjlx;
    }

    /**
     * 获取接警报警内容
     *
     * @return BJNR - 接警报警内容
     */
    public String getBjnr() {
        return bjnr;
    }

    /**
     * 设置接警报警内容
     *
     * @param bjnr 接警报警内容
     */
    public void setBjnr(String bjnr) {
        this.bjnr = bjnr;
    }

    /**
     * 获取接警报警人
     *
     * @return BJR - 接警报警人
     */
    public String getBjr() {
        return bjr;
    }

    /**
     * 设置接警报警人
     *
     * @param bjr 接警报警人
     */
    public void setBjr(String bjr) {
        this.bjr = bjr;
    }

    /**
     * 获取接警报警人性别
     *
     * @return BJRXB - 接警报警人性别
     */
    public String getBjrxb() {
        return bjrxb;
    }

    /**
     * 设置接警报警人性别
     *
     * @param bjrxb 接警报警人性别
     */
    public void setBjrxb(String bjrxb) {
        this.bjrxb = bjrxb;
    }

    /**
     * 获取接警退单原因
     *
     * @return BJTDYY - 接警退单原因
     */
    public String getBjtdyy() {
        return bjtdyy;
    }

    /**
     * 设置接警退单原因
     *
     * @param bjtdyy 接警退单原因
     */
    public void setBjtdyy(String bjtdyy) {
        this.bjtdyy = bjtdyy;
    }

    /**
     * 获取接警报警方式
     *
     * @return BJXS - 接警报警方式
     */
    public String getBjxs() {
        return bjxs;
    }

    /**
     * 设置接警报警方式
     *
     * @param bjxs 接警报警方式
     */
    public void setBjxs(String bjxs) {
        this.bjxs = bjxs;
    }

    /**
     * 获取接警毗领情况
     *
     * @return BLQK - 接警毗领情况
     */
    public String getBlqk() {
        return blqk;
    }

    /**
     * 设置接警毗领情况
     *
     * @param blqk 接警毗领情况
     */
    public void setBlqk(String blqk) {
        this.blqk = blqk;
    }

    /**
     * 获取接警建(构)筑物情况
     *
     * @return BZWQK - 接警建(构)筑物情况
     */
    public String getBzwqk() {
        return bzwqk;
    }

    /**
     * 设置接警建(构)筑物情况
     *
     * @param bzwqk 接警建(构)筑物情况
     */
    public void setBzwqk(String bzwqk) {
        this.bzwqk = bzwqk;
    }

    /**
     * 获取出动车辆编码
     *
     * @return CDCLBM - 出动车辆编码
     */
    public String getCdclbm() {
        return cdclbm;
    }

    /**
     * 设置出动车辆编码
     *
     * @param cdclbm 出动车辆编码
     */
    public void setCdclbm(String cdclbm) {
        this.cdclbm = cdclbm;
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
     * 获取接警处警标识
     *
     * @return CJBS - 接警处警标识
     */
    public String getCjbs() {
        return cjbs;
    }

    /**
     * 设置接警处警标识
     *
     * @param cjbs 接警处警标识
     */
    public void setCjbs(String cjbs) {
        this.cjbs = cjbs;
    }

    /**
     * 获取接警车辆类型
     *
     * @return CLLX - 接警车辆类型
     */
    public String getCllx() {
        return cllx;
    }

    /**
     * 设置接警车辆类型
     *
     * @param cllx 接警车辆类型
     */
    public void setCllx(String cllx) {
        this.cllx = cllx;
    }

    /**
     * 获取接警车辆去向
     *
     * @return CLQX - 接警车辆去向
     */
    public String getClqx() {
        return clqx;
    }

    /**
     * 设置接警车辆去向
     *
     * @param clqx 接警车辆去向
     */
    public void setClqx(String clqx) {
        this.clqx = clqx;
    }

    /**
     * 获取接警登记单位
     *
     * @return DJDW - 接警登记单位
     */
    public String getDjdw() {
        return djdw;
    }

    /**
     * 设置接警登记单位
     *
     * @param djdw 接警登记单位
     */
    public void setDjdw(String djdw) {
        this.djdw = djdw;
    }

    /**
     * 获取接警登记单位名称
     *
     * @return DJDWMC - 接警登记单位名称
     */
    public String getDjdwmc() {
        return djdwmc;
    }

    /**
     * 设置接警登记单位名称
     *
     * @param djdwmc 接警登记单位名称
     */
    public void setDjdwmc(String djdwmc) {
        this.djdwmc = djdwmc;
    }

    /**
     * 获取接警登记人
     *
     * @return DJR - 接警登记人
     */
    public String getDjr() {
        return djr;
    }

    /**
     * 设置接警登记人
     *
     * @param djr 接警登记人
     */
    public void setDjr(String djr) {
        this.djr = djr;
    }

    /**
     * 获取接警登记人姓名
     *
     * @return DJRXM - 接警登记人姓名
     */
    public String getDjrxm() {
        return djrxm;
    }

    /**
     * 设置接警登记人姓名
     *
     * @param djrxm 接警登记人姓名
     */
    public void setDjrxm(String djrxm) {
        this.djrxm = djrxm;
    }

    /**
     * 获取接警登记时间
     *
     * @return DJSJ - 接警登记时间
     */
    public Date getDjsj() {
        return djsj;
    }

    /**
     * 设置接警登记时间
     *
     * @param djsj 接警登记时间
     */
    public void setDjsj(Date djsj) {
        this.djsj = djsj;
    }

    /**
     * 获取二级接警单位到达时间
     *
     * @return EJDDSJ - 二级接警单位到达时间
     */
    public Date getEjddsj() {
        return ejddsj;
    }

    /**
     * 设置二级接警单位到达时间
     *
     * @param ejddsj 二级接警单位到达时间
     */
    public void setEjddsj(Date ejddsj) {
        this.ejddsj = ejddsj;
    }

    /**
     * 获取二级接警单位
     *
     * @return EJJSDW - 二级接警单位
     */
    public String getEjjsdw() {
        return ejjsdw;
    }

    /**
     * 设置二级接警单位
     *
     * @param ejjsdw 二级接警单位
     */
    public void setEjjsdw(String ejjsdw) {
        this.ejjsdw = ejjsdw;
    }

    /**
     * 获取二级接警单位名称
     *
     * @return EJJSDWMC - 二级接警单位名称
     */
    public String getEjjsdwmc() {
        return ejjsdwmc;
    }

    /**
     * 设置二级接警单位名称
     *
     * @param ejjsdwmc 二级接警单位名称
     */
    public void setEjjsdwmc(String ejjsdwmc) {
        this.ejjsdwmc = ejjsdwmc;
    }

    /**
     * 获取二级接警单位接收人
     *
     * @return EJJSR - 二级接警单位接收人
     */
    public String getEjjsr() {
        return ejjsr;
    }

    /**
     * 设置二级接警单位接收人
     *
     * @param ejjsr 二级接警单位接收人
     */
    public void setEjjsr(String ejjsr) {
        this.ejjsr = ejjsr;
    }

    /**
     * 获取二级接警单位接收人姓名
     *
     * @return EJJSRXM - 二级接警单位接收人姓名
     */
    public String getEjjsrxm() {
        return ejjsrxm;
    }

    /**
     * 设置二级接警单位接收人姓名
     *
     * @param ejjsrxm 二级接警单位接收人姓名
     */
    public void setEjjsrxm(String ejjsrxm) {
        this.ejjsrxm = ejjsrxm;
    }

    /**
     * 获取二级接警单位接收时间
     *
     * @return EJJSSJ - 二级接警单位接收时间
     */
    public Date getEjjssj() {
        return ejjssj;
    }

    /**
     * 设置二级接警单位接收时间
     *
     * @param ejjssj 二级接警单位接收时间
     */
    public void setEjjssj(Date ejjssj) {
        this.ejjssj = ejjssj;
    }

    /**
     * 获取二级接警单位下发时间
     *
     * @return EJXFSJ - 二级接警单位下发时间
     */
    public Date getEjxfsj() {
        return ejxfsj;
    }

    /**
     * 设置二级接警单位下发时间
     *
     * @param ejxfsj 二级接警单位下发时间
     */
    public void setEjxfsj(Date ejxfsj) {
        this.ejxfsj = ejxfsj;
    }

    /**
     * 获取反馈要求
     *
     * @return FKYQ - 反馈要求
     */
    public String getFkyq() {
        return fkyq;
    }

    /**
     * 设置反馈要求
     *
     * @param fkyq 反馈要求
     */
    public void setFkyq(String fkyq) {
        this.fkyq = fkyq;
    }

    /**
     * 获取接警X坐标
     *
     * @return GIS_X - 接警X坐标
     */
    public String getGisX() {
        return gisX;
    }

    /**
     * 设置接警X坐标
     *
     * @param gisX 接警X坐标
     */
    public void setGisX(String gisX) {
        this.gisX = gisX;
    }

    /**
     * 获取接警Y坐标
     *
     * @return GIS_Y - 接警Y坐标
     */
    public String getGisY() {
        return gisY;
    }

    /**
     * 设置接警Y坐标
     *
     * @param gisY 接警Y坐标
     */
    public void setGisY(String gisY) {
        this.gisY = gisY;
    }

    /**
     * 获取接警关联接警编号
     *
     * @return GLJJDBH - 接警关联接警编号
     */
    public String getGljjdbh() {
        return gljjdbh;
    }

    /**
     * 设置接警关联接警编号
     *
     * @param gljjdbh 接警关联接警编号
     */
    public void setGljjdbh(String gljjdbh) {
        this.gljjdbh = gljjdbh;
    }

    /**
     * 获取接警火灾等级
     *
     * @return HZDJ - 接警火灾等级
     */
    public String getHzdj() {
        return hzdj;
    }

    /**
     * 设置接警火灾等级
     *
     * @param hzdj 接警火灾等级
     */
    public void setHzdj(String hzdj) {
        this.hzdj = hzdj;
    }

    /**
     * 获取接警接警单号
     *
     * @return JJDBH - 接警接警单号
     */
    public String getJjdbh() {
        return jjdbh;
    }

    /**
     * 设置接警接警单号
     *
     * @param jjdbh 接警接警单号
     */
    public void setJjdbh(String jjdbh) {
        this.jjdbh = jjdbh;
    }

    /**
     * 获取接警单位
     *
     * @return JJDW - 接警单位
     */
    public String getJjdw() {
        return jjdw;
    }

    /**
     * 设置接警单位
     *
     * @param jjdw 接警单位
     */
    public void setJjdw(String jjdw) {
        this.jjdw = jjdw;
    }

    /**
     * 获取接警单位名称
     *
     * @return JJDWMC - 接警单位名称
     */
    public String getJjdwmc() {
        return jjdwmc;
    }

    /**
     * 设置接警单位名称
     *
     * @param jjdwmc 接警单位名称
     */
    public void setJjdwmc(String jjdwmc) {
        this.jjdwmc = jjdwmc;
    }

    /**
     * 获取交警短信内容
     *
     * @return JJDXNR - 交警短信内容
     */
    public String getJjdxnr() {
        return jjdxnr;
    }

    /**
     * 设置交警短信内容
     *
     * @param jjdxnr 交警短信内容
     */
    public void setJjdxnr(String jjdxnr) {
        this.jjdxnr = jjdxnr;
    }

    /**
     * 获取交警短信发送时间
     *
     * @return JJDXSJ - 交警短信发送时间
     */
    public Date getJjdxsj() {
        return jjdxsj;
    }

    /**
     * 设置交警短信发送时间
     *
     * @param jjdxsj 交警短信发送时间
     */
    public void setJjdxsj(Date jjdxsj) {
        this.jjdxsj = jjdxsj;
    }

    /**
     * 获取接警管辖单位
     *
     * @return JJGXDW - 接警管辖单位
     */
    public String getJjgxdw() {
        return jjgxdw;
    }

    /**
     * 设置接警管辖单位
     *
     * @param jjgxdw 接警管辖单位
     */
    public void setJjgxdw(String jjgxdw) {
        this.jjgxdw = jjgxdw;
    }

    /**
     * @return JJLX
     */
    public String getJjlx() {
        return jjlx;
    }

    /**
     * @param jjlx
     */
    public void setJjlx(String jjlx) {
        this.jjlx = jjlx;
    }

    /**
     * 获取接警接警录音编号
     *
     * @return JJLYH - 接警接警录音编号
     */
    public String getJjlyh() {
        return jjlyh;
    }

    /**
     * 设置接警接警录音编号
     *
     * @param jjlyh 接警接警录音编号
     */
    public void setJjlyh(String jjlyh) {
        this.jjlyh = jjlyh;
    }

    /**
     * 获取接警人
     *
     * @return JJR - 接警人
     */
    public String getJjr() {
        return jjr;
    }

    /**
     * 设置接警人
     *
     * @param jjr 接警人
     */
    public void setJjr(String jjr) {
        this.jjr = jjr;
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
     * 获取接警人姓名
     *
     * @return JJRXM - 接警人姓名
     */
    public String getJjrxm() {
        return jjrxm;
    }

    /**
     * 设置接警人姓名
     *
     * @param jjrxm 接警人姓名
     */
    public void setJjrxm(String jjrxm) {
        this.jjrxm = jjrxm;
    }

    /**
     * 获取接警行政区划
     *
     * @return JJXZQH - 接警行政区划
     */
    public String getJjxzqh() {
        return jjxzqh;
    }

    /**
     * 设置接警行政区划
     *
     * @param jjxzqh 接警行政区划
     */
    public void setJjxzqh(String jjxzqh) {
        this.jjxzqh = jjxzqh;
    }

    /**
     * 获取接警员姓名
     *
     * @return JJYXM - 接警员姓名
     */
    public String getJjyxm() {
        return jjyxm;
    }

    /**
     * 设置接警员姓名
     *
     * @param jjyxm 接警员姓名
     */
    public void setJjyxm(String jjyxm) {
        this.jjyxm = jjyxm;
    }

    /**
     * 获取接警建筑结构
     *
     * @return JZJG - 接警建筑结构
     */
    public String getJzjg() {
        return jzjg;
    }

    /**
     * 设置接警建筑结构
     *
     * @param jzjg 接警建筑结构
     */
    public void setJzjg(String jzjg) {
        this.jzjg = jzjg;
    }

    /**
     * 获取接警建筑类别
     *
     * @return JZLB - 接警建筑类别
     */
    public String getJzlb() {
        return jzlb;
    }

    /**
     * 设置接警建筑类别
     *
     * @param jzlb 接警建筑类别
     */
    public void setJzlb(String jzlb) {
        this.jzlb = jzlb;
    }

    /**
     * 获取接警路灯杆编号
     *
     * @return LDGBH - 接警路灯杆编号
     */
    public String getLdgbh() {
        return ldgbh;
    }

    /**
     * 设置接警路灯杆编号
     *
     * @param ldgbh 接警路灯杆编号
     */
    public void setLdgbh(String ldgbh) {
        this.ldgbh = ldgbh;
    }

    /**
     * 获取接警来话类别
     *
     * @return LHLBDM - 接警来话类别
     */
    public String getLhlbdm() {
        return lhlbdm;
    }

    /**
     * 设置接警来话类别
     *
     * @param lhlbdm 接警来话类别
     */
    public void setLhlbdm(String lhlbdm) {
        this.lhlbdm = lhlbdm;
    }

    /**
     * 获取接警报警人联系电话
     *
     * @return LXDH - 接警报警人联系电话
     */
    public String getLxdh() {
        return lxdh;
    }

    /**
     * 设置接警报警人联系电话
     *
     * @param lxdh 接警报警人联系电话
     */
    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    /**
     * 获取接警派警录音编号
     *
     * @return PJLYH - 接警派警录音编号
     */
    public String getPjlyh() {
        return pjlyh;
    }

    /**
     * 设置接警派警录音编号
     *
     * @param pjlyh 接警派警录音编号
     */
    public void setPjlyh(String pjlyh) {
        this.pjlyh = pjlyh;
    }

    /**
     * 获取接警处警单派警时间
     *
     * @return PJSJ - 接警处警单派警时间
     */
    public Date getPjsj() {
        return pjsj;
    }

    /**
     * 设置接警处警单派警时间
     *
     * @param pjsj 接警处警单派警时间
     */
    public void setPjsj(Date pjsj) {
        this.pjsj = pjsj;
    }

    /**
     * 获取接警派警员姓名
     *
     * @return PJYXM - 接警派警员姓名
     */
    public String getPjyxm() {
        return pjyxm;
    }

    /**
     * 设置接警派警员姓名
     *
     * @param pjyxm 接警派警员姓名
     */
    public void setPjyxm(String pjyxm) {
        this.pjyxm = pjyxm;
    }

    /**
     * 获取接警起火场所
     *
     * @return QHCS - 接警起火场所
     */
    public String getQhcs() {
        return qhcs;
    }

    /**
     * 设置接警起火场所
     *
     * @param qhcs 接警起火场所
     */
    public void setQhcs(String qhcs) {
        this.qhcs = qhcs;
    }

    /**
     * 获取接警燃烧物性质
     *
     * @return RSWXZ - 接警燃烧物性质
     */
    public String getRswxz() {
        return rswxz;
    }

    /**
     * 设置接警燃烧物性质
     *
     * @param rswxz 接警燃烧物性质
     */
    public void setRswxz(String rswxz) {
        this.rswxz = rswxz;
    }

    /**
     * 获取上报内容
     *
     * @return SBNR - 上报内容
     */
    public String getSbnr() {
        return sbnr;
    }

    /**
     * 设置上报内容
     *
     * @param sbnr 上报内容
     */
    public void setSbnr(String sbnr) {
        this.sbnr = sbnr;
    }

    /**
     * 获取上报时间
     *
     * @return SBSJ - 上报时间
     */
    public Date getSbsj() {
        return sbsj;
    }

    /**
     * 设置上报时间
     *
     * @param sbsj 上报时间
     */
    public void setSbsj(Date sbsj) {
        this.sbsj = sbsj;
    }

    /**
     * 获取是否拨打电话
     *
     * @return SFBDDH - 是否拨打电话
     */
    public String getSfbddh() {
        return sfbddh;
    }

    /**
     * 设置是否拨打电话
     *
     * @param sfbddh 是否拨打电话
     */
    public void setSfbddh(String sfbddh) {
        this.sfbddh = sfbddh;
    }

    /**
     * 获取接警事发部位
     *
     * @return SFBW - 接警事发部位
     */
    public String getSfbw() {
        return sfbw;
    }

    /**
     * 设置接警事发部位
     *
     * @param sfbw 接警事发部位
     */
    public void setSfbw(String sfbw) {
        this.sfbw = sfbw;
    }

    /**
     * 获取接警事发地址
     *
     * @return SFDD - 接警事发地址
     */
    public String getSfdd() {
        return sfdd;
    }

    /**
     * 设置接警事发地址
     *
     * @param sfdd 接警事发地址
     */
    public void setSfdd(String sfdd) {
        this.sfdd = sfdd;
    }

    /**
     * 获取是否已发交通事故自处告知短信
     *
     * @return SFYFDX - 是否已发交通事故自处告知短信
     */
    public String getSfyfdx() {
        return sfyfdx;
    }

    /**
     * 设置是否已发交通事故自处告知短信
     *
     * @param sfyfdx 是否已发交通事故自处告知短信
     */
    public void setSfyfdx(String sfyfdx) {
        this.sfyfdx = sfyfdx;
    }

    /**
     * 获取接警是否重点单位
     *
     * @return SFZDDW - 接警是否重点单位
     */
    public String getSfzddw() {
        return sfzddw;
    }

    /**
     * 设置接警是否重点单位
     *
     * @param sfzddw 接警是否重点单位
     */
    public void setSfzddw(String sfzddw) {
        this.sfzddw = sfzddw;
    }

    /**
     * 获取接警是否符合自行协商处理
     *
     * @return SFZXXS - 接警是否符合自行协商处理
     */
    public String getSfzxxs() {
        return sfzxxs;
    }

    /**
     * 设置接警是否符合自行协商处理
     *
     * @param sfzxxs 接警是否符合自行协商处理
     */
    public void setSfzxxs(String sfzxxs) {
        this.sfzxxs = sfzxxs;
    }

    /**
     * 获取接警涉警车牌
     *
     * @return SJCPH - 接警涉警车牌
     */
    public String getSjcph() {
        return sjcph;
    }

    /**
     * 设置接警涉警车牌
     *
     * @param sjcph 接警涉警车牌
     */
    public void setSjcph(String sjcph) {
        this.sjcph = sjcph;
    }

    /**
     * 获取三级接警单位到达时间
     *
     * @return SJDDSJ - 三级接警单位到达时间
     */
    public Date getSjddsj() {
        return sjddsj;
    }

    /**
     * 设置三级接警单位到达时间
     *
     * @param sjddsj 三级接警单位到达时间
     */
    public void setSjddsj(Date sjddsj) {
        this.sjddsj = sjddsj;
    }

    /**
     * 获取三级接警单位
     *
     * @return SJJSD - 三级接警单位
     */
    public String getSjjsd() {
        return sjjsd;
    }

    /**
     * 设置三级接警单位
     *
     * @param sjjsd 三级接警单位
     */
    public void setSjjsd(String sjjsd) {
        this.sjjsd = sjjsd;
    }

    /**
     * 获取三级接警单位名称
     *
     * @return SJJSDWMC - 三级接警单位名称
     */
    public String getSjjsdwmc() {
        return sjjsdwmc;
    }

    /**
     * 设置三级接警单位名称
     *
     * @param sjjsdwmc 三级接警单位名称
     */
    public void setSjjsdwmc(String sjjsdwmc) {
        this.sjjsdwmc = sjjsdwmc;
    }

    /**
     * 获取三级接警单位接收人
     *
     * @return SJJSR - 三级接警单位接收人
     */
    public String getSjjsr() {
        return sjjsr;
    }

    /**
     * 设置三级接警单位接收人
     *
     * @param sjjsr 三级接警单位接收人
     */
    public void setSjjsr(String sjjsr) {
        this.sjjsr = sjjsr;
    }

    /**
     * 获取三级接警单位接收人姓名
     *
     * @return SJJSRXM - 三级接警单位接收人姓名
     */
    public String getSjjsrxm() {
        return sjjsrxm;
    }

    /**
     * 设置三级接警单位接收人姓名
     *
     * @param sjjsrxm 三级接警单位接收人姓名
     */
    public void setSjjsrxm(String sjjsrxm) {
        this.sjjsrxm = sjjsrxm;
    }

    /**
     * 获取三级接警单位接收时间
     *
     * @return SJJSSJ - 三级接警单位接收时间
     */
    public Date getSjjssj() {
        return sjjssj;
    }

    /**
     * 设置三级接警单位接收时间
     *
     * @param sjjssj 三级接警单位接收时间
     */
    public void setSjjssj(Date sjjssj) {
        this.sjjssj = sjjssj;
    }

    /**
     * @return STRKSJ
     */
    public String getStrksj() {
        return strksj;
    }

    /**
     * @param strksj
     */
    public void setStrksj(String strksj) {
        this.strksj = strksj;
    }

    /**
     * @return STXGSJ
     */
    public String getStxgsj() {
        return stxgsj;
    }

    /**
     * @param stxgsj
     */
    public void setStxgsj(String stxgsj) {
        this.stxgsj = stxgsj;
    }

    /**
     * 获取接警伤员去向
     *
     * @return SYQX - 接警伤员去向
     */
    public String getSyqx() {
        return syqx;
    }

    /**
     * 设置接警伤员去向
     *
     * @param syqx 接警伤员去向
     */
    public void setSyqx(String syqx) {
        this.syqx = syqx;
    }

    /**
     * 获取接警通话时长
     *
     * @return THSC - 接警通话时长
     */
    public String getThsc() {
        return thsc;
    }

    /**
     * 设置接警通话时长
     *
     * @param thsc 接警通话时长
     */
    public void setThsc(String thsc) {
        this.thsc = thsc;
    }

    /**
     * 获取接警修改单位
     *
     * @return XGDW - 接警修改单位
     */
    public String getXgdw() {
        return xgdw;
    }

    /**
     * 设置接警修改单位
     *
     * @param xgdw 接警修改单位
     */
    public void setXgdw(String xgdw) {
        this.xgdw = xgdw;
    }

    /**
     * 获取接警修改单位名称
     *
     * @return XGDWMC - 接警修改单位名称
     */
    public String getXgdwmc() {
        return xgdwmc;
    }

    /**
     * 设置接警修改单位名称
     *
     * @param xgdwmc 接警修改单位名称
     */
    public void setXgdwmc(String xgdwmc) {
        this.xgdwmc = xgdwmc;
    }

    /**
     * 获取接警修改人
     *
     * @return XGR - 接警修改人
     */
    public String getXgr() {
        return xgr;
    }

    /**
     * 设置接警修改人
     *
     * @param xgr 接警修改人
     */
    public void setXgr(String xgr) {
        this.xgr = xgr;
    }

    /**
     * 获取接警修改人姓名
     *
     * @return XGRXM - 接警修改人姓名
     */
    public String getXgrxm() {
        return xgrxm;
    }

    /**
     * 设置接警修改人姓名
     *
     * @param xgrxm 接警修改人姓名
     */
    public void setXgrxm(String xgrxm) {
        this.xgrxm = xgrxm;
    }

    /**
     * 获取接警修改时间
     *
     * @return XGSJ - 接警修改时间
     */
    public Date getXgsj() {
        return xgsj;
    }

    /**
     * 设置接警修改时间
     *
     * @param xgsj 接警修改时间
     */
    public void setXgsj(Date xgsj) {
        this.xgsj = xgsj;
    }

    /**
     * 获取接警有否逃逸
     *
     * @return YFTY - 接警有否逃逸
     */
    public String getYfty() {
        return yfty;
    }

    /**
     * 设置接警有否逃逸
     *
     * @param yfty 接警有否逃逸
     */
    public void setYfty(String yfty) {
        this.yfty = yfty;
    }

    /**
     * 获取接警有否危险物质
     *
     * @return YFWXWZ - 接警有否危险物质
     */
    public String getYfwxwz() {
        return yfwxwz;
    }

    /**
     * 设置接警有否危险物质
     *
     * @param yfwxwz 接警有否危险物质
     */
    public void setYfwxwz(String yfwxwz) {
        this.yfwxwz = yfwxwz;
    }

    /**
     * 获取接警移交单位
     *
     * @return YJDW - 接警移交单位
     */
    public String getYjdw() {
        return yjdw;
    }

    /**
     * 设置接警移交单位
     *
     * @param yjdw 接警移交单位
     */
    public void setYjdw(String yjdw) {
        this.yjdw = yjdw;
    }

    /**
     * 获取接警移交人
     *
     * @return YJR - 接警移交人
     */
    public String getYjr() {
        return yjr;
    }

    /**
     * 设置接警移交人
     *
     * @param yjr 接警移交人
     */
    public void setYjr(String yjr) {
        this.yjr = yjr;
    }

    /**
     * 获取接警移交时间
     *
     * @return YJSJ - 接警移交时间
     */
    public Date getYjsj() {
        return yjsj;
    }

    /**
     * 设置接警移交时间
     *
     * @param yjsj 接警移交时间
     */
    public void setYjsj(Date yjsj) {
        this.yjsj = yjsj;
    }

    /**
     * 获取接警移交说明
     *
     * @return YJSM - 接警移交说明
     */
    public String getYjsm() {
        return yjsm;
    }

    /**
     * 设置接警移交说明
     *
     * @param yjsm 接警移交说明
     */
    public void setYjsm(String yjsm) {
        this.yjsm = yjsm;
    }

    /**
     * 获取接警有无被困人员
     *
     * @return YWBKRY - 接警有无被困人员
     */
    public String getYwbkry() {
        return ywbkry;
    }

    /**
     * 设置接警有无被困人员
     *
     * @param ywbkry 接警有无被困人员
     */
    public void setYwbkry(String ywbkry) {
        this.ywbkry = ywbkry;
    }

    /**
     * 获取接警有无爆炸/泄漏
     *
     * @return YWBZXL - 接警有无爆炸/泄漏
     */
    public String getYwbzxl() {
        return ywbzxl;
    }

    /**
     * 设置接警有无爆炸/泄漏
     *
     * @param ywbzxl 接警有无爆炸/泄漏
     */
    public void setYwbzxl(String ywbzxl) {
        this.ywbzxl = ywbzxl;
    }

    /**
     * 获取接警重点单位编码
     *
     * @return ZDDWBM - 接警重点单位编码
     */
    public String getZddwbm() {
        return zddwbm;
    }

    /**
     * 设置接警重点单位编码
     *
     * @param zddwbm 接警重点单位编码
     */
    public void setZddwbm(String zddwbm) {
        this.zddwbm = zddwbm;
    }

    /**
     * @return ZDYJDW
     */
    public String getZdyjdw() {
        return zdyjdw;
    }

    /**
     * @param zdyjdw
     */
    public void setZdyjdw(String zdyjdw) {
        this.zdyjdw = zdyjdw;
    }

    /**
     * @return ZDYJR
     */
    public String getZdyjr() {
        return zdyjr;
    }

    /**
     * @param zdyjr
     */
    public void setZdyjr(String zdyjr) {
        this.zdyjr = zdyjr;
    }

    /**
     * @return ZDYJSJ
     */
    public String getZdyjsj() {
        return zdyjsj;
    }

    /**
     * @param zdyjsj
     */
    public void setZdyjsj(String zdyjsj) {
        this.zdyjsj = zdyjsj;
    }

    /**
     * @return ZDYJSM
     */
    public String getZdyjsm() {
        return zdyjsm;
    }

    /**
     * @param zdyjsm
     */
    public void setZdyjsm(String zdyjsm) {
        this.zdyjsm = zdyjsm;
    }

    /**
     * 获取PJDBH
     *
     * @return PJDBH - PJDBH
     */
    public String getPjdbh() {
        return pjdbh;
    }

    /**
     * 设置PJDBH
     *
     * @param pjdbh PJDBH
     */
    public void setPjdbh(String pjdbh) {
        this.pjdbh = pjdbh;
    }

    /**
     * @return CJSJ
     */
    public Date getCjsj() {
        return cjsj;
    }

    /**
     * @param cjsj
     */
    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }
}