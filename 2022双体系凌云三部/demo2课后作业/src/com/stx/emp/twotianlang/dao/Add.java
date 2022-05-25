package com.stx.emp.twotianlang.dao;



import com.stx.emp.twotianlang.demo.Person;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author tianlang
 * @title
 * @description 添加
 * @updateTime 2022/3/14 15:14
 * @throws
 */
public class Add {
    static Scanner scanner = new Scanner(System.in);

    public void add(Person[] people) throws ParseException {

        Person person1 = new Person();
        System.out.println("请输入访客的姓名：");
        person1.setName(scanner.next());
        System.out.println("请输入访客的性别（男、女）：");
        person1.setGender(scanner.next());
        System.out.println("请输入访客的年龄（必须为数字）：");
        person1.setAge(ageTest());
        System.out.println("请输入访客的身份证号：");
        person1.setIdCode(idCardTest());
        System.out.println(scanner.nextLine());
        boolean choose = true;
        while (choose) {
            System.out.println("请输入访客的来访时间(yyyy-MM-dd HH:mm:ss格式)：");
            String a = scanner.nextLine();
            if (String.valueOf(a.charAt(4)).equals("-")&&String.valueOf(a.charAt(10)).equals(" ")) {
                person1.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(a));
                choose=false;
            }else {
                System.out.println("格式有误，请重新输入：");
            }
        }
        //System.out.println("请输入访客的来访时间(yyyy-MM-dd HH:mm:ss格式)：");
        //person1.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(scanner.nextLine()));
        System.out.println("请输入健康码状态：");
        person1.setHealthCard(scanner.next());
        System.out.println("请输入行程码状态：");
        person1.setTravelCard(scanner.next());
        System.out.println("请输入途径地区(多个地区以，分隔)：");
        person1.setArea(peaceText());
        for (int i = 0; i < people.length; i++) {
            if (people[i] == null) {
                people[i] = person1;
                System.out.println("登记成功！");
                break;
            }
        }

    }

    public static String idCardTest() {
        String id = scanner.next();
        if (!id.matches("^[1-9]*[1-9][0-9]*$") || id.length() != 18) {
            System.out.println("该身份证号不合法，请重新输入：");
            id = idCardTest();
        }
        return id;
    }

    public int ageTest() {
        int age = scanner.nextInt();
        if (0 <= age && age <= 120) {
        } else {
            System.out.println("年龄不合法，请重新输入：");
            age = ageTest();
        }
        return age;
    }

    public String peaceText() {
        String peace = scanner.next();
        String[] a = {"南岸区", "渝北区", "大渡口区", "大学城区", "万州区", "铜梁区",
                "沙坪坝区", "忠县区", "丰都区", "巴南区"};
        for (int i = 0; i < a.length; i++) {
            if (i <= 4) {
                if (peace.equals(a[i])) {
                    System.out.println(peace + "为低风险区");
                    break;
                }
            } else {
                if (peace.equals(a[i])) {
                    System.out.println(peace + "为高风险区");
                    break;
                }
            }
        }
        return peace;
    }

}
