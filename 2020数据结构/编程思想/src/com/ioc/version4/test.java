package com.ioc.version4;

import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2022/04/02/10:30
 * @Description:
 * 统一方法的调用
 * 但是不能统一对象的实例化
 */
public class test {
    public static void main(String[] args) throws Exception{
        ISkill hero = Factory.getHero(getInputName());
        hero.r();
    }
    private static String getInputName(){
        System.out.println("输入英雄名称");
        Scanner sc=new Scanner(System.in);
        return sc.next();
    }
}
