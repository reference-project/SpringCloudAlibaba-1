package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "t_legislation")
public class TLegislation {
    /**
     * 自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 排序字段，从小到大
     */
    @Column(name = "sort_num")
    private Integer sortNum;

    /**
     * 状态，填0即可
     */
    private String status;

    /**
     * 获取自增主键
     *
     * @return id - 自增主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增主键
     *
     * @param id 自增主键
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取排序字段，从小到大
     *
     * @return sort_num - 排序字段，从小到大
     */
    public Integer getSortNum() {
        return sortNum;
    }

    /**
     * 设置排序字段，从小到大
     *
     * @param sortNum 排序字段，从小到大
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * 获取状态，填0即可
     *
     * @return status - 状态，填0即可
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态，填0即可
     *
     * @param status 状态，填0即可
     */
    public void setStatus(String status) {
        this.status = status;
    }
}