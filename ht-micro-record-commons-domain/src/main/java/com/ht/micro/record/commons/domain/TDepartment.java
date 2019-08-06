package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_department")
public class TDepartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 部门名称别名
     */
    private String name;

    /**
     * 部门名称全称
     */
    @Column(name = "full_name")
    private String fullName;

    /**
     * 部门编号
     */
    private String code;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 部门父id
     */
    @Column(name = "p_id")
    private Integer pId;

    /**
     * 0否1是
     */
    @Column(name = "is_disabled")
    private String isDisabled;

    /**
     * 部门人数
     */
    @Column(name = "people_count")
    private Integer peopleCount;

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
     * 获取部门名称别名
     *
     * @return name - 部门名称别名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置部门名称别名
     *
     * @param name 部门名称别名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取部门名称全称
     *
     * @return full_name - 部门名称全称
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * 设置部门名称全称
     *
     * @param fullName 部门名称全称
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * 获取部门编号
     *
     * @return code - 部门编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置部门编号
     *
     * @param code 部门编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取部门父id
     *
     * @return p_id - 部门父id
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * 设置部门父id
     *
     * @param pId 部门父id
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * 获取0否1是
     *
     * @return is_disabled - 0否1是
     */
    public String getIsDisabled() {
        return isDisabled;
    }

    /**
     * 设置0否1是
     *
     * @param isDisabled 0否1是
     */
    public void setIsDisabled(String isDisabled) {
        this.isDisabled = isDisabled;
    }

    /**
     * 获取部门人数
     *
     * @return people_count - 部门人数
     */
    public Integer getPeopleCount() {
        return peopleCount;
    }

    /**
     * 设置部门人数
     *
     * @param peopleCount 部门人数
     */
    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
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