package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "ht_inside_addr")
public class HtInsideAddr {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 上级id
     */
    private Integer pid;

    /**
     * 级别
     */
    private Integer level;

    /**
     * code
     */
    private String code;

    /**
     * 名称
     */
    private String name;

    /**
     * 别名
     */
    private String alias;

    /**
     * 删除状态
     */
    private Integer status;

    @Column(name = "code_suffix")
    private Integer codeSuffix;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取上级id
     *
     * @return pid - 上级id
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 设置上级id
     *
     * @param pid 上级id
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 获取级别
     *
     * @return level - 级别
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置级别
     *
     * @param level 级别
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取code
     *
     * @return code - code
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code
     *
     * @param code code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取别名
     *
     * @return alias - 别名
     */
    public String getAlias() {
        return alias;
    }

    /**
     * 设置别名
     *
     * @param alias 别名
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * 获取删除状态
     *
     * @return status - 删除状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置删除状态
     *
     * @param status 删除状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return code_suffix
     */
    public Integer getCodeSuffix() {
        return codeSuffix;
    }

    /**
     * @param codeSuffix
     */
    public void setCodeSuffix(Integer codeSuffix) {
        this.codeSuffix = codeSuffix;
    }
}