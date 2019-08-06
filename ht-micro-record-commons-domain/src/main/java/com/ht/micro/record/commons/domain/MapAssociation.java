package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "map_association")
public class MapAssociation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String police;

    @Column(name = "police_code")
    private String policeCode;

    private String community;

    @Column(name = "community_code")
    private String communityCode;

    @Column(name = "c_alias")
    private String cAlias;

    private String district;

    @Column(name = "district_code")
    private String districtCode;

    @Column(name = "d_alias")
    private String dAlias;

    private String patrol;

    private String defence;

    private Double longitude;

    private Double latitude;

    @Column(name = "type_code")
    private Integer typeCode;

    private String type;

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
     * @return c_alias
     */
    public String getcAlias() {
        return cAlias;
    }

    /**
     * @param cAlias
     */
    public void setcAlias(String cAlias) {
        this.cAlias = cAlias;
    }

    /**
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return district_code
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * @param districtCode
     */
    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    /**
     * @return d_alias
     */
    public String getdAlias() {
        return dAlias;
    }

    /**
     * @param dAlias
     */
    public void setdAlias(String dAlias) {
        this.dAlias = dAlias;
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
}