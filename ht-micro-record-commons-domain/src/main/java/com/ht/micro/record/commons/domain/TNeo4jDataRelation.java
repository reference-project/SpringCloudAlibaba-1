package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "t_neo4j_data_relation")
public class TNeo4jDataRelation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 接警编号
     */
    private String jjbh;

    /**
     * 关系
     */
    private String relation;

    /**
     * 相似接警编号
     */
    @Column(name = "sim_jjbh")
    private String simJjbh;

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
     * 获取接警编号
     *
     * @return jjbh - 接警编号
     */
    public String getJjbh() {
        return jjbh;
    }

    /**
     * 设置接警编号
     *
     * @param jjbh 接警编号
     */
    public void setJjbh(String jjbh) {
        this.jjbh = jjbh;
    }

    /**
     * 获取关系
     *
     * @return relation - 关系
     */
    public String getRelation() {
        return relation;
    }

    /**
     * 设置关系
     *
     * @param relation 关系
     */
    public void setRelation(String relation) {
        this.relation = relation;
    }

    /**
     * 获取相似接警编号
     *
     * @return sim_jjbh - 相似接警编号
     */
    public String getSimJjbh() {
        return simJjbh;
    }

    /**
     * 设置相似接警编号
     *
     * @param simJjbh 相似接警编号
     */
    public void setSimJjbh(String simJjbh) {
        this.simJjbh = simJjbh;
    }
}