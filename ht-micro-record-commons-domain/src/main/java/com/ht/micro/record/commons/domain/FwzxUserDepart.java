package com.ht.micro.record.commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "fwzx_user_depart")
public class FwzxUserDepart {
    /**
     * pk
     */
    @Id
    private Integer dbid;

    /**
     * 部门编号
     */
    private String deptid;

    /**
     * 职责
     */
    private String dutycontent;

    /**
     * 职务编号
     */
    private String dutyid;

    /**
     * 职务名称
     */
    private String dutyname;

    /**
     * 是否主部门(1是0否)
     */
    private String isprimary;

    /**
     * 是否在通讯录展示(1是0否)
     */
    private String isshow;

    /**
     * 排序
     */
    private Integer ordernum;

    /**
     * 警号
     */
    private String policenum;

    /**
     * 用户DBID
     */
    @Column(name = "USERDBID")
    private Integer userdbid;

    /**
     * 获取pk
     *
     * @return dbid - pk
     */
    public Integer getDbid() {
        return dbid;
    }

    /**
     * 设置pk
     *
     * @param dbid pk
     */
    public void setDbid(Integer dbid) {
        this.dbid = dbid;
    }

    /**
     * 获取部门编号
     *
     * @return deptid - 部门编号
     */
    public String getDeptid() {
        return deptid;
    }

    /**
     * 设置部门编号
     *
     * @param deptid 部门编号
     */
    public void setDeptid(String deptid) {
        this.deptid = deptid;
    }

    /**
     * 获取职责
     *
     * @return dutycontent - 职责
     */
    public String getDutycontent() {
        return dutycontent;
    }

    /**
     * 设置职责
     *
     * @param dutycontent 职责
     */
    public void setDutycontent(String dutycontent) {
        this.dutycontent = dutycontent;
    }

    /**
     * 获取职务编号
     *
     * @return dutyid - 职务编号
     */
    public String getDutyid() {
        return dutyid;
    }

    /**
     * 设置职务编号
     *
     * @param dutyid 职务编号
     */
    public void setDutyid(String dutyid) {
        this.dutyid = dutyid;
    }

    /**
     * 获取职务名称
     *
     * @return dutyname - 职务名称
     */
    public String getDutyname() {
        return dutyname;
    }

    /**
     * 设置职务名称
     *
     * @param dutyname 职务名称
     */
    public void setDutyname(String dutyname) {
        this.dutyname = dutyname;
    }

    /**
     * 获取是否主部门(1是0否)
     *
     * @return isprimary - 是否主部门(1是0否)
     */
    public String getIsprimary() {
        return isprimary;
    }

    /**
     * 设置是否主部门(1是0否)
     *
     * @param isprimary 是否主部门(1是0否)
     */
    public void setIsprimary(String isprimary) {
        this.isprimary = isprimary;
    }

    /**
     * 获取是否在通讯录展示(1是0否)
     *
     * @return isshow - 是否在通讯录展示(1是0否)
     */
    public String getIsshow() {
        return isshow;
    }

    /**
     * 设置是否在通讯录展示(1是0否)
     *
     * @param isshow 是否在通讯录展示(1是0否)
     */
    public void setIsshow(String isshow) {
        this.isshow = isshow;
    }

    /**
     * 获取排序
     *
     * @return ordernum - 排序
     */
    public Integer getOrdernum() {
        return ordernum;
    }

    /**
     * 设置排序
     *
     * @param ordernum 排序
     */
    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    /**
     * 获取警号
     *
     * @return policenum - 警号
     */
    public String getPolicenum() {
        return policenum;
    }

    /**
     * 设置警号
     *
     * @param policenum 警号
     */
    public void setPolicenum(String policenum) {
        this.policenum = policenum;
    }

    /**
     * 获取用户DBID
     *
     * @return USERDBID - 用户DBID
     */
    public Integer getUserdbid() {
        return userdbid;
    }

    /**
     * 设置用户DBID
     *
     * @param userdbid 用户DBID
     */
    public void setUserdbid(Integer userdbid) {
        this.userdbid = userdbid;
    }
}