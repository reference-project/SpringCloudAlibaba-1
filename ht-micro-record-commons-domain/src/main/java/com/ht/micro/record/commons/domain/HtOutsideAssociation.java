package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "ht_outside_association")
public class HtOutsideAssociation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 辖区code
     */
    @Column(name = "police_code")
    private String policeCode;

    /**
     * 辖区
     */
    private String police;

    /**
     * 非居民住宅code
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 别名
     */
    private String alias;

    /**
     * 类型code
     */
    @Column(name = "type_code")
    private Integer typeCode;

    /**
     * 类型名称
     */
    private String type;

    /**
     * 巡区
     */
    private String patrol;

    /**
     * 防区
     */
    private String defence;

    /**
     * 社区id
     */
    @Column(name = "community_id")
    private Integer communityId;

    /**
     * 社区
     */
    private String community;

    /**
     * 社区code
     */
    @Column(name = "community_code")
    private String communityCode;

    /**
     * 经度
     */
    private Double longitude;

    /**
     * 纬度
     */
    private Double latitude;

    /**
     * 删除标识
     */
    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "code_suffix")
    private Integer codeSuffix;

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
     * 获取辖区code
     *
     * @return police_code - 辖区code
     */
    public String getPoliceCode() {
        return policeCode;
    }

    /**
     * 设置辖区code
     *
     * @param policeCode 辖区code
     */
    public void setPoliceCode(String policeCode) {
        this.policeCode = policeCode;
    }

    /**
     * 获取辖区
     *
     * @return police - 辖区
     */
    public String getPolice() {
        return police;
    }

    /**
     * 设置辖区
     *
     * @param police 辖区
     */
    public void setPolice(String police) {
        this.police = police;
    }

    /**
     * 获取非居民住宅code
     *
     * @return code - 非居民住宅code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置非居民住宅code
     *
     * @param code 非居民住宅code
     */
    public void setCode(String code) {
        this.code = code;
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
     * 获取别名
     *
     * @return alias - 别名
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置别名
     *
     * @param alias 别名
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 获取类型code
     *
     * @return type_code - 类型code
     */
    public Integer getTypeCode() {
        return typeCode;
    }

    /**
     * 设置类型code
     *
     * @param typeCode 类型code
     */
    public void setTypeCode(Integer typeCode) {
        this.typeCode = typeCode;
    }

    /**
     * 获取类型名称
     *
     * @return type - 类型名称
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型名称
     *
     * @param type 类型名称
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取巡区
     *
     * @return patrol - 巡区
     */
    public String getPatrol() {
        return patrol;
    }

    /**
     * 设置巡区
     *
     * @param patrol 巡区
     */
    public void setPatrol(String patrol) {
        this.patrol = patrol;
    }

    /**
     * 获取防区
     *
     * @return defence - 防区
     */
    public String getDefence() {
        return defence;
    }

    /**
     * 设置防区
     *
     * @param defence 防区
     */
    public void setDefence(String defence) {
        this.defence = defence;
    }

    /**
     * 获取社区id
     *
     * @return community_id - 社区id
     */
    public Integer getCommunityId() {
        return communityId;
    }

    /**
     * 设置社区id
     *
     * @param communityId 社区id
     */
    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    /**
     * 获取社区
     *
     * @return community - 社区
     */
    public String getCommunity() {
        return community;
    }

    /**
     * 设置社区
     *
     * @param community 社区
     */
    public void setCommunity(String community) {
        this.community = community;
    }

    /**
     * 获取社区code
     *
     * @return community_code - 社区code
     */
    public String getCommunityCode() {
        return communityCode;
    }

    /**
     * 设置社区code
     *
     * @param communityCode 社区code
     */
    public void setCommunityCode(String communityCode) {
        this.communityCode = communityCode;
    }

    /**
     * 获取经度
     *
     * @return longitude - 经度
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * 设置经度
     *
     * @param longitude 经度
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取纬度
     *
     * @return latitude - 纬度
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * 设置纬度
     *
     * @param latitude 纬度
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取删除标识
     *
     * @return status - 删除标识
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置删除标识
     *
     * @param status 删除标识
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * @return code_suffix
     */
    public Integer getCodeSuffix() {
        return codeSuffix;
    }

    /**
     * @param codeSuffix
     */
    public void setCodeSuffix(Integer codeSuffix) {
        this.codeSuffix = codeSuffix;
    }
}