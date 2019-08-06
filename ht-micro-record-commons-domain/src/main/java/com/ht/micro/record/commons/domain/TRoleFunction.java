package com.ht.micro.record.commons.domain;

import javax.persistence.*;

@Table(name = "t_role_function")
public class TRoleFunction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "function_id")
    private Integer functionId;

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
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return function_id
     */
    public Integer getFunctionId() {
        return functionId;
    }

    /**
     * @param functionId
     */
    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }
}