package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_sjwp")
public class TSjwp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 物品案件编号
     */
    @Column(name = "AJBH")
    private String ajbh;

    /**
     * 涉案车辆－被盗抢保险
     */
    @Column(name = "BDQX")
    private String bdqx;

    /**
     * 被发还人
     */
    @Column(name = "BFHR")
    private String bfhr;

    /**
     * 被发还人编号
     */
    @Column(name = "BFHRBH")
    private String bfhrbh;

    /**
     * 被发还人类别
     */
    @Column(name = "BFHRLB")
    private String bfhrlb;

    /**
     * 被发还人联系方式
     */
    @Column(name = "BFHRLXFS")
    private String bfhrlxfs;

    /**
     * 编号二
     */
    @Column(name = "BHE")
    private String bhe;

    /**
     * 编号四
     */
    @Column(name = "BHHS")
    private String bhhs;

    /**
     * 编号三
     */
    @Column(name = "BHS")
    private String bhs;

    /**
     * 编号五
     */
    @Column(name = "BHW")
    private String bhw;

    /**
     * 编号一
     */
    @Column(name = "BHY")
    private String bhy;

    /**
     * 被扣押人
     */
    @Column(name = "BKYR")
    private String bkyr;

    /**
     * 涉案车辆－保险情况
     */
    @Column(name = "BXQK")
    private String bxqk;

    /**
     * 保证金上交标识
     */
    @Column(name = "BZJBS")
    private String bzjbs;

    /**
     * 涉案车辆－初次登记时间
     */
    @Column(name = "CCDJSJ")
    private String ccdjsj;

    /**
     * 涉案毒品－初查重量
     */
    @Column(name = "CCZL")
    private Integer cczl;

    /**
     * 拆分关联物品编号
     */
    @Column(name = "CFGLWPBH")
    private String cfglwpbh;

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
     * 车架号
     */
    @Column(name = "CJH")
    private String cjh;

    /**
     * 物品出库类型
     */
    @Column(name = "CKLX")
    private String cklx;

    /**
     * 处理单位
     */
    @Column(name = "CLDW")
    private String cldw;

    /**
     * 处理单位名称
     */
    @Column(name = "CLDWMC")
    private String cldwmc;

    /**
     * 涉案车辆－车辆类型
     */
    @Column(name = "CLLX")
    private String cllx;

    /**
     * 处理情况－处理情况
     */
    @Column(name = "CLQK")
    private String clqk;

    /**
     * 处理日期
     */
    @Column(name = "CLRQ")
    private String clrq;

    /**
     * 涉案枪支－持枪人单位
     */
    @Column(name = "CQRDW")
    private String cqrdw;

    /**
     * 涉案车辆－车身颜色
     */
    @Column(name = "CSYS")
    private String csys;

    @Column(name = "CYRBH")
    private String cyrbh;

    @Column(name = "CYRLB")
    private String cyrlb;

    @Column(name = "CYRZJHM")
    private String cyrzjhm;

    /**
     * 涉案车辆－车主地址
     */
    @Column(name = "CZDZ")
    private String czdz;

    /**
     * 涉案车辆－车主联系电话
     */
    @Column(name = "CZLXDH")
    private String czlxdh;

    /**
     * 涉案车辆车主身份证号
     */
    @Column(name = "CZSFZH")
    private String czsfzh;

    /**
     * 涉案车辆－车主姓名
     */
    @Column(name = "CZXM")
    private String czxm;

    /**
     * 开票人ID
     */
    @Column(name = "CZY")
    private String czy;

    /**
     * 开票人姓名
     */
    @Column(name = "CZYM")
    private String czym;

    /**
     * 涉案毒品－查证重量
     */
    @Column(name = "CZZL")
    private Integer czzl;

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
     * 涉案车辆电机号
     */
    @Column(name = "DJH")
    private String djh;

    /**
     * 登记人
     */
    @Column(name = "DJR")
    private String djr;

    /**
     * 登记人姓名
     */
    @Column(name = "DJRXM")
    private String djrxm;

    /**
     * 登记时间
     */
    @Column(name = "DJSJ")
    private String djsj;

    /**
     * 大厅模式
     */
    @Column(name = "DTBZ")
    private String dtbz;

    /**
     * 大厅单位代码
     */
    @Column(name = "DTDWDM")
    private String dtdwdm;

    /**
     * 付款人开户行
     */
    @Column(name = "FKKHH")
    private String fkkhh;

    /**
     * 付款人
     */
    @Column(name = "FKR")
    private String fkr;

    /**
     * 付款人账号
     */
    @Column(name = "FKZH")
    private String fkzh;

    /**
     * 公告登记单位
     */
    @Column(name = "GGDJDW")
    private String ggdjdw;

    /**
     * 公告登记人
     */
    @Column(name = "GGDJR")
    private String ggdjr;

    /**
     * 公告登记时间
     */
    @Column(name = "GGDJSJ")
    private String ggdjsj;

    /**
     * 公告类型
     */
    @Column(name = "GGLX")
    private String gglx;

    /**
     * 涉案毒品－购进价格
     */
    @Column(name = "GJJG")
    private Integer gjjg;

    @Column(name = "GJJG1")
    private Integer gjjg1;

    /**
     * 关联物品编号－WP_JDC车辆编号
     */
    @Column(name = "GLBH")
    private String glbh;

    /**
     * 关联原物品编号
     */
    @Column(name = "GLYWPBH")
    private String glywpbh;

    /**
     * 购买日期
     */
    @Column(name = "GMRQ")
    private String gmrq;

    /**
     * 涉案物品手机号码归属地
     */
    @Column(name = "GSDMC")
    private String gsdmc;

    /**
     * 合计金额
     */
    @Column(name = "HJJE")
    private Integer hjje;

    /**
     * 涉案车辆－号牌种类
     */
    @Column(name = "HPZL")
    private String hpzl;

    /**
     * 毒品鉴定种类
     */
    @Column(name = "JDDPZL")
    private String jddpzl;

    /**
     * 金额
     */
    @Column(name = "JE")
    private Integer je;

    /**
     * 涉案毒品－缴获重量
     */
    @Column(name = "JHZL")
    private Integer jhzl;

    /**
     * 缴款书编号
     */
    @Column(name = "JKSBH")
    private String jksbh;

    /**
     * 计量单位
     */
    @Column(name = "JLDW")
    private String jldw;

    /**
     * 简要说明
     */
    @Column(name = "JYSM")
    private String jysm;

    /**
     * 扣押财物保管人
     */
    @Column(name = "KYCWBGR")
    private String kycwbgr;

    /**
     * 扣押单位
     */
    @Column(name = "KYDW")
    private String kydw;

    /**
     * 扣押人
     */
    @Column(name = "KYR")
    private String kyr;

    /**
     * 扣押时间
     */
    @Column(name = "KYSJ")
    private String kysj;

    /**
     * 涉案毒品－来源地
     */
    @Column(name = "LYD")
    private String lyd;

    /**
     * 涉案毒品－卖出价格
     */
    @Column(name = "MCJG")
    private Integer mcjg;

    /**
     * 明细序号
     */
    @Column(name = "MXID")
    private String mxid;

    /**
     * 票据号码
     */
    @Column(name = "PJHM")
    private String pjhm;

    /**
     * 票据类型
     */
    @Column(name = "PJLX")
    private String pjlx;

    /**
     * 批准发还时间
     */
    @Column(name = "PZFHSJ")
    private String pzfhsj;

    /**
     * 发行期限
     */
    @Column(name = "QX")
    private String qx;

    /**
     * 涉案枪支－发证日期
     */
    @Column(name = "QZFZRQ")
    private String qzfzrq;

    /**
     * 涉案枪支－口径
     */
    @Column(name = "QZKJ")
    private Integer qzkj;

    /**
     * 涉案枪支－枪支子弹数目
     */
    @Column(name = "QZZDSM")
    private Integer qzzdsm;

    /**
     * 物品入库类型
     */
    @Column(name = "RKLX")
    private String rklx;

    /**
     * 物品入库时间
     */
    @Column(name = "RKSJ")
    private String rksj;

    /**
     * 物品人员编号
     */
    @Column(name = "RYBH")
    private String rybh;

    /**
     * 物品出库时间
     */
    @Column(name = "CKSJ")
    private String cksj;

    /**
     * 涉案物品来源－物品来源
     */
    @Column(name = "SAWPLY")
    private String sawply;

    /**
     * 收费标准
     */
    @Column(name = "SFBZ")
    private String sfbz;

    /**
     * 是否公告
     */
    @Column(name = "SFGG")
    private String sfgg;

    /**
     * 审批结果
     */
    @Column(name = "SHJG")
    private String shjg;

    /**
     * 审核人
     */
    @Column(name = "SHR")
    private String shr;

    /**
     * 审核时间
     */
    @Column(name = "SHSJ")
    private String shsj;

    /**
     * 审核意见
     */
    @Column(name = "SHYJ")
    private String shyj;

    /**
     * 收据编号
     */
    @Column(name = "SJBH")
    private String sjbh;

    /**
     * 收款人开户行
     */
    @Column(name = "SKKHH")
    private String skkhh;

    /**
     * 收款人
     */
    @Column(name = "SKR")
    private String skr;

    /**
     * 收款日期
     */
    @Column(name = "SKRQ")
    private String skrq;

    /**
     * 收款人账号
     */
    @Column(name = "SKZH")
    private String skzh;

    /**
     * 物品数量单位
     */
    @Column(name = "SLDW")
    private String sldw;

    /**
     * 说明
     */
    @Column(name = "SM")
    private String sm;

    /**
     * 审批结果
     */
    @Column(name = "SPJG")
    private String spjg;

    /**
     * 审批人
     */
    @Column(name = "SPR")
    private String spr;

    /**
     * 审批时间
     */
    @Column(name = "SPSJ")
    private String spsj;

    /**
     * 审批意见
     */
    @Column(name = "SPYJ")
    private String spyj;

    /**
     * 损失价值
     */
    @Column(name = "SSJZ")
    private Integer ssjz;

    /**
     * 条形码打印标识
     */
    @Column(name = "TXMDY")
    private String txmdy;

    /**
     * 单位网点代码
     */
    @Column(name = "WDID")
    private String wdid;

    /**
     * 挽回损失价值
     */
    @Column(name = "WHSSJZ")
    private Integer whssjz;

    /**
     * 物品编号
     */
    @Column(name = "WPBH")
    private String wpbh;

    /**
     * 物品产地
     */
    @Column(name = "WPCD")
    private String wpcd;

    /**
     * 拆分标识
     */
    @Column(name = "WPCFBS")
    private String wpcfbs;

    /**
     * 物品存放地
     */
    @Column(name = "WPCFD")
    private String wpcfd;

    /**
     * 经案物品－处理凭证编号
     */
    @Column(name = "WPCLPZBH")
    private String wpclpzbh;

    /**
     * 物品厂牌
     */
    @Column(name = "WPCP")
    private String wpcp;

    /**
     * 物品成色
     */
    @Column(name = "WPCS")
    private String wpcs;

    /**
     * 物品规格
     */
    @Column(name = "WPGG")
    private String wpgg;

    /**
     * 物品价值
     */
    @Column(name = "WPJZ")
    private Integer wpjz;

    /**
     * 物品类型
     */
    @Column(name = "WPLX")
    private String wplx;

    /**
     * 物品来源（文书）
     */
    @Column(name = "WPLY")
    private String wply;

    /**
     * 经案物品－来源凭单编号
     */
    @Column(name = "WPLYPDBH")
    private String wplypdbh;

    /**
     * 物品名称
     */
    @Column(name = "WPMC")
    private String wpmc;

    /**
     * 物品数量
     */
    @Column(name = "WPSL")
    private Integer wpsl;

    /**
     * 经侦物品属性
     */
    @Column(name = "WPSX")
    private String wpsx;

    /**
     * 物品式样
     */
    @Column(name = "WPSY")
    private String wpsy;

    @Column(name = "WPSZD")
    private String wpszd;

    /**
     * 物品型号
     */
    @Column(name = "WPXH")
    private String wpxh;

    /**
     * 物品性质
     */
    @Column(name = "WPXZ")
    private String wpxz;

    /**
     * 物品颜色
     */
    @Column(name = "WPYS")
    private String wpys;

    /**
     * 物品质地
     */
    @Column(name = "WPZD")
    private String wpzd;

    /**
     * 物品证据来源
     */
    @Column(name = "WPZJLY")
    private String wpzjly;

    /**
     * 物品重量/长度
     */
    @Column(name = "WPZLCD")
    private Integer wpzlcd;

    /**
     * 处理状态－物品状态
     */
    @Column(name = "WPZT")
    private String wpzt;

    /**
     * 经案文书名称
     */
    @Column(name = "WSMC")
    private String wsmc;

    /**
     * 涉案毒品－伪装品名
     */
    @Column(name = "WZPM")
    private String wzpm;

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
    private String xgsj;

    /**
     * 收费项目执行码
     */
    @Column(name = "XMDM")
    private String xmdm;

    /**
     * 收费项目名称
     */
    @Column(name = "XMMC")
    private String xmmc;

    /**
     * 涉案毒品－销售方向
     */
    @Column(name = "XSFX")
    private String xsfx;

    /**
     * 全票面校验码
     */
    @Column(name = "XYM")
    private String xym;

    /**
     * 发行单位
     */
    @Column(name = "YJZQFXDW")
    private String yjzqfxdw;

    /**
     * 发行日期
     */
    @Column(name = "YJZQFXRQ")
    private String yjzqfxrq;

    /**
     * 证券面值
     */
    @Column(name = "YJZQMZ")
    private Integer yjzqmz;

    /**
     * 原物品数量
     */
    @Column(name = "YWPSL")
    private Integer ywpsl;

    /**
     * 持有人
     */
    @Column(name = "YYR")
    private String yyr;

    /**
     * 涉案毒品－种毒目的
     */
    @Column(name = "ZDMD")
    private String zdmd;

    /**
     * 作废标识
     */
    @Column(name = "ZFBZ")
    private String zfbz;

    /**
     * 代理银行网点代码
     */
    @Column(name = "ZHDM")
    private String zhdm;

    /**
     * 追缴单位
     */
    @Column(name = "ZJDW")
    private String zjdw;

    /**
     * 追缴单位名称
     */
    @Column(name = "ZJDWMC")
    private String zjdwmc;

    /**
     * 证据类别－证据类别
     */
    @Column(name = "ZJLB")
    private String zjlb;

    /**
     * 经案物品－证据品质
     */
    @Column(name = "ZJPZ")
    private String zjpz;

    /**
     * 追缴时间
     */
    @Column(name = "ZJSJ")
    private String zjsj;

    /**
     * 物品重量/长度单位
     */
    @Column(name = "ZLCDDW")
    private String zlcddw;

    /**
     * 缴款方式
     */
    @Column(name = "ZPH")
    private String zph;

    /**
     * 物品状态标识
     */
    @Column(name = "ZTBS")
    private String ztbs;

    /**
     * 删除状态
     */
    @Column(name = "CITGC_DEL_FLAG")
    private String citgcDelFlag;

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
     * 获取物品案件编号
     *
     * @return AJBH - 物品案件编号
     */
    public String getAjbh() {
        return ajbh;
    }

    /**
     * 设置物品案件编号
     *
     * @param ajbh 物品案件编号
     */
    public void setAjbh(String ajbh) {
        this.ajbh = ajbh;
    }

    /**
     * 获取涉案车辆－被盗抢保险
     *
     * @return BDQX - 涉案车辆－被盗抢保险
     */
    public String getBdqx() {
        return bdqx;
    }

    /**
     * 设置涉案车辆－被盗抢保险
     *
     * @param bdqx 涉案车辆－被盗抢保险
     */
    public void setBdqx(String bdqx) {
        this.bdqx = bdqx;
    }

    /**
     * 获取被发还人
     *
     * @return BFHR - 被发还人
     */
    public String getBfhr() {
        return bfhr;
    }

    /**
     * 设置被发还人
     *
     * @param bfhr 被发还人
     */
    public void setBfhr(String bfhr) {
        this.bfhr = bfhr;
    }

    /**
     * 获取被发还人编号
     *
     * @return BFHRBH - 被发还人编号
     */
    public String getBfhrbh() {
        return bfhrbh;
    }

    /**
     * 设置被发还人编号
     *
     * @param bfhrbh 被发还人编号
     */
    public void setBfhrbh(String bfhrbh) {
        this.bfhrbh = bfhrbh;
    }

    /**
     * 获取被发还人类别
     *
     * @return BFHRLB - 被发还人类别
     */
    public String getBfhrlb() {
        return bfhrlb;
    }

    /**
     * 设置被发还人类别
     *
     * @param bfhrlb 被发还人类别
     */
    public void setBfhrlb(String bfhrlb) {
        this.bfhrlb = bfhrlb;
    }

    /**
     * 获取被发还人联系方式
     *
     * @return BFHRLXFS - 被发还人联系方式
     */
    public String getBfhrlxfs() {
        return bfhrlxfs;
    }

    /**
     * 设置被发还人联系方式
     *
     * @param bfhrlxfs 被发还人联系方式
     */
    public void setBfhrlxfs(String bfhrlxfs) {
        this.bfhrlxfs = bfhrlxfs;
    }

    /**
     * 获取编号二
     *
     * @return BHE - 编号二
     */
    public String getBhe() {
        return bhe;
    }

    /**
     * 设置编号二
     *
     * @param bhe 编号二
     */
    public void setBhe(String bhe) {
        this.bhe = bhe;
    }

    /**
     * 获取编号四
     *
     * @return BHHS - 编号四
     */
    public String getBhhs() {
        return bhhs;
    }

    /**
     * 设置编号四
     *
     * @param bhhs 编号四
     */
    public void setBhhs(String bhhs) {
        this.bhhs = bhhs;
    }

    /**
     * 获取编号三
     *
     * @return BHS - 编号三
     */
    public String getBhs() {
        return bhs;
    }

    /**
     * 设置编号三
     *
     * @param bhs 编号三
     */
    public void setBhs(String bhs) {
        this.bhs = bhs;
    }

    /**
     * 获取编号五
     *
     * @return BHW - 编号五
     */
    public String getBhw() {
        return bhw;
    }

    /**
     * 设置编号五
     *
     * @param bhw 编号五
     */
    public void setBhw(String bhw) {
        this.bhw = bhw;
    }

    /**
     * 获取编号一
     *
     * @return BHY - 编号一
     */
    public String getBhy() {
        return bhy;
    }

    /**
     * 设置编号一
     *
     * @param bhy 编号一
     */
    public void setBhy(String bhy) {
        this.bhy = bhy;
    }

    /**
     * 获取被扣押人
     *
     * @return BKYR - 被扣押人
     */
    public String getBkyr() {
        return bkyr;
    }

    /**
     * 设置被扣押人
     *
     * @param bkyr 被扣押人
     */
    public void setBkyr(String bkyr) {
        this.bkyr = bkyr;
    }

    /**
     * 获取涉案车辆－保险情况
     *
     * @return BXQK - 涉案车辆－保险情况
     */
    public String getBxqk() {
        return bxqk;
    }

    /**
     * 设置涉案车辆－保险情况
     *
     * @param bxqk 涉案车辆－保险情况
     */
    public void setBxqk(String bxqk) {
        this.bxqk = bxqk;
    }

    /**
     * 获取保证金上交标识
     *
     * @return BZJBS - 保证金上交标识
     */
    public String getBzjbs() {
        return bzjbs;
    }

    /**
     * 设置保证金上交标识
     *
     * @param bzjbs 保证金上交标识
     */
    public void setBzjbs(String bzjbs) {
        this.bzjbs = bzjbs;
    }

    /**
     * 获取涉案车辆－初次登记时间
     *
     * @return CCDJSJ - 涉案车辆－初次登记时间
     */
    public String getCcdjsj() {
        return ccdjsj;
    }

    /**
     * 设置涉案车辆－初次登记时间
     *
     * @param ccdjsj 涉案车辆－初次登记时间
     */
    public void setCcdjsj(String ccdjsj) {
        this.ccdjsj = ccdjsj;
    }

    /**
     * 获取涉案毒品－初查重量
     *
     * @return CCZL - 涉案毒品－初查重量
     */
    public Integer getCczl() {
        return cczl;
    }

    /**
     * 设置涉案毒品－初查重量
     *
     * @param cczl 涉案毒品－初查重量
     */
    public void setCczl(Integer cczl) {
        this.cczl = cczl;
    }

    /**
     * 获取拆分关联物品编号
     *
     * @return CFGLWPBH - 拆分关联物品编号
     */
    public String getCfglwpbh() {
        return cfglwpbh;
    }

    /**
     * 设置拆分关联物品编号
     *
     * @param cfglwpbh 拆分关联物品编号
     */
    public void setCfglwpbh(String cfglwpbh) {
        this.cfglwpbh = cfglwpbh;
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
     * 获取车架号
     *
     * @return CJH - 车架号
     */
    public String getCjh() {
        return cjh;
    }

    /**
     * 设置车架号
     *
     * @param cjh 车架号
     */
    public void setCjh(String cjh) {
        this.cjh = cjh;
    }

    /**
     * 获取物品出库类型
     *
     * @return CKLX - 物品出库类型
     */
    public String getCklx() {
        return cklx;
    }

    /**
     * 设置物品出库类型
     *
     * @param cklx 物品出库类型
     */
    public void setCklx(String cklx) {
        this.cklx = cklx;
    }

    /**
     * 获取处理单位
     *
     * @return CLDW - 处理单位
     */
    public String getCldw() {
        return cldw;
    }

    /**
     * 设置处理单位
     *
     * @param cldw 处理单位
     */
    public void setCldw(String cldw) {
        this.cldw = cldw;
    }

    /**
     * 获取处理单位名称
     *
     * @return CLDWMC - 处理单位名称
     */
    public String getCldwmc() {
        return cldwmc;
    }

    /**
     * 设置处理单位名称
     *
     * @param cldwmc 处理单位名称
     */
    public void setCldwmc(String cldwmc) {
        this.cldwmc = cldwmc;
    }

    /**
     * 获取涉案车辆－车辆类型
     *
     * @return CLLX - 涉案车辆－车辆类型
     */
    public String getCllx() {
        return cllx;
    }

    /**
     * 设置涉案车辆－车辆类型
     *
     * @param cllx 涉案车辆－车辆类型
     */
    public void setCllx(String cllx) {
        this.cllx = cllx;
    }

    /**
     * 获取处理情况－处理情况
     *
     * @return CLQK - 处理情况－处理情况
     */
    public String getClqk() {
        return clqk;
    }

    /**
     * 设置处理情况－处理情况
     *
     * @param clqk 处理情况－处理情况
     */
    public void setClqk(String clqk) {
        this.clqk = clqk;
    }

    /**
     * 获取处理日期
     *
     * @return CLRQ - 处理日期
     */
    public String getClrq() {
        return clrq;
    }

    /**
     * 设置处理日期
     *
     * @param clrq 处理日期
     */
    public void setClrq(String clrq) {
        this.clrq = clrq;
    }

    /**
     * 获取涉案枪支－持枪人单位
     *
     * @return CQRDW - 涉案枪支－持枪人单位
     */
    public String getCqrdw() {
        return cqrdw;
    }

    /**
     * 设置涉案枪支－持枪人单位
     *
     * @param cqrdw 涉案枪支－持枪人单位
     */
    public void setCqrdw(String cqrdw) {
        this.cqrdw = cqrdw;
    }

    /**
     * 获取涉案车辆－车身颜色
     *
     * @return CSYS - 涉案车辆－车身颜色
     */
    public String getCsys() {
        return csys;
    }

    /**
     * 设置涉案车辆－车身颜色
     *
     * @param csys 涉案车辆－车身颜色
     */
    public void setCsys(String csys) {
        this.csys = csys;
    }

    /**
     * @return CYRBH
     */
    public String getCyrbh() {
        return cyrbh;
    }

    /**
     * @param cyrbh
     */
    public void setCyrbh(String cyrbh) {
        this.cyrbh = cyrbh;
    }

    /**
     * @return CYRLB
     */
    public String getCyrlb() {
        return cyrlb;
    }

    /**
     * @param cyrlb
     */
    public void setCyrlb(String cyrlb) {
        this.cyrlb = cyrlb;
    }

    /**
     * @return CYRZJHM
     */
    public String getCyrzjhm() {
        return cyrzjhm;
    }

    /**
     * @param cyrzjhm
     */
    public void setCyrzjhm(String cyrzjhm) {
        this.cyrzjhm = cyrzjhm;
    }

    /**
     * 获取涉案车辆－车主地址
     *
     * @return CZDZ - 涉案车辆－车主地址
     */
    public String getCzdz() {
        return czdz;
    }

    /**
     * 设置涉案车辆－车主地址
     *
     * @param czdz 涉案车辆－车主地址
     */
    public void setCzdz(String czdz) {
        this.czdz = czdz;
    }

    /**
     * 获取涉案车辆－车主联系电话
     *
     * @return CZLXDH - 涉案车辆－车主联系电话
     */
    public String getCzlxdh() {
        return czlxdh;
    }

    /**
     * 设置涉案车辆－车主联系电话
     *
     * @param czlxdh 涉案车辆－车主联系电话
     */
    public void setCzlxdh(String czlxdh) {
        this.czlxdh = czlxdh;
    }

    /**
     * 获取涉案车辆车主身份证号
     *
     * @return CZSFZH - 涉案车辆车主身份证号
     */
    public String getCzsfzh() {
        return czsfzh;
    }

    /**
     * 设置涉案车辆车主身份证号
     *
     * @param czsfzh 涉案车辆车主身份证号
     */
    public void setCzsfzh(String czsfzh) {
        this.czsfzh = czsfzh;
    }

    /**
     * 获取涉案车辆－车主姓名
     *
     * @return CZXM - 涉案车辆－车主姓名
     */
    public String getCzxm() {
        return czxm;
    }

    /**
     * 设置涉案车辆－车主姓名
     *
     * @param czxm 涉案车辆－车主姓名
     */
    public void setCzxm(String czxm) {
        this.czxm = czxm;
    }

    /**
     * 获取开票人ID
     *
     * @return CZY - 开票人ID
     */
    public String getCzy() {
        return czy;
    }

    /**
     * 设置开票人ID
     *
     * @param czy 开票人ID
     */
    public void setCzy(String czy) {
        this.czy = czy;
    }

    /**
     * 获取开票人姓名
     *
     * @return CZYM - 开票人姓名
     */
    public String getCzym() {
        return czym;
    }

    /**
     * 设置开票人姓名
     *
     * @param czym 开票人姓名
     */
    public void setCzym(String czym) {
        this.czym = czym;
    }

    /**
     * 获取涉案毒品－查证重量
     *
     * @return CZZL - 涉案毒品－查证重量
     */
    public Integer getCzzl() {
        return czzl;
    }

    /**
     * 设置涉案毒品－查证重量
     *
     * @param czzl 涉案毒品－查证重量
     */
    public void setCzzl(Integer czzl) {
        this.czzl = czzl;
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
     * 获取涉案车辆电机号
     *
     * @return DJH - 涉案车辆电机号
     */
    public String getDjh() {
        return djh;
    }

    /**
     * 设置涉案车辆电机号
     *
     * @param djh 涉案车辆电机号
     */
    public void setDjh(String djh) {
        this.djh = djh;
    }

    /**
     * 获取登记人
     *
     * @return DJR - 登记人
     */
    public String getDjr() {
        return djr;
    }

    /**
     * 设置登记人
     *
     * @param djr 登记人
     */
    public void setDjr(String djr) {
        this.djr = djr;
    }

    /**
     * 获取登记人姓名
     *
     * @return DJRXM - 登记人姓名
     */
    public String getDjrxm() {
        return djrxm;
    }

    /**
     * 设置登记人姓名
     *
     * @param djrxm 登记人姓名
     */
    public void setDjrxm(String djrxm) {
        this.djrxm = djrxm;
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
     * 获取大厅模式
     *
     * @return DTBZ - 大厅模式
     */
    public String getDtbz() {
        return dtbz;
    }

    /**
     * 设置大厅模式
     *
     * @param dtbz 大厅模式
     */
    public void setDtbz(String dtbz) {
        this.dtbz = dtbz;
    }

    /**
     * 获取大厅单位代码
     *
     * @return DTDWDM - 大厅单位代码
     */
    public String getDtdwdm() {
        return dtdwdm;
    }

    /**
     * 设置大厅单位代码
     *
     * @param dtdwdm 大厅单位代码
     */
    public void setDtdwdm(String dtdwdm) {
        this.dtdwdm = dtdwdm;
    }

    /**
     * 获取付款人开户行
     *
     * @return FKKHH - 付款人开户行
     */
    public String getFkkhh() {
        return fkkhh;
    }

    /**
     * 设置付款人开户行
     *
     * @param fkkhh 付款人开户行
     */
    public void setFkkhh(String fkkhh) {
        this.fkkhh = fkkhh;
    }

    /**
     * 获取付款人
     *
     * @return FKR - 付款人
     */
    public String getFkr() {
        return fkr;
    }

    /**
     * 设置付款人
     *
     * @param fkr 付款人
     */
    public void setFkr(String fkr) {
        this.fkr = fkr;
    }

    /**
     * 获取付款人账号
     *
     * @return FKZH - 付款人账号
     */
    public String getFkzh() {
        return fkzh;
    }

    /**
     * 设置付款人账号
     *
     * @param fkzh 付款人账号
     */
    public void setFkzh(String fkzh) {
        this.fkzh = fkzh;
    }

    /**
     * 获取公告登记单位
     *
     * @return GGDJDW - 公告登记单位
     */
    public String getGgdjdw() {
        return ggdjdw;
    }

    /**
     * 设置公告登记单位
     *
     * @param ggdjdw 公告登记单位
     */
    public void setGgdjdw(String ggdjdw) {
        this.ggdjdw = ggdjdw;
    }

    /**
     * 获取公告登记人
     *
     * @return GGDJR - 公告登记人
     */
    public String getGgdjr() {
        return ggdjr;
    }

    /**
     * 设置公告登记人
     *
     * @param ggdjr 公告登记人
     */
    public void setGgdjr(String ggdjr) {
        this.ggdjr = ggdjr;
    }

    /**
     * 获取公告登记时间
     *
     * @return GGDJSJ - 公告登记时间
     */
    public String getGgdjsj() {
        return ggdjsj;
    }

    /**
     * 设置公告登记时间
     *
     * @param ggdjsj 公告登记时间
     */
    public void setGgdjsj(String ggdjsj) {
        this.ggdjsj = ggdjsj;
    }

    /**
     * 获取公告类型
     *
     * @return GGLX - 公告类型
     */
    public String getGglx() {
        return gglx;
    }

    /**
     * 设置公告类型
     *
     * @param gglx 公告类型
     */
    public void setGglx(String gglx) {
        this.gglx = gglx;
    }

    /**
     * 获取涉案毒品－购进价格
     *
     * @return GJJG - 涉案毒品－购进价格
     */
    public Integer getGjjg() {
        return gjjg;
    }

    /**
     * 设置涉案毒品－购进价格
     *
     * @param gjjg 涉案毒品－购进价格
     */
    public void setGjjg(Integer gjjg) {
        this.gjjg = gjjg;
    }

    /**
     * @return GJJG1
     */
    public Integer getGjjg1() {
        return gjjg1;
    }

    /**
     * @param gjjg1
     */
    public void setGjjg1(Integer gjjg1) {
        this.gjjg1 = gjjg1;
    }

    /**
     * 获取关联物品编号－WP_JDC车辆编号
     *
     * @return GLBH - 关联物品编号－WP_JDC车辆编号
     */
    public String getGlbh() {
        return glbh;
    }

    /**
     * 设置关联物品编号－WP_JDC车辆编号
     *
     * @param glbh 关联物品编号－WP_JDC车辆编号
     */
    public void setGlbh(String glbh) {
        this.glbh = glbh;
    }

    /**
     * 获取关联原物品编号
     *
     * @return GLYWPBH - 关联原物品编号
     */
    public String getGlywpbh() {
        return glywpbh;
    }

    /**
     * 设置关联原物品编号
     *
     * @param glywpbh 关联原物品编号
     */
    public void setGlywpbh(String glywpbh) {
        this.glywpbh = glywpbh;
    }

    /**
     * 获取购买日期
     *
     * @return GMRQ - 购买日期
     */
    public String getGmrq() {
        return gmrq;
    }

    /**
     * 设置购买日期
     *
     * @param gmrq 购买日期
     */
    public void setGmrq(String gmrq) {
        this.gmrq = gmrq;
    }

    /**
     * 获取涉案物品手机号码归属地
     *
     * @return GSDMC - 涉案物品手机号码归属地
     */
    public String getGsdmc() {
        return gsdmc;
    }

    /**
     * 设置涉案物品手机号码归属地
     *
     * @param gsdmc 涉案物品手机号码归属地
     */
    public void setGsdmc(String gsdmc) {
        this.gsdmc = gsdmc;
    }

    /**
     * 获取合计金额
     *
     * @return HJJE - 合计金额
     */
    public Integer getHjje() {
        return hjje;
    }

    /**
     * 设置合计金额
     *
     * @param hjje 合计金额
     */
    public void setHjje(Integer hjje) {
        this.hjje = hjje;
    }

    /**
     * 获取涉案车辆－号牌种类
     *
     * @return HPZL - 涉案车辆－号牌种类
     */
    public String getHpzl() {
        return hpzl;
    }

    /**
     * 设置涉案车辆－号牌种类
     *
     * @param hpzl 涉案车辆－号牌种类
     */
    public void setHpzl(String hpzl) {
        this.hpzl = hpzl;
    }

    /**
     * 获取毒品鉴定种类
     *
     * @return JDDPZL - 毒品鉴定种类
     */
    public String getJddpzl() {
        return jddpzl;
    }

    /**
     * 设置毒品鉴定种类
     *
     * @param jddpzl 毒品鉴定种类
     */
    public void setJddpzl(String jddpzl) {
        this.jddpzl = jddpzl;
    }

    /**
     * 获取金额
     *
     * @return JE - 金额
     */
    public Integer getJe() {
        return je;
    }

    /**
     * 设置金额
     *
     * @param je 金额
     */
    public void setJe(Integer je) {
        this.je = je;
    }

    /**
     * 获取涉案毒品－缴获重量
     *
     * @return JHZL - 涉案毒品－缴获重量
     */
    public Integer getJhzl() {
        return jhzl;
    }

    /**
     * 设置涉案毒品－缴获重量
     *
     * @param jhzl 涉案毒品－缴获重量
     */
    public void setJhzl(Integer jhzl) {
        this.jhzl = jhzl;
    }

    /**
     * 获取缴款书编号
     *
     * @return JKSBH - 缴款书编号
     */
    public String getJksbh() {
        return jksbh;
    }

    /**
     * 设置缴款书编号
     *
     * @param jksbh 缴款书编号
     */
    public void setJksbh(String jksbh) {
        this.jksbh = jksbh;
    }

    /**
     * 获取计量单位
     *
     * @return JLDW - 计量单位
     */
    public String getJldw() {
        return jldw;
    }

    /**
     * 设置计量单位
     *
     * @param jldw 计量单位
     */
    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    /**
     * 获取简要说明
     *
     * @return JYSM - 简要说明
     */
    public String getJysm() {
        return jysm;
    }

    /**
     * 设置简要说明
     *
     * @param jysm 简要说明
     */
    public void setJysm(String jysm) {
        this.jysm = jysm;
    }

    /**
     * 获取扣押财物保管人
     *
     * @return KYCWBGR - 扣押财物保管人
     */
    public String getKycwbgr() {
        return kycwbgr;
    }

    /**
     * 设置扣押财物保管人
     *
     * @param kycwbgr 扣押财物保管人
     */
    public void setKycwbgr(String kycwbgr) {
        this.kycwbgr = kycwbgr;
    }

    /**
     * 获取扣押单位
     *
     * @return KYDW - 扣押单位
     */
    public String getKydw() {
        return kydw;
    }

    /**
     * 设置扣押单位
     *
     * @param kydw 扣押单位
     */
    public void setKydw(String kydw) {
        this.kydw = kydw;
    }

    /**
     * 获取扣押人
     *
     * @return KYR - 扣押人
     */
    public String getKyr() {
        return kyr;
    }

    /**
     * 设置扣押人
     *
     * @param kyr 扣押人
     */
    public void setKyr(String kyr) {
        this.kyr = kyr;
    }

    /**
     * 获取扣押时间
     *
     * @return KYSJ - 扣押时间
     */
    public String getKysj() {
        return kysj;
    }

    /**
     * 设置扣押时间
     *
     * @param kysj 扣押时间
     */
    public void setKysj(String kysj) {
        this.kysj = kysj;
    }

    /**
     * 获取涉案毒品－来源地
     *
     * @return LYD - 涉案毒品－来源地
     */
    public String getLyd() {
        return lyd;
    }

    /**
     * 设置涉案毒品－来源地
     *
     * @param lyd 涉案毒品－来源地
     */
    public void setLyd(String lyd) {
        this.lyd = lyd;
    }

    /**
     * 获取涉案毒品－卖出价格
     *
     * @return MCJG - 涉案毒品－卖出价格
     */
    public Integer getMcjg() {
        return mcjg;
    }

    /**
     * 设置涉案毒品－卖出价格
     *
     * @param mcjg 涉案毒品－卖出价格
     */
    public void setMcjg(Integer mcjg) {
        this.mcjg = mcjg;
    }

    /**
     * 获取明细序号
     *
     * @return MXID - 明细序号
     */
    public String getMxid() {
        return mxid;
    }

    /**
     * 设置明细序号
     *
     * @param mxid 明细序号
     */
    public void setMxid(String mxid) {
        this.mxid = mxid;
    }

    /**
     * 获取票据号码
     *
     * @return PJHM - 票据号码
     */
    public String getPjhm() {
        return pjhm;
    }

    /**
     * 设置票据号码
     *
     * @param pjhm 票据号码
     */
    public void setPjhm(String pjhm) {
        this.pjhm = pjhm;
    }

    /**
     * 获取票据类型
     *
     * @return PJLX - 票据类型
     */
    public String getPjlx() {
        return pjlx;
    }

    /**
     * 设置票据类型
     *
     * @param pjlx 票据类型
     */
    public void setPjlx(String pjlx) {
        this.pjlx = pjlx;
    }

    /**
     * 获取批准发还时间
     *
     * @return PZFHSJ - 批准发还时间
     */
    public String getPzfhsj() {
        return pzfhsj;
    }

    /**
     * 设置批准发还时间
     *
     * @param pzfhsj 批准发还时间
     */
    public void setPzfhsj(String pzfhsj) {
        this.pzfhsj = pzfhsj;
    }

    /**
     * 获取发行期限
     *
     * @return QX - 发行期限
     */
    public String getQx() {
        return qx;
    }

    /**
     * 设置发行期限
     *
     * @param qx 发行期限
     */
    public void setQx(String qx) {
        this.qx = qx;
    }

    /**
     * 获取涉案枪支－发证日期
     *
     * @return QZFZRQ - 涉案枪支－发证日期
     */
    public String getQzfzrq() {
        return qzfzrq;
    }

    /**
     * 设置涉案枪支－发证日期
     *
     * @param qzfzrq 涉案枪支－发证日期
     */
    public void setQzfzrq(String qzfzrq) {
        this.qzfzrq = qzfzrq;
    }

    /**
     * 获取涉案枪支－口径
     *
     * @return QZKJ - 涉案枪支－口径
     */
    public Integer getQzkj() {
        return qzkj;
    }

    /**
     * 设置涉案枪支－口径
     *
     * @param qzkj 涉案枪支－口径
     */
    public void setQzkj(Integer qzkj) {
        this.qzkj = qzkj;
    }

    /**
     * 获取涉案枪支－枪支子弹数目
     *
     * @return QZZDSM - 涉案枪支－枪支子弹数目
     */
    public Integer getQzzdsm() {
        return qzzdsm;
    }

    /**
     * 设置涉案枪支－枪支子弹数目
     *
     * @param qzzdsm 涉案枪支－枪支子弹数目
     */
    public void setQzzdsm(Integer qzzdsm) {
        this.qzzdsm = qzzdsm;
    }

    /**
     * 获取物品入库类型
     *
     * @return RKLX - 物品入库类型
     */
    public String getRklx() {
        return rklx;
    }

    /**
     * 设置物品入库类型
     *
     * @param rklx 物品入库类型
     */
    public void setRklx(String rklx) {
        this.rklx = rklx;
    }

    /**
     * 获取物品入库时间
     *
     * @return RKSJ - 物品入库时间
     */
    public String getRksj() {
        return rksj;
    }

    /**
     * 设置物品入库时间
     *
     * @param rksj 物品入库时间
     */
    public void setRksj(String rksj) {
        this.rksj = rksj;
    }

    /**
     * 获取物品人员编号
     *
     * @return RYBH - 物品人员编号
     */
    public String getRybh() {
        return rybh;
    }

    /**
     * 设置物品人员编号
     *
     * @param rybh 物品人员编号
     */
    public void setRybh(String rybh) {
        this.rybh = rybh;
    }

    /**
     * 获取物品出库时间
     *
     * @return CKSJ - 物品出库时间
     */
    public String getCksj() {
        return cksj;
    }

    /**
     * 设置物品出库时间
     *
     * @param cksj 物品出库时间
     */
    public void setCksj(String cksj) {
        this.cksj = cksj;
    }

    /**
     * 获取涉案物品来源－物品来源
     *
     * @return SAWPLY - 涉案物品来源－物品来源
     */
    public String getSawply() {
        return sawply;
    }

    /**
     * 设置涉案物品来源－物品来源
     *
     * @param sawply 涉案物品来源－物品来源
     */
    public void setSawply(String sawply) {
        this.sawply = sawply;
    }

    /**
     * 获取收费标准
     *
     * @return SFBZ - 收费标准
     */
    public String getSfbz() {
        return sfbz;
    }

    /**
     * 设置收费标准
     *
     * @param sfbz 收费标准
     */
    public void setSfbz(String sfbz) {
        this.sfbz = sfbz;
    }

    /**
     * 获取是否公告
     *
     * @return SFGG - 是否公告
     */
    public String getSfgg() {
        return sfgg;
    }

    /**
     * 设置是否公告
     *
     * @param sfgg 是否公告
     */
    public void setSfgg(String sfgg) {
        this.sfgg = sfgg;
    }

    /**
     * 获取审批结果
     *
     * @return SHJG - 审批结果
     */
    public String getShjg() {
        return shjg;
    }

    /**
     * 设置审批结果
     *
     * @param shjg 审批结果
     */
    public void setShjg(String shjg) {
        this.shjg = shjg;
    }

    /**
     * 获取审核人
     *
     * @return SHR - 审核人
     */
    public String getShr() {
        return shr;
    }

    /**
     * 设置审核人
     *
     * @param shr 审核人
     */
    public void setShr(String shr) {
        this.shr = shr;
    }

    /**
     * 获取审核时间
     *
     * @return SHSJ - 审核时间
     */
    public String getShsj() {
        return shsj;
    }

    /**
     * 设置审核时间
     *
     * @param shsj 审核时间
     */
    public void setShsj(String shsj) {
        this.shsj = shsj;
    }

    /**
     * 获取审核意见
     *
     * @return SHYJ - 审核意见
     */
    public String getShyj() {
        return shyj;
    }

    /**
     * 设置审核意见
     *
     * @param shyj 审核意见
     */
    public void setShyj(String shyj) {
        this.shyj = shyj;
    }

    /**
     * 获取收据编号
     *
     * @return SJBH - 收据编号
     */
    public String getSjbh() {
        return sjbh;
    }

    /**
     * 设置收据编号
     *
     * @param sjbh 收据编号
     */
    public void setSjbh(String sjbh) {
        this.sjbh = sjbh;
    }

    /**
     * 获取收款人开户行
     *
     * @return SKKHH - 收款人开户行
     */
    public String getSkkhh() {
        return skkhh;
    }

    /**
     * 设置收款人开户行
     *
     * @param skkhh 收款人开户行
     */
    public void setSkkhh(String skkhh) {
        this.skkhh = skkhh;
    }

    /**
     * 获取收款人
     *
     * @return SKR - 收款人
     */
    public String getSkr() {
        return skr;
    }

    /**
     * 设置收款人
     *
     * @param skr 收款人
     */
    public void setSkr(String skr) {
        this.skr = skr;
    }

    /**
     * 获取收款日期
     *
     * @return SKRQ - 收款日期
     */
    public String getSkrq() {
        return skrq;
    }

    /**
     * 设置收款日期
     *
     * @param skrq 收款日期
     */
    public void setSkrq(String skrq) {
        this.skrq = skrq;
    }

    /**
     * 获取收款人账号
     *
     * @return SKZH - 收款人账号
     */
    public String getSkzh() {
        return skzh;
    }

    /**
     * 设置收款人账号
     *
     * @param skzh 收款人账号
     */
    public void setSkzh(String skzh) {
        this.skzh = skzh;
    }

    /**
     * 获取物品数量单位
     *
     * @return SLDW - 物品数量单位
     */
    public String getSldw() {
        return sldw;
    }

    /**
     * 设置物品数量单位
     *
     * @param sldw 物品数量单位
     */
    public void setSldw(String sldw) {
        this.sldw = sldw;
    }

    /**
     * 获取说明
     *
     * @return SM - 说明
     */
    public String getSm() {
        return sm;
    }

    /**
     * 设置说明
     *
     * @param sm 说明
     */
    public void setSm(String sm) {
        this.sm = sm;
    }

    /**
     * 获取审批结果
     *
     * @return SPJG - 审批结果
     */
    public String getSpjg() {
        return spjg;
    }

    /**
     * 设置审批结果
     *
     * @param spjg 审批结果
     */
    public void setSpjg(String spjg) {
        this.spjg = spjg;
    }

    /**
     * 获取审批人
     *
     * @return SPR - 审批人
     */
    public String getSpr() {
        return spr;
    }

    /**
     * 设置审批人
     *
     * @param spr 审批人
     */
    public void setSpr(String spr) {
        this.spr = spr;
    }

    /**
     * 获取审批时间
     *
     * @return SPSJ - 审批时间
     */
    public String getSpsj() {
        return spsj;
    }

    /**
     * 设置审批时间
     *
     * @param spsj 审批时间
     */
    public void setSpsj(String spsj) {
        this.spsj = spsj;
    }

    /**
     * 获取审批意见
     *
     * @return SPYJ - 审批意见
     */
    public String getSpyj() {
        return spyj;
    }

    /**
     * 设置审批意见
     *
     * @param spyj 审批意见
     */
    public void setSpyj(String spyj) {
        this.spyj = spyj;
    }

    /**
     * 获取损失价值
     *
     * @return SSJZ - 损失价值
     */
    public Integer getSsjz() {
        return ssjz;
    }

    /**
     * 设置损失价值
     *
     * @param ssjz 损失价值
     */
    public void setSsjz(Integer ssjz) {
        this.ssjz = ssjz;
    }

    /**
     * 获取条形码打印标识
     *
     * @return TXMDY - 条形码打印标识
     */
    public String getTxmdy() {
        return txmdy;
    }

    /**
     * 设置条形码打印标识
     *
     * @param txmdy 条形码打印标识
     */
    public void setTxmdy(String txmdy) {
        this.txmdy = txmdy;
    }

    /**
     * 获取单位网点代码
     *
     * @return WDID - 单位网点代码
     */
    public String getWdid() {
        return wdid;
    }

    /**
     * 设置单位网点代码
     *
     * @param wdid 单位网点代码
     */
    public void setWdid(String wdid) {
        this.wdid = wdid;
    }

    /**
     * 获取挽回损失价值
     *
     * @return WHSSJZ - 挽回损失价值
     */
    public Integer getWhssjz() {
        return whssjz;
    }

    /**
     * 设置挽回损失价值
     *
     * @param whssjz 挽回损失价值
     */
    public void setWhssjz(Integer whssjz) {
        this.whssjz = whssjz;
    }

    /**
     * 获取物品编号
     *
     * @return WPBH - 物品编号
     */
    public String getWpbh() {
        return wpbh;
    }

    /**
     * 设置物品编号
     *
     * @param wpbh 物品编号
     */
    public void setWpbh(String wpbh) {
        this.wpbh = wpbh;
    }

    /**
     * 获取物品产地
     *
     * @return WPCD - 物品产地
     */
    public String getWpcd() {
        return wpcd;
    }

    /**
     * 设置物品产地
     *
     * @param wpcd 物品产地
     */
    public void setWpcd(String wpcd) {
        this.wpcd = wpcd;
    }

    /**
     * 获取拆分标识
     *
     * @return WPCFBS - 拆分标识
     */
    public String getWpcfbs() {
        return wpcfbs;
    }

    /**
     * 设置拆分标识
     *
     * @param wpcfbs 拆分标识
     */
    public void setWpcfbs(String wpcfbs) {
        this.wpcfbs = wpcfbs;
    }

    /**
     * 获取物品存放地
     *
     * @return WPCFD - 物品存放地
     */
    public String getWpcfd() {
        return wpcfd;
    }

    /**
     * 设置物品存放地
     *
     * @param wpcfd 物品存放地
     */
    public void setWpcfd(String wpcfd) {
        this.wpcfd = wpcfd;
    }

    /**
     * 获取经案物品－处理凭证编号
     *
     * @return WPCLPZBH - 经案物品－处理凭证编号
     */
    public String getWpclpzbh() {
        return wpclpzbh;
    }

    /**
     * 设置经案物品－处理凭证编号
     *
     * @param wpclpzbh 经案物品－处理凭证编号
     */
    public void setWpclpzbh(String wpclpzbh) {
        this.wpclpzbh = wpclpzbh;
    }

    /**
     * 获取物品厂牌
     *
     * @return WPCP - 物品厂牌
     */
    public String getWpcp() {
        return wpcp;
    }

    /**
     * 设置物品厂牌
     *
     * @param wpcp 物品厂牌
     */
    public void setWpcp(String wpcp) {
        this.wpcp = wpcp;
    }

    /**
     * 获取物品成色
     *
     * @return WPCS - 物品成色
     */
    public String getWpcs() {
        return wpcs;
    }

    /**
     * 设置物品成色
     *
     * @param wpcs 物品成色
     */
    public void setWpcs(String wpcs) {
        this.wpcs = wpcs;
    }

    /**
     * 获取物品规格
     *
     * @return WPGG - 物品规格
     */
    public String getWpgg() {
        return wpgg;
    }

    /**
     * 设置物品规格
     *
     * @param wpgg 物品规格
     */
    public void setWpgg(String wpgg) {
        this.wpgg = wpgg;
    }

    /**
     * 获取物品价值
     *
     * @return WPJZ - 物品价值
     */
    public Integer getWpjz() {
        return wpjz;
    }

    /**
     * 设置物品价值
     *
     * @param wpjz 物品价值
     */
    public void setWpjz(Integer wpjz) {
        this.wpjz = wpjz;
    }

    /**
     * 获取物品类型
     *
     * @return WPLX - 物品类型
     */
    public String getWplx() {
        return wplx;
    }

    /**
     * 设置物品类型
     *
     * @param wplx 物品类型
     */
    public void setWplx(String wplx) {
        this.wplx = wplx;
    }

    /**
     * 获取物品来源（文书）
     *
     * @return WPLY - 物品来源（文书）
     */
    public String getWply() {
        return wply;
    }

    /**
     * 设置物品来源（文书）
     *
     * @param wply 物品来源（文书）
     */
    public void setWply(String wply) {
        this.wply = wply;
    }

    /**
     * 获取经案物品－来源凭单编号
     *
     * @return WPLYPDBH - 经案物品－来源凭单编号
     */
    public String getWplypdbh() {
        return wplypdbh;
    }

    /**
     * 设置经案物品－来源凭单编号
     *
     * @param wplypdbh 经案物品－来源凭单编号
     */
    public void setWplypdbh(String wplypdbh) {
        this.wplypdbh = wplypdbh;
    }

    /**
     * 获取物品名称
     *
     * @return WPMC - 物品名称
     */
    public String getWpmc() {
        return wpmc;
    }

    /**
     * 设置物品名称
     *
     * @param wpmc 物品名称
     */
    public void setWpmc(String wpmc) {
        this.wpmc = wpmc;
    }

    /**
     * 获取物品数量
     *
     * @return WPSL - 物品数量
     */
    public Integer getWpsl() {
        return wpsl;
    }

    /**
     * 设置物品数量
     *
     * @param wpsl 物品数量
     */
    public void setWpsl(Integer wpsl) {
        this.wpsl = wpsl;
    }

    /**
     * 获取经侦物品属性
     *
     * @return WPSX - 经侦物品属性
     */
    public String getWpsx() {
        return wpsx;
    }

    /**
     * 设置经侦物品属性
     *
     * @param wpsx 经侦物品属性
     */
    public void setWpsx(String wpsx) {
        this.wpsx = wpsx;
    }

    /**
     * 获取物品式样
     *
     * @return WPSY - 物品式样
     */
    public String getWpsy() {
        return wpsy;
    }

    /**
     * 设置物品式样
     *
     * @param wpsy 物品式样
     */
    public void setWpsy(String wpsy) {
        this.wpsy = wpsy;
    }

    /**
     * @return WPSZD
     */
    public String getWpszd() {
        return wpszd;
    }

    /**
     * @param wpszd
     */
    public void setWpszd(String wpszd) {
        this.wpszd = wpszd;
    }

    /**
     * 获取物品型号
     *
     * @return WPXH - 物品型号
     */
    public String getWpxh() {
        return wpxh;
    }

    /**
     * 设置物品型号
     *
     * @param wpxh 物品型号
     */
    public void setWpxh(String wpxh) {
        this.wpxh = wpxh;
    }

    /**
     * 获取物品性质
     *
     * @return WPXZ - 物品性质
     */
    public String getWpxz() {
        return wpxz;
    }

    /**
     * 设置物品性质
     *
     * @param wpxz 物品性质
     */
    public void setWpxz(String wpxz) {
        this.wpxz = wpxz;
    }

    /**
     * 获取物品颜色
     *
     * @return WPYS - 物品颜色
     */
    public String getWpys() {
        return wpys;
    }

    /**
     * 设置物品颜色
     *
     * @param wpys 物品颜色
     */
    public void setWpys(String wpys) {
        this.wpys = wpys;
    }

    /**
     * 获取物品质地
     *
     * @return WPZD - 物品质地
     */
    public String getWpzd() {
        return wpzd;
    }

    /**
     * 设置物品质地
     *
     * @param wpzd 物品质地
     */
    public void setWpzd(String wpzd) {
        this.wpzd = wpzd;
    }

    /**
     * 获取物品证据来源
     *
     * @return WPZJLY - 物品证据来源
     */
    public String getWpzjly() {
        return wpzjly;
    }

    /**
     * 设置物品证据来源
     *
     * @param wpzjly 物品证据来源
     */
    public void setWpzjly(String wpzjly) {
        this.wpzjly = wpzjly;
    }

    /**
     * 获取物品重量/长度
     *
     * @return WPZLCD - 物品重量/长度
     */
    public Integer getWpzlcd() {
        return wpzlcd;
    }

    /**
     * 设置物品重量/长度
     *
     * @param wpzlcd 物品重量/长度
     */
    public void setWpzlcd(Integer wpzlcd) {
        this.wpzlcd = wpzlcd;
    }

    /**
     * 获取处理状态－物品状态
     *
     * @return WPZT - 处理状态－物品状态
     */
    public String getWpzt() {
        return wpzt;
    }

    /**
     * 设置处理状态－物品状态
     *
     * @param wpzt 处理状态－物品状态
     */
    public void setWpzt(String wpzt) {
        this.wpzt = wpzt;
    }

    /**
     * 获取经案文书名称
     *
     * @return WSMC - 经案文书名称
     */
    public String getWsmc() {
        return wsmc;
    }

    /**
     * 设置经案文书名称
     *
     * @param wsmc 经案文书名称
     */
    public void setWsmc(String wsmc) {
        this.wsmc = wsmc;
    }

    /**
     * 获取涉案毒品－伪装品名
     *
     * @return WZPM - 涉案毒品－伪装品名
     */
    public String getWzpm() {
        return wzpm;
    }

    /**
     * 设置涉案毒品－伪装品名
     *
     * @param wzpm 涉案毒品－伪装品名
     */
    public void setWzpm(String wzpm) {
        this.wzpm = wzpm;
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
    public String getXgsj() {
        return xgsj;
    }

    /**
     * 设置修改时间
     *
     * @param xgsj 修改时间
     */
    public void setXgsj(String xgsj) {
        this.xgsj = xgsj;
    }

    /**
     * 获取收费项目执行码
     *
     * @return XMDM - 收费项目执行码
     */
    public String getXmdm() {
        return xmdm;
    }

    /**
     * 设置收费项目执行码
     *
     * @param xmdm 收费项目执行码
     */
    public void setXmdm(String xmdm) {
        this.xmdm = xmdm;
    }

    /**
     * 获取收费项目名称
     *
     * @return XMMC - 收费项目名称
     */
    public String getXmmc() {
        return xmmc;
    }

    /**
     * 设置收费项目名称
     *
     * @param xmmc 收费项目名称
     */
    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    /**
     * 获取涉案毒品－销售方向
     *
     * @return XSFX - 涉案毒品－销售方向
     */
    public String getXsfx() {
        return xsfx;
    }

    /**
     * 设置涉案毒品－销售方向
     *
     * @param xsfx 涉案毒品－销售方向
     */
    public void setXsfx(String xsfx) {
        this.xsfx = xsfx;
    }

    /**
     * 获取全票面校验码
     *
     * @return XYM - 全票面校验码
     */
    public String getXym() {
        return xym;
    }

    /**
     * 设置全票面校验码
     *
     * @param xym 全票面校验码
     */
    public void setXym(String xym) {
        this.xym = xym;
    }

    /**
     * 获取发行单位
     *
     * @return YJZQFXDW - 发行单位
     */
    public String getYjzqfxdw() {
        return yjzqfxdw;
    }

    /**
     * 设置发行单位
     *
     * @param yjzqfxdw 发行单位
     */
    public void setYjzqfxdw(String yjzqfxdw) {
        this.yjzqfxdw = yjzqfxdw;
    }

    /**
     * 获取发行日期
     *
     * @return YJZQFXRQ - 发行日期
     */
    public String getYjzqfxrq() {
        return yjzqfxrq;
    }

    /**
     * 设置发行日期
     *
     * @param yjzqfxrq 发行日期
     */
    public void setYjzqfxrq(String yjzqfxrq) {
        this.yjzqfxrq = yjzqfxrq;
    }

    /**
     * 获取证券面值
     *
     * @return YJZQMZ - 证券面值
     */
    public Integer getYjzqmz() {
        return yjzqmz;
    }

    /**
     * 设置证券面值
     *
     * @param yjzqmz 证券面值
     */
    public void setYjzqmz(Integer yjzqmz) {
        this.yjzqmz = yjzqmz;
    }

    /**
     * 获取原物品数量
     *
     * @return YWPSL - 原物品数量
     */
    public Integer getYwpsl() {
        return ywpsl;
    }

    /**
     * 设置原物品数量
     *
     * @param ywpsl 原物品数量
     */
    public void setYwpsl(Integer ywpsl) {
        this.ywpsl = ywpsl;
    }

    /**
     * 获取持有人
     *
     * @return YYR - 持有人
     */
    public String getYyr() {
        return yyr;
    }

    /**
     * 设置持有人
     *
     * @param yyr 持有人
     */
    public void setYyr(String yyr) {
        this.yyr = yyr;
    }

    /**
     * 获取涉案毒品－种毒目的
     *
     * @return ZDMD - 涉案毒品－种毒目的
     */
    public String getZdmd() {
        return zdmd;
    }

    /**
     * 设置涉案毒品－种毒目的
     *
     * @param zdmd 涉案毒品－种毒目的
     */
    public void setZdmd(String zdmd) {
        this.zdmd = zdmd;
    }

    /**
     * 获取作废标识
     *
     * @return ZFBZ - 作废标识
     */
    public String getZfbz() {
        return zfbz;
    }

    /**
     * 设置作废标识
     *
     * @param zfbz 作废标识
     */
    public void setZfbz(String zfbz) {
        this.zfbz = zfbz;
    }

    /**
     * 获取代理银行网点代码
     *
     * @return ZHDM - 代理银行网点代码
     */
    public String getZhdm() {
        return zhdm;
    }

    /**
     * 设置代理银行网点代码
     *
     * @param zhdm 代理银行网点代码
     */
    public void setZhdm(String zhdm) {
        this.zhdm = zhdm;
    }

    /**
     * 获取追缴单位
     *
     * @return ZJDW - 追缴单位
     */
    public String getZjdw() {
        return zjdw;
    }

    /**
     * 设置追缴单位
     *
     * @param zjdw 追缴单位
     */
    public void setZjdw(String zjdw) {
        this.zjdw = zjdw;
    }

    /**
     * 获取追缴单位名称
     *
     * @return ZJDWMC - 追缴单位名称
     */
    public String getZjdwmc() {
        return zjdwmc;
    }

    /**
     * 设置追缴单位名称
     *
     * @param zjdwmc 追缴单位名称
     */
    public void setZjdwmc(String zjdwmc) {
        this.zjdwmc = zjdwmc;
    }

    /**
     * 获取证据类别－证据类别
     *
     * @return ZJLB - 证据类别－证据类别
     */
    public String getZjlb() {
        return zjlb;
    }

    /**
     * 设置证据类别－证据类别
     *
     * @param zjlb 证据类别－证据类别
     */
    public void setZjlb(String zjlb) {
        this.zjlb = zjlb;
    }

    /**
     * 获取经案物品－证据品质
     *
     * @return ZJPZ - 经案物品－证据品质
     */
    public String getZjpz() {
        return zjpz;
    }

    /**
     * 设置经案物品－证据品质
     *
     * @param zjpz 经案物品－证据品质
     */
    public void setZjpz(String zjpz) {
        this.zjpz = zjpz;
    }

    /**
     * 获取追缴时间
     *
     * @return ZJSJ - 追缴时间
     */
    public String getZjsj() {
        return zjsj;
    }

    /**
     * 设置追缴时间
     *
     * @param zjsj 追缴时间
     */
    public void setZjsj(String zjsj) {
        this.zjsj = zjsj;
    }

    /**
     * 获取物品重量/长度单位
     *
     * @return ZLCDDW - 物品重量/长度单位
     */
    public String getZlcddw() {
        return zlcddw;
    }

    /**
     * 设置物品重量/长度单位
     *
     * @param zlcddw 物品重量/长度单位
     */
    public void setZlcddw(String zlcddw) {
        this.zlcddw = zlcddw;
    }

    /**
     * 获取缴款方式
     *
     * @return ZPH - 缴款方式
     */
    public String getZph() {
        return zph;
    }

    /**
     * 设置缴款方式
     *
     * @param zph 缴款方式
     */
    public void setZph(String zph) {
        this.zph = zph;
    }

    /**
     * 获取物品状态标识
     *
     * @return ZTBS - 物品状态标识
     */
    public String getZtbs() {
        return ztbs;
    }

    /**
     * 设置物品状态标识
     *
     * @param ztbs 物品状态标识
     */
    public void setZtbs(String ztbs) {
        this.ztbs = ztbs;
    }

    /**
     * 获取删除状态
     *
     * @return CITGC_DEL_FLAG - 删除状态
     */
    public String getCitgcDelFlag() {
        return citgcDelFlag;
    }

    /**
     * 设置删除状态
     *
     * @param citgcDelFlag 删除状态
     */
    public void setCitgcDelFlag(String citgcDelFlag) {
        this.citgcDelFlag = citgcDelFlag;
    }
}