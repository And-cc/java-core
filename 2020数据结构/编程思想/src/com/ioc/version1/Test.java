package com.ioc.version1;

import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2022/04/02/10:14
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        String name = getInputName();
        if (name.equals("diana")){
            Diana diana = new Diana();
            diana.r();
        }
        if (name.equals("yasuo")){
            new Yasuo().r();
        }
    }
    private static String getInputName(){
        System.out.println("输入英雄名称");
        Scanner sc=new Scanner(System.in);
        return sc.next();
    }
}
