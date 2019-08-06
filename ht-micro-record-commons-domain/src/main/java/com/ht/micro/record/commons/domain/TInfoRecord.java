package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_info_record")
public class TInfoRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "id_card")
    private String idCard;

    private String phone;

    @Column(name = "nowAddr")
    private String nowaddr;

    private String jjbh;

    private String cjdw;

    @Column(name = "evaluateCodeOne")
    private String evaluatecodeone;

    @Column(name = "evaluateCode")
    private String evaluatecode;

    /**
     * 笔录创建时间
     */
    @Column(name = "record_time")
    private Date recordTime;

    /**
     * 创建时间
     */
    @Column(name = "creat_time")
    private Date creatTime;

    private String blnr;

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
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return id_card
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * @param idCard
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return nowAddr
     */
    public String getNowaddr() {
        return nowaddr;
    }

    /**
     * @param nowaddr
     */
    public void setNowaddr(String nowaddr) {
        this.nowaddr = nowaddr;
    }

    /**
     * @return jjbh
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
     * @return cjdw
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
     * @return evaluateCodeOne
     */
    public String getEvaluatecodeone() {
        return evaluatecodeone;
    }

    /**
     * @param evaluatecodeone
     */
    public void setEvaluatecodeone(String evaluatecodeone) {
        this.evaluatecodeone = evaluatecodeone;
    }

    /**
     * @return evaluateCode
     */
    public String getEvaluatecode() {
        return evaluatecode;
    }

    /**
     * @param evaluatecode
     */
    public void setEvaluatecode(String evaluatecode) {
        this.evaluatecode = evaluatecode;
    }

    /**
     * 获取笔录创建时间
     *
     * @return record_time - 笔录创建时间
     */
    public Date getRecordTime() {
        return recordTime;
    }

    /**
     * 设置笔录创建时间
     *
     * @param recordTime 笔录创建时间
     */
    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }

    /**
     * 获取创建时间
     *
     * @return creat_time - 创建时间
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * 设置创建时间
     *
     * @param creatTime 创建时间
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * @return blnr
     */
    public String getBlnr() {
        return blnr;
    }

    /**
     * @param blnr
     */
    public void setBlnr(String blnr) {
        this.blnr = blnr;
    }
}