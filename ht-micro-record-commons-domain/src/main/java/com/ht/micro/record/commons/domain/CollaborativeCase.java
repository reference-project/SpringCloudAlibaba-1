package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "collaborative_case")
public class CollaborativeCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 案件编号（cjbh）
     */
    @Column(name = "case_num")
    private String caseNum;

    /**
     * 案件名称
     */
    @Column(name = "case_name")
    private String caseName;

    @Column(name = "create_name")
    private String createName;

    @Column(name = "create_user_id")
    private Integer createUserId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "dept_name")
    private String deptName;

    @Column(name = "create_dept")
    private Integer createDept;

    /**
     * 询问室
     */
    @Column(name = "room_ids")
    private Integer roomIds;

    /**
     * 协同案件 1 结束
     */
    private Integer status;

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
     * 获取案件编号（cjbh）
     *
     * @return case_num - 案件编号（cjbh）
     */
    public String getCaseNum() {
        return caseNum;
    }

    /**
     * 设置案件编号（cjbh）
     *
     * @param caseNum 案件编号（cjbh）
     */
    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }

    /**
     * 获取案件名称
     *
     * @return case_name - 案件名称
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * 设置案件名称
     *
     * @param caseName 案件名称
     */
    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    /**
     * @return create_name
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * @param createName
     */
    public void setCreateName(String createName) {
        this.createName = createName;
    }

    /**
     * @return create_user_id
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * @param createUserId
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
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
     * @return dept_name
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * @param deptName
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * @return create_dept
     */
    public Integer getCreateDept() {
        return createDept;
    }

    /**
     * @param createDept
     */
    public void setCreateDept(Integer createDept) {
        this.createDept = createDept;
    }

    /**
     * 获取询问室
     *
     * @return room_ids - 询问室
     */
    public Integer getRoomIds() {
        return roomIds;
    }

    /**
     * 设置询问室
     *
     * @param roomIds 询问室
     */
    public void setRoomIds(Integer roomIds) {
        this.roomIds = roomIds;
    }

    /**
     * 获取协同案件 1 结束
     *
     * @return status - 协同案件 1 结束
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置协同案件 1 结束
     *
     * @param status 协同案件 1 结束
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}