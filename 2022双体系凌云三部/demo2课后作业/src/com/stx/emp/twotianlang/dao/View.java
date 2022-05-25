package com.stx.emp.twotianlang.dao;

import com.stx.emp.twotianlang.demo.Person;

import java.text.SimpleDateFormat;

/**
 * @author tianlang
 * @title
 * @description 展示
 * @updateTime 2022/3/14 15:15
 * @throws
 */
public class View {
    public void view(Person[] people) throws NullPointerException {
        Integer index = 1;
        for (int i = 0; i < people.length; i++) {
            if (people[i] != null) {
                System.out.println("序号：" + index + "||姓名：" + people[i].getName() +"||年龄:" +
                        people[i].getAge() + "||身份证:" + people[i].getIdCode()
                        + "||来访时间：" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(people[i].getTime())
                        + "||健康码状态：" + people[i].getHealthCard().show()
                        + "||行程码状态：" + people[i].getTravelCard().show() + "||来访地区：(" + people[i].getArea() + ")||");
                index++;
            }

        }
    }
}
