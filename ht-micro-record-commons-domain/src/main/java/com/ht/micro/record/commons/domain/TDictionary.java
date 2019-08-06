package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_dictionary")
public class TDictionary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String status;

    private String type;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "sort_num")
    private Integer sortNum;

    /**
     * 0 询 1 讯
     */
    private String other;

    private Integer level;

    /**
     * 0-未固定  1-固定 （描述辨认库字典筛选不可变动的标签）
     */
    @Column(name = "fix_status")
    private String fixStatus;

    private String code;

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

    /**
     * @return parent_id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * @param parentId
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * @return sort_num
     */
    public Integer getSortNum() {
        return sortNum;
    }

    /**
     * @param sortNum
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * 获取0 询 1 讯
     *
     * @return other - 0 询 1 讯
     */
    public String getOther() {
        return other;
    }

    /**
     * 设置0 询 1 讯
     *
     * @param other 0 询 1 讯
     */
    public void setOther(String other) {
        this.other = other;
    }

    /**
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * @param level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取0-未固定  1-固定 （描述辨认库字典筛选不可变动的标签）
     *
     * @return fix_status - 0-未固定  1-固定 （描述辨认库字典筛选不可变动的标签）
     */
    public String getFixStatus() {
        return fixStatus;
    }

    /**
     * 设置0-未固定  1-固定 （描述辨认库字典筛选不可变动的标签）
     *
     * @param fixStatus 0-未固定  1-固定 （描述辨认库字典筛选不可变动的标签）
     */
    public void setFixStatus(String fixStatus) {
        this.fixStatus = fixStatus;
    }

    /**
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }
}