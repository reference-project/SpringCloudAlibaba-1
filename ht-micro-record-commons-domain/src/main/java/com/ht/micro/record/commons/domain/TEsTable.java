package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "t_es_table")
public class TEsTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "table_name_cn")
    private String tableNameCn;

    @Column(name = "table_name_en")
    private String tableNameEn;

    @Column(name = "column_cn")
    private String columnCn;

    @Column(name = "column_en")
    private String columnEn;

    @Column(name = "is_participle")
    private Integer isParticiple;

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
     * @return table_name_cn
     */
    public String getTableNameCn() {
        return tableNameCn;
    }

    /**
     * @param tableNameCn
     */
    public void setTableNameCn(String tableNameCn) {
        this.tableNameCn = tableNameCn;
    }

    /**
     * @return table_name_en
     */
    public String getTableNameEn() {
        return tableNameEn;
    }

    /**
     * @param tableNameEn
     */
    public void setTableNameEn(String tableNameEn) {
        this.tableNameEn = tableNameEn;
    }

    /**
     * @return column_cn
     */
    public String getColumnCn() {
        return columnCn;
    }

    /**
     * @param columnCn
     */
    public void setColumnCn(String columnCn) {
        this.columnCn = columnCn;
    }

    /**
     * @return column_en
     */
    public String getColumnEn() {
        return columnEn;
    }

    /**
     * @param columnEn
     */
    public void setColumnEn(String columnEn) {
        this.columnEn = columnEn;
    }

    /**
     * @return is_participle
     */
    public Integer getIsParticiple() {
        return isParticiple;
    }

    /**
     * @param isParticiple
     */
    public void setIsParticiple(Integer isParticiple) {
        this.isParticiple = isParticiple;
    }
}