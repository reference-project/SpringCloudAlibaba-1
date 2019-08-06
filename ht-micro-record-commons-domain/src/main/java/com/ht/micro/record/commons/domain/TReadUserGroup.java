package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_read_user_group")
public class TReadUserGroup {

    private String builder;
    private String policeNum;
    private String departName;

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getPoliceNum() {
        return policeNum;
    }

    public void setPoliceNum(String policeNum) {
        this.policeNum = policeNum;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "create_time")
    private Date createTime;

    private String status;

    @Column(name = "case_num")
    private String caseNum;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "card_num")
    private String cardNum;

    private String name;

    private Integer age;

    private String sex;

    private String nation;

    @Column(name = "pic_count")
    private Integer picCount;

    @Column(name = "pic_ids")
    private String picIds;

    @Column(name = "cover_pic_url")
    private String coverPicUrl;

    @Column(name = "labelStr")
    private String labelstr;

    @Column(name = "user_id")
    private Integer userId;

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
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return case_num
     */
    public String getCaseNum() {
        return caseNum;
    }

    /**
     * @param caseNum
     */
    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }

    /**
     * @return card_type
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * @param cardType
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * @return card_num
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * @param cardNum
     */
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return nation
     */
    public String getNation() {
        return nation;
    }

    /**
     * @param nation
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * @return pic_count
     */
    public Integer getPicCount() {
        return picCount;
    }

    /**
     * @param picCount
     */
    public void setPicCount(Integer picCount) {
        this.picCount = picCount;
    }

    /**
     * @return pic_ids
     */
    public String getPicIds() {
        return picIds;
    }

    /**
     * @param picIds
     */
    public void setPicIds(String picIds) {
        this.picIds = picIds;
    }

    /**
     * @return cover_pic_url
     */
    public String getCoverPicUrl() {
        return coverPicUrl;
    }

    /**
     * @param coverPicUrl
     */
    public void setCoverPicUrl(String coverPicUrl) {
        this.coverPicUrl = coverPicUrl;
    }

    /**
     * @return labelStr
     */
    public String getLabelstr() {
        return labelstr;
    }

    /**
     * @param labelstr
     */
    public void setLabelstr(String labelstr) {
        this.labelstr = labelstr;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}