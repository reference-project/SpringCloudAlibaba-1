package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_feedback")
public class TFeedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String type;

    private String content;

    private String images;

    @Column(name = "create_time")
    private Date createTime;

    private String phone;

    @Column(name = "find_time")
    private Date findTime;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "create_user_name")
    private String createUserName;

    @Column(name = "creaye_user_num")
    private String creayeUserNum;

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
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return images
     */
    public String getImages() {
        return images;
    }

    /**
     * @param images
     */
    public void setImages(String images) {
        this.images = images;
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
     * @return find_time
     */
    public Date getFindTime() {
        return findTime;
    }

    /**
     * @param findTime
     */
    public void setFindTime(Date findTime) {
        this.findTime = findTime;
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

    /**
     * @return create_user_name
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * @param createUserName
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    /**
     * @return creaye_user_num
     */
    public String getCreayeUserNum() {
        return creayeUserNum;
    }

    /**
     * @param creayeUserNum
     */
    public void setCreayeUserNum(String creayeUserNum) {
        this.creayeUserNum = creayeUserNum;
    }
}