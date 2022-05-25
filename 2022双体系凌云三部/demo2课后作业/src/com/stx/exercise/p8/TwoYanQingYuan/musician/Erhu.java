package com.stx.exercise.p8.TwoYanQingYuan.musician;

/**
 * @Author: yqy
 * @Date: 2022/03/10/17:44
 * @Description:
 */
public class Erhu extends Musician{
    public Erhu(String sound) {
        super(sound);
    }

    @Override
    public void play() {
        System.out.println("啦啦啦，黑猫警长");
    }
}
