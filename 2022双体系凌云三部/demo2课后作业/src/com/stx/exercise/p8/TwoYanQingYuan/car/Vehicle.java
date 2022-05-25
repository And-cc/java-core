package com.stx.exercise.p8.TwoYanQingYuan.car;

/**
 * 车
 */
public class Vehicle {

    //写一个构造函数（带id, 和status 参数）用于初始化车辆
    public Vehicle(String id, int status) {
        this.id = id;
        this.status = status;
    }



    private String id; //车辆编号

    private int status; //是否已租（0可租，1已租）

    //完善getter setter 方法


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    //租车说明
    public String showInfo(){
        return "共享车每小时收费1元";
    }


}
