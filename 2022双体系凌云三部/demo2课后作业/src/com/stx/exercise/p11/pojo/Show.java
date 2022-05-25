package com.stx.exercise.p11.pojo;

import com.stx.exercise.p11.utils.DateUtil;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @Author: yqy
 * @Date: 2022/03/28/19:42
 * @Description:
 */
public class Show {
    private String name;
    private String address;
    private Date time;
    private double heat;
    private String tripCode;
    private String healthCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public double getHeat() {
        return heat;
    }

    public void setHeat(double heat) {
        this.heat = heat;
    }

    public String getTripCode() {
        return tripCode;
    }

    public void setTripCode(String tripCode) {
        this.tripCode = tripCode;
    }

    public String getHealthCode() {
        return healthCode;
    }

    public void setHealthCode(String healthCode) {
        this.healthCode = healthCode;
    }

    @Override
    public String toString() {
        return name +"  地址："+ address  +"  打卡时间："+ DateUtil.timestampToStr((Timestamp) time) +"  打卡温度："+ heat +"  健康码状态："+  tripCode+"  行程码状态："  + healthCode ;
    }
}
