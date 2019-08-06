package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_read_user")
public class TReadUser {
    //默认等级为 低级
    private Integer grade=1;
    private Integer labelIdsCount=0;
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getLabelIdsCount() {
        return labelIdsCount;
    }

    public void setLabelIdsCount(Integer labelIdsCount) {
        this.labelIdsCount = labelIdsCount;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "card_num")
    private String cardNum;

    private String name;

    private String nation;

    private Integer age;

    private String sex;

    @Column(name = "label_ids")
    private String labelIds;

    /**
     * 标签选中str如id1:1,2;id2:3,4
     */
    @Column(name = "label_str")
    private String labelStr;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "police_num")
    private String policeNum;

    @Column(name = "police_name")
    private String policeName;

    @Column(name = "police_job")
    private String policeJob;

    @Column(name = "police_department")
    private String policeDepartment;

    private String status;

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
     * @return label_ids
     */
    public String getLabelIds() {
        return labelIds;
    }

    /**
     * @param labelIds
     */
    public void setLabelIds(String labelIds) {
        this.labelIds = labelIds;
    }

    /**
     * 获取标签选中str如id1:1,2;id2:3,4
     *
     * @return label_str - 标签选中str如id1:1,2;id2:3,4
     */
    public String getLabelStr() {
        return labelStr;
    }

    /**
     * 设置标签选中str如id1:1,2;id2:3,4
     *
     * @param labelStr 标签选中str如id1:1,2;id2:3,4
     */
    public void setLabelStr(String labelStr) {
        this.labelStr = labelStr;
    }

    /**
     * @return image_url
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * @param imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * @return police_num
     */
    public String getPoliceNum() {
        return policeNum;
    }

    /**
     * @param policeNum
     */
    public void setPoliceNum(String policeNum) {
        this.policeNum = policeNum;
    }

    /**
     * @return police_name
     */
    public String getPoliceName() {
        return policeName;
    }

    /**
     * @param policeName
     */
    public void setPoliceName(String policeName) {
        this.policeName = policeName;
    }

    /**
     * @return police_job
     */
    public String getPoliceJob() {
        return policeJob;
    }

    /**
     * @param policeJob
     */
    public void setPoliceJob(String policeJob) {
        this.policeJob = policeJob;
    }

    /**
     * @return police_department
     */
    public String getPoliceDepartment() {
        return policeDepartment;
    }

    /**
     * @param policeDepartment
     */
    public void setPoliceDepartment(String policeDepartment) {
        this.policeDepartment = policeDepartment;
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
}