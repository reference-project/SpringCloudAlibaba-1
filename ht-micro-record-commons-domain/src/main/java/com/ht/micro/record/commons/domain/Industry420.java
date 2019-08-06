package com.ht.micro.record.commons.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "industry_420")
public class Industry420 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    private Integer level2;

    private Integer level1;

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
     * @return code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return level2
     */
    public Integer getLevel2() {
        return level2;
    }

    /**
     * @param level2
     */
    public void setLevel2(Integer level2) {
        this.level2 = level2;
    }

    /**
     * @return level1
     */
    public Integer getLevel1() {
        return level1;
    }

    /**
     * @param level1
     */
    public void setLevel1(Integer level1) {
        this.level1 = level1;
    }
}