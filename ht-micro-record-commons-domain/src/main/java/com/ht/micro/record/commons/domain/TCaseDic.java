package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "t_case_dic")
public class TCaseDic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "case_name")
    private String caseName;

    @Column(name = "cjlb_arr")
    private String cjlbArr;

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
     * @return case_name
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * @param caseName
     */
    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    /**
     * @return cjlb_arr
     */
    public String getCjlbArr() {
        return cjlbArr;
    }

    /**
     * @param cjlbArr
     */
    public void setCjlbArr(String cjlbArr) {
        this.cjlbArr = cjlbArr;
    }
}