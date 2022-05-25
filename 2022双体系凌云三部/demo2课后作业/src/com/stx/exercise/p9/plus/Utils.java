package com.stx.exercise.p9.plus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;

/**
 * @Author: yqy
 * @Date: 2022/03/14/19:26
 * @Description:
 */
public class Utils {
    private Scanner scanner = new Scanner(System.in);


    /**
     * 删除数据后，下标前移
     *
     * @param people
     * @return
     */
    public Person[] copyUse(Person[] people) {
        Person[] news = new Person[people.length];
        int j = 0;
        for (int i = 0; i < people.length; i++) {
            if (null != people[i]) {
                news[j] = people[i];
                j++;
            }
        }
        return news;
    }

    /**
     * 记录有效数据的个数
     *
     * @param arr
     * @return
     */
    public int haveUse(Person[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                sum++;
            }
        }
        return sum;
    }

    /**
     * 判断数组是否为空
     *
     * @param arr
     * @return
     */
    public boolean isEmpty(Person[] arr) {
        return arr[0] == null ? true : false;
    }

    /**
     * 给person对象数组扩容
     *
     * @param arr
     * @return
     */
    public Person[] changeBigArray(Person[] arr) {
        return Arrays.copyOf(arr, arr.length * 2);
    }

    /**
     * 判断数组是否满
     *
     * @param arr
     * @return
     */
    public boolean isFullArray(Person[] arr) {
        if (arr[arr.length - 1] != null) {
            return true;
        } else {
            return false;
        }
    }



    //-----一下是输入格式有关-----------------------------------------------

    /**
     * 输入正确的身份证号码
     *
     * @return
     */
    public String inputId(Person[] people) {
        String id = scanner.next();
        /**
         * 如果长度不是18 或 不是有数字组成
         */
        if (id.length() != 18 || !id.matches("^[0-9]*[1-9][0-9]*$")) {
            System.out.println("格式有误，请重新输入");
            id = inputId(people);
        }
        int length = haveUse(people);
        /**
         * 是否为第一个数据，第一个数据不用参与循环
         */
        if (length == 0) {
            return id;
        }

        int index = 0;
        for (int i = 0; i < length; i++) {
            if (id.equals(people[i].getId())) {
                index = i;
            }
        }
        if (!id.equals(people[index].getId())) {
            return id;
        } else {
            System.out.println("已被注册，请重新输入");
            id = inputId(people);
        }
        return id;
    }

    /**
     * 输入正确的性别
     *
     * @return
     */
    public String inputSex() {
        String sex = scanner.next();
        if ("男".equals(sex) || "女".equals(sex)) {
            return sex;
        } else {
            System.out.println("码输入有误，请重新输入");
            sex = inputSex();
        }
        return sex;
    }

    /**
     * 输入正确健康码
     *
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
     *
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
     *
     * @return
     */
    public Date parseTime() {
        String comeTimeStr = scanner.next() + " " + scanner.next();
        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time = new Date();
        try {
            time = timeFormat.parse(comeTimeStr);
        } catch (ParseException e) {
            System.out.println(e.getMessage() + "日期格式有误，请重新输入");
            time = parseTime();
        }
        return time;
    }

    /**
     * 分割字符串，存入地区数组
     *
     * @param waysStr
     * @return
     */
    public String[] splitStr(String waysStr) {
        return waysStr.split("、");
    }
}
