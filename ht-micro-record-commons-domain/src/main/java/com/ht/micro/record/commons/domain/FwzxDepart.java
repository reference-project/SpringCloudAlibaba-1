package com.ht.micro.record.commons.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "fwzx_depart")
public class FwzxDepart {
    @Id
    private Integer dbid;

    /**
     * 部门别名
     */
    private String alias;

    /**
     * 0 普通 1虚拟部门
     */
    private String cate;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 结构层级，顶级部门为ROOT
     */
    private Integer deep;

    /**
     * 部门编号
     */
    private String deptid;

    /**
     * 是否显示(1是0否)
     */
    private String isshow;

    /**
     * 是否显示人员(1是0否)
     */
    private String isshowuser;

    /**
     * 部门名称
     */
    private String name;

    /**
     * 排序顺序
     */
    private Integer ordernum;

    /**
     * 上级部门编号
     */
    private String parentid;

    /**
     * 备注信息
     */
    private String remark;

    private String seqcode;

    private String seqorder;

    @Column(name = "update_time")
    private Date updateTime;

    private Integer version;

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
     * 获取部门别名
     *
     * @return alias - 部门别名
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置部门别名
     *
     * @param alias 部门别名
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 获取0 普通 1虚拟部门
     *
     * @return cate - 0 普通 1虚拟部门
     */
    public String getCate() {
        return cate;
    }

    /**
     * 设置0 普通 1虚拟部门
     *
     * @param cate 0 普通 1虚拟部门
     */
    public void setCate(String cate) {
        this.cate = cate;
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
     * 获取结构层级，顶级部门为ROOT
     *
     * @return deep - 结构层级，顶级部门为ROOT
     */
    public Integer getDeep() {
        return deep;
    }

    /**
     * 设置结构层级，顶级部门为ROOT
     *
     * @param deep 结构层级，顶级部门为ROOT
     */
    public void setDeep(Integer deep) {
        this.deep = deep;
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
     * 获取是否显示(1是0否)
     *
     * @return isshow - 是否显示(1是0否)
     */
    public String getIsshow() {
        return isshow;
    }

    /**
     * 设置是否显示(1是0否)
     *
     * @param isshow 是否显示(1是0否)
     */
    public void setIsshow(String isshow) {
        this.isshow = isshow;
    }

    /**
     * 获取是否显示人员(1是0否)
     *
     * @return isshowuser - 是否显示人员(1是0否)
     */
    public String getIsshowuser() {
        return isshowuser;
    }

    /**
     * 设置是否显示人员(1是0否)
     *
     * @param isshowuser 是否显示人员(1是0否)
     */
    public void setIsshowuser(String isshowuser) {
        this.isshowuser = isshowuser;
    }

    /**
     * 获取部门名称
     *
     * @return name - 部门名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置部门名称
     *
     * @param name 部门名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取排序顺序
     *
     * @return ordernum - 排序顺序
     */
    public Integer getOrdernum() {
        return ordernum;
    }

    /**
     * 设置排序顺序
     *
     * @param ordernum 排序顺序
     */
    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    /**
     * 获取上级部门编号
     *
     * @return parentid - 上级部门编号
     */
    public String getParentid() {
        return parentid;
    }

    /**
     * 设置上级部门编号
     *
     * @param parentid 上级部门编号
     */
    public void setParentid(String parentid) {
        this.parentid = parentid;
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
     * @return seqcode
     */
    public String getSeqcode() {
        return seqcode;
    }

    /**
     * @param seqcode
     */
    public void setSeqcode(String seqcode) {
        this.seqcode = seqcode;
    }

    /**
     * @return seqorder
     */
    public String getSeqorder() {
        return seqorder;
    }

    /**
     * @param seqorder
     */
    public void setSeqorder(String seqorder) {
        this.seqorder = seqorder;
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
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}