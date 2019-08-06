package com.ht.micro.record.commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "city_handle_alarm")
public class CityHandleAlarm {
    /**
     * 处警编号
     */
    @Id
    @Column(name = "CJBH")
    private String cjbh;

    /**
     * 处警案件受理单位
     */
    @Column(name = "AJSLDW")
    private String ajsldw;

    /**
     * 处警案件受理人
     */
    @Column(name = "AJSLR")
    private String ajslr;

    /**
     * 处警补充处理结果
     */
    @Column(name = "BCCLJG")
    private String bccljg;

    /**
     * 标注单位
     */
    @Column(name = "BZDW")
    private String bzdw;

    /**
     * 标注单位名称
     */
    @Column(name = "BZDWMC")
    private String bzdwmc;

    /**
     * 标注人
     */
    @Column(name = "BZR")
    private String bzr;

    /**
     * 标注人姓名
     */
    @Column(name = "BZRXM")
    private String bzrxm;

    /**
     * 标注时间
     */
    @Column(name = "BZSJ")
    private Date bzsj;

    /**
     * 处警出动船只
     */
    @Column(name = "CDCZ")
    private String cdcz;

    /**
     * 处警出动机动车
     */
    @Column(name = "CDJDC")
    private String cdjdc;

    /**
     * 处警出动警力
     */
    @Column(name = "CDJL")
    private String cdjl;

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
     * 处警处警单位
     */
    @Column(name = "CJDW")
    private String cjdw;

    /**
     * 处警处警单位名称
     */
    @Column(name = "CJDWMC")
    private String cjdwmc;

    /**
     * 处警反馈时间
     */
    @Column(name = "CJFKSJ")
    private Date cjfksj;

    /**
     * 处警结果
     */
    @Column(name = "CJJG")
    private String cjjg;

    /**
     * 处警街路巷
     */
    @Column(name = "CJJLX")
    private String cjjlx;

    /**
     * 处警类别
     */
    @Column(name = "CJLB")
    private String cjlb;

    /**
     * 处警门楼牌号
     */
    @Column(name = "CJMLPH")
    private String cjmlph;

    /**
     * 处警门牌后缀
     */
    @Column(name = "CJMPHZ")
    private String cjmphz;

    /**
     * 处警人
     */
    @Column(name = "CJR")
    private String cjr;

    /**
     * 处警人姓名
     */
    @Column(name = "CJRHZXS")
    private String cjrhzxs;

    /**
     * 处警人联系方式
     */
    @Column(name = "CJRLXFS")
    private String cjrlxfs;

    /**
     * 处警处警时间
     */
    @Column(name = "CJSJ")
    private Date cjsj;

    /**
     * 处警详细地点
     */
    @Column(name = "CJXXDD")
    private String cjxxdd;

    /**
     * 处警详址
     */
    @Column(name = "CJXZ")
    private String cjxz;

    /**
     * 处警行政区划
     */
    @Column(name = "CJXZQH")
    private String cjxzqh;

    /**
     * 处警移送接收单位
     */
    @Column(name = "CJYSJSDW")
    private String cjysjsdw;

    /**
     * 处警移送接收人
     */
    @Column(name = "CJYSJSR")
    private String cjysjsr;

    /**
     * 处警移送接收时间
     */
    @Column(name = "CJYSJSSJ")
    private String cjysjssj;

    /**
     * 处警简要警情及处理结果
     */
    @Column(name = "CLJGNR")
    private String cljgnr;

    /**
     * 处警到达现场时间
     */
    @Column(name = "DDXCSJ")
    private Date ddxcsj;

    /**
     * 处警登记单位
     */
    @Column(name = "DJDW")
    private String djdw;

    /**
     * 处警登记单位名称
     */
    @Column(name = "DJDWMC")
    private String djdwmc;

    /**
     * 处警登记人
     */
    @Column(name = "DJR")
    private String djr;

    /**
     * 处警登记人姓名
     */
    @Column(name = "DJRXM")
    private String djrxm;

    /**
     * 处警登记时间
     */
    @Column(name = "DJSJ")
    private Date djsj;

    /**
     * 处警反馈录音号
     */
    @Column(name = "FKLYH")
    private String fklyh;

    /**
     * 处警发生原因
     */
    @Column(name = "FSYY")
    private String fsyy;

    /**
     * 处警地址X坐标
     */
    @Column(name = "GIS_X")
    private String gisX;

    /**
     * 处警地址Y坐标
     */
    @Column(name = "GIS_Y")
    private String gisY;

    /**
     * 处警关联案件编号
     */
    @Column(name = "GLAJBH")
    private String glajbh;

    /**
     * 处警关联案件状态
     */
    @Column(name = "GLAJZT")
    private String glajzt;

    /**
     * 更新单位
     */
    @Column(name = "GXDW")
    private String gxdw;

    /**
     * 更新单位名称
     */
    @Column(name = "GXDWMC")
    private String gxdwmc;

    /**
     * 更新人
     */
    @Column(name = "GXR")
    private String gxr;

    /**
     * 更新人姓名
     */
    @Column(name = "GXRXM")
    private String gxrxm;

    /**
     * 更新时间
     */
    @Column(name = "GXSJ")
    private Date gxsj;

    /**
     * 处警接警编号－接警编号
     */
    @Column(name = "JJBH")
    private String jjbh;

    /**
     * 处警接警单编号
     */
    @Column(name = "JJDBH")
    private String jjdbh;

    /**
     * 处警解救儿童数
     */
    @Column(name = "JJETS")
    private String jjets;

    /**
     * 处警解救妇女数
     */
    @Column(name = "JJFNS")
    private String jjfns;

    /**
     * 处警解救人质数
     */
    @Column(name = "JJRZS")
    private String jjrzs;

    /**
     * 处警警情属性
     */
    @Column(name = "JQSX")
    private String jqsx;

    /**
     * 处警救助群众
     */
    @Column(name = "JZQZ")
    private String jzqz;

    /**
     * 处警救助伤员
     */
    @Column(name = "JZSY")
    private String jzsy;

    /**
     * 处警领导处理时间
     */
    @Column(name = "LDCLSJ")
    private Date ldclsj;

    /**
     * 处警继续审查人数
     */
    @Column(name = "LZSCRS")
    private String lzscrs;

    /**
     * 处警破获刑事案件
     */
    @Column(name = "PHXSAJ")
    private String phxsaj;

    /**
     * 处警破获现行案件
     */
    @Column(name = "PHXXAJ")
    private String phxxaj;

    /**
     * 处警破获治安案件
     */
    @Column(name = "PHZAAJ")
    private String phzaaj;

    /**
     * 处警派警单编号
     */
    @Column(name = "PJDBH")
    private String pjdbh;

    /**
     * 处警人员受伤数
     */
    @Column(name = "RYSSS")
    private String rysss;

    /**
     * 处警人员死亡数
     */
    @Column(name = "RYSWS")
    private String rysws;

    /**
     * 处警事发场所
     */
    @Column(name = "SFCS")
    private String sfcs;

    /**
     * 处警事发时间上限
     */
    @Column(name = "SFSJSX")
    private Date sfsjsx;

    /**
     * 处警事发时间下限
     */
    @Column(name = "SFSJXX")
    private Date sfsjxx;

    /**
     * 处警事发星期
     */
    @Column(name = "SFXQ")
    private String sfxq;

    /**
     * 处警审批时间
     */
    @Column(name = "SPSJ")
    private Date spsj;

    /**
     * 处警审批修改时间
     */
    @Column(name = "SPXGSJ")
    private Date spxgsj;

    /**
     * 处警损失详细情况
     */
    @Column(name = "SSXXQK")
    private String ssxxqk;

    /**
     * 处警逃跑人犯
     */
    @Column(name = "TPRF")
    private String tprf;

    /**
     * 处警天气情况
     */
    @Column(name = "TQQK")
    private String tqqk;

    /**
     * 处警挽回损失
     */
    @Column(name = "WHSS")
    private BigDecimal whss;

    /**
     * 处警修改单位名称
     */
    @Column(name = "XGDW")
    private String xgdw;

    /**
     * 处警修改人
     */
    @Column(name = "XGR")
    private String xgr;

    /**
     * 处警修改人姓名
     */
    @Column(name = "XGRXM")
    private String xgrxm;

    /**
     * 处警修改时间
     */
    @Column(name = "XGSJ")
    private Date xgsj;

    /**
     * 处警值班领导
     */
    @Column(name = "ZBLD")
    private String zbld;

    /**
     * 处警值班领导单位
     */
    @Column(name = "ZBLDDW")
    private String zblddw;

    /**
     * 处警值班领导单位名称
     */
    @Column(name = "ZBLDDWMC")
    private String zblddwmc;

    /**
     * 处警值班领导姓名
     */
    @Column(name = "ZBLDXM")
    private String zbldxm;

    /**
     * 处警抓获作案成员
     */
    @Column(name = "ZHZACY")
    private String zhzacy;

    /**
     * 处警直接经济损失
     */
    @Column(name = "ZJJJSS")
    private BigDecimal zjjjss;

    @Column(name = "RKSJ")
    private Date rksj;

    /**
     * 0  1
     */
    @Column(name = "CLJGNRLENGTH")
    private String cljgnrlength;

    /**
     * 处警X坐标
     */
    @Column(name = "XZB")
    private byte[] xzb;

    /**
     * 处警Y坐标
     */
    @Column(name = "YZB")
    private byte[] yzb;

    /**
     * 获取处警编号
     *
     * @return CJBH - 处警编号
     */
    public String getCjbh() {
        return cjbh;
    }

    /**
     * 设置处警编号
     *
     * @param cjbh 处警编号
     */
    public void setCjbh(String cjbh) {
        this.cjbh = cjbh;
    }

    /**
     * 获取处警案件受理单位
     *
     * @return AJSLDW - 处警案件受理单位
     */
    public String getAjsldw() {
        return ajsldw;
    }

    /**
     * 设置处警案件受理单位
     *
     * @param ajsldw 处警案件受理单位
     */
    public void setAjsldw(String ajsldw) {
        this.ajsldw = ajsldw;
    }

    /**
     * 获取处警案件受理人
     *
     * @return AJSLR - 处警案件受理人
     */
    public String getAjslr() {
        return ajslr;
    }

    /**
     * 设置处警案件受理人
     *
     * @param ajslr 处警案件受理人
     */
    public void setAjslr(String ajslr) {
        this.ajslr = ajslr;
    }

    /**
     * 获取处警补充处理结果
     *
     * @return BCCLJG - 处警补充处理结果
     */
    public String getBccljg() {
        return bccljg;
    }

    /**
     * 设置处警补充处理结果
     *
     * @param bccljg 处警补充处理结果
     */
    public void setBccljg(String bccljg) {
        this.bccljg = bccljg;
    }

    /**
     * 获取标注单位
     *
     * @return BZDW - 标注单位
     */
    public String getBzdw() {
        return bzdw;
    }

    /**
     * 设置标注单位
     *
     * @param bzdw 标注单位
     */
    public void setBzdw(String bzdw) {
        this.bzdw = bzdw;
    }

    /**
     * 获取标注单位名称
     *
     * @return BZDWMC - 标注单位名称
     */
    public String getBzdwmc() {
        return bzdwmc;
    }

    /**
     * 设置标注单位名称
     *
     * @param bzdwmc 标注单位名称
     */
    public void setBzdwmc(String bzdwmc) {
        this.bzdwmc = bzdwmc;
    }

    /**
     * 获取标注人
     *
     * @return BZR - 标注人
     */
    public String getBzr() {
        return bzr;
    }

    /**
     * 设置标注人
     *
     * @param bzr 标注人
     */
    public void setBzr(String bzr) {
        this.bzr = bzr;
    }

    /**
     * 获取标注人姓名
     *
     * @return BZRXM - 标注人姓名
     */
    public String getBzrxm() {
        return bzrxm;
    }

    /**
     * 设置标注人姓名
     *
     * @param bzrxm 标注人姓名
     */
    public void setBzrxm(String bzrxm) {
        this.bzrxm = bzrxm;
    }

    /**
     * 获取标注时间
     *
     * @return BZSJ - 标注时间
     */
    public Date getBzsj() {
        return bzsj;
    }

    /**
     * 设置标注时间
     *
     * @param bzsj 标注时间
     */
    public void setBzsj(Date bzsj) {
        this.bzsj = bzsj;
    }

    /**
     * 获取处警出动船只
     *
     * @return CDCZ - 处警出动船只
     */
    public String getCdcz() {
        return cdcz;
    }

    /**
     * 设置处警出动船只
     *
     * @param cdcz 处警出动船只
     */
    public void setCdcz(String cdcz) {
        this.cdcz = cdcz;
    }

    /**
     * 获取处警出动机动车
     *
     * @return CDJDC - 处警出动机动车
     */
    public String getCdjdc() {
        return cdjdc;
    }

    /**
     * 设置处警出动机动车
     *
     * @param cdjdc 处警出动机动车
     */
    public void setCdjdc(String cdjdc) {
        this.cdjdc = cdjdc;
    }

    /**
     * 获取处警出动警力
     *
     * @return CDJL - 处警出动警力
     */
    public String getCdjl() {
        return cdjl;
    }

    /**
     * 设置处警出动警力
     *
     * @param cdjl 处警出动警力
     */
    public void setCdjl(String cdjl) {
        this.cdjl = cdjl;
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
     * 获取处警处警单位
     *
     * @return CJDW - 处警处警单位
     */
    public String getCjdw() {
        return cjdw;
    }

    /**
     * 设置处警处警单位
     *
     * @param cjdw 处警处警单位
     */
    public void setCjdw(String cjdw) {
        this.cjdw = cjdw;
    }

    /**
     * 获取处警处警单位名称
     *
     * @return CJDWMC - 处警处警单位名称
     */
    public String getCjdwmc() {
        return cjdwmc;
    }

    /**
     * 设置处警处警单位名称
     *
     * @param cjdwmc 处警处警单位名称
     */
    public void setCjdwmc(String cjdwmc) {
        this.cjdwmc = cjdwmc;
    }

    /**
     * 获取处警反馈时间
     *
     * @return CJFKSJ - 处警反馈时间
     */
    public Date getCjfksj() {
        return cjfksj;
    }

    /**
     * 设置处警反馈时间
     *
     * @param cjfksj 处警反馈时间
     */
    public void setCjfksj(Date cjfksj) {
        this.cjfksj = cjfksj;
    }

    /**
     * 获取处警结果
     *
     * @return CJJG - 处警结果
     */
    public String getCjjg() {
        return cjjg;
    }

    /**
     * 设置处警结果
     *
     * @param cjjg 处警结果
     */
    public void setCjjg(String cjjg) {
        this.cjjg = cjjg;
    }

    /**
     * 获取处警街路巷
     *
     * @return CJJLX - 处警街路巷
     */
    public String getCjjlx() {
        return cjjlx;
    }

    /**
     * 设置处警街路巷
     *
     * @param cjjlx 处警街路巷
     */
    public void setCjjlx(String cjjlx) {
        this.cjjlx = cjjlx;
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
     * 获取处警门楼牌号
     *
     * @return CJMLPH - 处警门楼牌号
     */
    public String getCjmlph() {
        return cjmlph;
    }

    /**
     * 设置处警门楼牌号
     *
     * @param cjmlph 处警门楼牌号
     */
    public void setCjmlph(String cjmlph) {
        this.cjmlph = cjmlph;
    }

    /**
     * 获取处警门牌后缀
     *
     * @return CJMPHZ - 处警门牌后缀
     */
    public String getCjmphz() {
        return cjmphz;
    }

    /**
     * 设置处警门牌后缀
     *
     * @param cjmphz 处警门牌后缀
     */
    public void setCjmphz(String cjmphz) {
        this.cjmphz = cjmphz;
    }

    /**
     * 获取处警人
     *
     * @return CJR - 处警人
     */
    public String getCjr() {
        return cjr;
    }

    /**
     * 设置处警人
     *
     * @param cjr 处警人
     */
    public void setCjr(String cjr) {
        this.cjr = cjr;
    }

    /**
     * 获取处警人姓名
     *
     * @return CJRHZXS - 处警人姓名
     */
    public String getCjrhzxs() {
        return cjrhzxs;
    }

    /**
     * 设置处警人姓名
     *
     * @param cjrhzxs 处警人姓名
     */
    public void setCjrhzxs(String cjrhzxs) {
        this.cjrhzxs = cjrhzxs;
    }

    /**
     * 获取处警人联系方式
     *
     * @return CJRLXFS - 处警人联系方式
     */
    public String getCjrlxfs() {
        return cjrlxfs;
    }

    /**
     * 设置处警人联系方式
     *
     * @param cjrlxfs 处警人联系方式
     */
    public void setCjrlxfs(String cjrlxfs) {
        this.cjrlxfs = cjrlxfs;
    }

    /**
     * 获取处警处警时间
     *
     * @return CJSJ - 处警处警时间
     */
    public Date getCjsj() {
        return cjsj;
    }

    /**
     * 设置处警处警时间
     *
     * @param cjsj 处警处警时间
     */
    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    /**
     * 获取处警详细地点
     *
     * @return CJXXDD - 处警详细地点
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
     * 获取处警详址
     *
     * @return CJXZ - 处警详址
     */
    public String getCjxz() {
        return cjxz;
    }

    /**
     * 设置处警详址
     *
     * @param cjxz 处警详址
     */
    public void setCjxz(String cjxz) {
        this.cjxz = cjxz;
    }

    /**
     * 获取处警行政区划
     *
     * @return CJXZQH - 处警行政区划
     */
    public String getCjxzqh() {
        return cjxzqh;
    }

    /**
     * 设置处警行政区划
     *
     * @param cjxzqh 处警行政区划
     */
    public void setCjxzqh(String cjxzqh) {
        this.cjxzqh = cjxzqh;
    }

    /**
     * 获取处警移送接收单位
     *
     * @return CJYSJSDW - 处警移送接收单位
     */
    public String getCjysjsdw() {
        return cjysjsdw;
    }

    /**
     * 设置处警移送接收单位
     *
     * @param cjysjsdw 处警移送接收单位
     */
    public void setCjysjsdw(String cjysjsdw) {
        this.cjysjsdw = cjysjsdw;
    }

    /**
     * 获取处警移送接收人
     *
     * @return CJYSJSR - 处警移送接收人
     */
    public String getCjysjsr() {
        return cjysjsr;
    }

    /**
     * 设置处警移送接收人
     *
     * @param cjysjsr 处警移送接收人
     */
    public void setCjysjsr(String cjysjsr) {
        this.cjysjsr = cjysjsr;
    }

    /**
     * 获取处警移送接收时间
     *
     * @return CJYSJSSJ - 处警移送接收时间
     */
    public String getCjysjssj() {
        return cjysjssj;
    }

    /**
     * 设置处警移送接收时间
     *
     * @param cjysjssj 处警移送接收时间
     */
    public void setCjysjssj(String cjysjssj) {
        this.cjysjssj = cjysjssj;
    }

    /**
     * 获取处警简要警情及处理结果
     *
     * @return CLJGNR - 处警简要警情及处理结果
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
     * 获取处警到达现场时间
     *
     * @return DDXCSJ - 处警到达现场时间
     */
    public Date getDdxcsj() {
        return ddxcsj;
    }

    /**
     * 设置处警到达现场时间
     *
     * @param ddxcsj 处警到达现场时间
     */
    public void setDdxcsj(Date ddxcsj) {
        this.ddxcsj = ddxcsj;
    }

    /**
     * 获取处警登记单位
     *
     * @return DJDW - 处警登记单位
     */
    public String getDjdw() {
        return djdw;
    }

    /**
     * 设置处警登记单位
     *
     * @param djdw 处警登记单位
     */
    public void setDjdw(String djdw) {
        this.djdw = djdw;
    }

    /**
     * 获取处警登记单位名称
     *
     * @return DJDWMC - 处警登记单位名称
     */
    public String getDjdwmc() {
        return djdwmc;
    }

    /**
     * 设置处警登记单位名称
     *
     * @param djdwmc 处警登记单位名称
     */
    public void setDjdwmc(String djdwmc) {
        this.djdwmc = djdwmc;
    }

    /**
     * 获取处警登记人
     *
     * @return DJR - 处警登记人
     */
    public String getDjr() {
        return djr;
    }

    /**
     * 设置处警登记人
     *
     * @param djr 处警登记人
     */
    public void setDjr(String djr) {
        this.djr = djr;
    }

    /**
     * 获取处警登记人姓名
     *
     * @return DJRXM - 处警登记人姓名
     */
    public String getDjrxm() {
        return djrxm;
    }

    /**
     * 设置处警登记人姓名
     *
     * @param djrxm 处警登记人姓名
     */
    public void setDjrxm(String djrxm) {
        this.djrxm = djrxm;
    }

    /**
     * 获取处警登记时间
     *
     * @return DJSJ - 处警登记时间
     */
    public Date getDjsj() {
        return djsj;
    }

    /**
     * 设置处警登记时间
     *
     * @param djsj 处警登记时间
     */
    public void setDjsj(Date djsj) {
        this.djsj = djsj;
    }

    /**
     * 获取处警反馈录音号
     *
     * @return FKLYH - 处警反馈录音号
     */
    public String getFklyh() {
        return fklyh;
    }

    /**
     * 设置处警反馈录音号
     *
     * @param fklyh 处警反馈录音号
     */
    public void setFklyh(String fklyh) {
        this.fklyh = fklyh;
    }

    /**
     * 获取处警发生原因
     *
     * @return FSYY - 处警发生原因
     */
    public String getFsyy() {
        return fsyy;
    }

    /**
     * 设置处警发生原因
     *
     * @param fsyy 处警发生原因
     */
    public void setFsyy(String fsyy) {
        this.fsyy = fsyy;
    }

    /**
     * 获取处警地址X坐标
     *
     * @return GIS_X - 处警地址X坐标
     */
    public String getGisX() {
        return gisX;
    }

    /**
     * 设置处警地址X坐标
     *
     * @param gisX 处警地址X坐标
     */
    public void setGisX(String gisX) {
        this.gisX = gisX;
    }

    /**
     * 获取处警地址Y坐标
     *
     * @return GIS_Y - 处警地址Y坐标
     */
    public String getGisY() {
        return gisY;
    }

    /**
     * 设置处警地址Y坐标
     *
     * @param gisY 处警地址Y坐标
     */
    public void setGisY(String gisY) {
        this.gisY = gisY;
    }

    /**
     * 获取处警关联案件编号
     *
     * @return GLAJBH - 处警关联案件编号
     */
    public String getGlajbh() {
        return glajbh;
    }

    /**
     * 设置处警关联案件编号
     *
     * @param glajbh 处警关联案件编号
     */
    public void setGlajbh(String glajbh) {
        this.glajbh = glajbh;
    }

    /**
     * 获取处警关联案件状态
     *
     * @return GLAJZT - 处警关联案件状态
     */
    public String getGlajzt() {
        return glajzt;
    }

    /**
     * 设置处警关联案件状态
     *
     * @param glajzt 处警关联案件状态
     */
    public void setGlajzt(String glajzt) {
        this.glajzt = glajzt;
    }

    /**
     * 获取更新单位
     *
     * @return GXDW - 更新单位
     */
    public String getGxdw() {
        return gxdw;
    }

    /**
     * 设置更新单位
     *
     * @param gxdw 更新单位
     */
    public void setGxdw(String gxdw) {
        this.gxdw = gxdw;
    }

    /**
     * 获取更新单位名称
     *
     * @return GXDWMC - 更新单位名称
     */
    public String getGxdwmc() {
        return gxdwmc;
    }

    /**
     * 设置更新单位名称
     *
     * @param gxdwmc 更新单位名称
     */
    public void setGxdwmc(String gxdwmc) {
        this.gxdwmc = gxdwmc;
    }

    /**
     * 获取更新人
     *
     * @return GXR - 更新人
     */
    public String getGxr() {
        return gxr;
    }

    /**
     * 设置更新人
     *
     * @param gxr 更新人
     */
    public void setGxr(String gxr) {
        this.gxr = gxr;
    }

    /**
     * 获取更新人姓名
     *
     * @return GXRXM - 更新人姓名
     */
    public String getGxrxm() {
        return gxrxm;
    }

    /**
     * 设置更新人姓名
     *
     * @param gxrxm 更新人姓名
     */
    public void setGxrxm(String gxrxm) {
        this.gxrxm = gxrxm;
    }

    /**
     * 获取更新时间
     *
     * @return GXSJ - 更新时间
     */
    public Date getGxsj() {
        return gxsj;
    }

    /**
     * 设置更新时间
     *
     * @param gxsj 更新时间
     */
    public void setGxsj(Date gxsj) {
        this.gxsj = gxsj;
    }

    /**
     * 获取处警接警编号－接警编号
     *
     * @return JJBH - 处警接警编号－接警编号
     */
    public String getJjbh() {
        return jjbh;
    }

    /**
     * 设置处警接警编号－接警编号
     *
     * @param jjbh 处警接警编号－接警编号
     */
    public void setJjbh(String jjbh) {
        this.jjbh = jjbh;
    }

    /**
     * 获取处警接警单编号
     *
     * @return JJDBH - 处警接警单编号
     */
    public String getJjdbh() {
        return jjdbh;
    }

    /**
     * 设置处警接警单编号
     *
     * @param jjdbh 处警接警单编号
     */
    public void setJjdbh(String jjdbh) {
        this.jjdbh = jjdbh;
    }

    /**
     * 获取处警解救儿童数
     *
     * @return JJETS - 处警解救儿童数
     */
    public String getJjets() {
        return jjets;
    }

    /**
     * 设置处警解救儿童数
     *
     * @param jjets 处警解救儿童数
     */
    public void setJjets(String jjets) {
        this.jjets = jjets;
    }

    /**
     * 获取处警解救妇女数
     *
     * @return JJFNS - 处警解救妇女数
     */
    public String getJjfns() {
        return jjfns;
    }

    /**
     * 设置处警解救妇女数
     *
     * @param jjfns 处警解救妇女数
     */
    public void setJjfns(String jjfns) {
        this.jjfns = jjfns;
    }

    /**
     * 获取处警解救人质数
     *
     * @return JJRZS - 处警解救人质数
     */
    public String getJjrzs() {
        return jjrzs;
    }

    /**
     * 设置处警解救人质数
     *
     * @param jjrzs 处警解救人质数
     */
    public void setJjrzs(String jjrzs) {
        this.jjrzs = jjrzs;
    }

    /**
     * 获取处警警情属性
     *
     * @return JQSX - 处警警情属性
     */
    public String getJqsx() {
        return jqsx;
    }

    /**
     * 设置处警警情属性
     *
     * @param jqsx 处警警情属性
     */
    public void setJqsx(String jqsx) {
        this.jqsx = jqsx;
    }

    /**
     * 获取处警救助群众
     *
     * @return JZQZ - 处警救助群众
     */
    public String getJzqz() {
        return jzqz;
    }

    /**
     * 设置处警救助群众
     *
     * @param jzqz 处警救助群众
     */
    public void setJzqz(String jzqz) {
        this.jzqz = jzqz;
    }

    /**
     * 获取处警救助伤员
     *
     * @return JZSY - 处警救助伤员
     */
    public String getJzsy() {
        return jzsy;
    }

    /**
     * 设置处警救助伤员
     *
     * @param jzsy 处警救助伤员
     */
    public void setJzsy(String jzsy) {
        this.jzsy = jzsy;
    }

    /**
     * 获取处警领导处理时间
     *
     * @return LDCLSJ - 处警领导处理时间
     */
    public Date getLdclsj() {
        return ldclsj;
    }

    /**
     * 设置处警领导处理时间
     *
     * @param ldclsj 处警领导处理时间
     */
    public void setLdclsj(Date ldclsj) {
        this.ldclsj = ldclsj;
    }

    /**
     * 获取处警继续审查人数
     *
     * @return LZSCRS - 处警继续审查人数
     */
    public String getLzscrs() {
        return lzscrs;
    }

    /**
     * 设置处警继续审查人数
     *
     * @param lzscrs 处警继续审查人数
     */
    public void setLzscrs(String lzscrs) {
        this.lzscrs = lzscrs;
    }

    /**
     * 获取处警破获刑事案件
     *
     * @return PHXSAJ - 处警破获刑事案件
     */
    public String getPhxsaj() {
        return phxsaj;
    }

    /**
     * 设置处警破获刑事案件
     *
     * @param phxsaj 处警破获刑事案件
     */
    public void setPhxsaj(String phxsaj) {
        this.phxsaj = phxsaj;
    }

    /**
     * 获取处警破获现行案件
     *
     * @return PHXXAJ - 处警破获现行案件
     */
    public String getPhxxaj() {
        return phxxaj;
    }

    /**
     * 设置处警破获现行案件
     *
     * @param phxxaj 处警破获现行案件
     */
    public void setPhxxaj(String phxxaj) {
        this.phxxaj = phxxaj;
    }

    /**
     * 获取处警破获治安案件
     *
     * @return PHZAAJ - 处警破获治安案件
     */
    public String getPhzaaj() {
        return phzaaj;
    }

    /**
     * 设置处警破获治安案件
     *
     * @param phzaaj 处警破获治安案件
     */
    public void setPhzaaj(String phzaaj) {
        this.phzaaj = phzaaj;
    }

    /**
     * 获取处警派警单编号
     *
     * @return PJDBH - 处警派警单编号
     */
    public String getPjdbh() {
        return pjdbh;
    }

    /**
     * 设置处警派警单编号
     *
     * @param pjdbh 处警派警单编号
     */
    public void setPjdbh(String pjdbh) {
        this.pjdbh = pjdbh;
    }

    /**
     * 获取处警人员受伤数
     *
     * @return RYSSS - 处警人员受伤数
     */
    public String getRysss() {
        return rysss;
    }

    /**
     * 设置处警人员受伤数
     *
     * @param rysss 处警人员受伤数
     */
    public void setRysss(String rysss) {
        this.rysss = rysss;
    }

    /**
     * 获取处警人员死亡数
     *
     * @return RYSWS - 处警人员死亡数
     */
    public String getRysws() {
        return rysws;
    }

    /**
     * 设置处警人员死亡数
     *
     * @param rysws 处警人员死亡数
     */
    public void setRysws(String rysws) {
        this.rysws = rysws;
    }

    /**
     * 获取处警事发场所
     *
     * @return SFCS - 处警事发场所
     */
    public String getSfcs() {
        return sfcs;
    }

    /**
     * 设置处警事发场所
     *
     * @param sfcs 处警事发场所
     */
    public void setSfcs(String sfcs) {
        this.sfcs = sfcs;
    }

    /**
     * 获取处警事发时间上限
     *
     * @return SFSJSX - 处警事发时间上限
     */
    public Date getSfsjsx() {
        return sfsjsx;
    }

    /**
     * 设置处警事发时间上限
     *
     * @param sfsjsx 处警事发时间上限
     */
    public void setSfsjsx(Date sfsjsx) {
        this.sfsjsx = sfsjsx;
    }

    /**
     * 获取处警事发时间下限
     *
     * @return SFSJXX - 处警事发时间下限
     */
    public Date getSfsjxx() {
        return sfsjxx;
    }

    /**
     * 设置处警事发时间下限
     *
     * @param sfsjxx 处警事发时间下限
     */
    public void setSfsjxx(Date sfsjxx) {
        this.sfsjxx = sfsjxx;
    }

    /**
     * 获取处警事发星期
     *
     * @return SFXQ - 处警事发星期
     */
    public String getSfxq() {
        return sfxq;
    }

    /**
     * 设置处警事发星期
     *
     * @param sfxq 处警事发星期
     */
    public void setSfxq(String sfxq) {
        this.sfxq = sfxq;
    }

    /**
     * 获取处警审批时间
     *
     * @return SPSJ - 处警审批时间
     */
    public Date getSpsj() {
        return spsj;
    }

    /**
     * 设置处警审批时间
     *
     * @param spsj 处警审批时间
     */
    public void setSpsj(Date spsj) {
        this.spsj = spsj;
    }

    /**
     * 获取处警审批修改时间
     *
     * @return SPXGSJ - 处警审批修改时间
     */
    public Date getSpxgsj() {
        return spxgsj;
    }

    /**
     * 设置处警审批修改时间
     *
     * @param spxgsj 处警审批修改时间
     */
    public void setSpxgsj(Date spxgsj) {
        this.spxgsj = spxgsj;
    }

    /**
     * 获取处警损失详细情况
     *
     * @return SSXXQK - 处警损失详细情况
     */
    public String getSsxxqk() {
        return ssxxqk;
    }

    /**
     * 设置处警损失详细情况
     *
     * @param ssxxqk 处警损失详细情况
     */
    public void setSsxxqk(String ssxxqk) {
        this.ssxxqk = ssxxqk;
    }

    /**
     * 获取处警逃跑人犯
     *
     * @return TPRF - 处警逃跑人犯
     */
    public String getTprf() {
        return tprf;
    }

    /**
     * 设置处警逃跑人犯
     *
     * @param tprf 处警逃跑人犯
     */
    public void setTprf(String tprf) {
        this.tprf = tprf;
    }

    /**
     * 获取处警天气情况
     *
     * @return TQQK - 处警天气情况
     */
    public String getTqqk() {
        return tqqk;
    }

    /**
     * 设置处警天气情况
     *
     * @param tqqk 处警天气情况
     */
    public void setTqqk(String tqqk) {
        this.tqqk = tqqk;
    }

    /**
     * 获取处警挽回损失
     *
     * @return WHSS - 处警挽回损失
     */
    public BigDecimal getWhss() {
        return whss;
    }

    /**
     * 设置处警挽回损失
     *
     * @param whss 处警挽回损失
     */
    public void setWhss(BigDecimal whss) {
        this.whss = whss;
    }

    /**
     * 获取处警修改单位名称
     *
     * @return XGDW - 处警修改单位名称
     */
    public String getXgdw() {
        return xgdw;
    }

    /**
     * 设置处警修改单位名称
     *
     * @param xgdw 处警修改单位名称
     */
    public void setXgdw(String xgdw) {
        this.xgdw = xgdw;
    }

    /**
     * 获取处警修改人
     *
     * @return XGR - 处警修改人
     */
    public String getXgr() {
        return xgr;
    }

    /**
     * 设置处警修改人
     *
     * @param xgr 处警修改人
     */
    public void setXgr(String xgr) {
        this.xgr = xgr;
    }

    /**
     * 获取处警修改人姓名
     *
     * @return XGRXM - 处警修改人姓名
     */
    public String getXgrxm() {
        return xgrxm;
    }

    /**
     * 设置处警修改人姓名
     *
     * @param xgrxm 处警修改人姓名
     */
    public void setXgrxm(String xgrxm) {
        this.xgrxm = xgrxm;
    }

    /**
     * 获取处警修改时间
     *
     * @return XGSJ - 处警修改时间
     */
    public Date getXgsj() {
        return xgsj;
    }

    /**
     * 设置处警修改时间
     *
     * @param xgsj 处警修改时间
     */
    public void setXgsj(Date xgsj) {
        this.xgsj = xgsj;
    }

    /**
     * 获取处警值班领导
     *
     * @return ZBLD - 处警值班领导
     */
    public String getZbld() {
        return zbld;
    }

    /**
     * 设置处警值班领导
     *
     * @param zbld 处警值班领导
     */
    public void setZbld(String zbld) {
        this.zbld = zbld;
    }

    /**
     * 获取处警值班领导单位
     *
     * @return ZBLDDW - 处警值班领导单位
     */
    public String getZblddw() {
        return zblddw;
    }

    /**
     * 设置处警值班领导单位
     *
     * @param zblddw 处警值班领导单位
     */
    public void setZblddw(String zblddw) {
        this.zblddw = zblddw;
    }

    /**
     * 获取处警值班领导单位名称
     *
     * @return ZBLDDWMC - 处警值班领导单位名称
     */
    public String getZblddwmc() {
        return zblddwmc;
    }

    /**
     * 设置处警值班领导单位名称
     *
     * @param zblddwmc 处警值班领导单位名称
     */
    public void setZblddwmc(String zblddwmc) {
        this.zblddwmc = zblddwmc;
    }

    /**
     * 获取处警值班领导姓名
     *
     * @return ZBLDXM - 处警值班领导姓名
     */
    public String getZbldxm() {
        return zbldxm;
    }

    /**
     * 设置处警值班领导姓名
     *
     * @param zbldxm 处警值班领导姓名
     */
    public void setZbldxm(String zbldxm) {
        this.zbldxm = zbldxm;
    }

    /**
     * 获取处警抓获作案成员
     *
     * @return ZHZACY - 处警抓获作案成员
     */
    public String getZhzacy() {
        return zhzacy;
    }

    /**
     * 设置处警抓获作案成员
     *
     * @param zhzacy 处警抓获作案成员
     */
    public void setZhzacy(String zhzacy) {
        this.zhzacy = zhzacy;
    }

    /**
     * 获取处警直接经济损失
     *
     * @return ZJJJSS - 处警直接经济损失
     */
    public BigDecimal getZjjjss() {
        return zjjjss;
    }

    /**
     * 设置处警直接经济损失
     *
     * @param zjjjss 处警直接经济损失
     */
    public void setZjjjss(BigDecimal zjjjss) {
        this.zjjjss = zjjjss;
    }

    /**
     * @return RKSJ
     */
    public Date getRksj() {
        return rksj;
    }

    /**
     * @param rksj
     */
    public void setRksj(Date rksj) {
        this.rksj = rksj;
    }

    /**
     * 获取0  1
     *
     * @return CLJGNRLENGTH - 0  1
     */
    public String getCljgnrlength() {
        return cljgnrlength;
    }

    /**
     * 设置0  1
     *
     * @param cljgnrlength 0  1
     */
    public void setCljgnrlength(String cljgnrlength) {
        this.cljgnrlength = cljgnrlength;
    }

    /**
     * 获取处警X坐标
     *
     * @return XZB - 处警X坐标
     */
    public byte[] getXzb() {
        return xzb;
    }

    /**
     * 设置处警X坐标
     *
     * @param xzb 处警X坐标
     */
    public void setXzb(byte[] xzb) {
        this.xzb = xzb;
    }

    /**
     * 获取处警Y坐标
     *
     * @return YZB - 处警Y坐标
     */
    public byte[] getYzb() {
        return yzb;
    }

    /**
     * 设置处警Y坐标
     *
     * @param yzb 处警Y坐标
     */
    public void setYzb(byte[] yzb) {
        this.yzb = yzb;
    }
}