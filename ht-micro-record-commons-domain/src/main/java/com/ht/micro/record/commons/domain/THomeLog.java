package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_home_log")
public class THomeLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 1-自动串案 2-主题串案 3-笔录分析 4-警情分析 5-笔录相关
     */
    private String type;

    /**
     * 操作内容
     */
    private String context;

    /**
     * 0-预警 1-正常
     */
    private String status;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 部门编号
     */
    @Column(name = "dept_code")
    private String deptCode;

    /**
     * 关联外键
     */
    @Column(name = "web_id")
    private String webId;

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
     * 获取1-自动串案 2-主题串案 3-笔录分析 4-警情分析 5-笔录相关
     *
     * @return type - 1-自动串案 2-主题串案 3-笔录分析 4-警情分析 5-笔录相关
     */
    public String getType() {
        return type;
    }

    /**
     * 设置1-自动串案 2-主题串案 3-笔录分析 4-警情分析 5-笔录相关
     *
     * @param type 1-自动串案 2-主题串案 3-笔录分析 4-警情分析 5-笔录相关
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取操作内容
     *
     * @return context - 操作内容
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置操作内容
     *
     * @param context 操作内容
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * 获取0-预警 1-正常
     *
     * @return status - 0-预警 1-正常
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置0-预警 1-正常
     *
     * @param status 0-预警 1-正常
     */
    public void setStatus(String status) {
        this.status = status;
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
     * 获取部门编号
     *
     * @return dept_code - 部门编号
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置部门编号
     *
     * @param deptCode 部门编号
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * 获取关联外键
     *
     * @return web_id - 关联外键
     */
    public String getWebId() {
        return webId;
    }

    /**
     * 设置关联外键
     *
     * @param webId 关联外键
     */
    public void setWebId(String webId) {
        this.webId = webId;
    }
}