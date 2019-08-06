package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "t_template_question")
public class TTemplateQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "template_id")
    private Integer templateId;

    @Column(name = "sort_num")
    private Integer sortNum;

    private String question;

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
     * @return template_id
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * @param templateId
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    /**
     * @return sort_num
     */
    public Integer getSortNum() {
        return sortNum;
    }

    /**
     * @param sortNum
     */
    public void setSortNum(Integer sortNum) {
        this.sortNum = sortNum;
    }

    /**
     * @return question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question
     */
    public void setQuestion(String question) {
        this.question = question;
    }
}