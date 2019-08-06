package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_notation_area")
public class TNotationArea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 批注区内容
     */
    private String content;

    /**
     * 对应笔录id
     */
    @Column(name = "case_info_id")
    private Integer caseInfoId;

    /**
     * 批注区创建用户id
     */
    private Integer creator;

    /**
     * 创建人名称
     */
    @Column(name = "creator_name")
    private String creatorName;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

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
     * 获取批注区内容
     *
     * @return content - 批注区内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置批注区内容
     *
     * @param content 批注区内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取对应笔录id
     *
     * @return case_info_id - 对应笔录id
     */
    public Integer getCaseInfoId() {
        return caseInfoId;
    }

    /**
     * 设置对应笔录id
     *
     * @param caseInfoId 对应笔录id
     */
    public void setCaseInfoId(Integer caseInfoId) {
        this.caseInfoId = caseInfoId;
    }

    /**
     * 获取批注区创建用户id
     *
     * @return creator - 批注区创建用户id
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * 设置批注区创建用户id
     *
     * @param creator 批注区创建用户id
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * 获取创建人名称
     *
     * @return creator_name - 创建人名称
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * 设置创建人名称
     *
     * @param creatorName 创建人名称
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
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
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}