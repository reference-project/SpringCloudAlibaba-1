package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_template")
public class TTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String status;

    @Column(name = "create_time")
    private Date createTime;

    private String name;

    @Column(name = "menu_ids")
    private String menuIds;

    private String content;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "html_content")
    private String htmlContent;

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
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return menu_ids
     */
    public String getMenuIds() {
        return menuIds;
    }

    /**
     * @param menuIds
     */
    public void setMenuIds(String menuIds) {
        this.menuIds = menuIds;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return html_content
     */
    public String getHtmlContent() {
        return htmlContent;
    }

    /**
     * @param htmlContent
     */
    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }
}