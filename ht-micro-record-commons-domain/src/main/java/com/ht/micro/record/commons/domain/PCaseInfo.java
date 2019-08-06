package com.ht.micro.record.commons.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "p_case_info")
public class PCaseInfo {
    /**
     * 案件编号
     */
    @Column(name = "AJBH")
    private String ajbh;

    /**
     * 案件详细地址名称
     */
    @Column(name = "AJDZMC")
    private String ajdzmc;

    /**
     * 案件副案别
     */
    @Column(name = "AJFAB")
    private String ajfab;

    /**
     * 解救儿童数
     */
    @Column(name = "AJJJETS")
    private BigDecimal ajjjets;

    /**
     * 解救妇女数
     */
    @Column(name = "AJJJFNS")
    private BigDecimal ajjjfns;

    /**
     * 解救人质数
     */
    @Column(name = "AJJJRZS")
    private BigDecimal ajjjrzs;

    /**
     * 街路巷
     */
    @Column(name = "AJJLX")
    private String ajjlx;

    /**
     * 案件类别
     */
    @Column(name = "AJLB")
    private String ajlb;

    /**
     * 案件类别名称
     */
    @Column(name = "AJLBMC")
    private String ajlbmc;

    /**
     * 案件来源
     */
    @Column(name = "AJLY")
    private String ajly;

    /**
     * 案件名称
     */
    @Column(name = "AJMC")
    private String ajmc;

    /**
     * 案件密级
     */
    @Column(name = "AJMJ")
    private String ajmj;

    /**
     * 门楼牌号
     */
    @Column(name = "AJMLPH")
    private String ajmlph;

    /**
     * 门楼详址
     */
    @Column(name = "AJMLXZ")
    private String ajmlxz;

    /**
     * 门牌后缀
     */
    @Column(name = "AJMPHZ")
    private String ajmphz;

    /**
     * 其他受害人数
     */
    @Column(name = "AJQTSHRS")
    private BigDecimal ajqtshrs;

    /**
     * 人员受伤数
     */
    @Column(name = "AJRYSSS")
    private BigDecimal ajrysss;

    /**
     * 人员死亡数
     */
    @Column(name = "AJRYSWS")
    private BigDecimal ajrysws;

    /**
     * 省市县区
     */
    @Column(name = "AJSSXQ")
    private String ajssxq;

    /**
     * 案件所属责任区
     */
    @Column(name = "AJSSZRQ")
    private String ajsszrq;

    /**
     * 案件所属责任区名称
     */
    @Column(name = "AJSSZRQMC")
    private String ajsszrqmc;

    /**
     * 案件属性
     */
    @Column(name = "AJSX")
    private String ajsx;

    /**
     * 案件性质
     */
    @Column(name = "AJXZ")
    private String ajxz;

    /**
     * 案件状态
     */
    @Column(name = "AJZT")
    private String ajzt;

    /**
     * 案件主题词
     */
    @Column(name = "AJZTC")
    private String ajztc;

    /**
     * 案情综述
     */
    @Column(name = "AQZS")
    private String aqzs;

    /**
     * 案件报案单位地址
     */
    @Column(name = "BADWDZ")
    private String badwdz;

    /**
     * 案件报案单位联系方式
     */
    @Column(name = "BADWLXFS")
    private String badwlxfs;

    /**
     * 案件报案单位联系人
     */
    @Column(name = "BADWLXR")
    private String badwlxr;

    /**
     * 案件报案单位名称
     */
    @Column(name = "BADWMC")
    private String badwmc;

    /**
     * 报案人保密级别
     */
    @Column(name = "BARBMJB")
    private String barbmjb;

    /**
     * 报案人出生日期
     */
    @Column(name = "BARCSRQ")
    private Date barcsrq;

    /**
     * 报案人单位
     */
    @Column(name = "BARDW")
    private String bardw;

    /**
     * 报案人联系方式
     */
    @Column(name = "BARLXFS")
    private String barlxfs;

    /**
     * 报案人性别
     */
    @Column(name = "BARXB")
    private String barxb;

    /**
     * 报案人姓名
     */
    @Column(name = "BARXM")
    private String barxm;

    /**
     * 报案人证件号码
     */
    @Column(name = "BARZJHM")
    private String barzjhm;

    /**
     * 报案人证件种类
     */
    @Column(name = "BARZJZL")
    private String barzjzl;

    /**
     * 报案人住址
     */
    @Column(name = "BARZZ")
    private String barzz;

    /**
     * 报案时间
     */
    @Column(name = "BASJ")
    private Date basj;

    /**
     * 登记时间
     */
    @Column(name = "DJSJ")
    private String djsj;

    /**
     * 大要案标识
     */
    @Column(name = "DYABS")
    private String dyabs;

    /**
     * 发案部位
     */
    @Column(name = "FABW")
    private String fabw;

    /**
     * 发案处所
     */
    @Column(name = "FACS")
    private String facs;

    /**
     * 发案地域
     */
    @Column(name = "FADY")
    private String fady;

    /**
     * 发案时间段
     */
    @Column(name = "FASJD")
    private String fasjd;

    /**
     * 发案时间上限
     */
    @Column(name = "FASJSX")
    private Date fasjsx;

    /**
     * 发案时间下限
     */
    @Column(name = "FASJXX")
    private Date fasjxx;

    /**
     * 分局串案编号
     */
    @Column(name = "FJCABH")
    private String fjcabh;

    /**
     * 分类案件编号
     */
    @Column(name = "FLAJBH")
    private String flajbh;

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
     * 合并破案案件编号
     */
    @Column(name = "HBPAAJBH")
    private String hbpaajbh;

    /**
     * 结案日期
     */
    @Column(name = "JARQ")
    private Date jarq;

    /**
     * 经济损失
     */
    @Column(name = "JJSS")
    private BigDecimal jjss;

    /**
     * 案件记录编号
     */
    @Column(name = "JLBH")
    private String jlbh;

    /**
     * 技术串案编号
     */
    @Column(name = "JSCABH")
    private String jscabh;

    /**
     * 接收单位
     */
    @Column(name = "JSDW")
    private String jsdw;

    /**
     * 接收单位名称
     */
    @Column(name = "JSDWMC")
    private String jsdwmc;

    /**
     * 接收人
     */
    @Column(name = "JSR")
    private String jsr;

    /**
     * 案件内外勾结
     */
    @Column(name = "NWGJ")
    private String nwgj;

    /**
     * 内外勾结对象
     */
    @Column(name = "NWGJDX")
    private String nwgjdx;

    /**
     * 破案单位
     */
    @Column(name = "PADW")
    private String padw;

    /**
     * 破案单位名称
     */
    @Column(name = "PADWMC")
    private String padwmc;

    /**
     * 破案方式
     */
    @Column(name = "PAFS")
    private String pafs;

    /**
     * 破案简况
     */
    @Column(name = "PAJK")
    private String pajk;

    /**
     * 破案类型
     */
    @Column(name = "PALX")
    private String palx;

    /**
     * 破案批准单位
     */
    @Column(name = "PAPZDW")
    private String papzdw;

    /**
     * 破案批准人
     */
    @Column(name = "PAPZR")
    private String papzr;

    /**
     * 破案批准时间
     */
    @Column(name = "PAPZSJ")
    private Date papzsj;

    /**
     * 涉及国家地区
     */
    @Column(name = "SJGJDQ")
    private String sjgjdq;

    /**
     * 受理单位
     */
    @Column(name = "SLDW")
    private String sldw;

    /**
     * 受理单位联系电话
     */
    @Column(name = "SLDWDH")
    private String sldwdh;

    /**
     * 受理单位名称
     */
    @Column(name = "SLDWMC")
    private String sldwmc;

    /**
     * 受理方式
     */
    @Column(name = "SLFS")
    private String slfs;

    /**
     * 受理人
     */
    @Column(name = "SLR")
    private String slr;

    /**
     * 受理人姓名
     */
    @Column(name = "SLRXM")
    private String slrxm;

    /**
     * 受理时间
     */
    @Column(name = "SLSJ")
    private Date slsj;

    /**
     * 省厅串案编号
     */
    @Column(name = "STCABH")
    private String stcabh;

    /**
     * 外部接收单位
     */
    @Column(name = "WBJSDWMC")
    private String wbjsdwmc;

    /**
     * 主办人电话
     */
    @Column(name = "ZBRDH")
    private String zbrdh;

    /**
     * 主办人姓名
     */
    @Column(name = "ZBRXM")
    private String zbrxm;

    /**
     * 直属分局案件－是否
     */
    @Column(name = "ZSAJ")
    private String zsaj;

    /**
     * 直属办案单位
     */
    @Column(name = "ZSBADW")
    private String zsbadw;

    /**
     * 直属办案单位名称
     */
    @Column(name = "ZSBADWMC")
    private String zsbadwmc;

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
     * 撤销单位
     */
    @Column(name = "CXDW")
    private String cxdw;

    /**
     * 撤销单位名称
     */
    @Column(name = "CXDWMC")
    private String cxdwmc;

    /**
     * 撤销批准人
     */
    @Column(name = "CXPZR")
    private String cxpzr;

    /**
     * 撤销批准人姓名
     */
    @Column(name = "CXPZRXM")
    private String cxpzrxm;

    /**
     * 撤销日期
     */
    @Column(name = "CXRQ")
    private Date cxrq;

    /**
     * 撤销原因
     */
    @Column(name = "CXYY")
    private String cxyy;

    /**
     * 补立原因
     */
    @Column(name = "BLYY")
    private String blyy;

    /**
     * 标注单位
     */
    @Column(name = "BZDW")
    private String bzdw;

    /**
     * 督办编号
     */
    @Column(name = "DBBH")
    private String dbbh;

    /**
     * 督办级别
     */
    @Column(name = "DBJB")
    private String dbjb;

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
     * 分析串案编号
     */
    @Column(name = "FXCABH")
    private String fxcabh;

    /**
     * 发现时间
     */
    @Column(name = "FXSJ")
    private Date fxsj;

    /**
     * 犯罪主体类型
     */
    @Column(name = "FZZTLX")
    private String fzztlx;

    /**
     * 归档时间
     */
    @Column(name = "GDSJ")
    private Date gdsj;

    /**
     * 归档状态
     */
    @Column(name = "GDZT")
    private String gdzt;

    /**
     * 关联编号
     */
    @Column(name = "GLBH")
    private String glbh;

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
     * 管辖分工
     */
    @Column(name = "GXFG")
    private String gxfg;

    /**
     * 更新人
     */
    @Column(name = "GXR")
    private String gxr;

    /**
     * 接收姓名
     */
    @Column(name = "JSRXM")
    private String jsrxm;

    /**
     * 接收时间
     */
    @Column(name = "JSSJ")
    private Date jssj;

    /**
     * 简要案情
     */
    @Column(name = "JYAQ")
    private String jyaq;

    /**
     * 经侦案件属性
     */
    @Column(name = "JZAJSX")
    private String jzajsx;

    /**
     * 案件可防性案件类别
     */
    @Column(name = "KFXAJLB")
    private String kfxajlb;

    /**
     * 立案单位
     */
    @Column(name = "LADW")
    private String ladw;

    /**
     * 立案单位名称
     */
    @Column(name = "LADWMC")
    private String ladwmc;

    /**
     * 立案批准人
     */
    @Column(name = "LAPZR")
    private String lapzr;

    /**
     * 立案批准人姓名
     */
    @Column(name = "LAPZRXM")
    private String lapzrxm;

    /**
     * 立案时间
     */
    @Column(name = "LASJ")
    private Date lasj;

    /**
     * 破案日期
     */
    @Column(name = "PARQ")
    private Date parq;

    /**
     * 破案时间段
     */
    @Column(name = "PASJD")
    private String pasjd;

    /**
     * 缴获总价值
     */
    @Column(name = "PAZJZ")
    private BigDecimal pazjz;

    /**
     * 案件涉外侵害类别
     */
    @Column(name = "QFLB")
    private String qflb;

    /**
     * 涉案总价值
     */
    @Column(name = "SAZJZ")
    private BigDecimal sazjz;

    /**
     * 立案审查到期时间
     */
    @Column(name = "SCDQSJ")
    private Date scdqsj;

    /**
     * 审查时间
     */
    @Column(name = "SCSJ")
    private Date scsj;

    /**
     * 是否勘查现场
     */
    @Column(name = "SFKCXC")
    private String sfkcxc;

    /**
     * 是否有现场
     */
    @Column(name = "SFYXC")
    private String sfyxc;

    /**
     * 市局串案编号
     */
    @Column(name = "SJCABH")
    private String sjcabh;

    /**
     * 外部接收人
     */
    @Column(name = "WBJSRXM")
    private String wbjsrxm;

    /**
     * 危害程度
     */
    @Column(name = "WHCD")
    private String whcd;

    /**
     * 挽回总价值
     */
    @Column(name = "WHZJZ")
    private BigDecimal whzjz;

    /**
     * 案件协办单位
     */
    @Column(name = "XBDW")
    private String xbdw;

    /**
     * 协办人
     */
    @Column(name = "XBR")
    private String xbr;

    /**
     * 协办人姓名
     */
    @Column(name = "XBRXM")
    private String xbrxm;

    /**
     * 相关案件类别
     */
    @Column(name = "XGAJLB")
    private String xgajlb;

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
     * 协破单位
     */
    @Column(name = "XPDW")
    private String xpdw;

    /**
     * 线索编号
     */
    @Column(name = "XSBH")
    private String xsbh;

    /**
     * 移送单位
     */
    @Column(name = "YSDW")
    private String ysdw;

    /**
     * 移送单位联系电话
     */
    @Column(name = "YSDWLXDH")
    private String ysdwlxdh;

    /**
     * 移送单位名称
     */
    @Column(name = "YSDWMC")
    private String ysdwmc;

    /**
     * 案件移送接收单位联系电话
     */
    @Column(name = "YSJSDWLXDH")
    private String ysjsdwlxdh;

    /**
     * 移送人
     */
    @Column(name = "YSR")
    private String ysr;

    /**
     * 移送人姓名
     */
    @Column(name = "YSRXM")
    private String ysrxm;

    /**
     * 移送时间
     */
    @Column(name = "YSSJ")
    private String yssj;

    /**
     * 移送原因
     */
    @Column(name = "YSYY")
    private String ysyy;

    /**
     * 专案标记
     */
    @Column(name = "ZABJ")
    private String zabj;

    /**
     * 转案件编号
     */
    @Column(name = "ZAJBH")
    private String zajbh;

    /**
     * 作案人数
     */
    @Column(name = "ZARS")
    private BigDecimal zars;

    /**
     * 主办单位
     */
    @Column(name = "ZBDW")
    private String zbdw;

    /**
     * 主办单位名称
     */
    @Column(name = "ZBDWMC")
    private String zbdwmc;

    /**
     * 主办人 
     */
    @Column(name = "ZBR")
    private String zbr;

    /**
     * 案件X坐标
     */
    @Column(name = "XZB")
    private byte[] xzb;

    /**
     * 案件Y坐标
     */
    @Column(name = "YZB")
    private byte[] yzb;

    /**
     * 获取案件编号
     *
     * @return AJBH - 案件编号
     */
    public String getAjbh() {
        return ajbh;
    }

    /**
     * 设置案件编号
     *
     * @param ajbh 案件编号
     */
    public void setAjbh(String ajbh) {
        this.ajbh = ajbh;
    }

    /**
     * 获取案件详细地址名称
     *
     * @return AJDZMC - 案件详细地址名称
     */
    public String getAjdzmc() {
        return ajdzmc;
    }

    /**
     * 设置案件详细地址名称
     *
     * @param ajdzmc 案件详细地址名称
     */
    public void setAjdzmc(String ajdzmc) {
        this.ajdzmc = ajdzmc;
    }

    /**
     * 获取案件副案别
     *
     * @return AJFAB - 案件副案别
     */
    public String getAjfab() {
        return ajfab;
    }

    /**
     * 设置案件副案别
     *
     * @param ajfab 案件副案别
     */
    public void setAjfab(String ajfab) {
        this.ajfab = ajfab;
    }

    /**
     * 获取解救儿童数
     *
     * @return AJJJETS - 解救儿童数
     */
    public BigDecimal getAjjjets() {
        return ajjjets;
    }

    /**
     * 设置解救儿童数
     *
     * @param ajjjets 解救儿童数
     */
    public void setAjjjets(BigDecimal ajjjets) {
        this.ajjjets = ajjjets;
    }

    /**
     * 获取解救妇女数
     *
     * @return AJJJFNS - 解救妇女数
     */
    public BigDecimal getAjjjfns() {
        return ajjjfns;
    }

    /**
     * 设置解救妇女数
     *
     * @param ajjjfns 解救妇女数
     */
    public void setAjjjfns(BigDecimal ajjjfns) {
        this.ajjjfns = ajjjfns;
    }

    /**
     * 获取解救人质数
     *
     * @return AJJJRZS - 解救人质数
     */
    public BigDecimal getAjjjrzs() {
        return ajjjrzs;
    }

    /**
     * 设置解救人质数
     *
     * @param ajjjrzs 解救人质数
     */
    public void setAjjjrzs(BigDecimal ajjjrzs) {
        this.ajjjrzs = ajjjrzs;
    }

    /**
     * 获取街路巷
     *
     * @return AJJLX - 街路巷
     */
    public String getAjjlx() {
        return ajjlx;
    }

    /**
     * 设置街路巷
     *
     * @param ajjlx 街路巷
     */
    public void setAjjlx(String ajjlx) {
        this.ajjlx = ajjlx;
    }

    /**
     * 获取案件类别
     *
     * @return AJLB - 案件类别
     */
    public String getAjlb() {
        return ajlb;
    }

    /**
     * 设置案件类别
     *
     * @param ajlb 案件类别
     */
    public void setAjlb(String ajlb) {
        this.ajlb = ajlb;
    }

    /**
     * 获取案件类别名称
     *
     * @return AJLBMC - 案件类别名称
     */
    public String getAjlbmc() {
        return ajlbmc;
    }

    /**
     * 设置案件类别名称
     *
     * @param ajlbmc 案件类别名称
     */
    public void setAjlbmc(String ajlbmc) {
        this.ajlbmc = ajlbmc;
    }

    /**
     * 获取案件来源
     *
     * @return AJLY - 案件来源
     */
    public String getAjly() {
        return ajly;
    }

    /**
     * 设置案件来源
     *
     * @param ajly 案件来源
     */
    public void setAjly(String ajly) {
        this.ajly = ajly;
    }

    /**
     * 获取案件名称
     *
     * @return AJMC - 案件名称
     */
    public String getAjmc() {
        return ajmc;
    }

    /**
     * 设置案件名称
     *
     * @param ajmc 案件名称
     */
    public void setAjmc(String ajmc) {
        this.ajmc = ajmc;
    }

    /**
     * 获取案件密级
     *
     * @return AJMJ - 案件密级
     */
    public String getAjmj() {
        return ajmj;
    }

    /**
     * 设置案件密级
     *
     * @param ajmj 案件密级
     */
    public void setAjmj(String ajmj) {
        this.ajmj = ajmj;
    }

    /**
     * 获取门楼牌号
     *
     * @return AJMLPH - 门楼牌号
     */
    public String getAjmlph() {
        return ajmlph;
    }

    /**
     * 设置门楼牌号
     *
     * @param ajmlph 门楼牌号
     */
    public void setAjmlph(String ajmlph) {
        this.ajmlph = ajmlph;
    }

    /**
     * 获取门楼详址
     *
     * @return AJMLXZ - 门楼详址
     */
    public String getAjmlxz() {
        return ajmlxz;
    }

    /**
     * 设置门楼详址
     *
     * @param ajmlxz 门楼详址
     */
    public void setAjmlxz(String ajmlxz) {
        this.ajmlxz = ajmlxz;
    }

    /**
     * 获取门牌后缀
     *
     * @return AJMPHZ - 门牌后缀
     */
    public String getAjmphz() {
        return ajmphz;
    }

    /**
     * 设置门牌后缀
     *
     * @param ajmphz 门牌后缀
     */
    public void setAjmphz(String ajmphz) {
        this.ajmphz = ajmphz;
    }

    /**
     * 获取其他受害人数
     *
     * @return AJQTSHRS - 其他受害人数
     */
    public BigDecimal getAjqtshrs() {
        return ajqtshrs;
    }

    /**
     * 设置其他受害人数
     *
     * @param ajqtshrs 其他受害人数
     */
    public void setAjqtshrs(BigDecimal ajqtshrs) {
        this.ajqtshrs = ajqtshrs;
    }

    /**
     * 获取人员受伤数
     *
     * @return AJRYSSS - 人员受伤数
     */
    public BigDecimal getAjrysss() {
        return ajrysss;
    }

    /**
     * 设置人员受伤数
     *
     * @param ajrysss 人员受伤数
     */
    public void setAjrysss(BigDecimal ajrysss) {
        this.ajrysss = ajrysss;
    }

    /**
     * 获取人员死亡数
     *
     * @return AJRYSWS - 人员死亡数
     */
    public BigDecimal getAjrysws() {
        return ajrysws;
    }

    /**
     * 设置人员死亡数
     *
     * @param ajrysws 人员死亡数
     */
    public void setAjrysws(BigDecimal ajrysws) {
        this.ajrysws = ajrysws;
    }

    /**
     * 获取省市县区
     *
     * @return AJSSXQ - 省市县区
     */
    public String getAjssxq() {
        return ajssxq;
    }

    /**
     * 设置省市县区
     *
     * @param ajssxq 省市县区
     */
    public void setAjssxq(String ajssxq) {
        this.ajssxq = ajssxq;
    }

    /**
     * 获取案件所属责任区
     *
     * @return AJSSZRQ - 案件所属责任区
     */
    public String getAjsszrq() {
        return ajsszrq;
    }

    /**
     * 设置案件所属责任区
     *
     * @param ajsszrq 案件所属责任区
     */
    public void setAjsszrq(String ajsszrq) {
        this.ajsszrq = ajsszrq;
    }

    /**
     * 获取案件所属责任区名称
     *
     * @return AJSSZRQMC - 案件所属责任区名称
     */
    public String getAjsszrqmc() {
        return ajsszrqmc;
    }

    /**
     * 设置案件所属责任区名称
     *
     * @param ajsszrqmc 案件所属责任区名称
     */
    public void setAjsszrqmc(String ajsszrqmc) {
        this.ajsszrqmc = ajsszrqmc;
    }

    /**
     * 获取案件属性
     *
     * @return AJSX - 案件属性
     */
    public String getAjsx() {
        return ajsx;
    }

    /**
     * 设置案件属性
     *
     * @param ajsx 案件属性
     */
    public void setAjsx(String ajsx) {
        this.ajsx = ajsx;
    }

    /**
     * 获取案件性质
     *
     * @return AJXZ - 案件性质
     */
    public String getAjxz() {
        return ajxz;
    }

    /**
     * 设置案件性质
     *
     * @param ajxz 案件性质
     */
    public void setAjxz(String ajxz) {
        this.ajxz = ajxz;
    }

    /**
     * 获取案件状态
     *
     * @return AJZT - 案件状态
     */
    public String getAjzt() {
        return ajzt;
    }

    /**
     * 设置案件状态
     *
     * @param ajzt 案件状态
     */
    public void setAjzt(String ajzt) {
        this.ajzt = ajzt;
    }

    /**
     * 获取案件主题词
     *
     * @return AJZTC - 案件主题词
     */
    public String getAjztc() {
        return ajztc;
    }

    /**
     * 设置案件主题词
     *
     * @param ajztc 案件主题词
     */
    public void setAjztc(String ajztc) {
        this.ajztc = ajztc;
    }

    /**
     * 获取案情综述
     *
     * @return AQZS - 案情综述
     */
    public String getAqzs() {
        return aqzs;
    }

    /**
     * 设置案情综述
     *
     * @param aqzs 案情综述
     */
    public void setAqzs(String aqzs) {
        this.aqzs = aqzs;
    }

    /**
     * 获取案件报案单位地址
     *
     * @return BADWDZ - 案件报案单位地址
     */
    public String getBadwdz() {
        return badwdz;
    }

    /**
     * 设置案件报案单位地址
     *
     * @param badwdz 案件报案单位地址
     */
    public void setBadwdz(String badwdz) {
        this.badwdz = badwdz;
    }

    /**
     * 获取案件报案单位联系方式
     *
     * @return BADWLXFS - 案件报案单位联系方式
     */
    public String getBadwlxfs() {
        return badwlxfs;
    }

    /**
     * 设置案件报案单位联系方式
     *
     * @param badwlxfs 案件报案单位联系方式
     */
    public void setBadwlxfs(String badwlxfs) {
        this.badwlxfs = badwlxfs;
    }

    /**
     * 获取案件报案单位联系人
     *
     * @return BADWLXR - 案件报案单位联系人
     */
    public String getBadwlxr() {
        return badwlxr;
    }

    /**
     * 设置案件报案单位联系人
     *
     * @param badwlxr 案件报案单位联系人
     */
    public void setBadwlxr(String badwlxr) {
        this.badwlxr = badwlxr;
    }

    /**
     * 获取案件报案单位名称
     *
     * @return BADWMC - 案件报案单位名称
     */
    public String getBadwmc() {
        return badwmc;
    }

    /**
     * 设置案件报案单位名称
     *
     * @param badwmc 案件报案单位名称
     */
    public void setBadwmc(String badwmc) {
        this.badwmc = badwmc;
    }

    /**
     * 获取报案人保密级别
     *
     * @return BARBMJB - 报案人保密级别
     */
    public String getBarbmjb() {
        return barbmjb;
    }

    /**
     * 设置报案人保密级别
     *
     * @param barbmjb 报案人保密级别
     */
    public void setBarbmjb(String barbmjb) {
        this.barbmjb = barbmjb;
    }

    /**
     * 获取报案人出生日期
     *
     * @return BARCSRQ - 报案人出生日期
     */
    public Date getBarcsrq() {
        return barcsrq;
    }

    /**
     * 设置报案人出生日期
     *
     * @param barcsrq 报案人出生日期
     */
    public void setBarcsrq(Date barcsrq) {
        this.barcsrq = barcsrq;
    }

    /**
     * 获取报案人单位
     *
     * @return BARDW - 报案人单位
     */
    public String getBardw() {
        return bardw;
    }

    /**
     * 设置报案人单位
     *
     * @param bardw 报案人单位
     */
    public void setBardw(String bardw) {
        this.bardw = bardw;
    }

    /**
     * 获取报案人联系方式
     *
     * @return BARLXFS - 报案人联系方式
     */
    public String getBarlxfs() {
        return barlxfs;
    }

    /**
     * 设置报案人联系方式
     *
     * @param barlxfs 报案人联系方式
     */
    public void setBarlxfs(String barlxfs) {
        this.barlxfs = barlxfs;
    }

    /**
     * 获取报案人性别
     *
     * @return BARXB - 报案人性别
     */
    public String getBarxb() {
        return barxb;
    }

    /**
     * 设置报案人性别
     *
     * @param barxb 报案人性别
     */
    public void setBarxb(String barxb) {
        this.barxb = barxb;
    }

    /**
     * 获取报案人姓名
     *
     * @return BARXM - 报案人姓名
     */
    public String getBarxm() {
        return barxm;
    }

    /**
     * 设置报案人姓名
     *
     * @param barxm 报案人姓名
     */
    public void setBarxm(String barxm) {
        this.barxm = barxm;
    }

    /**
     * 获取报案人证件号码
     *
     * @return BARZJHM - 报案人证件号码
     */
    public String getBarzjhm() {
        return barzjhm;
    }

    /**
     * 设置报案人证件号码
     *
     * @param barzjhm 报案人证件号码
     */
    public void setBarzjhm(String barzjhm) {
        this.barzjhm = barzjhm;
    }

    /**
     * 获取报案人证件种类
     *
     * @return BARZJZL - 报案人证件种类
     */
    public String getBarzjzl() {
        return barzjzl;
    }

    /**
     * 设置报案人证件种类
     *
     * @param barzjzl 报案人证件种类
     */
    public void setBarzjzl(String barzjzl) {
        this.barzjzl = barzjzl;
    }

    /**
     * 获取报案人住址
     *
     * @return BARZZ - 报案人住址
     */
    public String getBarzz() {
        return barzz;
    }

    /**
     * 设置报案人住址
     *
     * @param barzz 报案人住址
     */
    public void setBarzz(String barzz) {
        this.barzz = barzz;
    }

    /**
     * 获取报案时间
     *
     * @return BASJ - 报案时间
     */
    public Date getBasj() {
        return basj;
    }

    /**
     * 设置报案时间
     *
     * @param basj 报案时间
     */
    public void setBasj(Date basj) {
        this.basj = basj;
    }

    /**
     * 获取登记时间
     *
     * @return DJSJ - 登记时间
     */
    public String getDjsj() {
        return djsj;
    }

    /**
     * 设置登记时间
     *
     * @param djsj 登记时间
     */
    public void setDjsj(String djsj) {
        this.djsj = djsj;
    }

    /**
     * 获取大要案标识
     *
     * @return DYABS - 大要案标识
     */
    public String getDyabs() {
        return dyabs;
    }

    /**
     * 设置大要案标识
     *
     * @param dyabs 大要案标识
     */
    public void setDyabs(String dyabs) {
        this.dyabs = dyabs;
    }

    /**
     * 获取发案部位
     *
     * @return FABW - 发案部位
     */
    public String getFabw() {
        return fabw;
    }

    /**
     * 设置发案部位
     *
     * @param fabw 发案部位
     */
    public void setFabw(String fabw) {
        this.fabw = fabw;
    }

    /**
     * 获取发案处所
     *
     * @return FACS - 发案处所
     */
    public String getFacs() {
        return facs;
    }

    /**
     * 设置发案处所
     *
     * @param facs 发案处所
     */
    public void setFacs(String facs) {
        this.facs = facs;
    }

    /**
     * 获取发案地域
     *
     * @return FADY - 发案地域
     */
    public String getFady() {
        return fady;
    }

    /**
     * 设置发案地域
     *
     * @param fady 发案地域
     */
    public void setFady(String fady) {
        this.fady = fady;
    }

    /**
     * 获取发案时间段
     *
     * @return FASJD - 发案时间段
     */
    public String getFasjd() {
        return fasjd;
    }

    /**
     * 设置发案时间段
     *
     * @param fasjd 发案时间段
     */
    public void setFasjd(String fasjd) {
        this.fasjd = fasjd;
    }

    /**
     * 获取发案时间上限
     *
     * @return FASJSX - 发案时间上限
     */
    public Date getFasjsx() {
        return fasjsx;
    }

    /**
     * 设置发案时间上限
     *
     * @param fasjsx 发案时间上限
     */
    public void setFasjsx(Date fasjsx) {
        this.fasjsx = fasjsx;
    }

    /**
     * 获取发案时间下限
     *
     * @return FASJXX - 发案时间下限
     */
    public Date getFasjxx() {
        return fasjxx;
    }

    /**
     * 设置发案时间下限
     *
     * @param fasjxx 发案时间下限
     */
    public void setFasjxx(Date fasjxx) {
        this.fasjxx = fasjxx;
    }

    /**
     * 获取分局串案编号
     *
     * @return FJCABH - 分局串案编号
     */
    public String getFjcabh() {
        return fjcabh;
    }

    /**
     * 设置分局串案编号
     *
     * @param fjcabh 分局串案编号
     */
    public void setFjcabh(String fjcabh) {
        this.fjcabh = fjcabh;
    }

    /**
     * 获取分类案件编号
     *
     * @return FLAJBH - 分类案件编号
     */
    public String getFlajbh() {
        return flajbh;
    }

    /**
     * 设置分类案件编号
     *
     * @param flajbh 分类案件编号
     */
    public void setFlajbh(String flajbh) {
        this.flajbh = flajbh;
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
     * 获取合并破案案件编号
     *
     * @return HBPAAJBH - 合并破案案件编号
     */
    public String getHbpaajbh() {
        return hbpaajbh;
    }

    /**
     * 设置合并破案案件编号
     *
     * @param hbpaajbh 合并破案案件编号
     */
    public void setHbpaajbh(String hbpaajbh) {
        this.hbpaajbh = hbpaajbh;
    }

    /**
     * 获取结案日期
     *
     * @return JARQ - 结案日期
     */
    public Date getJarq() {
        return jarq;
    }

    /**
     * 设置结案日期
     *
     * @param jarq 结案日期
     */
    public void setJarq(Date jarq) {
        this.jarq = jarq;
    }

    /**
     * 获取经济损失
     *
     * @return JJSS - 经济损失
     */
    public BigDecimal getJjss() {
        return jjss;
    }

    /**
     * 设置经济损失
     *
     * @param jjss 经济损失
     */
    public void setJjss(BigDecimal jjss) {
        this.jjss = jjss;
    }

    /**
     * 获取案件记录编号
     *
     * @return JLBH - 案件记录编号
     */
    public String getJlbh() {
        return jlbh;
    }

    /**
     * 设置案件记录编号
     *
     * @param jlbh 案件记录编号
     */
    public void setJlbh(String jlbh) {
        this.jlbh = jlbh;
    }

    /**
     * 获取技术串案编号
     *
     * @return JSCABH - 技术串案编号
     */
    public String getJscabh() {
        return jscabh;
    }

    /**
     * 设置技术串案编号
     *
     * @param jscabh 技术串案编号
     */
    public void setJscabh(String jscabh) {
        this.jscabh = jscabh;
    }

    /**
     * 获取接收单位
     *
     * @return JSDW - 接收单位
     */
    public String getJsdw() {
        return jsdw;
    }

    /**
     * 设置接收单位
     *
     * @param jsdw 接收单位
     */
    public void setJsdw(String jsdw) {
        this.jsdw = jsdw;
    }

    /**
     * 获取接收单位名称
     *
     * @return JSDWMC - 接收单位名称
     */
    public String getJsdwmc() {
        return jsdwmc;
    }

    /**
     * 设置接收单位名称
     *
     * @param jsdwmc 接收单位名称
     */
    public void setJsdwmc(String jsdwmc) {
        this.jsdwmc = jsdwmc;
    }

    /**
     * 获取接收人
     *
     * @return JSR - 接收人
     */
    public String getJsr() {
        return jsr;
    }

    /**
     * 设置接收人
     *
     * @param jsr 接收人
     */
    public void setJsr(String jsr) {
        this.jsr = jsr;
    }

    /**
     * 获取案件内外勾结
     *
     * @return NWGJ - 案件内外勾结
     */
    public String getNwgj() {
        return nwgj;
    }

    /**
     * 设置案件内外勾结
     *
     * @param nwgj 案件内外勾结
     */
    public void setNwgj(String nwgj) {
        this.nwgj = nwgj;
    }

    /**
     * 获取内外勾结对象
     *
     * @return NWGJDX - 内外勾结对象
     */
    public String getNwgjdx() {
        return nwgjdx;
    }

    /**
     * 设置内外勾结对象
     *
     * @param nwgjdx 内外勾结对象
     */
    public void setNwgjdx(String nwgjdx) {
        this.nwgjdx = nwgjdx;
    }

    /**
     * 获取破案单位
     *
     * @return PADW - 破案单位
     */
    public String getPadw() {
        return padw;
    }

    /**
     * 设置破案单位
     *
     * @param padw 破案单位
     */
    public void setPadw(String padw) {
        this.padw = padw;
    }

    /**
     * 获取破案单位名称
     *
     * @return PADWMC - 破案单位名称
     */
    public String getPadwmc() {
        return padwmc;
    }

    /**
     * 设置破案单位名称
     *
     * @param padwmc 破案单位名称
     */
    public void setPadwmc(String padwmc) {
        this.padwmc = padwmc;
    }

    /**
     * 获取破案方式
     *
     * @return PAFS - 破案方式
     */
    public String getPafs() {
        return pafs;
    }

    /**
     * 设置破案方式
     *
     * @param pafs 破案方式
     */
    public void setPafs(String pafs) {
        this.pafs = pafs;
    }

    /**
     * 获取破案简况
     *
     * @return PAJK - 破案简况
     */
    public String getPajk() {
        return pajk;
    }

    /**
     * 设置破案简况
     *
     * @param pajk 破案简况
     */
    public void setPajk(String pajk) {
        this.pajk = pajk;
    }

    /**
     * 获取破案类型
     *
     * @return PALX - 破案类型
     */
    public String getPalx() {
        return palx;
    }

    /**
     * 设置破案类型
     *
     * @param palx 破案类型
     */
    public void setPalx(String palx) {
        this.palx = palx;
    }

    /**
     * 获取破案批准单位
     *
     * @return PAPZDW - 破案批准单位
     */
    public String getPapzdw() {
        return papzdw;
    }

    /**
     * 设置破案批准单位
     *
     * @param papzdw 破案批准单位
     */
    public void setPapzdw(String papzdw) {
        this.papzdw = papzdw;
    }

    /**
     * 获取破案批准人
     *
     * @return PAPZR - 破案批准人
     */
    public String getPapzr() {
        return papzr;
    }

    /**
     * 设置破案批准人
     *
     * @param papzr 破案批准人
     */
    public void setPapzr(String papzr) {
        this.papzr = papzr;
    }

    /**
     * 获取破案批准时间
     *
     * @return PAPZSJ - 破案批准时间
     */
    public Date getPapzsj() {
        return papzsj;
    }

    /**
     * 设置破案批准时间
     *
     * @param papzsj 破案批准时间
     */
    public void setPapzsj(Date papzsj) {
        this.papzsj = papzsj;
    }

    /**
     * 获取涉及国家地区
     *
     * @return SJGJDQ - 涉及国家地区
     */
    public String getSjgjdq() {
        return sjgjdq;
    }

    /**
     * 设置涉及国家地区
     *
     * @param sjgjdq 涉及国家地区
     */
    public void setSjgjdq(String sjgjdq) {
        this.sjgjdq = sjgjdq;
    }

    /**
     * 获取受理单位
     *
     * @return SLDW - 受理单位
     */
    public String getSldw() {
        return sldw;
    }

    /**
     * 设置受理单位
     *
     * @param sldw 受理单位
     */
    public void setSldw(String sldw) {
        this.sldw = sldw;
    }

    /**
     * 获取受理单位联系电话
     *
     * @return SLDWDH - 受理单位联系电话
     */
    public String getSldwdh() {
        return sldwdh;
    }

    /**
     * 设置受理单位联系电话
     *
     * @param sldwdh 受理单位联系电话
     */
    public void setSldwdh(String sldwdh) {
        this.sldwdh = sldwdh;
    }

    /**
     * 获取受理单位名称
     *
     * @return SLDWMC - 受理单位名称
     */
    public String getSldwmc() {
        return sldwmc;
    }

    /**
     * 设置受理单位名称
     *
     * @param sldwmc 受理单位名称
     */
    public void setSldwmc(String sldwmc) {
        this.sldwmc = sldwmc;
    }

    /**
     * 获取受理方式
     *
     * @return SLFS - 受理方式
     */
    public String getSlfs() {
        return slfs;
    }

    /**
     * 设置受理方式
     *
     * @param slfs 受理方式
     */
    public void setSlfs(String slfs) {
        this.slfs = slfs;
    }

    /**
     * 获取受理人
     *
     * @return SLR - 受理人
     */
    public String getSlr() {
        return slr;
    }

    /**
     * 设置受理人
     *
     * @param slr 受理人
     */
    public void setSlr(String slr) {
        this.slr = slr;
    }

    /**
     * 获取受理人姓名
     *
     * @return SLRXM - 受理人姓名
     */
    public String getSlrxm() {
        return slrxm;
    }

    /**
     * 设置受理人姓名
     *
     * @param slrxm 受理人姓名
     */
    public void setSlrxm(String slrxm) {
        this.slrxm = slrxm;
    }

    /**
     * 获取受理时间
     *
     * @return SLSJ - 受理时间
     */
    public Date getSlsj() {
        return slsj;
    }

    /**
     * 设置受理时间
     *
     * @param slsj 受理时间
     */
    public void setSlsj(Date slsj) {
        this.slsj = slsj;
    }

    /**
     * 获取省厅串案编号
     *
     * @return STCABH - 省厅串案编号
     */
    public String getStcabh() {
        return stcabh;
    }

    /**
     * 设置省厅串案编号
     *
     * @param stcabh 省厅串案编号
     */
    public void setStcabh(String stcabh) {
        this.stcabh = stcabh;
    }

    /**
     * 获取外部接收单位
     *
     * @return WBJSDWMC - 外部接收单位
     */
    public String getWbjsdwmc() {
        return wbjsdwmc;
    }

    /**
     * 设置外部接收单位
     *
     * @param wbjsdwmc 外部接收单位
     */
    public void setWbjsdwmc(String wbjsdwmc) {
        this.wbjsdwmc = wbjsdwmc;
    }

    /**
     * 获取主办人电话
     *
     * @return ZBRDH - 主办人电话
     */
    public String getZbrdh() {
        return zbrdh;
    }

    /**
     * 设置主办人电话
     *
     * @param zbrdh 主办人电话
     */
    public void setZbrdh(String zbrdh) {
        this.zbrdh = zbrdh;
    }

    /**
     * 获取主办人姓名
     *
     * @return ZBRXM - 主办人姓名
     */
    public String getZbrxm() {
        return zbrxm;
    }

    /**
     * 设置主办人姓名
     *
     * @param zbrxm 主办人姓名
     */
    public void setZbrxm(String zbrxm) {
        this.zbrxm = zbrxm;
    }

    /**
     * 获取直属分局案件－是否
     *
     * @return ZSAJ - 直属分局案件－是否
     */
    public String getZsaj() {
        return zsaj;
    }

    /**
     * 设置直属分局案件－是否
     *
     * @param zsaj 直属分局案件－是否
     */
    public void setZsaj(String zsaj) {
        this.zsaj = zsaj;
    }

    /**
     * 获取直属办案单位
     *
     * @return ZSBADW - 直属办案单位
     */
    public String getZsbadw() {
        return zsbadw;
    }

    /**
     * 设置直属办案单位
     *
     * @param zsbadw 直属办案单位
     */
    public void setZsbadw(String zsbadw) {
        this.zsbadw = zsbadw;
    }

    /**
     * 获取直属办案单位名称
     *
     * @return ZSBADWMC - 直属办案单位名称
     */
    public String getZsbadwmc() {
        return zsbadwmc;
    }

    /**
     * 设置直属办案单位名称
     *
     * @param zsbadwmc 直属办案单位名称
     */
    public void setZsbadwmc(String zsbadwmc) {
        this.zsbadwmc = zsbadwmc;
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
     * 获取撤销单位
     *
     * @return CXDW - 撤销单位
     */
    public String getCxdw() {
        return cxdw;
    }

    /**
     * 设置撤销单位
     *
     * @param cxdw 撤销单位
     */
    public void setCxdw(String cxdw) {
        this.cxdw = cxdw;
    }

    /**
     * 获取撤销单位名称
     *
     * @return CXDWMC - 撤销单位名称
     */
    public String getCxdwmc() {
        return cxdwmc;
    }

    /**
     * 设置撤销单位名称
     *
     * @param cxdwmc 撤销单位名称
     */
    public void setCxdwmc(String cxdwmc) {
        this.cxdwmc = cxdwmc;
    }

    /**
     * 获取撤销批准人
     *
     * @return CXPZR - 撤销批准人
     */
    public String getCxpzr() {
        return cxpzr;
    }

    /**
     * 设置撤销批准人
     *
     * @param cxpzr 撤销批准人
     */
    public void setCxpzr(String cxpzr) {
        this.cxpzr = cxpzr;
    }

    /**
     * 获取撤销批准人姓名
     *
     * @return CXPZRXM - 撤销批准人姓名
     */
    public String getCxpzrxm() {
        return cxpzrxm;
    }

    /**
     * 设置撤销批准人姓名
     *
     * @param cxpzrxm 撤销批准人姓名
     */
    public void setCxpzrxm(String cxpzrxm) {
        this.cxpzrxm = cxpzrxm;
    }

    /**
     * 获取撤销日期
     *
     * @return CXRQ - 撤销日期
     */
    public Date getCxrq() {
        return cxrq;
    }

    /**
     * 设置撤销日期
     *
     * @param cxrq 撤销日期
     */
    public void setCxrq(Date cxrq) {
        this.cxrq = cxrq;
    }

    /**
     * 获取撤销原因
     *
     * @return CXYY - 撤销原因
     */
    public String getCxyy() {
        return cxyy;
    }

    /**
     * 设置撤销原因
     *
     * @param cxyy 撤销原因
     */
    public void setCxyy(String cxyy) {
        this.cxyy = cxyy;
    }

    /**
     * 获取补立原因
     *
     * @return BLYY - 补立原因
     */
    public String getBlyy() {
        return blyy;
    }

    /**
     * 设置补立原因
     *
     * @param blyy 补立原因
     */
    public void setBlyy(String blyy) {
        this.blyy = blyy;
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
     * 获取督办编号
     *
     * @return DBBH - 督办编号
     */
    public String getDbbh() {
        return dbbh;
    }

    /**
     * 设置督办编号
     *
     * @param dbbh 督办编号
     */
    public void setDbbh(String dbbh) {
        this.dbbh = dbbh;
    }

    /**
     * 获取督办级别
     *
     * @return DBJB - 督办级别
     */
    public String getDbjb() {
        return dbjb;
    }

    /**
     * 设置督办级别
     *
     * @param dbjb 督办级别
     */
    public void setDbjb(String dbjb) {
        this.dbjb = dbjb;
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
     * 获取分析串案编号
     *
     * @return FXCABH - 分析串案编号
     */
    public String getFxcabh() {
        return fxcabh;
    }

    /**
     * 设置分析串案编号
     *
     * @param fxcabh 分析串案编号
     */
    public void setFxcabh(String fxcabh) {
        this.fxcabh = fxcabh;
    }

    /**
     * 获取发现时间
     *
     * @return FXSJ - 发现时间
     */
    public Date getFxsj() {
        return fxsj;
    }

    /**
     * 设置发现时间
     *
     * @param fxsj 发现时间
     */
    public void setFxsj(Date fxsj) {
        this.fxsj = fxsj;
    }

    /**
     * 获取犯罪主体类型
     *
     * @return FZZTLX - 犯罪主体类型
     */
    public String getFzztlx() {
        return fzztlx;
    }

    /**
     * 设置犯罪主体类型
     *
     * @param fzztlx 犯罪主体类型
     */
    public void setFzztlx(String fzztlx) {
        this.fzztlx = fzztlx;
    }

    /**
     * 获取归档时间
     *
     * @return GDSJ - 归档时间
     */
    public Date getGdsj() {
        return gdsj;
    }

    /**
     * 设置归档时间
     *
     * @param gdsj 归档时间
     */
    public void setGdsj(Date gdsj) {
        this.gdsj = gdsj;
    }

    /**
     * 获取归档状态
     *
     * @return GDZT - 归档状态
     */
    public String getGdzt() {
        return gdzt;
    }

    /**
     * 设置归档状态
     *
     * @param gdzt 归档状态
     */
    public void setGdzt(String gdzt) {
        this.gdzt = gdzt;
    }

    /**
     * 获取关联编号
     *
     * @return GLBH - 关联编号
     */
    public String getGlbh() {
        return glbh;
    }

    /**
     * 设置关联编号
     *
     * @param glbh 关联编号
     */
    public void setGlbh(String glbh) {
        this.glbh = glbh;
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
     * 获取管辖分工
     *
     * @return GXFG - 管辖分工
     */
    public String getGxfg() {
        return gxfg;
    }

    /**
     * 设置管辖分工
     *
     * @param gxfg 管辖分工
     */
    public void setGxfg(String gxfg) {
        this.gxfg = gxfg;
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
     * 获取接收姓名
     *
     * @return JSRXM - 接收姓名
     */
    public String getJsrxm() {
        return jsrxm;
    }

    /**
     * 设置接收姓名
     *
     * @param jsrxm 接收姓名
     */
    public void setJsrxm(String jsrxm) {
        this.jsrxm = jsrxm;
    }

    /**
     * 获取接收时间
     *
     * @return JSSJ - 接收时间
     */
    public Date getJssj() {
        return jssj;
    }

    /**
     * 设置接收时间
     *
     * @param jssj 接收时间
     */
    public void setJssj(Date jssj) {
        this.jssj = jssj;
    }

    /**
     * 获取简要案情
     *
     * @return JYAQ - 简要案情
     */
    public String getJyaq() {
        return jyaq;
    }

    /**
     * 设置简要案情
     *
     * @param jyaq 简要案情
     */
    public void setJyaq(String jyaq) {
        this.jyaq = jyaq;
    }

    /**
     * 获取经侦案件属性
     *
     * @return JZAJSX - 经侦案件属性
     */
    public String getJzajsx() {
        return jzajsx;
    }

    /**
     * 设置经侦案件属性
     *
     * @param jzajsx 经侦案件属性
     */
    public void setJzajsx(String jzajsx) {
        this.jzajsx = jzajsx;
    }

    /**
     * 获取案件可防性案件类别
     *
     * @return KFXAJLB - 案件可防性案件类别
     */
    public String getKfxajlb() {
        return kfxajlb;
    }

    /**
     * 设置案件可防性案件类别
     *
     * @param kfxajlb 案件可防性案件类别
     */
    public void setKfxajlb(String kfxajlb) {
        this.kfxajlb = kfxajlb;
    }

    /**
     * 获取立案单位
     *
     * @return LADW - 立案单位
     */
    public String getLadw() {
        return ladw;
    }

    /**
     * 设置立案单位
     *
     * @param ladw 立案单位
     */
    public void setLadw(String ladw) {
        this.ladw = ladw;
    }

    /**
     * 获取立案单位名称
     *
     * @return LADWMC - 立案单位名称
     */
    public String getLadwmc() {
        return ladwmc;
    }

    /**
     * 设置立案单位名称
     *
     * @param ladwmc 立案单位名称
     */
    public void setLadwmc(String ladwmc) {
        this.ladwmc = ladwmc;
    }

    /**
     * 获取立案批准人
     *
     * @return LAPZR - 立案批准人
     */
    public String getLapzr() {
        return lapzr;
    }

    /**
     * 设置立案批准人
     *
     * @param lapzr 立案批准人
     */
    public void setLapzr(String lapzr) {
        this.lapzr = lapzr;
    }

    /**
     * 获取立案批准人姓名
     *
     * @return LAPZRXM - 立案批准人姓名
     */
    public String getLapzrxm() {
        return lapzrxm;
    }

    /**
     * 设置立案批准人姓名
     *
     * @param lapzrxm 立案批准人姓名
     */
    public void setLapzrxm(String lapzrxm) {
        this.lapzrxm = lapzrxm;
    }

    /**
     * 获取立案时间
     *
     * @return LASJ - 立案时间
     */
    public Date getLasj() {
        return lasj;
    }

    /**
     * 设置立案时间
     *
     * @param lasj 立案时间
     */
    public void setLasj(Date lasj) {
        this.lasj = lasj;
    }

    /**
     * 获取破案日期
     *
     * @return PARQ - 破案日期
     */
    public Date getParq() {
        return parq;
    }

    /**
     * 设置破案日期
     *
     * @param parq 破案日期
     */
    public void setParq(Date parq) {
        this.parq = parq;
    }

    /**
     * 获取破案时间段
     *
     * @return PASJD - 破案时间段
     */
    public String getPasjd() {
        return pasjd;
    }

    /**
     * 设置破案时间段
     *
     * @param pasjd 破案时间段
     */
    public void setPasjd(String pasjd) {
        this.pasjd = pasjd;
    }

    /**
     * 获取缴获总价值
     *
     * @return PAZJZ - 缴获总价值
     */
    public BigDecimal getPazjz() {
        return pazjz;
    }

    /**
     * 设置缴获总价值
     *
     * @param pazjz 缴获总价值
     */
    public void setPazjz(BigDecimal pazjz) {
        this.pazjz = pazjz;
    }

    /**
     * 获取案件涉外侵害类别
     *
     * @return QFLB - 案件涉外侵害类别
     */
    public String getQflb() {
        return qflb;
    }

    /**
     * 设置案件涉外侵害类别
     *
     * @param qflb 案件涉外侵害类别
     */
    public void setQflb(String qflb) {
        this.qflb = qflb;
    }

    /**
     * 获取涉案总价值
     *
     * @return SAZJZ - 涉案总价值
     */
    public BigDecimal getSazjz() {
        return sazjz;
    }

    /**
     * 设置涉案总价值
     *
     * @param sazjz 涉案总价值
     */
    public void setSazjz(BigDecimal sazjz) {
        this.sazjz = sazjz;
    }

    /**
     * 获取立案审查到期时间
     *
     * @return SCDQSJ - 立案审查到期时间
     */
    public Date getScdqsj() {
        return scdqsj;
    }

    /**
     * 设置立案审查到期时间
     *
     * @param scdqsj 立案审查到期时间
     */
    public void setScdqsj(Date scdqsj) {
        this.scdqsj = scdqsj;
    }

    /**
     * 获取审查时间
     *
     * @return SCSJ - 审查时间
     */
    public Date getScsj() {
        return scsj;
    }

    /**
     * 设置审查时间
     *
     * @param scsj 审查时间
     */
    public void setScsj(Date scsj) {
        this.scsj = scsj;
    }

    /**
     * 获取是否勘查现场
     *
     * @return SFKCXC - 是否勘查现场
     */
    public String getSfkcxc() {
        return sfkcxc;
    }

    /**
     * 设置是否勘查现场
     *
     * @param sfkcxc 是否勘查现场
     */
    public void setSfkcxc(String sfkcxc) {
        this.sfkcxc = sfkcxc;
    }

    /**
     * 获取是否有现场
     *
     * @return SFYXC - 是否有现场
     */
    public String getSfyxc() {
        return sfyxc;
    }

    /**
     * 设置是否有现场
     *
     * @param sfyxc 是否有现场
     */
    public void setSfyxc(String sfyxc) {
        this.sfyxc = sfyxc;
    }

    /**
     * 获取市局串案编号
     *
     * @return SJCABH - 市局串案编号
     */
    public String getSjcabh() {
        return sjcabh;
    }

    /**
     * 设置市局串案编号
     *
     * @param sjcabh 市局串案编号
     */
    public void setSjcabh(String sjcabh) {
        this.sjcabh = sjcabh;
    }

    /**
     * 获取外部接收人
     *
     * @return WBJSRXM - 外部接收人
     */
    public String getWbjsrxm() {
        return wbjsrxm;
    }

    /**
     * 设置外部接收人
     *
     * @param wbjsrxm 外部接收人
     */
    public void setWbjsrxm(String wbjsrxm) {
        this.wbjsrxm = wbjsrxm;
    }

    /**
     * 获取危害程度
     *
     * @return WHCD - 危害程度
     */
    public String getWhcd() {
        return whcd;
    }

    /**
     * 设置危害程度
     *
     * @param whcd 危害程度
     */
    public void setWhcd(String whcd) {
        this.whcd = whcd;
    }

    /**
     * 获取挽回总价值
     *
     * @return WHZJZ - 挽回总价值
     */
    public BigDecimal getWhzjz() {
        return whzjz;
    }

    /**
     * 设置挽回总价值
     *
     * @param whzjz 挽回总价值
     */
    public void setWhzjz(BigDecimal whzjz) {
        this.whzjz = whzjz;
    }

    /**
     * 获取案件协办单位
     *
     * @return XBDW - 案件协办单位
     */
    public String getXbdw() {
        return xbdw;
    }

    /**
     * 设置案件协办单位
     *
     * @param xbdw 案件协办单位
     */
    public void setXbdw(String xbdw) {
        this.xbdw = xbdw;
    }

    /**
     * 获取协办人
     *
     * @return XBR - 协办人
     */
    public String getXbr() {
        return xbr;
    }

    /**
     * 设置协办人
     *
     * @param xbr 协办人
     */
    public void setXbr(String xbr) {
        this.xbr = xbr;
    }

    /**
     * 获取协办人姓名
     *
     * @return XBRXM - 协办人姓名
     */
    public String getXbrxm() {
        return xbrxm;
    }

    /**
     * 设置协办人姓名
     *
     * @param xbrxm 协办人姓名
     */
    public void setXbrxm(String xbrxm) {
        this.xbrxm = xbrxm;
    }

    /**
     * 获取相关案件类别
     *
     * @return XGAJLB - 相关案件类别
     */
    public String getXgajlb() {
        return xgajlb;
    }

    /**
     * 设置相关案件类别
     *
     * @param xgajlb 相关案件类别
     */
    public void setXgajlb(String xgajlb) {
        this.xgajlb = xgajlb;
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
     * 获取协破单位
     *
     * @return XPDW - 协破单位
     */
    public String getXpdw() {
        return xpdw;
    }

    /**
     * 设置协破单位
     *
     * @param xpdw 协破单位
     */
    public void setXpdw(String xpdw) {
        this.xpdw = xpdw;
    }

    /**
     * 获取线索编号
     *
     * @return XSBH - 线索编号
     */
    public String getXsbh() {
        return xsbh;
    }

    /**
     * 设置线索编号
     *
     * @param xsbh 线索编号
     */
    public void setXsbh(String xsbh) {
        this.xsbh = xsbh;
    }

    /**
     * 获取移送单位
     *
     * @return YSDW - 移送单位
     */
    public String getYsdw() {
        return ysdw;
    }

    /**
     * 设置移送单位
     *
     * @param ysdw 移送单位
     */
    public void setYsdw(String ysdw) {
        this.ysdw = ysdw;
    }

    /**
     * 获取移送单位联系电话
     *
     * @return YSDWLXDH - 移送单位联系电话
     */
    public String getYsdwlxdh() {
        return ysdwlxdh;
    }

    /**
     * 设置移送单位联系电话
     *
     * @param ysdwlxdh 移送单位联系电话
     */
    public void setYsdwlxdh(String ysdwlxdh) {
        this.ysdwlxdh = ysdwlxdh;
    }

    /**
     * 获取移送单位名称
     *
     * @return YSDWMC - 移送单位名称
     */
    public String getYsdwmc() {
        return ysdwmc;
    }

    /**
     * 设置移送单位名称
     *
     * @param ysdwmc 移送单位名称
     */
    public void setYsdwmc(String ysdwmc) {
        this.ysdwmc = ysdwmc;
    }

    /**
     * 获取案件移送接收单位联系电话
     *
     * @return YSJSDWLXDH - 案件移送接收单位联系电话
     */
    public String getYsjsdwlxdh() {
        return ysjsdwlxdh;
    }

    /**
     * 设置案件移送接收单位联系电话
     *
     * @param ysjsdwlxdh 案件移送接收单位联系电话
     */
    public void setYsjsdwlxdh(String ysjsdwlxdh) {
        this.ysjsdwlxdh = ysjsdwlxdh;
    }

    /**
     * 获取移送人
     *
     * @return YSR - 移送人
     */
    public String getYsr() {
        return ysr;
    }

    /**
     * 设置移送人
     *
     * @param ysr 移送人
     */
    public void setYsr(String ysr) {
        this.ysr = ysr;
    }

    /**
     * 获取移送人姓名
     *
     * @return YSRXM - 移送人姓名
     */
    public String getYsrxm() {
        return ysrxm;
    }

    /**
     * 设置移送人姓名
     *
     * @param ysrxm 移送人姓名
     */
    public void setYsrxm(String ysrxm) {
        this.ysrxm = ysrxm;
    }

    /**
     * 获取移送时间
     *
     * @return YSSJ - 移送时间
     */
    public String getYssj() {
        return yssj;
    }

    /**
     * 设置移送时间
     *
     * @param yssj 移送时间
     */
    public void setYssj(String yssj) {
        this.yssj = yssj;
    }

    /**
     * 获取移送原因
     *
     * @return YSYY - 移送原因
     */
    public String getYsyy() {
        return ysyy;
    }

    /**
     * 设置移送原因
     *
     * @param ysyy 移送原因
     */
    public void setYsyy(String ysyy) {
        this.ysyy = ysyy;
    }

    /**
     * 获取专案标记
     *
     * @return ZABJ - 专案标记
     */
    public String getZabj() {
        return zabj;
    }

    /**
     * 设置专案标记
     *
     * @param zabj 专案标记
     */
    public void setZabj(String zabj) {
        this.zabj = zabj;
    }

    /**
     * 获取转案件编号
     *
     * @return ZAJBH - 转案件编号
     */
    public String getZajbh() {
        return zajbh;
    }

    /**
     * 设置转案件编号
     *
     * @param zajbh 转案件编号
     */
    public void setZajbh(String zajbh) {
        this.zajbh = zajbh;
    }

    /**
     * 获取作案人数
     *
     * @return ZARS - 作案人数
     */
    public BigDecimal getZars() {
        return zars;
    }

    /**
     * 设置作案人数
     *
     * @param zars 作案人数
     */
    public void setZars(BigDecimal zars) {
        this.zars = zars;
    }

    /**
     * 获取主办单位
     *
     * @return ZBDW - 主办单位
     */
    public String getZbdw() {
        return zbdw;
    }

    /**
     * 设置主办单位
     *
     * @param zbdw 主办单位
     */
    public void setZbdw(String zbdw) {
        this.zbdw = zbdw;
    }

    /**
     * 获取主办单位名称
     *
     * @return ZBDWMC - 主办单位名称
     */
    public String getZbdwmc() {
        return zbdwmc;
    }

    /**
     * 设置主办单位名称
     *
     * @param zbdwmc 主办单位名称
     */
    public void setZbdwmc(String zbdwmc) {
        this.zbdwmc = zbdwmc;
    }

    /**
     * 获取主办人 
     *
     * @return ZBR - 主办人 
     */
    public String getZbr() {
        return zbr;
    }

    /**
     * 设置主办人 
     *
     * @param zbr 主办人 
     */
    public void setZbr(String zbr) {
        this.zbr = zbr;
    }

    /**
     * 获取案件X坐标
     *
     * @return XZB - 案件X坐标
     */
    public byte[] getXzb() {
        return xzb;
    }

    /**
     * 设置案件X坐标
     *
     * @param xzb 案件X坐标
     */
    public void setXzb(byte[] xzb) {
        this.xzb = xzb;
    }

    /**
     * 获取案件Y坐标
     *
     * @return YZB - 案件Y坐标
     */
    public byte[] getYzb() {
        return yzb;
    }

    /**
     * 设置案件Y坐标
     *
     * @param yzb 案件Y坐标
     */
    public void setYzb(byte[] yzb) {
        this.yzb = yzb;
    }
}