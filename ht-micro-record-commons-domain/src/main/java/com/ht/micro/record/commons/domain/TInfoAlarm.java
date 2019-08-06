package com.ht.micro.record.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "t_info_alarm")
public class TInfoAlarm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String jjbh;

    private Date jjrqsj;

    private String sfdd;

    private String cjlb;

    private String cjxxdd;

    private String cjxz;

    private String cjdw;

    private String cjdwmc;

    private Date sfsjsx;

    private Date sfsjxx;

    private String cjbh;

    @Column(name = "create_time")
    private Date createTime;

    private String bjnr;

    private String cljgnr;

    private String bccljg;

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
     * @return jjbh
     */
    public String getJjbh() {
        return jjbh;
    }

    /**
     * @param jjbh
     */
    public void setJjbh(String jjbh) {
        this.jjbh = jjbh;
    }

    /**
     * @return jjrqsj
     */
    public Date getJjrqsj() {
        return jjrqsj;
    }

    /**
     * @param jjrqsj
     */
    public void setJjrqsj(Date jjrqsj) {
        this.jjrqsj = jjrqsj;
    }

    /**
     * @return sfdd
     */
    public String getSfdd() {
        return sfdd;
    }

    /**
     * @param sfdd
     */
    public void setSfdd(String sfdd) {
        this.sfdd = sfdd;
    }

    /**
     * @return cjlb
     */
    public String getCjlb() {
        return cjlb;
    }

    /**
     * @param cjlb
     */
    public void setCjlb(String cjlb) {
        this.cjlb = cjlb;
    }

    /**
     * @return cjxxdd
     */
    public String getCjxxdd() {
        return cjxxdd;
    }

    /**
     * @param cjxxdd
     */
    public void setCjxxdd(String cjxxdd) {
        this.cjxxdd = cjxxdd;
    }

    /**
     * @return cjxz
     */
    public String getCjxz() {
        return cjxz;
    }

    /**
     * @param cjxz
     */
    public void setCjxz(String cjxz) {
        this.cjxz = cjxz;
    }

    /**
     * @return cjdw
     */
    public String getCjdw() {
        return cjdw;
    }

    /**
     * @param cjdw
     */
    public void setCjdw(String cjdw) {
        this.cjdw = cjdw;
    }

    /**
     * @return cjdwmc
     */
    public String getCjdwmc() {
        return cjdwmc;
    }

    /**
     * @param cjdwmc
     */
    public void setCjdwmc(String cjdwmc) {
        this.cjdwmc = cjdwmc;
    }

    /**
     * @return sfsjsx
     */
    public Date getSfsjsx() {
        return sfsjsx;
    }

    /**
     * @param sfsjsx
     */
    public void setSfsjsx(Date sfsjsx) {
        this.sfsjsx = sfsjsx;
    }

    /**
     * @return sfsjxx
     */
    public Date getSfsjxx() {
        return sfsjxx;
    }

    /**
     * @param sfsjxx
     */
    public void setSfsjxx(Date sfsjxx) {
        this.sfsjxx = sfsjxx;
    }

    /**
     * @return cjbh
     */
    public String getCjbh() {
        return cjbh;
    }

    /**
     * @param cjbh
     */
    public void setCjbh(String cjbh) {
        this.cjbh = cjbh;
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
     * @return bjnr
     */
    public String getBjnr() {
        return bjnr;
    }

    /**
     * @param bjnr
     */
    public void setBjnr(String bjnr) {
        this.bjnr = bjnr;
    }

    /**
     * @return cljgnr
     */
    public String getCljgnr() {
        return cljgnr;
    }

    /**
     * @param cljgnr
     */
    public void setCljgnr(String cljgnr) {
        this.cljgnr = cljgnr;
    }

    /**
     * @return bccljg
     */
    public String getBccljg() {
        return bccljg;
    }

    /**
     * @param bccljg
     */
    public void setBccljg(String bccljg) {
        this.bccljg = bccljg;
    }
}