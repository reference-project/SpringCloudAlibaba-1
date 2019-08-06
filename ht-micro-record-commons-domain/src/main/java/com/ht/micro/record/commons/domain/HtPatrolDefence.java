package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "ht_patrol_defence")
public class HtPatrolDefence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 巡区防区code
     */
    private String code;

    /**
     * 部门code
     */
    @Column(name = "police_code")
    private String policeCode;

    /**
     * 名称
     */
    private String name;

    /**
     * 1 巡区 2 防区
     */
    private Integer type;

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
     * 获取巡区防区code
     *
     * @return code - 巡区防区code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置巡区防区code
     *
     * @param code 巡区防区code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取部门code
     *
     * @return police_code - 部门code
     */
    public String getPoliceCode() {
        return policeCode;
    }

    /**
     * 设置部门code
     *
     * @param policeCode 部门code
     */
    public void setPoliceCode(String policeCode) {
        this.policeCode = policeCode;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取1 巡区 2 防区
     *
     * @return type - 1 巡区 2 防区
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置1 巡区 2 防区
     *
     * @param type 1 巡区 2 防区
     */
    public void setType(Integer type) {
        this.type = type;
    }
}