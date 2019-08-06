package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "t_legislation_item")
public class TLegislationItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 所属法律法规ID
     */
    @Column(name = "legislation_id")
    private Integer legislationId;

    /**
     * 条款编号
     */
    @Column(name = "clause_num")
    private Integer clauseNum;

    /**
     * 条款具体内容
     */
    private String content;

    /**
     * 状态，填0即可
     */
    private String status;

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
     * 获取所属法律法规ID
     *
     * @return legislation_id - 所属法律法规ID
     */
    public Integer getLegislationId() {
        return legislationId;
    }

    /**
     * 设置所属法律法规ID
     *
     * @param legislationId 所属法律法规ID
     */
    public void setLegislationId(Integer legislationId) {
        this.legislationId = legislationId;
    }

    /**
     * 获取条款编号
     *
     * @return clause_num - 条款编号
     */
    public Integer getClauseNum() {
        return clauseNum;
    }

    /**
     * 设置条款编号
     *
     * @param clauseNum 条款编号
     */
    public void setClauseNum(Integer clauseNum) {
        this.clauseNum = clauseNum;
    }

    /**
     * 获取条款具体内容
     *
     * @return content - 条款具体内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置条款具体内容
     *
     * @param content 条款具体内容
     */
    public void setContent(String content) {
        this.content = content;
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