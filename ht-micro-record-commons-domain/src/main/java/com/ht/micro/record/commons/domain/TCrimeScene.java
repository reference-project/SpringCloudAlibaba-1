package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "t_crime_scene")
public class TCrimeScene {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 笔录id
     */
    @Column(name = "case_info_id")
    private Integer caseInfoId;

    /**
     * 案发详细地址
     */
    private String address;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

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
     * 获取笔录id
     *
     * @return case_info_id - 笔录id
     */
    public Integer getCaseInfoId() {
        return caseInfoId;
    }

    /**
     * 设置笔录id
     *
     * @param caseInfoId 笔录id
     */
    public void setCaseInfoId(Integer caseInfoId) {
        this.caseInfoId = caseInfoId;
    }

    /**
     * 获取案发详细地址
     *
     * @return address - 案发详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置案发详细地址
     *
     * @param address 案发详细地址
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }
}