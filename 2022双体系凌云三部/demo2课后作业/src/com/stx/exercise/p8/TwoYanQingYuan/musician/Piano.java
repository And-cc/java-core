package com.stx.exercise.p8.TwoYanQingYuan.musician;

/**
 * @Author: yqy
 * @Date: 2022/03/10/17:45
 * @Description:钢琴
 */
public class Piano extends Musician{
    public Piano(String sound) {
        super(sound);
    }

    @Override
    public void play() {
        System.out.println("喜羊羊美羊羊，别看我只是一只羊");
    }
}
