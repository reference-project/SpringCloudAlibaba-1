package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "t_case_group")
public class TCaseGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "case_id")
    private Integer caseId;

    /**
     * 辨认模板id
     */
    @Column(name = "read_user_group")
    private Integer readUserGroup;

    /**
     * 选中的图片id
     */
    @Column(name = "choose_pic_id")
    private Integer choosePicId;

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
     * @return case_id
     */
    public Integer getCaseId() {
        return caseId;
    }

    /**
     * @param caseId
     */
    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    /**
     * 获取辨认模板id
     *
     * @return read_user_group - 辨认模板id
     */
    public Integer getReadUserGroup() {
        return readUserGroup;
    }

    /**
     * 设置辨认模板id
     *
     * @param readUserGroup 辨认模板id
     */
    public void setReadUserGroup(Integer readUserGroup) {
        this.readUserGroup = readUserGroup;
    }

    /**
     * 获取选中的图片id
     *
     * @return choose_pic_id - 选中的图片id
     */
    public Integer getChoosePicId() {
        return choosePicId;
    }

    /**
     * 设置选中的图片id
     *
     * @param choosePicId 选中的图片id
     */
    public void setChoosePicId(Integer choosePicId) {
        this.choosePicId = choosePicId;
    }
}