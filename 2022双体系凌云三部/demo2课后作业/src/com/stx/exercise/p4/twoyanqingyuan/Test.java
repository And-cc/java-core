package com.stx.exercise.p4.twoyanqingyuan;

/**
 * @Author: yqy
 * @Date: 2022/03/03/17:25
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        //Ship是类，Merlin是对象，Sunny是对象
        Ship merlin = new Ship("梅林号");
        merlin.paddle();
        Ship sunny = new Ship("阳光号");
        sunny.paddle();


    }
}
