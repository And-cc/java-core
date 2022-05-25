package com.stx.exercise.p7.TwoYanQingYuan;

/**
 * @Author: yqy
 * @Date: 2022/03/09/15:02
 * @Description:
 */
public class Pig {
    private String name;
    private boolean sex;
    private int weight;

    public Pig(String name, boolean sex, int weight) {
        this.name = name;
        this.sex = sex;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void show() {
        System.out.println("我叫" + name + ",是头" + (sex ? "公猪" : "母猪") + "，现在" + weight + "斤");
    }
}
