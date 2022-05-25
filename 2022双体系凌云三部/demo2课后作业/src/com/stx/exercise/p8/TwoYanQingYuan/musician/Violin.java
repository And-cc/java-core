package com.stx.exercise.p8.TwoYanQingYuan.musician;

/**
 * @Author: yqy
 * @Date: 2022/03/10/17:45
 * @Description:小提琴
 */
public class Violin extends Musician{
    public Violin(String sound) {
        super(sound);
    }

    @Override
    public void play() {
        System.out.println("葫芦娃，葫芦哇，一根藤上七朵花");
    }
}
