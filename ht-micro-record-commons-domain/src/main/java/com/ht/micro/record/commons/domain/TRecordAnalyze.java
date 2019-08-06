package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_record_analyze")
public class TRecordAnalyze {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 询问对象字典id
     */
    @Column(name = "ask_obj")
    private Integer askObj;

    /**
     * 姓名
     */
    @Column(name = "report_name")
    private String reportName;

    /**
     * 曾用名
     */
    @Column(name = "used_name")
    private String usedName;

    /**
     * 绰号
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 出生日期
     */
    @Column(name = "birth_date")
    private String birthDate;

    /**
     * 国籍
     */
    private Integer nationality;

    /**
     * 民族
     */
    private Integer nation;

    /**
     * 工作单位
     */
    @Column(name = "work_unit")
    private String workUnit;

    /**
     * 职业
     */
    private String position;

    /**
     * 政治面貌
     */
    @Column(name = "politics_status")
    private Integer politicsStatus;

    /**
     * 受教育程度
     */
    @Column(name = "education_degree")
    private Integer educationDegree;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private String age;

    /**
     * 证件类型字典id
     */
    @Column(name = "id_card_id")
    private Integer idCardId;

    /**
     * 证件号码
     */
    @Column(name = "id_card")
    private String idCard;

    private String phone;

    /**
     * 户籍地
     */
    @Column(name = "register_address")
    private String registerAddress;

    /**
     * 现住址
     */
    @Column(name = "now_address")
    private String nowAddress;

    /**
     * 关联笔录
     */
    @Column(name = "relate_record")
    private String relateRecord;

    private String jjbh;

    /**
     * 警情辖区
     */
    private String jqxq;

    /**
     * 所属案情
     */
    private String ssaq;

    @Column(name = "first_case")
    private String firstCase;

    @Column(name = "second_case")
    private String secondCase;

    @Column(name = "third_case")
    private String thirdCase;

    /**
     * 案发时间起始
     */
    @Column(name = "min_fasj")
    private String minFasj;

    /**
     * 案发时间结束
     */
    @Column(name = "max_fasj")
    private String maxFasj;

    /**
     * 选择时机: 24小时间 填-1, 1 清晨 , 2 白天  21 上午 22 中午 23 下午, 3 傍晚(黄昏), 4 夜间  41 上半夜 42 下半夜
     */
    private String xzsj;

    /**
     * 事发地点
     */
    private String sfdd;

    /**
     * 小区内外
     */
    private String xqnw;

    /**
     * 发生地点
     */
    private String fsdd;

    /**
     * 作案手段
     */
    private String zasd;

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
     * 涉案物品信息（"name"-物品名称 "pro_name"-属性名称） "pro_val"-属性值
     */
    @Column(name = "sawp_info")
    private String sawpInfo;

    /**
     * 唯一健数据（"item"-字典项id "value"-唯一健值 "remark"-备注）
     */
    @Column(name = "wyj_info")
    private String wyjInfo;

    /**
     * 涉案对象信息（"name"-"姓名" "id_card"-证件号码 "phone"-联系电话 "address"-"现住址" "remark"-描述）
     */
    @Column(name = "sadx_info")
    private String sadxInfo;

    /**
     * 笔录摘要
     */
    private String blzy;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 对应笔录id
     */
    @Column(name = "record_id")
    private Integer recordId;

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
     * 获取询问对象字典id
     *
     * @return ask_obj - 询问对象字典id
     */
    public Integer getAskObj() {
        return askObj;
    }

    /**
     * 设置询问对象字典id
     *
     * @param askObj 询问对象字典id
     */
    public void setAskObj(Integer askObj) {
        this.askObj = askObj;
    }

    /**
     * 获取姓名
     *
     * @return report_name - 姓名
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * 设置姓名
     *
     * @param reportName 姓名
     */
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * 获取曾用名
     *
     * @return used_name - 曾用名
     */
    public String getUsedName() {
        return usedName;
    }

    /**
     * 设置曾用名
     *
     * @param usedName 曾用名
     */
    public void setUsedName(String usedName) {
        this.usedName = usedName;
    }

    /**
     * 获取绰号
     *
     * @return nick_name - 绰号
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置绰号
     *
     * @param nickName 绰号
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 获取出生日期
     *
     * @return birth_date - 出生日期
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * 设置出生日期
     *
     * @param birthDate 出生日期
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * 获取国籍
     *
     * @return nationality - 国籍
     */
    public Integer getNationality() {
        return nationality;
    }

    /**
     * 设置国籍
     *
     * @param nationality 国籍
     */
    public void setNationality(Integer nationality) {
        this.nationality = nationality;
    }

    /**
     * 获取民族
     *
     * @return nation - 民族
     */
    public Integer getNation() {
        return nation;
    }

    /**
     * 设置民族
     *
     * @param nation 民族
     */
    public void setNation(Integer nation) {
        this.nation = nation;
    }

    /**
     * 获取工作单位
     *
     * @return work_unit - 工作单位
     */
    public String getWorkUnit() {
        return workUnit;
    }

    /**
     * 设置工作单位
     *
     * @param workUnit 工作单位
     */
    public void setWorkUnit(String workUnit) {
        this.workUnit = workUnit;
    }

    /**
     * 获取职业
     *
     * @return position - 职业
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置职业
     *
     * @param position 职业
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取政治面貌
     *
     * @return politics_status - 政治面貌
     */
    public Integer getPoliticsStatus() {
        return politicsStatus;
    }

    /**
     * 设置政治面貌
     *
     * @param politicsStatus 政治面貌
     */
    public void setPoliticsStatus(Integer politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    /**
     * 获取受教育程度
     *
     * @return education_degree - 受教育程度
     */
    public Integer getEducationDegree() {
        return educationDegree;
    }

    /**
     * 设置受教育程度
     *
     * @param educationDegree 受教育程度
     */
    public void setEducationDegree(Integer educationDegree) {
        this.educationDegree = educationDegree;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 获取证件类型字典id
     *
     * @return id_card_id - 证件类型字典id
     */
    public Integer getIdCardId() {
        return idCardId;
    }

    /**
     * 设置证件类型字典id
     *
     * @param idCardId 证件类型字典id
     */
    public void setIdCardId(Integer idCardId) {
        this.idCardId = idCardId;
    }

    /**
     * 获取证件号码
     *
     * @return id_card - 证件号码
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置证件号码
     *
     * @param idCard 证件号码
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取户籍地
     *
     * @return register_address - 户籍地
     */
    public String getRegisterAddress() {
        return registerAddress;
    }

    /**
     * 设置户籍地
     *
     * @param registerAddress 户籍地
     */
    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    /**
     * 获取现住址
     *
     * @return now_address - 现住址
     */
    public String getNowAddress() {
        return nowAddress;
    }

    /**
     * 设置现住址
     *
     * @param nowAddress 现住址
     */
    public void setNowAddress(String nowAddress) {
        this.nowAddress = nowAddress;
    }

    /**
     * 获取关联笔录
     *
     * @return relate_record - 关联笔录
     */
    public String getRelateRecord() {
        return relateRecord;
    }

    /**
     * 设置关联笔录
     *
     * @param relateRecord 关联笔录
     */
    public void setRelateRecord(String relateRecord) {
        this.relateRecord = relateRecord;
    }

    /**
     * @return jjbh
     */
    public String getJjbh() {
        return jjbh;
    }

    /**
     * @param jjbh
     */
    public void setJjbh(String jjbh) {
        this.jjbh = jjbh;
    }

    /**
     * 获取警情辖区
     *
     * @return jqxq - 警情辖区
     */
    public String getJqxq() {
        return jqxq;
    }

    /**
     * 设置警情辖区
     *
     * @param jqxq 警情辖区
     */
    public void setJqxq(String jqxq) {
        this.jqxq = jqxq;
    }

    /**
     * 获取所属案情
     *
     * @return ssaq - 所属案情
     */
    public String getSsaq() {
        return ssaq;
    }

    /**
     * 设置所属案情
     *
     * @param ssaq 所属案情
     */
    public void setSsaq(String ssaq) {
        this.ssaq = ssaq;
    }

    /**
     * @return first_case
     */
    public String getFirstCase() {
        return firstCase;
    }

    /**
     * @param firstCase
     */
    public void setFirstCase(String firstCase) {
        this.firstCase = firstCase;
    }

    /**
     * @return second_case
     */
    public String getSecondCase() {
        return secondCase;
    }

    /**
     * @param secondCase
     */
    public void setSecondCase(String secondCase) {
        this.secondCase = secondCase;
    }

    /**
     * @return third_case
     */
    public String getThirdCase() {
        return thirdCase;
    }

    /**
     * @param thirdCase
     */
    public void setThirdCase(String thirdCase) {
        this.thirdCase = thirdCase;
    }

    /**
     * 获取案发时间起始
     *
     * @return min_fasj - 案发时间起始
     */
    public String getMinFasj() {
        return minFasj;
    }

    /**
     * 设置案发时间起始
     *
     * @param minFasj 案发时间起始
     */
    public void setMinFasj(String minFasj) {
        this.minFasj = minFasj;
    }

    /**
     * 获取案发时间结束
     *
     * @return max_fasj - 案发时间结束
     */
    public String getMaxFasj() {
        return maxFasj;
    }

    /**
     * 设置案发时间结束
     *
     * @param maxFasj 案发时间结束
     */
    public void setMaxFasj(String maxFasj) {
        this.maxFasj = maxFasj;
    }

    /**
     * 获取选择时机: 24小时间 填-1, 1 清晨 , 2 白天  21 上午 22 中午 23 下午, 3 傍晚(黄昏), 4 夜间  41 上半夜 42 下半夜
     *
     * @return xzsj - 选择时机: 24小时间 填-1, 1 清晨 , 2 白天  21 上午 22 中午 23 下午, 3 傍晚(黄昏), 4 夜间  41 上半夜 42 下半夜
     */
    public String getXzsj() {
        return xzsj;
    }

    /**
     * 设置选择时机: 24小时间 填-1, 1 清晨 , 2 白天  21 上午 22 中午 23 下午, 3 傍晚(黄昏), 4 夜间  41 上半夜 42 下半夜
     *
     * @param xzsj 选择时机: 24小时间 填-1, 1 清晨 , 2 白天  21 上午 22 中午 23 下午, 3 傍晚(黄昏), 4 夜间  41 上半夜 42 下半夜
     */
    public void setXzsj(String xzsj) {
        this.xzsj = xzsj;
    }

    /**
     * 获取事发地点
     *
     * @return sfdd - 事发地点
     */
    public String getSfdd() {
        return sfdd;
    }

    /**
     * 设置事发地点
     *
     * @param sfdd 事发地点
     */
    public void setSfdd(String sfdd) {
        this.sfdd = sfdd;
    }

    /**
     * 获取小区内外
     *
     * @return xqnw - 小区内外
     */
    public String getXqnw() {
        return xqnw;
    }

    /**
     * 设置小区内外
     *
     * @param xqnw 小区内外
     */
    public void setXqnw(String xqnw) {
        this.xqnw = xqnw;
    }

    /**
     * 获取发生地点
     *
     * @return fsdd - 发生地点
     */
    public String getFsdd() {
        return fsdd;
    }

    /**
     * 设置发生地点
     *
     * @param fsdd 发生地点
     */
    public void setFsdd(String fsdd) {
        this.fsdd = fsdd;
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
     * 获取涉案物品信息（"name"-物品名称 "pro_name"-属性名称） "pro_val"-属性值
     *
     * @return sawp_info - 涉案物品信息（"name"-物品名称 "pro_name"-属性名称） "pro_val"-属性值
     */
    public String getSawpInfo() {
        return sawpInfo;
    }

    /**
     * 设置涉案物品信息（"name"-物品名称 "pro_name"-属性名称） "pro_val"-属性值
     *
     * @param sawpInfo 涉案物品信息（"name"-物品名称 "pro_name"-属性名称） "pro_val"-属性值
     */
    public void setSawpInfo(String sawpInfo) {
        this.sawpInfo = sawpInfo;
    }

    /**
     * 获取唯一健数据（"item"-字典项id "value"-唯一健值 "remark"-备注）
     *
     * @return wyj_info - 唯一健数据（"item"-字典项id "value"-唯一健值 "remark"-备注）
     */
    public String getWyjInfo() {
        return wyjInfo;
    }

    /**
     * 设置唯一健数据（"item"-字典项id "value"-唯一健值 "remark"-备注）
     *
     * @param wyjInfo 唯一健数据（"item"-字典项id "value"-唯一健值 "remark"-备注）
     */
    public void setWyjInfo(String wyjInfo) {
        this.wyjInfo = wyjInfo;
    }

    /**
     * 获取涉案对象信息（"name"-"姓名" "id_card"-证件号码 "phone"-联系电话 "address"-"现住址" "remark"-描述）
     *
     * @return sadx_info - 涉案对象信息（"name"-"姓名" "id_card"-证件号码 "phone"-联系电话 "address"-"现住址" "remark"-描述）
     */
    public String getSadxInfo() {
        return sadxInfo;
    }

    /**
     * 设置涉案对象信息（"name"-"姓名" "id_card"-证件号码 "phone"-联系电话 "address"-"现住址" "remark"-描述）
     *
     * @param sadxInfo 涉案对象信息（"name"-"姓名" "id_card"-证件号码 "phone"-联系电话 "address"-"现住址" "remark"-描述）
     */
    public void setSadxInfo(String sadxInfo) {
        this.sadxInfo = sadxInfo;
    }

    /**
     * 获取笔录摘要
     *
     * @return blzy - 笔录摘要
     */
    public String getBlzy() {
        return blzy;
    }

    /**
     * 设置笔录摘要
     *
     * @param blzy 笔录摘要
     */
    public void setBlzy(String blzy) {
        this.blzy = blzy;
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
     * 获取对应笔录id
     *
     * @return record_id - 对应笔录id
     */
    public Integer getRecordId() {
        return recordId;
    }

    /**
     * 设置对应笔录id
     *
     * @param recordId 对应笔录id
     */
    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }
}