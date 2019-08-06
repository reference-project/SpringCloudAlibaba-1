package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "t_reporting_type")
public class TReportingType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "img_url")
    private String imgUrl;

    private String jurisdiction;

    private String name;

    @Column(name = "time_type")
    private String timeType;

    @Column(name = "jurisdiction_name")
    private String jurisdictionName;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return img_url
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * @param imgUrl
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    /**
     * @return jurisdiction
     */
    public String getJurisdiction() {
        return jurisdiction;
    }

    /**
     * @param jurisdiction
     */
    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return time_type
     */
    public String getTimeType() {
        return timeType;
    }

    /**
     * @param timeType
     */
    public void setTimeType(String timeType) {
        this.timeType = timeType;
    }

    /**
     * @return jurisdiction_name
     */
    public String getJurisdictionName() {
        return jurisdictionName;
    }

    /**
     * @param jurisdictionName
     */
    public void setJurisdictionName(String jurisdictionName) {
        this.jurisdictionName = jurisdictionName;
    }
}