package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "chat_conten")
public class ChatConten {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 房间号
     */
    @Column(name = "room_id")
    private Integer roomId;

    /**
     * 发送者id
     */
    @Column(name = "send_user_id")
    private Integer sendUserId;

    /**
     * 接收人id
     */
    @Column(name = "received_id")
    private Integer receivedId;

    /**
     * 发送信息
     */
    private String msg;

    /**
     * 发送时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 发送人姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 在线人数
     */
    @Column(name = "online_count")
    private Integer onlineCount;

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
     * 获取房间号
     *
     * @return room_id - 房间号
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * 设置房间号
     *
     * @param roomId 房间号
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * 获取发送者id
     *
     * @return send_user_id - 发送者id
     */
    public Integer getSendUserId() {
        return sendUserId;
    }

    /**
     * 设置发送者id
     *
     * @param sendUserId 发送者id
     */
    public void setSendUserId(Integer sendUserId) {
        this.sendUserId = sendUserId;
    }

    /**
     * 获取接收人id
     *
     * @return received_id - 接收人id
     */
    public Integer getReceivedId() {
        return receivedId;
    }

    /**
     * 设置接收人id
     *
     * @param receivedId 接收人id
     */
    public void setReceivedId(Integer receivedId) {
        this.receivedId = receivedId;
    }

    /**
     * 获取发送信息
     *
     * @return msg - 发送信息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置发送信息
     *
     * @param msg 发送信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 获取发送时间
     *
     * @return create_time - 发送时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置发送时间
     *
     * @param createTime 发送时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取发送人姓名
     *
     * @return user_name - 发送人姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置发送人姓名
     *
     * @param userName 发送人姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取在线人数
     *
     * @return online_count - 在线人数
     */
    public Integer getOnlineCount() {
        return onlineCount;
    }

    /**
     * 设置在线人数
     *
     * @param onlineCount 在线人数
     */
    public void setOnlineCount(Integer onlineCount) {
        this.onlineCount = onlineCount;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }
}