package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "t_black_list")
public class TBlackList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 主题表主键
     */
    @Column(name = "top_id")
    private Integer topId;

    /**
     * 对应排除的es笔录或警情的主键
     */
    @Column(name = "analysis_ids")
    private String analysisIds;

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
     * 获取主题表主键
     *
     * @return top_id - 主题表主键
     */
    public Integer getTopId() {
        return topId;
    }

    /**
     * 设置主题表主键
     *
     * @param topId 主题表主键
     */
    public void setTopId(Integer topId) {
        this.topId = topId;
    }

    /**
     * 获取对应排除的es笔录或警情的主键
     *
     * @return analysis_ids - 对应排除的es笔录或警情的主键
     */
    public String getAnalysisIds() {
        return analysisIds;
    }

    /**
     * 设置对应排除的es笔录或警情的主键
     *
     * @param analysisIds 对应排除的es笔录或警情的主键
     */
    public void setAnalysisIds(String analysisIds) {
        this.analysisIds = analysisIds;
    }
}