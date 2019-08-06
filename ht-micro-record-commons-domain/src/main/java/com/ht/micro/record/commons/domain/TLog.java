package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_log")
public class TLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 业务名称
     */
    @Column(name = "bus_name")
    private String busName;

    /**
     * 操作人警号
     */
    @Column(name = "operator_num")
    private String operatorNum;

    /**
     * 操作人姓名
     */
    @Column(name = "operator_name")
    private String operatorName;

    /**
     * 操作类型
     */
    @Column(name = "operate_type")
    private String operateType;

    /**
     * 操作时间
     */
    @Column(name = "operate_time")
    private Date operateTime;

    /**
     * 操作内容
     */
    @Column(name = "operate_txt")
    private String operateTxt;

    /**
     * 操作人用户id
     */
    @Column(name = "operate_id")
    private Integer operateId;

    /**
     * 笔录新增或修改的笔录id
     */
    @Column(name = "case_info_id")
    private Integer caseInfoId;

    /**
     * 终端标识
     */
    @Column(name = "terminal_id")
    private String terminalId;

    /**
     * 1:成功；0：失败
     */
    @Column(name = "operate_result")
    private String operateResult;

    /**
     * 操作条件
     */
    @Column(name = "operate_condition")
    private String operateCondition;

    /**
     * 查询 日志被接收的处理情况
     */
    @Column(name = "query_status")
    private String queryStatus;

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
     * 获取业务名称
     *
     * @return bus_name - 业务名称
     */
    public String getBusName() {
        return busName;
    }

    /**
     * 设置业务名称
     *
     * @param busName 业务名称
     */
    public void setBusName(String busName) {
        this.busName = busName;
    }

    /**
     * 获取操作人警号
     *
     * @return operator_num - 操作人警号
     */
    public String getOperatorNum() {
        return operatorNum;
    }

    /**
     * 设置操作人警号
     *
     * @param operatorNum 操作人警号
     */
    public void setOperatorNum(String operatorNum) {
        this.operatorNum = operatorNum;
    }

    /**
     * 获取操作人姓名
     *
     * @return operator_name - 操作人姓名
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * 设置操作人姓名
     *
     * @param operatorName 操作人姓名
     */
    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    /**
     * 获取操作类型
     *
     * @return operate_type - 操作类型
     */
    public String getOperateType() {
        return operateType;
    }

    /**
     * 设置操作类型
     *
     * @param operateType 操作类型
     */
    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    /**
     * 获取操作时间
     *
     * @return operate_time - 操作时间
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * 设置操作时间
     *
     * @param operateTime 操作时间
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    /**
     * 获取操作内容
     *
     * @return operate_txt - 操作内容
     */
    public String getOperateTxt() {
        return operateTxt;
    }

    /**
     * 设置操作内容
     *
     * @param operateTxt 操作内容
     */
    public void setOperateTxt(String operateTxt) {
        this.operateTxt = operateTxt;
    }

    /**
     * 获取操作人用户id
     *
     * @return operate_id - 操作人用户id
     */
    public Integer getOperateId() {
        return operateId;
    }

    /**
     * 设置操作人用户id
     *
     * @param operateId 操作人用户id
     */
    public void setOperateId(Integer operateId) {
        this.operateId = operateId;
    }

    /**
     * 获取笔录新增或修改的笔录id
     *
     * @return case_info_id - 笔录新增或修改的笔录id
     */
    public Integer getCaseInfoId() {
        return caseInfoId;
    }

    /**
     * 设置笔录新增或修改的笔录id
     *
     * @param caseInfoId 笔录新增或修改的笔录id
     */
    public void setCaseInfoId(Integer caseInfoId) {
        this.caseInfoId = caseInfoId;
    }

    /**
     * 获取终端标识
     *
     * @return terminal_id - 终端标识
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * 设置终端标识
     *
     * @param terminalId 终端标识
     */
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    /**
     * 获取1:成功；0：失败
     *
     * @return operate_result - 1:成功；0：失败
     */
    public String getOperateResult() {
        return operateResult;
    }

    /**
     * 设置1:成功；0：失败
     *
     * @param operateResult 1:成功；0：失败
     */
    public void setOperateResult(String operateResult) {
        this.operateResult = operateResult;
    }

    /**
     * 获取操作条件
     *
     * @return operate_condition - 操作条件
     */
    public String getOperateCondition() {
        return operateCondition;
    }

    /**
     * 设置操作条件
     *
     * @param operateCondition 操作条件
     */
    public void setOperateCondition(String operateCondition) {
        this.operateCondition = operateCondition;
    }

    /**
     * 获取查询 日志被接收的处理情况
     *
     * @return query_status - 查询 日志被接收的处理情况
     */
    public String getQueryStatus() {
        return queryStatus;
    }

    /**
     * 设置查询 日志被接收的处理情况
     *
     * @param queryStatus 查询 日志被接收的处理情况
     */
    public void setQueryStatus(String queryStatus) {
        this.queryStatus = queryStatus;
    }
}