package com.stx.exercise.p11.pojo;

import java.sql.Timestamp;

/**
 * @Author: yqy
 * @Date: 2022/03/27/20:09
 * @Description:记录类
 */
public class Record {
    private int id;
    private int pid;
    private Timestamp createTime;
    private  String address;
    private double heat;
    private int tripCode;
    private int healthCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getHeat() {
        return heat;
    }

    public void setHeat(double heat) {
        this.heat = heat;
    }

    public int getTripCode() {
        return tripCode;
    }

    public void setTripCode(int tripCode) {
        this.tripCode = tripCode;
    }

    public int getHealthCode() {
        return healthCode;
    }

    public void setHealthCode(int healthCode) {
        this.healthCode = healthCode;
    }
}
