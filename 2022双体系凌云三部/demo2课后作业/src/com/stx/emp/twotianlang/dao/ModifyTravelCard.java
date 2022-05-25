package com.stx.emp.twotianlang.dao;
import com.stx.emp.twotianlang.demo.Person;

import java.util.Scanner;
/**
 * @title
 * @description 修改行程码
 * @author tianlang
 * @updateTime 2022/3/14 15:15
 * @throws
 */
public class ModifyTravelCard {
    public void update(String idCode, Person[] people) throws NullPointerException {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                a++;
            }
        }
        for (int i = 0; i < a; i++) {
            if (idCode.equals(people[i].getIdCode())) {
                System.out.println("请输入行程码状态：");
                people[i].setTravelCard(scanner.next());
                System.out.println("请输入途径地区(多个地区以，分隔)：");
                people[i].setArea(new Add().peaceText());
                return;
            } else {
                System.out.println("没有该访客，请重新修改!");
            }
        }
    }
}
