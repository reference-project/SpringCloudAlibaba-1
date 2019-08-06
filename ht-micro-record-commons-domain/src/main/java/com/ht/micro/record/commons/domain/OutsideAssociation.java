package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "outside_association")
public class OutsideAssociation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "police_code")
    private String policeCode;

    private String police;

    private String code;

    private String name;

    private String alias;

    @Column(name = "type_code")
    private Integer typeCode;

    private String type;

    private String patrol;

    private String defence;

    private String community;

    @Column(name = "community_code")
    private String communityCode;

    private Double longitude;

    private Double latitude;

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
     * @return police_code
     */
    public String getPoliceCode() {
        return policeCode;
    }

    /**
     * @param policeCode
     */
    public void setPoliceCode(String policeCode) {
        this.policeCode = policeCode;
    }

    /**
     * @return police
     */
    public String getPolice() {
        return police;
    }

    /**
     * @param police
     */
    public void setPolice(String police) {
        this.police = police;
    }

    /**
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
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
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * @return type_code
     */
    public Integer getTypeCode() {
        return typeCode;
    }

    /**
     * @param typeCode
     */
    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return patrol
     */
    public String getPatrol() {
        return patrol;
    }

    /**
     * @param patrol
     */
    public void setPatrol(String patrol) {
        this.patrol = patrol;
    }

    /**
     * @return defence
     */
    public String getDefence() {
        return defence;
    }

    /**
     * @param defence
     */
    public void setDefence(String defence) {
        this.defence = defence;
    }

    /**
     * @return community
     */
    public String getCommunity() {
        return community;
    }

    /**
     * @param community
     */
    public void setCommunity(String community) {
        this.community = community;
    }

    /**
     * @return community_code
     */
    public String getCommunityCode() {
        return communityCode;
    }

    /**
     * @param communityCode
     */
    public void setCommunityCode(String communityCode) {
        this.communityCode = communityCode;
    }

    /**
     * @return longitude
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * @return latitude
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}