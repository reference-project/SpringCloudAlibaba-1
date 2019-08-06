package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_topic")
public class TTopic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cjlb;

    /**
     * 出警类型
     */
    private String cjlb2;

    private String cjlb3;

    private String cjlb4;

    /**
     * 评估类别1
     */
    private String pglb1;

    private String pglb2;

    private String pglb3;

    private String pglb4;

    private String bjfs;

    /**
     * 报警时间起始时间
     */
    @Column(name = "min_bjsj")
    private String minBjsj;

    /**
     * 报警时间结束时间
     */
    @Column(name = "max_bjsj")
    private String maxBjsj;

    /**
     * 案发时段起始时间
     */
    @Column(name = "min_afsd")
    private String minAfsd;

    @Column(name = "max_afsd")
    private String maxAfsd;

    /**
     * 选择时机
     */
    private String xzsj;

    /**
     * 所属辖区（逗号分割多个）
     */
    private String ssxq;

    /**
     * 小区内外（逗号分割多个）
     */
    private String xqnw;

    /**
     * 发生地点（逗号分割多个）
     */
    private String fsdd;

    /**
     * 小区 逗号分割多个
     */
    private String district;

    private String building;

    private String cell;

    private String room;

    private String floor;

    @Column(name = "otherUnit")
    private String otherunit;

    private String road;

    /**
     * 作案手段
     */
    private String zasd;

    @Column(name = "regionType")
    private String regiontype;

    @Column(name = "publicPlace")
    private String publicplace;

    @Column(name = "publicPlaceType")
    private String publicplacetype;

    @Column(name = "doorNo")
    private String doorno;

    private String region;

    private String bzdz;

    /**
     * 侵害目标
     */
    private String qhmb;

    /**
     * 区域部位
     */
    private String qybw;

    /**
     * 作案工具
     */
    private String zagj;

    /**
     * 选择对象
     */
    private String xzdx;

    /**
     * 交通工具
     */
    private String jtgj;

    /**
     * 群租房
     */
    private String qzf;

    /**
     * 视频监控
     */
    private String spjk;

    /**
     * 案情相似度 0-大于 1-大于等于 2-等于
     */
    @Column(name = "xsd_status")
    private String xsdStatus;

    /**
     * 相似度值
     */
    @Column(name = "xsd_val")
    private String xsdVal;

    /**
     * 主题名称
     */
    @Column(name = "topic_name")
    private String topicName;

    /**
     * 备注
     */
    private String remark;

    /**
     * 0-个人主题 1-系统主题
     */
    @Column(name = "is_systen")
    private String isSysten;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private String creator;

    @Column(name = "creator_name")
    private String creatorName;

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
     * @return cjlb
     */
    public String getCjlb() {
        return cjlb;
    }

    /**
     * @param cjlb
     */
    public void setCjlb(String cjlb) {
        this.cjlb = cjlb;
    }

    /**
     * 获取出警类型
     *
     * @return cjlb2 - 出警类型
     */
    public String getCjlb2() {
        return cjlb2;
    }

    /**
     * 设置出警类型
     *
     * @param cjlb2 出警类型
     */
    public void setCjlb2(String cjlb2) {
        this.cjlb2 = cjlb2;
    }

    /**
     * @return cjlb3
     */
    public String getCjlb3() {
        return cjlb3;
    }

    /**
     * @param cjlb3
     */
    public void setCjlb3(String cjlb3) {
        this.cjlb3 = cjlb3;
    }

    /**
     * @return cjlb4
     */
    public String getCjlb4() {
        return cjlb4;
    }

    /**
     * @param cjlb4
     */
    public void setCjlb4(String cjlb4) {
        this.cjlb4 = cjlb4;
    }

    /**
     * 获取评估类别1
     *
     * @return pglb1 - 评估类别1
     */
    public String getPglb1() {
        return pglb1;
    }

    /**
     * 设置评估类别1
     *
     * @param pglb1 评估类别1
     */
    public void setPglb1(String pglb1) {
        this.pglb1 = pglb1;
    }

    /**
     * @return pglb2
     */
    public String getPglb2() {
        return pglb2;
    }

    /**
     * @param pglb2
     */
    public void setPglb2(String pglb2) {
        this.pglb2 = pglb2;
    }

    /**
     * @return pglb3
     */
    public String getPglb3() {
        return pglb3;
    }

    /**
     * @param pglb3
     */
    public void setPglb3(String pglb3) {
        this.pglb3 = pglb3;
    }

    /**
     * @return pglb4
     */
    public String getPglb4() {
        return pglb4;
    }

    /**
     * @param pglb4
     */
    public void setPglb4(String pglb4) {
        this.pglb4 = pglb4;
    }

    /**
     * @return bjfs
     */
    public String getBjfs() {
        return bjfs;
    }

    /**
     * @param bjfs
     */
    public void setBjfs(String bjfs) {
        this.bjfs = bjfs;
    }

    /**
     * 获取报警时间起始时间
     *
     * @return min_bjsj - 报警时间起始时间
     */
    public String getMinBjsj() {
        return minBjsj;
    }

    /**
     * 设置报警时间起始时间
     *
     * @param minBjsj 报警时间起始时间
     */
    public void setMinBjsj(String minBjsj) {
        this.minBjsj = minBjsj;
    }

    /**
     * 获取报警时间结束时间
     *
     * @return max_bjsj - 报警时间结束时间
     */
    public String getMaxBjsj() {
        return maxBjsj;
    }

    /**
     * 设置报警时间结束时间
     *
     * @param maxBjsj 报警时间结束时间
     */
    public void setMaxBjsj(String maxBjsj) {
        this.maxBjsj = maxBjsj;
    }

    /**
     * 获取案发时段起始时间
     *
     * @return min_afsd - 案发时段起始时间
     */
    public String getMinAfsd() {
        return minAfsd;
    }

    /**
     * 设置案发时段起始时间
     *
     * @param minAfsd 案发时段起始时间
     */
    public void setMinAfsd(String minAfsd) {
        this.minAfsd = minAfsd;
    }

    /**
     * @return max_afsd
     */
    public String getMaxAfsd() {
        return maxAfsd;
    }

    /**
     * @param maxAfsd
     */
    public void setMaxAfsd(String maxAfsd) {
        this.maxAfsd = maxAfsd;
    }

    /**
     * 获取选择时机
     *
     * @return xzsj - 选择时机
     */
    public String getXzsj() {
        return xzsj;
    }

    /**
     * 设置选择时机
     *
     * @param xzsj 选择时机
     */
    public void setXzsj(String xzsj) {
        this.xzsj = xzsj;
    }

    /**
     * 获取所属辖区（逗号分割多个）
     *
     * @return ssxq - 所属辖区（逗号分割多个）
     */
    public String getSsxq() {
        return ssxq;
    }

    /**
     * 设置所属辖区（逗号分割多个）
     *
     * @param ssxq 所属辖区（逗号分割多个）
     */
    public void setSsxq(String ssxq) {
        this.ssxq = ssxq;
    }

    /**
     * 获取小区内外（逗号分割多个）
     *
     * @return xqnw - 小区内外（逗号分割多个）
     */
    public String getXqnw() {
        return xqnw;
    }

    /**
     * 设置小区内外（逗号分割多个）
     *
     * @param xqnw 小区内外（逗号分割多个）
     */
    public void setXqnw(String xqnw) {
        this.xqnw = xqnw;
    }

    /**
     * 获取发生地点（逗号分割多个）
     *
     * @return fsdd - 发生地点（逗号分割多个）
     */
    public String getFsdd() {
        return fsdd;
    }

    /**
     * 设置发生地点（逗号分割多个）
     *
     * @param fsdd 发生地点（逗号分割多个）
     */
    public void setFsdd(String fsdd) {
        this.fsdd = fsdd;
    }

    /**
     * 获取小区 逗号分割多个
     *
     * @return district - 小区 逗号分割多个
     */
    public String getDistrict() {
        return district;
    }

    /**
     * 设置小区 逗号分割多个
     *
     * @param district 小区 逗号分割多个
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return building
     */
    public String getBuilding() {
        return building;
    }

    /**
     * @param building
     */
    public void setBuilding(String building) {
        this.building = building;
    }

    /**
     * @return cell
     */
    public String getCell() {
        return cell;
    }

    /**
     * @param cell
     */
    public void setCell(String cell) {
        this.cell = cell;
    }

    /**
     * @return room
     */
    public String getRoom() {
        return room;
    }

    /**
     * @param room
     */
    public void setRoom(String room) {
        this.room = room;
    }

    /**
     * @return floor
     */
    public String getFloor() {
        return floor;
    }

    /**
     * @param floor
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    /**
     * @return otherUnit
     */
    public String getOtherunit() {
        return otherunit;
    }

    /**
     * @param otherunit
     */
    public void setOtherunit(String otherunit) {
        this.otherunit = otherunit;
    }

    /**
     * @return road
     */
    public String getRoad() {
        return road;
    }

    /**
     * @param road
     */
    public void setRoad(String road) {
        this.road = road;
    }

    /**
     * 获取作案手段
     *
     * @return zasd - 作案手段
     */
    public String getZasd() {
        return zasd;
    }

    /**
     * 设置作案手段
     *
     * @param zasd 作案手段
     */
    public void setZasd(String zasd) {
        this.zasd = zasd;
    }

    /**
     * @return regionType
     */
    public String getRegiontype() {
        return regiontype;
    }

    /**
     * @param regiontype
     */
    public void setRegiontype(String regiontype) {
        this.regiontype = regiontype;
    }

    /**
     * @return publicPlace
     */
    public String getPublicplace() {
        return publicplace;
    }

    /**
     * @param publicplace
     */
    public void setPublicplace(String publicplace) {
        this.publicplace = publicplace;
    }

    /**
     * @return publicPlaceType
     */
    public String getPublicplacetype() {
        return publicplacetype;
    }

    /**
     * @param publicplacetype
     */
    public void setPublicplacetype(String publicplacetype) {
        this.publicplacetype = publicplacetype;
    }

    /**
     * @return doorNo
     */
    public String getDoorno() {
        return doorno;
    }

    /**
     * @param doorno
     */
    public void setDoorno(String doorno) {
        this.doorno = doorno;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * @return bzdz
     */
    public String getBzdz() {
        return bzdz;
    }

    /**
     * @param bzdz
     */
    public void setBzdz(String bzdz) {
        this.bzdz = bzdz;
    }

    /**
     * 获取侵害目标
     *
     * @return qhmb - 侵害目标
     */
    public String getQhmb() {
        return qhmb;
    }

    /**
     * 设置侵害目标
     *
     * @param qhmb 侵害目标
     */
    public void setQhmb(String qhmb) {
        this.qhmb = qhmb;
    }

    /**
     * 获取区域部位
     *
     * @return qybw - 区域部位
     */
    public String getQybw() {
        return qybw;
    }

    /**
     * 设置区域部位
     *
     * @param qybw 区域部位
     */
    public void setQybw(String qybw) {
        this.qybw = qybw;
    }

    /**
     * 获取作案工具
     *
     * @return zagj - 作案工具
     */
    public String getZagj() {
        return zagj;
    }

    /**
     * 设置作案工具
     *
     * @param zagj 作案工具
     */
    public void setZagj(String zagj) {
        this.zagj = zagj;
    }

    /**
     * 获取选择对象
     *
     * @return xzdx - 选择对象
     */
    public String getXzdx() {
        return xzdx;
    }

    /**
     * 设置选择对象
     *
     * @param xzdx 选择对象
     */
    public void setXzdx(String xzdx) {
        this.xzdx = xzdx;
    }

    /**
     * 获取交通工具
     *
     * @return jtgj - 交通工具
     */
    public String getJtgj() {
        return jtgj;
    }

    /**
     * 设置交通工具
     *
     * @param jtgj 交通工具
     */
    public void setJtgj(String jtgj) {
        this.jtgj = jtgj;
    }

    /**
     * 获取群租房
     *
     * @return qzf - 群租房
     */
    public String getQzf() {
        return qzf;
    }

    /**
     * 设置群租房
     *
     * @param qzf 群租房
     */
    public void setQzf(String qzf) {
        this.qzf = qzf;
    }

    /**
     * 获取视频监控
     *
     * @return spjk - 视频监控
     */
    public String getSpjk() {
        return spjk;
    }

    /**
     * 设置视频监控
     *
     * @param spjk 视频监控
     */
    public void setSpjk(String spjk) {
        this.spjk = spjk;
    }

    /**
     * 获取案情相似度 0-大于 1-大于等于 2-等于
     *
     * @return xsd_status - 案情相似度 0-大于 1-大于等于 2-等于
     */
    public String getXsdStatus() {
        return xsdStatus;
    }

    /**
     * 设置案情相似度 0-大于 1-大于等于 2-等于
     *
     * @param xsdStatus 案情相似度 0-大于 1-大于等于 2-等于
     */
    public void setXsdStatus(String xsdStatus) {
        this.xsdStatus = xsdStatus;
    }

    /**
     * 获取相似度值
     *
     * @return xsd_val - 相似度值
     */
    public String getXsdVal() {
        return xsdVal;
    }

    /**
     * 设置相似度值
     *
     * @param xsdVal 相似度值
     */
    public void setXsdVal(String xsdVal) {
        this.xsdVal = xsdVal;
    }

    /**
     * 获取主题名称
     *
     * @return topic_name - 主题名称
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * 设置主题名称
     *
     * @param topicName 主题名称
     */
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取0-个人主题 1-系统主题
     *
     * @return is_systen - 0-个人主题 1-系统主题
     */
    public String getIsSysten() {
        return isSysten;
    }

    /**
     * 设置0-个人主题 1-系统主题
     *
     * @param isSysten 0-个人主题 1-系统主题
     */
    public void setIsSysten(String isSysten) {
        this.isSysten = isSysten;
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
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * @return creator_name
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * @param creatorName
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }
}