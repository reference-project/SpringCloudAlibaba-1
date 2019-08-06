package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_alarm_analysis_result")
public class TAlarmAnalysisResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 接警编号
     */
    private String jjbh;

    /**
     * 报警类别
     */
    private String bjlb;

    /**
     * 接警时间
     */
    private Date jjrqsj;

    /**
     * 补充处理结果
     */
    private String bccljg;

    /**
     * 接警报警内容
     */
    private String bjnr;

    /**
     * 处警类别
     */
    private String cjlb;

    /**
     * 处警简要警情及处理结果
     */
    private String cljgnr;

    /**
     * 处警单位
     */
    private String cjdw;

    /**
     * 处警单位名称
     */
    private String cjdwmc;

    /**
     * 涉案人员数量
     */
    @Column(name = "involved_people_count")
    private Integer involvedPeopleCount;

    /**
     * 涉案物品数量
     */
    @Column(name = "involved_goods_count")
    private Integer involvedGoodsCount;

    /**
     * 报警内容完整性 0 是 1 否, -1 未处理
     */
    private Integer bjlbco;

    /**
     * 报警类别准确 0 是 1 否, -1 未处理
     */
    private Integer bjlbac;

    /**
     * 处警内容完整性 0 是 1 否, -1 未处理
     */
    private Integer cljgnrco;

    /**
     * 处警类别准确 0 是 1 否, -1 未处理
     */
    private Integer cljgnrac;

    /**
     * 涉案人员 0 是 1 否, -1 未处理
     */
    @Column(name = "involved_people")
    private Integer involvedPeople;

    /**
     * 涉案物品 0 是 1 否, -1 未处理
     */
    @Column(name = "involved_goods")
    private Integer involvedGoods;

    /**
     * 处理内容完整性原因 1缺人 2 缺地址 4 缺时间
     */
    @Column(name = "cljgnrco_cause")
    private Integer cljgnrcoCause;

    /**
     * 处警详细地点
     */
    private String cjxxdd;

    /**
     * 事发时间上限
     */
    private Date sfsjsx;

    /**
     * 事发时间下限
     */
    private Date sfsjxx;

    /**
     * 0 正常, -1 不正常
     */
    private Integer status;

    /**
     * 报警类型 0-110 1-一般
     */
    private String bjxs;

    private String pjyxm;

    /**
     * 同步时间
     */
    @Column(name = "CITGC_TIME")
    private Date citgcTime;

    /**
     * 处警同步时间
     */
    @Column(name = "PHA_CITGC_TIME")
    private Date phaCitgcTime;

    /**
     * 涉案人员关联编号
     */
    @Column(name = "involved_people_code")
    private String involvedPeopleCode;

    /**
     * 涉案物品关联编号
     */
    @Column(name = "involved_goods_code")
    private String involvedGoodsCode;

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
     * 获取接警编号
     *
     * @return jjbh - 接警编号
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
     * 获取报警类别
     *
     * @return bjlb - 报警类别
     */
    public String getBjlb() {
        return bjlb;
    }

    /**
     * 设置报警类别
     *
     * @param bjlb 报警类别
     */
    public void setBjlb(String bjlb) {
        this.bjlb = bjlb;
    }

    /**
     * 获取接警时间
     *
     * @return jjrqsj - 接警时间
     */
    public Date getJjrqsj() {
        return jjrqsj;
    }

    /**
     * 设置接警时间
     *
     * @param jjrqsj 接警时间
     */
    public void setJjrqsj(Date jjrqsj) {
        this.jjrqsj = jjrqsj;
    }

    /**
     * 获取补充处理结果
     *
     * @return bccljg - 补充处理结果
     */
    public String getBccljg() {
        return bccljg;
    }

    /**
     * 设置补充处理结果
     *
     * @param bccljg 补充处理结果
     */
    public void setBccljg(String bccljg) {
        this.bccljg = bccljg;
    }

    /**
     * 获取接警报警内容
     *
     * @return bjnr - 接警报警内容
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
     * 获取处警类别
     *
     * @return cjlb - 处警类别
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
     * 获取处警简要警情及处理结果
     *
     * @return cljgnr - 处警简要警情及处理结果
     */
    public String getCljgnr() {
        return cljgnr;
    }

    /**
     * 设置处警简要警情及处理结果
     *
     * @param cljgnr 处警简要警情及处理结果
     */
    public void setCljgnr(String cljgnr) {
        this.cljgnr = cljgnr;
    }

    /**
     * 获取处警单位
     *
     * @return cjdw - 处警单位
     */
    public String getCjdw() {
        return cjdw;
    }

    /**
     * 设置处警单位
     *
     * @param cjdw 处警单位
     */
    public void setCjdw(String cjdw) {
        this.cjdw = cjdw;
    }

    /**
     * 获取处警单位名称
     *
     * @return cjdwmc - 处警单位名称
     */
    public String getCjdwmc() {
        return cjdwmc;
    }

    /**
     * 设置处警单位名称
     *
     * @param cjdwmc 处警单位名称
     */
    public void setCjdwmc(String cjdwmc) {
        this.cjdwmc = cjdwmc;
    }

    /**
     * 获取涉案人员数量
     *
     * @return involved_people_count - 涉案人员数量
     */
    public Integer getInvolvedPeopleCount() {
        return involvedPeopleCount;
    }

    /**
     * 设置涉案人员数量
     *
     * @param involvedPeopleCount 涉案人员数量
     */
    public void setInvolvedPeopleCount(Integer involvedPeopleCount) {
        this.involvedPeopleCount = involvedPeopleCount;
    }

    /**
     * 获取涉案物品数量
     *
     * @return involved_goods_count - 涉案物品数量
     */
    public Integer getInvolvedGoodsCount() {
        return involvedGoodsCount;
    }

    /**
     * 设置涉案物品数量
     *
     * @param involvedGoodsCount 涉案物品数量
     */
    public void setInvolvedGoodsCount(Integer involvedGoodsCount) {
        this.involvedGoodsCount = involvedGoodsCount;
    }

    /**
     * 获取报警内容完整性 0 是 1 否, -1 未处理
     *
     * @return bjlbco - 报警内容完整性 0 是 1 否, -1 未处理
     */
    public Integer getBjlbco() {
        return bjlbco;
    }

    /**
     * 设置报警内容完整性 0 是 1 否, -1 未处理
     *
     * @param bjlbco 报警内容完整性 0 是 1 否, -1 未处理
     */
    public void setBjlbco(Integer bjlbco) {
        this.bjlbco = bjlbco;
    }

    /**
     * 获取报警类别准确 0 是 1 否, -1 未处理
     *
     * @return bjlbac - 报警类别准确 0 是 1 否, -1 未处理
     */
    public Integer getBjlbac() {
        return bjlbac;
    }

    /**
     * 设置报警类别准确 0 是 1 否, -1 未处理
     *
     * @param bjlbac 报警类别准确 0 是 1 否, -1 未处理
     */
    public void setBjlbac(Integer bjlbac) {
        this.bjlbac = bjlbac;
    }

    /**
     * 获取处警内容完整性 0 是 1 否, -1 未处理
     *
     * @return cljgnrco - 处警内容完整性 0 是 1 否, -1 未处理
     */
    public Integer getCljgnrco() {
        return cljgnrco;
    }

    /**
     * 设置处警内容完整性 0 是 1 否, -1 未处理
     *
     * @param cljgnrco 处警内容完整性 0 是 1 否, -1 未处理
     */
    public void setCljgnrco(Integer cljgnrco) {
        this.cljgnrco = cljgnrco;
    }

    /**
     * 获取处警类别准确 0 是 1 否, -1 未处理
     *
     * @return cljgnrac - 处警类别准确 0 是 1 否, -1 未处理
     */
    public Integer getCljgnrac() {
        return cljgnrac;
    }

    /**
     * 设置处警类别准确 0 是 1 否, -1 未处理
     *
     * @param cljgnrac 处警类别准确 0 是 1 否, -1 未处理
     */
    public void setCljgnrac(Integer cljgnrac) {
        this.cljgnrac = cljgnrac;
    }

    /**
     * 获取涉案人员 0 是 1 否, -1 未处理
     *
     * @return involved_people - 涉案人员 0 是 1 否, -1 未处理
     */
    public Integer getInvolvedPeople() {
        return involvedPeople;
    }

    /**
     * 设置涉案人员 0 是 1 否, -1 未处理
     *
     * @param involvedPeople 涉案人员 0 是 1 否, -1 未处理
     */
    public void setInvolvedPeople(Integer involvedPeople) {
        this.involvedPeople = involvedPeople;
    }

    /**
     * 获取涉案物品 0 是 1 否, -1 未处理
     *
     * @return involved_goods - 涉案物品 0 是 1 否, -1 未处理
     */
    public Integer getInvolvedGoods() {
        return involvedGoods;
    }

    /**
     * 设置涉案物品 0 是 1 否, -1 未处理
     *
     * @param involvedGoods 涉案物品 0 是 1 否, -1 未处理
     */
    public void setInvolvedGoods(Integer involvedGoods) {
        this.involvedGoods = involvedGoods;
    }

    /**
     * 获取处理内容完整性原因 1缺人 2 缺地址 4 缺时间
     *
     * @return cljgnrco_cause - 处理内容完整性原因 1缺人 2 缺地址 4 缺时间
     */
    public Integer getCljgnrcoCause() {
        return cljgnrcoCause;
    }

    /**
     * 设置处理内容完整性原因 1缺人 2 缺地址 4 缺时间
     *
     * @param cljgnrcoCause 处理内容完整性原因 1缺人 2 缺地址 4 缺时间
     */
    public void setCljgnrcoCause(Integer cljgnrcoCause) {
        this.cljgnrcoCause = cljgnrcoCause;
    }

    /**
     * 获取处警详细地点
     *
     * @return cjxxdd - 处警详细地点
     */
    public String getCjxxdd() {
        return cjxxdd;
    }

    /**
     * 设置处警详细地点
     *
     * @param cjxxdd 处警详细地点
     */
    public void setCjxxdd(String cjxxdd) {
        this.cjxxdd = cjxxdd;
    }

    /**
     * 获取事发时间上限
     *
     * @return sfsjsx - 事发时间上限
     */
    public Date getSfsjsx() {
        return sfsjsx;
    }

    /**
     * 设置事发时间上限
     *
     * @param sfsjsx 事发时间上限
     */
    public void setSfsjsx(Date sfsjsx) {
        this.sfsjsx = sfsjsx;
    }

    /**
     * 获取事发时间下限
     *
     * @return sfsjxx - 事发时间下限
     */
    public Date getSfsjxx() {
        return sfsjxx;
    }

    /**
     * 设置事发时间下限
     *
     * @param sfsjxx 事发时间下限
     */
    public void setSfsjxx(Date sfsjxx) {
        this.sfsjxx = sfsjxx;
    }

    /**
     * 获取0 正常, -1 不正常
     *
     * @return status - 0 正常, -1 不正常
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0 正常, -1 不正常
     *
     * @param status 0 正常, -1 不正常
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取报警类型 0-110 1-一般
     *
     * @return bjxs - 报警类型 0-110 1-一般
     */
    public String getBjxs() {
        return bjxs;
    }

    /**
     * 设置报警类型 0-110 1-一般
     *
     * @param bjxs 报警类型 0-110 1-一般
     */
    public void setBjxs(String bjxs) {
        this.bjxs = bjxs;
    }

    /**
     * @return pjyxm
     */
    public String getPjyxm() {
        return pjyxm;
    }

    /**
     * @param pjyxm
     */
    public void setPjyxm(String pjyxm) {
        this.pjyxm = pjyxm;
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
     * 获取涉案人员关联编号
     *
     * @return involved_people_code - 涉案人员关联编号
     */
    public String getInvolvedPeopleCode() {
        return involvedPeopleCode;
    }

    /**
     * 设置涉案人员关联编号
     *
     * @param involvedPeopleCode 涉案人员关联编号
     */
    public void setInvolvedPeopleCode(String involvedPeopleCode) {
        this.involvedPeopleCode = involvedPeopleCode;
    }

    /**
     * 获取涉案物品关联编号
     *
     * @return involved_goods_code - 涉案物品关联编号
     */
    public String getInvolvedGoodsCode() {
        return involvedGoodsCode;
    }

    /**
     * 设置涉案物品关联编号
     *
     * @param involvedGoodsCode 涉案物品关联编号
     */
    public void setInvolvedGoodsCode(String involvedGoodsCode) {
        this.involvedGoodsCode = involvedGoodsCode;
    }
}