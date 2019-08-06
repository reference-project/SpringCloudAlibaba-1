package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_case_info")
public class TCaseInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 当前案由
     */
    @Column(name = "current_cause")
    private String currentCause;

    /**
     * 部门id
     */
    @Column(name = "depart_id")
    private Integer departId;

    /**
     * 部门树
     */
    @Column(name = "depart_arr")
    private String departArr;

    /**
     * 办案单位
     */
    @Column(name = "handle_unit")
    private String handleUnit;

    /**
     * 案件编号
     */
    @Column(name = "case_code")
    private String caseCode;

    /**
     * 询问人1警号
     */
    @Column(name = "ask_person1_code")
    private String askPerson1Code;

    /**
     * 询问人1
     */
    @Column(name = "ask_person1")
    private String askPerson1;

    /**
     * 询问人2警号
     */
    @Column(name = "ask_person2_code")
    private String askPerson2Code;

    /**
     * 询问人2
     */
    @Column(name = "ask_person2")
    private String askPerson2;

    /**
     * 记录人警号
     */
    @Column(name = "recorder_code")
    private String recorderCode;

    /**
     * 记录人
     */
    private String recorder;

    /**
     * 问话地点
     */
    @Column(name = "ask_address")
    private String askAddress;

    /**
     * 询问对象字典id
     */
    @Column(name = "ask_obj_id")
    private Integer askObjId;

    /**
     * 询问对象
     */
    @Column(name = "ask_obj")
    private String askObj;

    /**
     * 到案方式
     */
    @Column(name = "accomplices_way")
    private Integer accomplicesWay;

    /**
     * 到达时间
     */
    @Column(name = "arrive_time")
    private Date arriveTime;

    /**
     * 离开时间
     */
    @Column(name = "leave_time")
    private Date leaveTime;

    /**
     * 询问次数
     */
    @Column(name = "question_count")
    private Integer questionCount;

    /**
     * 案件名称
     */
    @Column(name = "case_name")
    private String caseName;

    /**
     * 证件类型字典id
     */
    @Column(name = "certificate_id")
    private Integer certificateId;

    /**
     * 证件类型
     */
    @Column(name = "certificate_type")
    private String certificateType;

    /**
     * 证件号码
     */
    @Column(name = "certificate_num")
    private String certificateNum;

    /**
     * 被讯问人姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 曾用名
     */
    @Column(name = "used_name")
    private String usedName;

    /**
     * 年龄
     */
    private String age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 外号
     */
    @Column(name = "nick_name")
    private String nickName;

    /**
     * 出生日期
     */
    @Column(name = "birth_date")
    private String birthDate;

    /**
     * 民族
     */
    private Integer nation;

    /**
     * 国籍
     */
    private Integer nationality;

    /**
     * 政治面貌
     */
    @Column(name = "politics_status")
    private Integer politicsStatus;

    /**
     * 文化程度
     */
    @Column(name = "education_degree")
    private Integer educationDegree;

    /**
     * 是否人大代表(0:否 1:是)
     */
    @Column(name = "is_npc_member")
    private Integer isNpcMember;

    /**
     * 职业
     */
    private String position;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 工作单位
     */
    @Column(name = "work_unit")
    private String workUnit;

    /**
     * 户籍地
     */
    @Column(name = "register_place")
    private String registerPlace;

    /**
     * 现居地
     */
    @Column(name = "present_address")
    private Integer presentAddress;

    /**
     * 现居地详情
     */
    @Column(name = "present_address_detail")
    private String presentAddressDetail;

    /**
     * 违法记录
     */
    @Column(name = "illegal_record")
    private String illegalRecord;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 笔录开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 笔录结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 笔录类型str（12,13,14三层）
     */
    @Column(name = "type_arr")
    private String typeArr;

    /**
     * 笔录一级类型
     */
    @Column(name = "first_type")
    private Integer firstType;

    /**
     * 笔录二级类型名称
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 询问/讯问
     */
    private String other;

    /**
     * 0:未完成 1:完成(笔录状态)
     */
    private Integer status;

    /**
     * 是否评估(0否 1是)
     */
    @Column(name = "is_evaluate")
    private Integer isEvaluate;

    /**
     * 笔录耗时
     */
    @Column(name = "cost_time")
    private String costTime;

    /**
     * 报案时间
     */
    @Column(name = "record_time")
    private String recordTime;

    /**
     * mac机器码
     */
    @Column(name = "mac_id")
    private String macId;

    /**
     * 辨认照片id
     */
    @Column(name = "read_user_id")
    private Integer readUserId;

    /**
     * 笔录创建人
     */
    private Integer creator;

    /**
     * 笔录同步离线端数据标识
     */
    @Column(name = "sync_id")
    private Integer syncId;

    /**
     * 警情辖区code
     */
    private String jqxq;

    /**
     * 文件导出开始时间
     */
    @Column(name = "export_start_time")
    private Date exportStartTime;

    /**
     * 文件导出结束时间
     */
    @Column(name = "export_end_time")
    private Date exportEndTime;

    /**
     * 刑事辨认-笔录头
     */
    @Column(name = "xsbr_head")
    private Integer xsbrHead;

    /**
     * 民警1
     */
    @Column(name = "xsbr_person1")
    private String xsbrPerson1;

    @Column(name = "xsbr_person1_code")
    private String xsbrPerson1Code;

    /**
     * 民警2
     */
    @Column(name = "xsbr_person2")
    private String xsbrPerson2;

    @Column(name = "xsbr_person2_code")
    private String xsbrPerson2Code;

    /**
     * 辨认对象
     */
    @Column(name = "xsbr_brdx")
    private String xsbrBrdx;

    /**
     * 地点
     */
    @Column(name = "xsbr_location")
    private String xsbrLocation;

    /**
     * 目的
     */
    @Column(name = "xsbr_goal")
    private String xsbrGoal;

    /**
     * 刑事辨认-开始时间
     */
    @Column(name = "xsbr_startime")
    private Date xsbrStartime;

    /**
     * 刑事辨认-结束时间
     */
    @Column(name = "xsbr_endtime")
    private Date xsbrEndtime;

    /**
     * 见证人-身份证类型
     */
    @Column(name = "xsbr_jzr_cer_type")
    private Integer xsbrJzrCerType;

    /**
     * 见证人-身份证号码
     */
    @Column(name = "xsbr_jzr_cer_num")
    private String xsbrJzrCerNum;

    /**
     * 见证人-性别
     */
    @Column(name = "xsbr_jzr_sex")
    private String xsbrJzrSex;

    /**
     * 见证人-年龄
     */
    @Column(name = "xsbr_jzr_age")
    private String xsbrJzrAge;

    /**
     * 见证人姓名
     */
    @Column(name = "xsbr_jzr")
    private String xsbrJzr;

    /**
     * 见证人-工作单位
     */
    @Column(name = "xsbr_jzr_unit")
    private String xsbrJzrUnit;

    /**
     * 见证人-地址
     */
    @Column(name = "xsbr_jzr_address")
    private String xsbrJzrAddress;

    /**
     * 在场人员
     */
    @Column(name = "xsbr_zcry")
    private String xsbrZcry;

    /**
     * 作案地点详细地址
     */
    @Column(name = "crime_address")
    private String crimeAddress;

    /**
     * 作案地址的纬度
     */
    private String latitudel;

    /**
     * 作案地址的经度
     */
    private String longitude;

    /**
     * 删除标记( 1 已删除 )
     */
    @Column(name = "is_delete")
    private String isDelete;

    /**
     * 根据经纬度查询的地址信息  
     */
    @Column(name = "coordinate_address")
    private String coordinateAddress;

    /**
     * 报警类型
     */
    private String bjlx;

    /**
     * 跟新次数
     */
    @Column(name = "update_count")
    private Integer updateCount;

    /**
     * 纯文本
     */
    @Column(name = "plain_text")
    private String plainText;

    /**
     * 模板父文本
     */
    private String text;

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
     * 获取当前案由
     *
     * @return current_cause - 当前案由
     */
    public String getCurrentCause() {
        return currentCause;
    }

    /**
     * 设置当前案由
     *
     * @param currentCause 当前案由
     */
    public void setCurrentCause(String currentCause) {
        this.currentCause = currentCause;
    }

    /**
     * 获取部门id
     *
     * @return depart_id - 部门id
     */
    public Integer getDepartId() {
        return departId;
    }

    /**
     * 设置部门id
     *
     * @param departId 部门id
     */
    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    /**
     * 获取部门树
     *
     * @return depart_arr - 部门树
     */
    public String getDepartArr() {
        return departArr;
    }

    /**
     * 设置部门树
     *
     * @param departArr 部门树
     */
    public void setDepartArr(String departArr) {
        this.departArr = departArr;
    }

    /**
     * 获取办案单位
     *
     * @return handle_unit - 办案单位
     */
    public String getHandleUnit() {
        return handleUnit;
    }

    /**
     * 设置办案单位
     *
     * @param handleUnit 办案单位
     */
    public void setHandleUnit(String handleUnit) {
        this.handleUnit = handleUnit;
    }

    /**
     * 获取案件编号
     *
     * @return case_code - 案件编号
     */
    public String getCaseCode() {
        return caseCode;
    }

    /**
     * 设置案件编号
     *
     * @param caseCode 案件编号
     */
    public void setCaseCode(String caseCode) {
        this.caseCode = caseCode;
    }

    /**
     * 获取询问人1警号
     *
     * @return ask_person1_code - 询问人1警号
     */
    public String getAskPerson1Code() {
        return askPerson1Code;
    }

    /**
     * 设置询问人1警号
     *
     * @param askPerson1Code 询问人1警号
     */
    public void setAskPerson1Code(String askPerson1Code) {
        this.askPerson1Code = askPerson1Code;
    }

    /**
     * 获取询问人1
     *
     * @return ask_person1 - 询问人1
     */
    public String getAskPerson1() {
        return askPerson1;
    }

    /**
     * 设置询问人1
     *
     * @param askPerson1 询问人1
     */
    public void setAskPerson1(String askPerson1) {
        this.askPerson1 = askPerson1;
    }

    /**
     * 获取询问人2警号
     *
     * @return ask_person2_code - 询问人2警号
     */
    public String getAskPerson2Code() {
        return askPerson2Code;
    }

    /**
     * 设置询问人2警号
     *
     * @param askPerson2Code 询问人2警号
     */
    public void setAskPerson2Code(String askPerson2Code) {
        this.askPerson2Code = askPerson2Code;
    }

    /**
     * 获取询问人2
     *
     * @return ask_person2 - 询问人2
     */
    public String getAskPerson2() {
        return askPerson2;
    }

    /**
     * 设置询问人2
     *
     * @param askPerson2 询问人2
     */
    public void setAskPerson2(String askPerson2) {
        this.askPerson2 = askPerson2;
    }

    /**
     * 获取记录人警号
     *
     * @return recorder_code - 记录人警号
     */
    public String getRecorderCode() {
        return recorderCode;
    }

    /**
     * 设置记录人警号
     *
     * @param recorderCode 记录人警号
     */
    public void setRecorderCode(String recorderCode) {
        this.recorderCode = recorderCode;
    }

    /**
     * 获取记录人
     *
     * @return recorder - 记录人
     */
    public String getRecorder() {
        return recorder;
    }

    /**
     * 设置记录人
     *
     * @param recorder 记录人
     */
    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    /**
     * 获取问话地点
     *
     * @return ask_address - 问话地点
     */
    public String getAskAddress() {
        return askAddress;
    }

    /**
     * 设置问话地点
     *
     * @param askAddress 问话地点
     */
    public void setAskAddress(String askAddress) {
        this.askAddress = askAddress;
    }

    /**
     * 获取询问对象字典id
     *
     * @return ask_obj_id - 询问对象字典id
     */
    public Integer getAskObjId() {
        return askObjId;
    }

    /**
     * 设置询问对象字典id
     *
     * @param askObjId 询问对象字典id
     */
    public void setAskObjId(Integer askObjId) {
        this.askObjId = askObjId;
    }

    /**
     * 获取询问对象
     *
     * @return ask_obj - 询问对象
     */
    public String getAskObj() {
        return askObj;
    }

    /**
     * 设置询问对象
     *
     * @param askObj 询问对象
     */
    public void setAskObj(String askObj) {
        this.askObj = askObj;
    }

    /**
     * 获取到案方式
     *
     * @return accomplices_way - 到案方式
     */
    public Integer getAccomplicesWay() {
        return accomplicesWay;
    }

    /**
     * 设置到案方式
     *
     * @param accomplicesWay 到案方式
     */
    public void setAccomplicesWay(Integer accomplicesWay) {
        this.accomplicesWay = accomplicesWay;
    }

    /**
     * 获取到达时间
     *
     * @return arrive_time - 到达时间
     */
    public Date getArriveTime() {
        return arriveTime;
    }

    /**
     * 设置到达时间
     *
     * @param arriveTime 到达时间
     */
    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    /**
     * 获取离开时间
     *
     * @return leave_time - 离开时间
     */
    public Date getLeaveTime() {
        return leaveTime;
    }

    /**
     * 设置离开时间
     *
     * @param leaveTime 离开时间
     */
    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    /**
     * 获取询问次数
     *
     * @return question_count - 询问次数
     */
    public Integer getQuestionCount() {
        return questionCount;
    }

    /**
     * 设置询问次数
     *
     * @param questionCount 询问次数
     */
    public void setQuestionCount(Integer questionCount) {
        this.questionCount = questionCount;
    }

    /**
     * 获取案件名称
     *
     * @return case_name - 案件名称
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * 设置案件名称
     *
     * @param caseName 案件名称
     */
    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    /**
     * 获取证件类型字典id
     *
     * @return certificate_id - 证件类型字典id
     */
    public Integer getCertificateId() {
        return certificateId;
    }

    /**
     * 设置证件类型字典id
     *
     * @param certificateId 证件类型字典id
     */
    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * 获取证件类型
     *
     * @return certificate_type - 证件类型
     */
    public String getCertificateType() {
        return certificateType;
    }

    /**
     * 设置证件类型
     *
     * @param certificateType 证件类型
     */
    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * 获取证件号码
     *
     * @return certificate_num - 证件号码
     */
    public String getCertificateNum() {
        return certificateNum;
    }

    /**
     * 设置证件号码
     *
     * @param certificateNum 证件号码
     */
    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum;
    }

    /**
     * 获取被讯问人姓名
     *
     * @return user_name - 被讯问人姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置被讯问人姓名
     *
     * @param userName 被讯问人姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * 获取外号
     *
     * @return nick_name - 外号
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 设置外号
     *
     * @param nickName 外号
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
     * 获取文化程度
     *
     * @return education_degree - 文化程度
     */
    public Integer getEducationDegree() {
        return educationDegree;
    }

    /**
     * 设置文化程度
     *
     * @param educationDegree 文化程度
     */
    public void setEducationDegree(Integer educationDegree) {
        this.educationDegree = educationDegree;
    }

    /**
     * 获取是否人大代表(0:否 1:是)
     *
     * @return is_npc_member - 是否人大代表(0:否 1:是)
     */
    public Integer getIsNpcMember() {
        return isNpcMember;
    }

    /**
     * 设置是否人大代表(0:否 1:是)
     *
     * @param isNpcMember 是否人大代表(0:否 1:是)
     */
    public void setIsNpcMember(Integer isNpcMember) {
        this.isNpcMember = isNpcMember;
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
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
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
     * 获取户籍地
     *
     * @return register_place - 户籍地
     */
    public String getRegisterPlace() {
        return registerPlace;
    }

    /**
     * 设置户籍地
     *
     * @param registerPlace 户籍地
     */
    public void setRegisterPlace(String registerPlace) {
        this.registerPlace = registerPlace;
    }

    /**
     * 获取现居地
     *
     * @return present_address - 现居地
     */
    public Integer getPresentAddress() {
        return presentAddress;
    }

    /**
     * 设置现居地
     *
     * @param presentAddress 现居地
     */
    public void setPresentAddress(Integer presentAddress) {
        this.presentAddress = presentAddress;
    }

    /**
     * 获取现居地详情
     *
     * @return present_address_detail - 现居地详情
     */
    public String getPresentAddressDetail() {
        return presentAddressDetail;
    }

    /**
     * 设置现居地详情
     *
     * @param presentAddressDetail 现居地详情
     */
    public void setPresentAddressDetail(String presentAddressDetail) {
        this.presentAddressDetail = presentAddressDetail;
    }

    /**
     * 获取违法记录
     *
     * @return illegal_record - 违法记录
     */
    public String getIllegalRecord() {
        return illegalRecord;
    }

    /**
     * 设置违法记录
     *
     * @param illegalRecord 违法记录
     */
    public void setIllegalRecord(String illegalRecord) {
        this.illegalRecord = illegalRecord;
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
     * 获取笔录开始时间
     *
     * @return start_time - 笔录开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置笔录开始时间
     *
     * @param startTime 笔录开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取笔录结束时间
     *
     * @return end_time - 笔录结束时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置笔录结束时间
     *
     * @param endTime 笔录结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取笔录类型str（12,13,14三层）
     *
     * @return type_arr - 笔录类型str（12,13,14三层）
     */
    public String getTypeArr() {
        return typeArr;
    }

    /**
     * 设置笔录类型str（12,13,14三层）
     *
     * @param typeArr 笔录类型str（12,13,14三层）
     */
    public void setTypeArr(String typeArr) {
        this.typeArr = typeArr;
    }

    /**
     * 获取笔录一级类型
     *
     * @return first_type - 笔录一级类型
     */
    public Integer getFirstType() {
        return firstType;
    }

    /**
     * 设置笔录一级类型
     *
     * @param firstType 笔录一级类型
     */
    public void setFirstType(Integer firstType) {
        this.firstType = firstType;
    }

    /**
     * 获取笔录二级类型名称
     *
     * @return type_name - 笔录二级类型名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置笔录二级类型名称
     *
     * @param typeName 笔录二级类型名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取询问/讯问
     *
     * @return other - 询问/讯问
     */
    public String getOther() {
        return other;
    }

    /**
     * 设置询问/讯问
     *
     * @param other 询问/讯问
     */
    public void setOther(String other) {
        this.other = other;
    }

    /**
     * 获取0:未完成 1:完成(笔录状态)
     *
     * @return status - 0:未完成 1:完成(笔录状态)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0:未完成 1:完成(笔录状态)
     *
     * @param status 0:未完成 1:完成(笔录状态)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取是否评估(0否 1是)
     *
     * @return is_evaluate - 是否评估(0否 1是)
     */
    public Integer getIsEvaluate() {
        return isEvaluate;
    }

    /**
     * 设置是否评估(0否 1是)
     *
     * @param isEvaluate 是否评估(0否 1是)
     */
    public void setIsEvaluate(Integer isEvaluate) {
        this.isEvaluate = isEvaluate;
    }

    /**
     * 获取笔录耗时
     *
     * @return cost_time - 笔录耗时
     */
    public String getCostTime() {
        return costTime;
    }

    /**
     * 设置笔录耗时
     *
     * @param costTime 笔录耗时
     */
    public void setCostTime(String costTime) {
        this.costTime = costTime;
    }

    /**
     * 获取报案时间
     *
     * @return record_time - 报案时间
     */
    public String getRecordTime() {
        return recordTime;
    }

    /**
     * 设置报案时间
     *
     * @param recordTime 报案时间
     */
    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    /**
     * 获取mac机器码
     *
     * @return mac_id - mac机器码
     */
    public String getMacId() {
        return macId;
    }

    /**
     * 设置mac机器码
     *
     * @param macId mac机器码
     */
    public void setMacId(String macId) {
        this.macId = macId;
    }

    /**
     * 获取辨认照片id
     *
     * @return read_user_id - 辨认照片id
     */
    public Integer getReadUserId() {
        return readUserId;
    }

    /**
     * 设置辨认照片id
     *
     * @param readUserId 辨认照片id
     */
    public void setReadUserId(Integer readUserId) {
        this.readUserId = readUserId;
    }

    /**
     * 获取笔录创建人
     *
     * @return creator - 笔录创建人
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     * 设置笔录创建人
     *
     * @param creator 笔录创建人
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    /**
     * 获取笔录同步离线端数据标识
     *
     * @return sync_id - 笔录同步离线端数据标识
     */
    public Integer getSyncId() {
        return syncId;
    }

    /**
     * 设置笔录同步离线端数据标识
     *
     * @param syncId 笔录同步离线端数据标识
     */
    public void setSyncId(Integer syncId) {
        this.syncId = syncId;
    }

    /**
     * 获取警情辖区code
     *
     * @return jqxq - 警情辖区code
     */
    public String getJqxq() {
        return jqxq;
    }

    /**
     * 设置警情辖区code
     *
     * @param jqxq 警情辖区code
     */
    public void setJqxq(String jqxq) {
        this.jqxq = jqxq;
    }

    /**
     * 获取文件导出开始时间
     *
     * @return export_start_time - 文件导出开始时间
     */
    public Date getExportStartTime() {
        return exportStartTime;
    }

    /**
     * 设置文件导出开始时间
     *
     * @param exportStartTime 文件导出开始时间
     */
    public void setExportStartTime(Date exportStartTime) {
        this.exportStartTime = exportStartTime;
    }

    /**
     * 获取文件导出结束时间
     *
     * @return export_end_time - 文件导出结束时间
     */
    public Date getExportEndTime() {
        return exportEndTime;
    }

    /**
     * 设置文件导出结束时间
     *
     * @param exportEndTime 文件导出结束时间
     */
    public void setExportEndTime(Date exportEndTime) {
        this.exportEndTime = exportEndTime;
    }

    /**
     * 获取刑事辨认-笔录头
     *
     * @return xsbr_head - 刑事辨认-笔录头
     */
    public Integer getXsbrHead() {
        return xsbrHead;
    }

    /**
     * 设置刑事辨认-笔录头
     *
     * @param xsbrHead 刑事辨认-笔录头
     */
    public void setXsbrHead(Integer xsbrHead) {
        this.xsbrHead = xsbrHead;
    }

    /**
     * 获取民警1
     *
     * @return xsbr_person1 - 民警1
     */
    public String getXsbrPerson1() {
        return xsbrPerson1;
    }

    /**
     * 设置民警1
     *
     * @param xsbrPerson1 民警1
     */
    public void setXsbrPerson1(String xsbrPerson1) {
        this.xsbrPerson1 = xsbrPerson1;
    }

    /**
     * @return xsbr_person1_code
     */
    public String getXsbrPerson1Code() {
        return xsbrPerson1Code;
    }

    /**
     * @param xsbrPerson1Code
     */
    public void setXsbrPerson1Code(String xsbrPerson1Code) {
        this.xsbrPerson1Code = xsbrPerson1Code;
    }

    /**
     * 获取民警2
     *
     * @return xsbr_person2 - 民警2
     */
    public String getXsbrPerson2() {
        return xsbrPerson2;
    }

    /**
     * 设置民警2
     *
     * @param xsbrPerson2 民警2
     */
    public void setXsbrPerson2(String xsbrPerson2) {
        this.xsbrPerson2 = xsbrPerson2;
    }

    /**
     * @return xsbr_person2_code
     */
    public String getXsbrPerson2Code() {
        return xsbrPerson2Code;
    }

    /**
     * @param xsbrPerson2Code
     */
    public void setXsbrPerson2Code(String xsbrPerson2Code) {
        this.xsbrPerson2Code = xsbrPerson2Code;
    }

    /**
     * 获取辨认对象
     *
     * @return xsbr_brdx - 辨认对象
     */
    public String getXsbrBrdx() {
        return xsbrBrdx;
    }

    /**
     * 设置辨认对象
     *
     * @param xsbrBrdx 辨认对象
     */
    public void setXsbrBrdx(String xsbrBrdx) {
        this.xsbrBrdx = xsbrBrdx;
    }

    /**
     * 获取地点
     *
     * @return xsbr_location - 地点
     */
    public String getXsbrLocation() {
        return xsbrLocation;
    }

    /**
     * 设置地点
     *
     * @param xsbrLocation 地点
     */
    public void setXsbrLocation(String xsbrLocation) {
        this.xsbrLocation = xsbrLocation;
    }

    /**
     * 获取目的
     *
     * @return xsbr_goal - 目的
     */
    public String getXsbrGoal() {
        return xsbrGoal;
    }

    /**
     * 设置目的
     *
     * @param xsbrGoal 目的
     */
    public void setXsbrGoal(String xsbrGoal) {
        this.xsbrGoal = xsbrGoal;
    }

    /**
     * 获取刑事辨认-开始时间
     *
     * @return xsbr_startime - 刑事辨认-开始时间
     */
    public Date getXsbrStartime() {
        return xsbrStartime;
    }

    /**
     * 设置刑事辨认-开始时间
     *
     * @param xsbrStartime 刑事辨认-开始时间
     */
    public void setXsbrStartime(Date xsbrStartime) {
        this.xsbrStartime = xsbrStartime;
    }

    /**
     * 获取刑事辨认-结束时间
     *
     * @return xsbr_endtime - 刑事辨认-结束时间
     */
    public Date getXsbrEndtime() {
        return xsbrEndtime;
    }

    /**
     * 设置刑事辨认-结束时间
     *
     * @param xsbrEndtime 刑事辨认-结束时间
     */
    public void setXsbrEndtime(Date xsbrEndtime) {
        this.xsbrEndtime = xsbrEndtime;
    }

    /**
     * 获取见证人-身份证类型
     *
     * @return xsbr_jzr_cer_type - 见证人-身份证类型
     */
    public Integer getXsbrJzrCerType() {
        return xsbrJzrCerType;
    }

    /**
     * 设置见证人-身份证类型
     *
     * @param xsbrJzrCerType 见证人-身份证类型
     */
    public void setXsbrJzrCerType(Integer xsbrJzrCerType) {
        this.xsbrJzrCerType = xsbrJzrCerType;
    }

    /**
     * 获取见证人-身份证号码
     *
     * @return xsbr_jzr_cer_num - 见证人-身份证号码
     */
    public String getXsbrJzrCerNum() {
        return xsbrJzrCerNum;
    }

    /**
     * 设置见证人-身份证号码
     *
     * @param xsbrJzrCerNum 见证人-身份证号码
     */
    public void setXsbrJzrCerNum(String xsbrJzrCerNum) {
        this.xsbrJzrCerNum = xsbrJzrCerNum;
    }

    /**
     * 获取见证人-性别
     *
     * @return xsbr_jzr_sex - 见证人-性别
     */
    public String getXsbrJzrSex() {
        return xsbrJzrSex;
    }

    /**
     * 设置见证人-性别
     *
     * @param xsbrJzrSex 见证人-性别
     */
    public void setXsbrJzrSex(String xsbrJzrSex) {
        this.xsbrJzrSex = xsbrJzrSex;
    }

    /**
     * 获取见证人-年龄
     *
     * @return xsbr_jzr_age - 见证人-年龄
     */
    public String getXsbrJzrAge() {
        return xsbrJzrAge;
    }

    /**
     * 设置见证人-年龄
     *
     * @param xsbrJzrAge 见证人-年龄
     */
    public void setXsbrJzrAge(String xsbrJzrAge) {
        this.xsbrJzrAge = xsbrJzrAge;
    }

    /**
     * 获取见证人姓名
     *
     * @return xsbr_jzr - 见证人姓名
     */
    public String getXsbrJzr() {
        return xsbrJzr;
    }

    /**
     * 设置见证人姓名
     *
     * @param xsbrJzr 见证人姓名
     */
    public void setXsbrJzr(String xsbrJzr) {
        this.xsbrJzr = xsbrJzr;
    }

    /**
     * 获取见证人-工作单位
     *
     * @return xsbr_jzr_unit - 见证人-工作单位
     */
    public String getXsbrJzrUnit() {
        return xsbrJzrUnit;
    }

    /**
     * 设置见证人-工作单位
     *
     * @param xsbrJzrUnit 见证人-工作单位
     */
    public void setXsbrJzrUnit(String xsbrJzrUnit) {
        this.xsbrJzrUnit = xsbrJzrUnit;
    }

    /**
     * 获取见证人-地址
     *
     * @return xsbr_jzr_address - 见证人-地址
     */
    public String getXsbrJzrAddress() {
        return xsbrJzrAddress;
    }

    /**
     * 设置见证人-地址
     *
     * @param xsbrJzrAddress 见证人-地址
     */
    public void setXsbrJzrAddress(String xsbrJzrAddress) {
        this.xsbrJzrAddress = xsbrJzrAddress;
    }

    /**
     * 获取在场人员
     *
     * @return xsbr_zcry - 在场人员
     */
    public String getXsbrZcry() {
        return xsbrZcry;
    }

    /**
     * 设置在场人员
     *
     * @param xsbrZcry 在场人员
     */
    public void setXsbrZcry(String xsbrZcry) {
        this.xsbrZcry = xsbrZcry;
    }

    /**
     * 获取作案地点详细地址
     *
     * @return crime_address - 作案地点详细地址
     */
    public String getCrimeAddress() {
        return crimeAddress;
    }

    /**
     * 设置作案地点详细地址
     *
     * @param crimeAddress 作案地点详细地址
     */
    public void setCrimeAddress(String crimeAddress) {
        this.crimeAddress = crimeAddress;
    }

    /**
     * 获取作案地址的纬度
     *
     * @return latitudel - 作案地址的纬度
     */
    public String getLatitudel() {
        return latitudel;
    }

    /**
     * 设置作案地址的纬度
     *
     * @param latitudel 作案地址的纬度
     */
    public void setLatitudel(String latitudel) {
        this.latitudel = latitudel;
    }

    /**
     * 获取作案地址的经度
     *
     * @return longitude - 作案地址的经度
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * 设置作案地址的经度
     *
     * @param longitude 作案地址的经度
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * 获取删除标记( 1 已删除 )
     *
     * @return is_delete - 删除标记( 1 已删除 )
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * 设置删除标记( 1 已删除 )
     *
     * @param isDelete 删除标记( 1 已删除 )
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取根据经纬度查询的地址信息  
     *
     * @return coordinate_address - 根据经纬度查询的地址信息  
     */
    public String getCoordinateAddress() {
        return coordinateAddress;
    }

    /**
     * 设置根据经纬度查询的地址信息  
     *
     * @param coordinateAddress 根据经纬度查询的地址信息  
     */
    public void setCoordinateAddress(String coordinateAddress) {
        this.coordinateAddress = coordinateAddress;
    }

    /**
     * 获取报警类型
     *
     * @return bjlx - 报警类型
     */
    public String getBjlx() {
        return bjlx;
    }

    /**
     * 设置报警类型
     *
     * @param bjlx 报警类型
     */
    public void setBjlx(String bjlx) {
        this.bjlx = bjlx;
    }

    /**
     * 获取跟新次数
     *
     * @return update_count - 跟新次数
     */
    public Integer getUpdateCount() {
        return updateCount;
    }

    /**
     * 设置跟新次数
     *
     * @param updateCount 跟新次数
     */
    public void setUpdateCount(Integer updateCount) {
        this.updateCount = updateCount;
    }

    /**
     * 获取纯文本
     *
     * @return plain_text - 纯文本
     */
    public String getPlainText() {
        return plainText;
    }

    /**
     * 设置纯文本
     *
     * @param plainText 纯文本
     */
    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    /**
     * 获取模板父文本
     *
     * @return text - 模板父文本
     */
    public String getText() {
        return text;
    }

    /**
     * 设置模板父文本
     *
     * @param text 模板父文本
     */
    public void setText(String text) {
        this.text = text;
    }
}