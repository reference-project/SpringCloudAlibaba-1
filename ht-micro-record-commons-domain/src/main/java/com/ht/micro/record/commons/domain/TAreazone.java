package com.ht.micro.record.commons.domain;

import javax.persistence.Table;

@Table(name = "t_areazone")
public class TAreazone {
    private Integer province;

    private Integer city;

    private Integer zone;

    private String areazone;

    /**
     * @return province
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * @return city
     */
    public Integer getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * @return zone
     */
    public Integer getZone() {
        return zone;
    }

    /**
     * @param zone
     */
    public void setZone(Integer zone) {
        this.zone = zone;
    }

    /**
     * @return areazone
     */
    public String getAreazone() {
        return areazone;
    }

    /**
     * @param areazone
     */
    public void setAreazone(String areazone) {
        this.areazone = areazone;
    }
}