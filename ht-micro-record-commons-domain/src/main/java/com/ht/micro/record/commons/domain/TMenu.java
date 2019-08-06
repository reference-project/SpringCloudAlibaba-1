package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "t_menu")
public class TMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String code;

    /**
     * 菜单名称
     */
    private String name;

    private Integer sort;

    @Column(name = "p_id")
    private Integer pId;

    /**
     * 菜单level
     */
    private Integer level;

    /**
     * （hdc）自主分析url
     */
    private String url;

    /**
     * 图片路径
     */
    @Column(name = "picture_url")
    private String pictureUrl;

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
     * 获取菜单名称
     *
     * @return name - 菜单名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置菜单名称
     *
     * @param name 菜单名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * @param sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * @return p_id
     */
    public Integer getpId() {
        return pId;
    }

    /**
     * @param pId
     */
    public void setpId(Integer pId) {
        this.pId = pId;
    }

    /**
     * 获取菜单level
     *
     * @return level - 菜单level
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置菜单level
     *
     * @param level 菜单level
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取（hdc）自主分析url
     *
     * @return url - （hdc）自主分析url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置（hdc）自主分析url
     *
     * @param url （hdc）自主分析url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取图片路径
     *
     * @return picture_url - 图片路径
     */
    public String getPictureUrl() {
        return pictureUrl;
    }

    /**
     * 设置图片路径
     *
     * @param pictureUrl 图片路径
     */
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
}