package com.stx.exercise.p9.plus;

import com.stx.exercise.p9.plus.Code;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2022/03/13/15:25
 * @Description:疫情健康管理系统
 */
public class EpidemicHealthManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static Person[] people;
    private Utils utils = new Utils();

    public EpidemicHealthManager() {
        people = new Person[5];
    }

    /**
     * 启动方法
     */
    public void start() {
        System.out.println("**************************");
        System.out.println("*******疫情健康管理系统********");
        System.out.println("**************************");
        boolean isExit = false;
        while (!isExit) {
            System.out.println("\n***请选择操作：");
            System.out.println("1.来访登记\t2.修改健康码\t3.修改行程码\t4.删除来访记录\t5.查看来访信息\t0.退出");
            String choose = scanner.next();
            switch (choose) {
                case "1":
                    inputOne();
                    break;
                case "2":
                    System.out.println("请输入修改记录的身份证号码");
                    boolean flag = updateHealthCode(scanner.next());
                    if (flag) {
                        System.out.println("修改成功");
                    } else {
                        System.out.println("修改失败，可能没有这个人");
                    }
                    break;
                case "3":
                    System.out.println("请输入修改记录的身份证号码");
                    boolean fla = updateJourneyCode(scanner.next());
                    if (fla) {
                        System.out.println("修改成功");
                    } else {
                        System.out.println("修改失败，可能没有这个人");
                    }
                    break;
                case "4":
                    System.out.println("请输入删除记录的身份证号码");
                    boolean delete = delete(scanner.next());
                    if (delete) {
                        System.out.println("删除成功");
                    } else {
                        System.out.println("删除失败，可能没有这个人");
                    }
                    break;
                case "5":
                    view();
                    break;
                case "0":
                    scanner.close();
                    isExit = true;
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;

            }

        }
        ;
    }

    /**
     * 展示数据
     */
    public void view() {
        if (people[0] == null) {
            System.out.println("--------------------还没有人----------------------");
        } else {
            int length = utils.haveUse(people);
            System.out.println("姓名\t\t性别\t\t年龄\t\t身份证号\t\t来访时间\t\t健康码\t\t行程码\t\t途径地区");
            for (int i = 0; i < length; i++) {
                System.out.println(people[i].toString());
            }
        }
    }

    /**
     * 插入数据
     */
    public void inputOne() {
        Person person = new Person();

        System.out.println("请输入访客姓名：");
        person.setName(scanner.next());

        System.out.println("请输入访客性别(限男、女):");
        person.setSex(utils.inputSex());

        System.out.println("请输入访客年龄：");
        person.setAge(scanner.nextInt());

        System.out.println("请输入访客身份证号(限长度18位数字)：");
        person.setId(utils.inputId(people));

        System.out.println("请输入访客来访时间(限yyyy-MM-dd HH:mm:ss)：");
        person.setComeTime(utils.parseTime());

        System.out.println("请输入访客途径地区（多个地区用符号、分隔）：");
        person.setWays(utils.splitStr(scanner.next()));

        /**
         * 生成健康码，并赋值
         */
        HealthCode healthCode = new HealthCode();
        healthCode.createCode(person.getWays());
        person.setHealthStatus(healthCode);

        /**
         * 生成行程码，并赋值
         */
        JourneyCode journeyCode = new JourneyCode();
        journeyCode.createCode(person.getWays());
        person.setJourneyStatus(journeyCode);


        /**
         * 判断一下是否满，满了就扩容
         */
        if (utils.isFullArray(people)) {
            Person[] news = utils.changeBigArray(EpidemicHealthManager.people);
            people = news;
        }
        /**
         * 找到插入的位置
         */
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                people[i] = person;
                break;
            }
        }
    }

    /**
     * 删除数据
     *
     * @param id
     * @return
     */
    public boolean delete(String id) {
        /**
         * 输入的id有误直接退出
         */
        if (id.length() == 0 || id == null || id == "") {
            return false;
        }
        /**
         *  数组还没有数据直接退出
         */
        if (utils.isEmpty(people)) {
            return false;
        }
        boolean flag = false;
        /**
         * 删除数据，但没有改变下标
         */
        for (int i = 0; i < people.length; i++) {
            if (id.equals(people[i].getId())) {
                people[i] = null;
                flag = true;
                break;
            }
        }
        /**
         * 拿到删除后数据前移的数组
         */
        Person[] use = utils.copyUse(people);
        people = use;
        return flag;
    }

    /**
     * 修改健康码
     *
     * @param id
     * @return
     */
    public boolean updateHealthCode(String id) {
        if (id.length() == 0 || id == null || id == "") {
            return false;
        }
        Code code = new HealthCode();
        for (Person person : people) {
            if (id.equals(person.getId())) {
                System.out.println("请输入健康码：");
                code.setCode(utils.inputHealthCode());
                person.setHealthStatus(code);
                return true;
            }
        }
        return false;
    }

    /**
     * 修改行程码
     *
     * @param id
     * @return
     */
    public boolean updateJourneyCode(String id) {
        if (id.length() == 0 || id == null || id == "") {
            return false;
        }
        Code code = new JourneyCode();
        for (Person person : people) {
            if (id.equals(person.getId())) {
                System.out.println("请输入行程码：");
                code.setCode(utils.inputJourneyCode());
                person.setJourneyStatus(code);
                return true;
            }
        }
        return false;
    }

}
