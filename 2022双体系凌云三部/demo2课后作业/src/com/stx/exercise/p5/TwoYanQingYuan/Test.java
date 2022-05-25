package com.stx.exercise.p5.TwoYanQingYuan;

/**
 * @Author: yqy
 * @Date: 2022/03/07/19:17
 * @Description:测试类
 */
public class Test {
    public static void main(String[] args) {
        Noodle yanHandsome = new Noodle("牛肉面",3,false);
        yanHandsome.show();
        System.out.println("老板我想改一下");
        yanHandsome.setType("麻辣面");
        yanHandsome.setWeight(8);
        yanHandsome.setHaveSoup(true);
        yanHandsome.show();
    }
}
