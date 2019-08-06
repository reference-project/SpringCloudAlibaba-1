package com.ht.micro.record.commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "fwzx_user")
public class FwzxUser {
    @Id
    private Integer dbid;

    /**
     * 是否启用  1
     */
    private String activeflag;

    /**
     * 办公地点
     */
    private String address;

    /**
     * 生日
     */
    private Date birthday;

    /**
     * 0 普通 1虚拟
     */
    private String cate;

    /**
     * 公司ID
     */
    private Integer companyid;

    /**
     * 新增时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 0: 正常 1：已删除
     */
    private String delflag;

    /**
     * 身份证号
     */
    private String idcard;

    /**
     * 姓名
     */
    private String name;

    /**
     * 姓名简拼
     */
    private String namepycap;

    /**
     * 密码
     */
    private String password;

    /**
     * 警号
     */
    private String policenum;

    /**
     * 备注信息
     */
    private String remark;

    /**
     * 签名
     */
    private String signature;

    /**
     * 移动电话
     */
    @Column(name = "tel_mobile")
    private String telMobile;

    /**
     * 办公电话
     */
    @Column(name = "tel_office")
    private String telOffice;

    /**
     * 短号
     */
    @Column(name = "tel_short")
    private String telShort;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 人员类型（0：民警，1：警辅，2：职工，3：虚拟人员，4：临时人员，5：其他）
     */
    private String type;

    /**
     * 照片
     */
    private byte[] photo;

    /**
     * @return dbid
     */
    public Integer getDbid() {
        return dbid;
    }

    /**
     * @param dbid
     */
    public void setDbid(Integer dbid) {
        this.dbid = dbid;
    }

    /**
     * 获取是否启用  1
     *
     * @return activeflag - 是否启用  1
     */
    public String getActiveflag() {
        return activeflag;
    }

    /**
     * 设置是否启用  1
     *
     * @param activeflag 是否启用  1
     */
    public void setActiveflag(String activeflag) {
        this.activeflag = activeflag;
    }

    /**
     * 获取办公地点
     *
     * @return address - 办公地点
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置办公地点
     *
     * @param address 办公地点
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取0 普通 1虚拟
     *
     * @return cate - 0 普通 1虚拟
     */
    public String getCate() {
        return cate;
    }

    /**
     * 设置0 普通 1虚拟
     *
     * @param cate 0 普通 1虚拟
     */
    public void setCate(String cate) {
        this.cate = cate;
    }

    /**
     * 获取公司ID
     *
     * @return companyid - 公司ID
     */
    public Integer getCompanyid() {
        return companyid;
    }

    /**
     * 设置公司ID
     *
     * @param companyid 公司ID
     */
    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    /**
     * 获取新增时间
     *
     * @return create_time - 新增时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置新增时间
     *
     * @param createTime 新增时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取0: 正常 1：已删除
     *
     * @return delflag - 0: 正常 1：已删除
     */
    public String getDelflag() {
        return delflag;
    }

    /**
     * 设置0: 正常 1：已删除
     *
     * @param delflag 0: 正常 1：已删除
     */
    public void setDelflag(String delflag) {
        this.delflag = delflag;
    }

    /**
     * 获取身份证号
     *
     * @return idcard - 身份证号
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置身份证号
     *
     * @param idcard 身份证号
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
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
     * 获取姓名简拼
     *
     * @return namepycap - 姓名简拼
     */
    public String getNamepycap() {
        return namepycap;
    }

    /**
     * 设置姓名简拼
     *
     * @param namepycap 姓名简拼
     */
    public void setNamepycap(String namepycap) {
        this.namepycap = namepycap;
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
     * 获取备注信息
     *
     * @return remark - 备注信息
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注信息
     *
     * @param remark 备注信息
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取签名
     *
     * @return signature - 签名
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 设置签名
     *
     * @param signature 签名
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * 获取移动电话
     *
     * @return tel_mobile - 移动电话
     */
    public String getTelMobile() {
        return telMobile;
    }

    /**
     * 设置移动电话
     *
     * @param telMobile 移动电话
     */
    public void setTelMobile(String telMobile) {
        this.telMobile = telMobile;
    }

    /**
     * 获取办公电话
     *
     * @return tel_office - 办公电话
     */
    public String getTelOffice() {
        return telOffice;
    }

    /**
     * 设置办公电话
     *
     * @param telOffice 办公电话
     */
    public void setTelOffice(String telOffice) {
        this.telOffice = telOffice;
    }

    /**
     * 获取短号
     *
     * @return tel_short - 短号
     */
    public String getTelShort() {
        return telShort;
    }

    /**
     * 设置短号
     *
     * @param telShort 短号
     */
    public void setTelShort(String telShort) {
        this.telShort = telShort;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取版本
     *
     * @return version - 版本
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 获取人员类型（0：民警，1：警辅，2：职工，3：虚拟人员，4：临时人员，5：其他）
     *
     * @return type - 人员类型（0：民警，1：警辅，2：职工，3：虚拟人员，4：临时人员，5：其他）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置人员类型（0：民警，1：警辅，2：职工，3：虚拟人员，4：临时人员，5：其他）
     *
     * @param type 人员类型（0：民警，1：警辅，2：职工，3：虚拟人员，4：临时人员，5：其他）
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取照片
     *
     * @return photo - 照片
     */
    public byte[] getPhoto() {
        return photo;
    }

    /**
     * 设置照片
     *
     * @param photo 照片
     */
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}