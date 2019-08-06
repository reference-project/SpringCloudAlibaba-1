package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "t_topic_analysis")
public class TTopicAnalysis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 主题表id
     */
    @Column(name = "topId")
    private Integer topid;

    /**
     * 对应主题表查询分析数据
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
     * 获取主题表id
     *
     * @return topId - 主题表id
     */
    public Integer getTopid() {
        return topid;
    }

    /**
     * 设置主题表id
     *
     * @param topid 主题表id
     */
    public void setTopid(Integer topid) {
        this.topid = topid;
    }

    /**
     * 获取对应主题表查询分析数据
     *
     * @return analysis_ids - 对应主题表查询分析数据
     */
    public String getAnalysisIds() {
        return analysisIds;
    }

    /**
     * 设置对应主题表查询分析数据
     *
     * @param analysisIds 对应主题表查询分析数据
     */
    public void setAnalysisIds(String analysisIds) {
        this.analysisIds = analysisIds;
    }
}