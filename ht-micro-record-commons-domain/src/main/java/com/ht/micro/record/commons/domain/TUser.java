package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_user")
public class TUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 采用数字证书进行用户身份验证的应用系统，填写用户公民身份号码。未采用数字证书进行用户身份验证的应用系统/资源库，则填写警号
     */
    @Column(name = "police_num")
    private String policeNum;

    /**
     * 姓名
     */
    private String name;

    /**
     * 职务
     */
    private String position;

    /**
     * 单位id
     */
    @Column(name = "depart_id")
    private Integer departId;

    /**
     * 用户所属单位的公安机关机构名称
     */
    @Column(name = "depart_name")
    private String departName;

    /**
     * 用户所属单位的公安机关机构代码
     */
    @Column(name = "unit_code")
    private String unitCode;

    /**
     * 角色id
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 是否禁用(0否 1是)
     */
    @Column(name = "is_disabled")
    private String isDisabled;

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
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取采用数字证书进行用户身份验证的应用系统，填写用户公民身份号码。未采用数字证书进行用户身份验证的应用系统/资源库，则填写警号
     *
     * @return police_num - 采用数字证书进行用户身份验证的应用系统，填写用户公民身份号码。未采用数字证书进行用户身份验证的应用系统/资源库，则填写警号
     */
    public String getPoliceNum() {
        return policeNum;
    }

    /**
     * 设置采用数字证书进行用户身份验证的应用系统，填写用户公民身份号码。未采用数字证书进行用户身份验证的应用系统/资源库，则填写警号
     *
     * @param policeNum 采用数字证书进行用户身份验证的应用系统，填写用户公民身份号码。未采用数字证书进行用户身份验证的应用系统/资源库，则填写警号
     */
    public void setPoliceNum(String policeNum) {
        this.policeNum = policeNum;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取职务
     *
     * @return position - 职务
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置职务
     *
     * @param position 职务
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取单位id
     *
     * @return depart_id - 单位id
     */
    public Integer getDepartId() {
        return departId;
    }

    /**
     * 设置单位id
     *
     * @param departId 单位id
     */
    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    /**
     * 获取用户所属单位的公安机关机构名称
     *
     * @return depart_name - 用户所属单位的公安机关机构名称
     */
    public String getDepartName() {
        return departName;
    }

    /**
     * 设置用户所属单位的公安机关机构名称
     *
     * @param departName 用户所属单位的公安机关机构名称
     */
    public void setDepartName(String departName) {
        this.departName = departName;
    }

    /**
     * 获取用户所属单位的公安机关机构代码
     *
     * @return unit_code - 用户所属单位的公安机关机构代码
     */
    public String getUnitCode() {
        return unitCode;
    }

    /**
     * 设置用户所属单位的公安机关机构代码
     *
     * @param unitCode 用户所属单位的公安机关机构代码
     */
    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    /**
     * 获取角色id
     *
     * @return role_id - 角色id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置角色id
     *
     * @param roleId 角色id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
     * 获取是否禁用(0否 1是)
     *
     * @return is_disabled - 是否禁用(0否 1是)
     */
    public String getIsDisabled() {
        return isDisabled;
    }

    /**
     * 设置是否禁用(0否 1是)
     *
     * @param isDisabled 是否禁用(0否 1是)
     */
    public void setIsDisabled(String isDisabled) {
        this.isDisabled = isDisabled;
    }
}