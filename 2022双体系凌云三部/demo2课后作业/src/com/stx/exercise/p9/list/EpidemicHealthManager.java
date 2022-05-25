package com.stx.exercise.p9.list;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2022/03/13/15:25
 * @Description:疫情健康管理系统
 */
public class EpidemicHealthManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Person> people = new ArrayList<>();

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
        if (people.size() <= 0) {
            System.out.println("--------------------还没有人----------------------");
        } else {
            System.out.println("姓名\t\t性别\t\t年龄\t\t身份证号\t\t来访时间\t\t健康码\t\t行程码\t\t途径地区");
            for (Person person : people) {
                System.out.println(person.toString());
            }
        }
    }

    /**
     * 插入数据
     */
    public void inputOne() {
        System.out.println("请输入访客姓名：如小明");
        String name = scanner.next();
        System.out.println("请输入访客性别：如男");
        String sex = scanner.next();
        System.out.println("请输入访客年龄：如29");
        int age = scanner.nextInt();
        System.out.println("请输入访客身份证号：如10086");
        String id = scanner.next();

        System.out.println("请输入访客来访时间：如2022-10-27 19:17:12");
        String comeTimeStr = scanner.next() + " " + scanner.next();

        System.out.println("请输入访客健康码状态：如红码");
        String healthStatus = inputHealthCode();
        Code healthCode = new HealthCode(healthStatus);

        System.out.println("请输入访客行程码状态：如正常");
        String journeyStatus = inputJourneyCode();
        Code journeyCode = new JourneyCode(journeyStatus);

        System.out.println("请输入访客途径地区（多个地区痘号分隔）：如合川,彭水");
        String way = scanner.next();

        Person person = new Person(name, sex, age, id, parseTime(comeTimeStr), healthCode, journeyCode, splitStr(way));
        people.add(person);
    }

    /**
     * 删除数据
     * @param id
     * @return
     */
    public boolean delete(String id) {
        if (id.length() == 0 || id == null || id == "") {
            return false;
        }
        for (Person person : people) {
            if (id.equals(person.getId())) {
                people.remove(person);
                return true;
            }
        }
        return false;
    }

    /**
     * 修改健康码
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
                code.setCode(inputHealthCode());
                person.setHealthStatus(code);
                return true;
            }
        }
        return false;
    }

    /**
     * 修改行程码
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
                code.setCode(inputJourneyCode());
                person.setJourneyStatus(code);
                return true;
            }
        }
        return false;
    }

    /**
     * 输入正确健康码
     * @return
     */
    public String inputHealthCode() {
        String code = scanner.next();
        if ("红码".equals(code) || "绿码".equals(code) || "黄码".equals(code)) {
            return code;
        } else {
            System.out.println("码输入有误，请重新输入");
            code = inputHealthCode();
        }
        return code;
    }

    /**
     * 输入正确行程码
     * @return
     */
    public String inputJourneyCode() {
        String code = scanner.next();
        if ("正常".equals(code) || "异常".equals(code)) {
            return code;
        } else {
            System.out.println("码输入有误，请重新输入");
            code = inputJourneyCode();
        }
        return code;
    }

    /**
     * 时间格式化
     * @param timeStr
     * @return
     */
    private Date parseTime(String timeStr) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = new Date();
        try {
            time = timeFormat.parse(timeStr);
        } catch (ParseException e) {
            System.out.println(e.getMessage() + "日期格式有误~~");
        }
        return time;
    }

    /**
     * 分割字符串，存入地区数组
     * @param waysStr
     * @return
     */
    private ArrayList<String> splitStr(String waysStr) {
        ArrayList<String> ways = new ArrayList<>();
        String[] split = waysStr.split(",");
        for (String str : split) {
            ways.add(str);
        }
        return ways;
    }
}
