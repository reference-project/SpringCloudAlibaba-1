package com.ht.micro.record.commons.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "word_freq_b")
public class WordFreqB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 词
     */
    private String name;

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
     * 获取词
     *
     * @return name - 词
     */
    public String getName() {
        return name;
    }

    /**
     * 设置词
     *
     * @param name 词
     */
    public void setName(String name) {
        this.name = name;
    }
}