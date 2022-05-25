package com.stx.exercise.p9.twoyanqingyuan;

/**
 * @Author: yqy
 * @Date: 2022/03/21/19:44
 * @Description:
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
