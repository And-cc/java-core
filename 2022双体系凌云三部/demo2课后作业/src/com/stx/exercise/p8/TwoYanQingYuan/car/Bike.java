package com.stx.exercise.p8.TwoYanQingYuan.car;

/**
 * 共享单车
 */
// 继承 Vehicle
public class Bike extends Vehicle{

    //写出当前类的构造方法，在构造方法里面调用父类的构造方法完成 id, 状态 的初始化
    // 从写父类showInfo(){} 方法， 返回值为 : "共享单车每小时收费1元";

    public Bike(String id, int status) {
        super(id, status);
    }

    @Override
    public String showInfo() {
        return "共享单车每小时收费1元";
    }
}
