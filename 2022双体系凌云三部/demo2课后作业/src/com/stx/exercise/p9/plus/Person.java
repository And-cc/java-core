package com.stx.exercise.p9.plus;


import com.stx.exercise.p9.plus.Code;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author: yqy
 * @Date: 2022/03/13/15:13
 * @Description:
 */
public class Person {
    public Person(String name, String sex, int age, String id, Date comeTime, Code healthStatus, Code journeyStatus, String[] ways) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.id = id;
        this.comeTime = comeTime;
        this.healthStatus = healthStatus;
        this.journeyStatus = journeyStatus;
        this.ways = ways;
    }

    /**
     * 来访姓名
     */
    private String name;
    /**
     * 来访性别
     */
    private String sex;
    /**
     * 来访年龄
     */
    private int age;
    /**
     * 来访身份证
     */
    private String id;
    /**
     * 来访时间
     */
    private Date comeTime;
    /**
     * 来访健康码状态
     */
    private Code healthStatus;
    /**
     * 来访行程码状态
     */
    private Code journeyStatus;
    /**
     * 途径地区
     */
    private String[] ways;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getComeTime() {
        return comeTime;
    }

    public void setComeTime(Date comeTime) {
        this.comeTime = comeTime;
    }

    public Code getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(Code healthStatus) {
        this.healthStatus = healthStatus;
    }

    public Code getJourneyStatus() {
        return journeyStatus;
    }

    public void setJourneyStatus(Code journeyStatus) {
        this.journeyStatus = journeyStatus;
    }

    public String[] getWays() {
        return ways;
    }

    public void setWays(String[] ways) {
        this.ways = ways;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");
        String time = simpleDateFormat.format(comeTime);
        return name + "\t" + sex + "\t" + age + "\t" + id + "\t" + time + "\t" + healthStatus.getCode() + "\t" + journeyStatus.getCode() + Arrays.toString(ways);
    }

}
