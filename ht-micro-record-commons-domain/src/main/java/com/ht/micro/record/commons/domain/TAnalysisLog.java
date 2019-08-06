package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_analysis_log")
public class TAnalysisLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 操作（新增、修改、删除）
     */
    private String operate;

    /**
     * 字段英文名称
     */
    @Column(name = "column_en")
    private String columnEn;

    /**
     * 字段中文名称
     */
    @Column(name = "column_cn")
    private String columnCn;

    /**
     * 字段原值
     */
    @Column(name = "old_val")
    private String oldVal;

    /**
     * 字段新值
     */
    @Column(name = "new_val")
    private String newVal;

    /**
     * 操作人id
     */
    @Column(name = "creator_id")
    private Integer creatorId;

    private String creator;

    /**
     * 分析id
     */
    @Column(name = "analysis_id")
    private String analysisId;

    /**
     * 0:笔录日志 1:警情日志
     */
    private String type;

    @Column(name = "create_time")
    private Date createTime;

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
     * 获取操作（新增、修改、删除）
     *
     * @return operate - 操作（新增、修改、删除）
     */
    public String getOperate() {
        return operate;
    }

    /**
     * 设置操作（新增、修改、删除）
     *
     * @param operate 操作（新增、修改、删除）
     */
    public void setOperate(String operate) {
        this.operate = operate;
    }

    /**
     * 获取字段英文名称
     *
     * @return column_en - 字段英文名称
     */
    public String getColumnEn() {
        return columnEn;
    }

    /**
     * 设置字段英文名称
     *
     * @param columnEn 字段英文名称
     */
    public void setColumnEn(String columnEn) {
        this.columnEn = columnEn;
    }

    /**
     * 获取字段中文名称
     *
     * @return column_cn - 字段中文名称
     */
    public String getColumnCn() {
        return columnCn;
    }

    /**
     * 设置字段中文名称
     *
     * @param columnCn 字段中文名称
     */
    public void setColumnCn(String columnCn) {
        this.columnCn = columnCn;
    }

    /**
     * 获取字段原值
     *
     * @return old_val - 字段原值
     */
    public String getOldVal() {
        return oldVal;
    }

    /**
     * 设置字段原值
     *
     * @param oldVal 字段原值
     */
    public void setOldVal(String oldVal) {
        this.oldVal = oldVal;
    }

    /**
     * 获取字段新值
     *
     * @return new_val - 字段新值
     */
    public String getNewVal() {
        return newVal;
    }

    /**
     * 设置字段新值
     *
     * @param newVal 字段新值
     */
    public void setNewVal(String newVal) {
        this.newVal = newVal;
    }

    /**
     * 获取操作人id
     *
     * @return creator_id - 操作人id
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * 设置操作人id
     *
     * @param creatorId 操作人id
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * 获取分析id
     *
     * @return analysis_id - 分析id
     */
    public String getAnalysisId() {
        return analysisId;
    }

    /**
     * 设置分析id
     *
     * @param analysisId 分析id
     */
    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    /**
     * 获取0:笔录日志 1:警情日志
     *
     * @return type - 0:笔录日志 1:警情日志
     */
    public String getType() {
        return type;
    }

    /**
     * 设置0:笔录日志 1:警情日志
     *
     * @param type 0:笔录日志 1:警情日志
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
}