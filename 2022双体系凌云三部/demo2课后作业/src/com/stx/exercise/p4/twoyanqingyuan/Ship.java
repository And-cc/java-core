package com.stx.exercise.p4.twoyanqingyuan;

/**
 * @Author: yqy
 * @Date: 2022/03/03/17:23
 * @Description:
 */
public class Ship {
    private String name;

    public Ship(String name) {
        this.name = name;
    }
    public void paddle(){
        System.out.println(this.name+"滑行");
    }
}
