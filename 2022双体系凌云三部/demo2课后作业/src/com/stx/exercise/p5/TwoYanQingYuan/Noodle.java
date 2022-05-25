package com.stx.exercise.p5.TwoYanQingYuan;

/**
 * @Author: yqy
 * @Date: 2022/03/07/19:18
 * @Description:小面类，show方法显示属性
 */
public class Noodle {
    /**
     * 写一个小面class Noodle，题目要求： 包名如：（com.stx. exercise.p5.OneLiuChuan）
     * 1）. 有三个属性，String  type(类型，如麻辣面，牛肉面)，  int weight 分量, 是否带汤boolean isHaveSoup.
     * 2). 写一个方法show 打印小面的种类，分量，是否带汤用于查看是否符合要求，即将三个属性打印在控制台上。
     */
    private String type;
    private int weight;
    private boolean isHaveSoup;

    public Noodle(String type, int weight, boolean isHaveSoup) {
        this.type = type;
        this.weight = weight;
        this.isHaveSoup = isHaveSoup;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHaveSoup() {
        return isHaveSoup;
    }

    public void setHaveSoup(boolean haveSoup) {
        isHaveSoup = haveSoup;
    }

    public void show(){
        if (isHaveSoup) {
            System.out.println("您吃的" + weight + "两,汤锅," + type);
        }else {
            System.out.println("您吃的" + weight + "两,干杂," + type);
        }
    }
}
