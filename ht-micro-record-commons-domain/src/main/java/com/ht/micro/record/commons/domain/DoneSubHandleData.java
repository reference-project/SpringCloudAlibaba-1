package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "done_sub_handle_data")
public class DoneSubHandleData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 处警编号
     */
    private String cjbh;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取处警编号
     *
     * @return cjbh - 处警编号
     */
    public String getCjbh() {
        return cjbh;
    }

    /**
     * 设置处警编号
     *
     * @param cjbh 处警编号
     */
    public void setCjbh(String cjbh) {
        this.cjbh = cjbh;
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
}