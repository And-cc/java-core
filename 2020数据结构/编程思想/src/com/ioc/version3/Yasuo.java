package com.ioc.version3;

/**
 * @Author: yqy
 * @Date: 2022/04/02/10:28
 * @Description:
 */
public class Yasuo implements ISkill {
    @Override
    public void q() {
        System.out.println("Yasuo q");
    }

    @Override
    public void w() {
        System.out.println("Yasuo w");
    }

    @Override
    public void e() {
        System.out.println("Yasuo e");
    }

    @Override
    public void r() {
        System.out.println("Yasuo r");
    }
}
