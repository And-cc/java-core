package com.stx.teacher.entity;

/**
 * @author LiuChuan
 * @version 1.0.0
 * @description TODO
 * @createTime 2022年03月21日 10:29:00
 */
public class Area {
    /**
     * 城市
     */
    private String city;
    /**
     * 是否是高风险地区
     */
    private boolean isRisk;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isRisk() {
        return isRisk;
    }

    public void setRisk(boolean risk) {
        isRisk = risk;
    }
}
