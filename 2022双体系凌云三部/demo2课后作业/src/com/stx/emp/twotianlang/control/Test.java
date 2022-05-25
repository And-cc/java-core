package com.stx.emp.twotianlang.control;

import com.stx.emp.twotianlang.dao.*;
import com.stx.emp.twotianlang.demo.Person;

import java.text.ParseException;
import java.util.Scanner;

/**
 * @title
 * @description 测试主类
 * @author tianlang
 * @updateTime 2022/3/14 15:21
 * @throws
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Person[] person = new Person[100];
        boolean flag = true;
        System.out.println("\t\t\t<<<**********欢迎来到疫情健康管理系统**********>>>");
        do {
            System.out.println("1.来访登记  2.修改健康码  3.修改行程码  4.删除来访记录  5.查看来访记录  0.退出");
            String num = scanner.next();
            switch (num) {
                case "1":
                    new Add().add(person);
                    break;
                case "2":
                    System.out.println("请输入要修改的访客身份证号（*必须为18位*）：");
                    new ModifyHealthCard().update(scanner.next(), person);
                    break;
                case "3":
                    System.out.println("请输入要修改的访客身份证号（*必须为18位*）：");
                    new ModifyTravelCard().update(scanner.next(), person);
                    break;
                case "4":
                    System.out.println("请输入要删除的访客身份证号（*必须为18位*）：");
                    new Delete().delete(scanner.next(), person);
                    break;
                case"5":
                    new View().view(person);
                    break;
                case "0":
                    flag = false;
                    break;
                default:
                    System.out.println("你的输入有误，请重新输入0-5!");
            }
        } while (flag);
    }
}
