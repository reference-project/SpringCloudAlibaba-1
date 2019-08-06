package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_jq_rs")
public class TJqRs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 来源 0手动 1自动
     */
    private String source;

    /**
     * 0:未审核 1:通过 2:未通过
     */
    private String state;

    private Integer creator;

    @Column(name = "creator_name")
    private String creatorName;

    /**
     * 警情详情
     */
    private String jqxq;

    /**
     * 操作人警号
     */
    private String jh;

    /**
     * 1.涉案人手机2.涉案人身份证3.涉案人地址4.支付宝5.银行账号6.邮箱7.电瓶车车架号8.身份证9.手机号10.车牌号11.电瓶车车牌12.QQ号13.电话14.网址15.微信号16.YY号
     */
    private Integer type;

    /**
     * 相同的值
     */
    @Column(name = "same_value")
    private String sameValue;

    /**
     * 笔录主键和jjbh逗号分割
     */
    @Column(name = "jjbh_arr")
    private String jjbhArr;

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
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取来源 0手动 1自动
     *
     * @return source - 来源 0手动 1自动
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置来源 0手动 1自动
     *
     * @param source 来源 0手动 1自动
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * 获取0:未审核 1:通过 2:未通过
     *
     * @return state - 0:未审核 1:通过 2:未通过
     */
    public String getState() {
        return state;
    }

    /**
     * 设置0:未审核 1:通过 2:未通过
     *
     * @param state 0:未审核 1:通过 2:未通过
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return creator
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * @return creator_name
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * @param creatorName
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    /**
     * 获取警情详情
     *
     * @return jqxq - 警情详情
     */
    public String getJqxq() {
        return jqxq;
    }

    /**
     * 设置警情详情
     *
     * @param jqxq 警情详情
     */
    public void setJqxq(String jqxq) {
        this.jqxq = jqxq;
    }

    /**
     * 获取操作人警号
     *
     * @return jh - 操作人警号
     */
    public String getJh() {
        return jh;
    }

    /**
     * 设置操作人警号
     *
     * @param jh 操作人警号
     */
    public void setJh(String jh) {
        this.jh = jh;
    }

    /**
     * 获取1.涉案人手机2.涉案人身份证3.涉案人地址4.支付宝5.银行账号6.邮箱7.电瓶车车架号8.身份证9.手机号10.车牌号11.电瓶车车牌12.QQ号13.电话14.网址15.微信号16.YY号
     *
     * @return type - 1.涉案人手机2.涉案人身份证3.涉案人地址4.支付宝5.银行账号6.邮箱7.电瓶车车架号8.身份证9.手机号10.车牌号11.电瓶车车牌12.QQ号13.电话14.网址15.微信号16.YY号
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1.涉案人手机2.涉案人身份证3.涉案人地址4.支付宝5.银行账号6.邮箱7.电瓶车车架号8.身份证9.手机号10.车牌号11.电瓶车车牌12.QQ号13.电话14.网址15.微信号16.YY号
     *
     * @param type 1.涉案人手机2.涉案人身份证3.涉案人地址4.支付宝5.银行账号6.邮箱7.电瓶车车架号8.身份证9.手机号10.车牌号11.电瓶车车牌12.QQ号13.电话14.网址15.微信号16.YY号
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取相同的值
     *
     * @return same_value - 相同的值
     */
    public String getSameValue() {
        return sameValue;
    }

    /**
     * 设置相同的值
     *
     * @param sameValue 相同的值
     */
    public void setSameValue(String sameValue) {
        this.sameValue = sameValue;
    }

    /**
     * 获取笔录主键和jjbh逗号分割
     *
     * @return jjbh_arr - 笔录主键和jjbh逗号分割
     */
    public String getJjbhArr() {
        return jjbhArr;
    }

    /**
     * 设置笔录主键和jjbh逗号分割
     *
     * @param jjbhArr 笔录主键和jjbh逗号分割
     */
    public void setJjbhArr(String jjbhArr) {
        this.jjbhArr = jjbhArr;
    }
}