package com.ioc.version2;

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
        ISkill iSkill;
        switch (getInputName()){
            case "yasuo":
                iSkill=new Yasuo();
                break;
            case "nuoshou":
                iSkill=new Nuoshou();
                break;
            default:
                throw new Exception();
        }
        iSkill.r();
    }
    private static String getInputName(){
        System.out.println("输入英雄名称");
        Scanner sc=new Scanner(System.in);
        return sc.next();
    }
}
