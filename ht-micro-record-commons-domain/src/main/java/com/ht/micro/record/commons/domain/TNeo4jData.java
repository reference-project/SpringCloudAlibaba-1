package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_neo4j_data")
public class TNeo4jData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 接警编号
     */
    private String jjbh;

    /**
     * 处警类别
     */
    private String cjlb;

    /**
     * 支付宝
     */
    private String alipay;

    /**
     * 身份证
     */
    @Column(name = "id_card")
    private String idCard;

    /**
     * 银行卡号
     */
    private String bank;

    /**
     * 邮箱
     */
    @Column(name = "e_mail")
    private String eMail;

    /**
     * 电瓶车车架号
     */
    @Column(name = "frameEbike")
    private String frameebike;

    /**
     * 手机
     */
    private String phone;

    /**
     * 汽车车牌
     */
    @Column(name = "plate_car")
    private String plateCar;

    /**
     * 电瓶车车牌
     */
    @Column(name = "plateEbike")
    private String plateebike;

    /**
     * QQ号
     */
    private String qq;

    /**
     * 电话
     */
    private String tel;

    /**
     * 网址
     */
    private String website;

    /**
     * 微信账号
     */
    private String wechat;

    /**
     * 直播YY号
     */
    private String yy;

    /**
     * 摩托车牌
     */
    @Column(name = "motorCycle")
    private String motorcycle;

    /**
     * 处警单位名称
     */
    private String cjdwmc;

    /**
     * 评估类型
     */
    private String pglx;

    /**
     * 接警时间
     */
    private Date jjsj;

    /**
     * 发案详地
     */
    private String faxz;

    /**
     * 处警时间
     */
    private Date cjsj;

    /**
     * 处理结果
     */
    private String jieguo;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
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
     * 获取支付宝
     *
     * @return alipay - 支付宝
     */
    public String getAlipay() {
        return alipay;
    }

    /**
     * 设置支付宝
     *
     * @param alipay 支付宝
     */
    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    /**
     * 获取身份证
     *
     * @return id_card - 身份证
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置身份证
     *
     * @param idCard 身份证
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取银行卡号
     *
     * @return bank - 银行卡号
     */
    public String getBank() {
        return bank;
    }

    /**
     * 设置银行卡号
     *
     * @param bank 银行卡号
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * 获取邮箱
     *
     * @return e_mail - 邮箱
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * 设置邮箱
     *
     * @param eMail 邮箱
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * 获取电瓶车车架号
     *
     * @return frameEbike - 电瓶车车架号
     */
    public String getFrameebike() {
        return frameebike;
    }

    /**
     * 设置电瓶车车架号
     *
     * @param frameebike 电瓶车车架号
     */
    public void setFrameebike(String frameebike) {
        this.frameebike = frameebike;
    }

    /**
     * 获取手机
     *
     * @return phone - 手机
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机
     *
     * @param phone 手机
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取汽车车牌
     *
     * @return plate_car - 汽车车牌
     */
    public String getPlateCar() {
        return plateCar;
    }

    /**
     * 设置汽车车牌
     *
     * @param plateCar 汽车车牌
     */
    public void setPlateCar(String plateCar) {
        this.plateCar = plateCar;
    }

    /**
     * 获取电瓶车车牌
     *
     * @return plateEbike - 电瓶车车牌
     */
    public String getPlateebike() {
        return plateebike;
    }

    /**
     * 设置电瓶车车牌
     *
     * @param plateebike 电瓶车车牌
     */
    public void setPlateebike(String plateebike) {
        this.plateebike = plateebike;
    }

    /**
     * 获取QQ号
     *
     * @return qq - QQ号
     */
    public String getQq() {
        return qq;
    }

    /**
     * 设置QQ号
     *
     * @param qq QQ号
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * 获取电话
     *
     * @return tel - 电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置电话
     *
     * @param tel 电话
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取网址
     *
     * @return website - 网址
     */
    public String getWebsite() {
        return website;
    }

    /**
     * 设置网址
     *
     * @param website 网址
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * 获取微信账号
     *
     * @return wechat - 微信账号
     */
    public String getWechat() {
        return wechat;
    }

    /**
     * 设置微信账号
     *
     * @param wechat 微信账号
     */
    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    /**
     * 获取直播YY号
     *
     * @return yy - 直播YY号
     */
    public String getYy() {
        return yy;
    }

    /**
     * 设置直播YY号
     *
     * @param yy 直播YY号
     */
    public void setYy(String yy) {
        this.yy = yy;
    }

    /**
     * 获取摩托车牌
     *
     * @return motorCycle - 摩托车牌
     */
    public String getMotorcycle() {
        return motorcycle;
    }

    /**
     * 设置摩托车牌
     *
     * @param motorcycle 摩托车牌
     */
    public void setMotorcycle(String motorcycle) {
        this.motorcycle = motorcycle;
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
     * 获取评估类型
     *
     * @return pglx - 评估类型
     */
    public String getPglx() {
        return pglx;
    }

    /**
     * 设置评估类型
     *
     * @param pglx 评估类型
     */
    public void setPglx(String pglx) {
        this.pglx = pglx;
    }

    /**
     * 获取接警时间
     *
     * @return jjsj - 接警时间
     */
    public Date getJjsj() {
        return jjsj;
    }

    /**
     * 设置接警时间
     *
     * @param jjsj 接警时间
     */
    public void setJjsj(Date jjsj) {
        this.jjsj = jjsj;
    }

    /**
     * 获取发案详地
     *
     * @return faxz - 发案详地
     */
    public String getFaxz() {
        return faxz;
    }

    /**
     * 设置发案详地
     *
     * @param faxz 发案详地
     */
    public void setFaxz(String faxz) {
        this.faxz = faxz;
    }

    /**
     * 获取处警时间
     *
     * @return cjsj - 处警时间
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
     * 获取处理结果
     *
     * @return jieguo - 处理结果
     */
    public String getJieguo() {
        return jieguo;
    }

    /**
     * 设置处理结果
     *
     * @param jieguo 处理结果
     */
    public void setJieguo(String jieguo) {
        this.jieguo = jieguo;
    }
}