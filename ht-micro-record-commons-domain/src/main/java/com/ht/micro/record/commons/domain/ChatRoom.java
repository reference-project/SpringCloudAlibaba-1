package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "chat_room")
public class ChatRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 协同案件id
     */
    @Column(name = "collaborative_id")
    private Integer collaborativeId;

    /**
     * 协同案件名称
     */
    @Column(name = "case_name")
    private String caseName;

    /**
     * 房间名称
     */
    @Column(name = "room_name")
    private String roomName;

    /**
     * 是否启用密码
     */
    @Column(name = "whether_pas")
    private Integer whetherPas;

    /**
     * 密码
     */
    private String password;

    /**
     * 参与审讯人员id
     */
    @Column(name = "user_ids")
    private String userIds;

    /**
     * 房间创建人id
     */
    @Column(name = "creator_id")
    private String creatorId;

    /**
     * 创建人名称
     */
    @Column(name = "create_name")
    private String createName;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 聊天内容id集合
     */
    @Column(name = "chat_conten_id")
    private String chatContenId;

    /**
     * 是否结束
     */
    private Integer status;

    /**
     * 创建部门
     */
    @Column(name = "create_dept")
    private Integer createDept;

    /**
     * 创建部门名称
     */
    @Column(name = "dept_name")
    private String deptName;

    /**
     * 创建者警号
     */
    @Column(name = "police_num")
    private String policeNum;

    /**
     * 用户对应的笔录id
     */
    @Column(name = "case_arr_id")
    private String caseArrId;

    /**
     * 参与审讯人员名称集合
     */
    @Column(name = "user_name_arr")
    private String userNameArr;

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
     * 获取协同案件id
     *
     * @return collaborative_id - 协同案件id
     */
    public Integer getCollaborativeId() {
        return collaborativeId;
    }

    /**
     * 设置协同案件id
     *
     * @param collaborativeId 协同案件id
     */
    public void setCollaborativeId(Integer collaborativeId) {
        this.collaborativeId = collaborativeId;
    }

    /**
     * 获取协同案件名称
     *
     * @return case_name - 协同案件名称
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * 设置协同案件名称
     *
     * @param caseName 协同案件名称
     */
    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    /**
     * 获取房间名称
     *
     * @return room_name - 房间名称
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * 设置房间名称
     *
     * @param roomName 房间名称
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * 获取是否启用密码
     *
     * @return whether_pas - 是否启用密码
     */
    public Integer getWhetherPas() {
        return whetherPas;
    }

    /**
     * 设置是否启用密码
     *
     * @param whetherPas 是否启用密码
     */
    public void setWhetherPas(Integer whetherPas) {
        this.whetherPas = whetherPas;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取参与审讯人员id
     *
     * @return user_ids - 参与审讯人员id
     */
    public String getUserIds() {
        return userIds;
    }

    /**
     * 设置参与审讯人员id
     *
     * @param userIds 参与审讯人员id
     */
    public void setUserIds(String userIds) {
        this.userIds = userIds;
    }

    /**
     * 获取房间创建人id
     *
     * @return creator_id - 房间创建人id
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * 设置房间创建人id
     *
     * @param creatorId 房间创建人id
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取创建人名称
     *
     * @return create_name - 创建人名称
     */
    public String getCreateName() {
        return createName;
    }

    /**
     * 设置创建人名称
     *
     * @param createName 创建人名称
     */
    public void setCreateName(String createName) {
        this.createName = createName;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取聊天内容id集合
     *
     * @return chat_conten_id - 聊天内容id集合
     */
    public String getChatContenId() {
        return chatContenId;
    }

    /**
     * 设置聊天内容id集合
     *
     * @param chatContenId 聊天内容id集合
     */
    public void setChatContenId(String chatContenId) {
        this.chatContenId = chatContenId;
    }

    /**
     * 获取是否结束
     *
     * @return status - 是否结束
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置是否结束
     *
     * @param status 是否结束
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建部门
     *
     * @return create_dept - 创建部门
     */
    public Integer getCreateDept() {
        return createDept;
    }

    /**
     * 设置创建部门
     *
     * @param createDept 创建部门
     */
    public void setCreateDept(Integer createDept) {
        this.createDept = createDept;
    }

    /**
     * 获取创建部门名称
     *
     * @return dept_name - 创建部门名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置创建部门名称
     *
     * @param deptName 创建部门名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * 获取创建者警号
     *
     * @return police_num - 创建者警号
     */
    public String getPoliceNum() {
        return policeNum;
    }

    /**
     * 设置创建者警号
     *
     * @param policeNum 创建者警号
     */
    public void setPoliceNum(String policeNum) {
        this.policeNum = policeNum;
    }

    /**
     * 获取用户对应的笔录id
     *
     * @return case_arr_id - 用户对应的笔录id
     */
    public String getCaseArrId() {
        return caseArrId;
    }

    /**
     * 设置用户对应的笔录id
     *
     * @param caseArrId 用户对应的笔录id
     */
    public void setCaseArrId(String caseArrId) {
        this.caseArrId = caseArrId;
    }

    /**
     * 获取参与审讯人员名称集合
     *
     * @return user_name_arr - 参与审讯人员名称集合
     */
    public String getUserNameArr() {
        return userNameArr;
    }

    /**
     * 设置参与审讯人员名称集合
     *
     * @param userNameArr 参与审讯人员名称集合
     */
    public void setUserNameArr(String userNameArr) {
        this.userNameArr = userNameArr;
    }
}