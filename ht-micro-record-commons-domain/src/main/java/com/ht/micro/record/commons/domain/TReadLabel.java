package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "t_read_label")
public class TReadLabel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 图片主键
     */
    @Column(name = "read_user_id")
    private Integer readUserId;

    /**
     * 标签主键
     */
    @Column(name = "label_id")
    private String labelId;

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
     * 获取图片主键
     *
     * @return read_user_id - 图片主键
     */
    public Integer getReadUserId() {
        return readUserId;
    }

    /**
     * 设置图片主键
     *
     * @param readUserId 图片主键
     */
    public void setReadUserId(Integer readUserId) {
        this.readUserId = readUserId;
    }

    /**
     * 获取标签主键
     *
     * @return label_id - 标签主键
     */
    public String getLabelId() {
        return labelId;
    }

    /**
     * 设置标签主键
     *
     * @param labelId 标签主键
     */
    public void setLabelId(String labelId) {
        this.labelId = labelId;
    }
}