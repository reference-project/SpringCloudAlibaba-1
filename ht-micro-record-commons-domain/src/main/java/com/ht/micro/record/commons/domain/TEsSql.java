package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_es_sql")
public class TEsSql {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 查询sql
     */
    @Column(name = "select_sql")
    private String selectSql;

    /**
     * 查询时间
     */
    @Column(name = "select_date")
    private Date selectDate;

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
     * 获取查询sql
     *
     * @return select_sql - 查询sql
     */
    public String getSelectSql() {
        return selectSql;
    }

    /**
     * 设置查询sql
     *
     * @param selectSql 查询sql
     */
    public void setSelectSql(String selectSql) {
        this.selectSql = selectSql;
    }

    /**
     * 获取查询时间
     *
     * @return select_date - 查询时间
     */
    public Date getSelectDate() {
        return selectDate;
    }

    /**
     * 设置查询时间
     *
     * @param selectDate 查询时间
     */
    public void setSelectDate(Date selectDate) {
        this.selectDate = selectDate;
    }
}