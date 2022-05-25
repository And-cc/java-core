package com.stx.exercise.p7.TwoYanQingYuan;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2022/03/09/15:11
 * @Description:
 */
public class SmartPigFarmSystem {
    private final Scanner in = new Scanner(System.in);
    private Pig[] pigs = new Pig[2];

    public void start() {
        System.out.println("-----------欢迎光临智慧养猪系统-----------");
        boolean flag = true;
        while (flag) {
            System.out.println("add:买小猪");
            System.out.println("update：换小猪");
            System.out.println("delete：卖小猪");
            System.out.println("show:查看所有小猪");
            System.out.println("exit:退出系统");
            switch (in.next()) {
                case "add":
                    Pig pig = example();
                    addAtBigAfter(pig);
                    break;
                case "update":
                    System.out.println("请输入要修改小猪的姓名");
                    String s = in.next();
                    update(s);
                    break;
                case "delete":
                    System.out.println("请输入要删除小猪的姓名");
                    String s1 = in.next();
                    System.out.println(delete(s1) ? "删除成功" : "删除失败");
                    break;
                case "show":
                    show();
                    break;
                case "exit":
                    in.close();
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }

    /**
     * 废弃的添加方法
     *
     * @param pig
     * @return
     */
    private Pig[] add(Pig pig) {
        int length = pigs.length + 1;
        Pig[] newPigs = new Pig[length];
        for (int i = 0; i < newPigs.length; i++) {
            newPigs[i] = pigs[i];
        }
        newPigs[length] = pig;
        pigs = newPigs;
        return pigs;
    }

    /**
     * 在数组扩容后添加数据
     *
     * @param pig
     */
    private void addAtBigAfter(Pig pig) {
        if (isFull()) {
            pigs = Arrays.copyOf(pigs, pigs.length * 2);
        }
        int i = efficient();
        pigs[i] = pig;
    }

    /**
     * 根据小猪名字改
     *
     * @param name
     */
    private void update(String name) {
        int i = searchIndex(name);
        try {
            if (i < 0) {
                System.out.println("没找到");
                return;
            }
        } catch (Exception e) {

        }
        Pig pig = example();
        pigs[i] = pig;
    }

    /**
     * 删除方法
     *
     * @param name
     */
    private boolean delete(String name) {
        int i = searchIndex(name);
        try {
            if (i < 0) {
                System.out.println("没找到");
                return false;
            }
        } catch (Exception e) {
        }
        pigs[i] = null;
        return null == pigs[i];
    }

    /**
     * 展示有效的数据
     */
    private void show() {
        for (int i = 0; i < pigs.length; i++) {
            if (pigs[i] != null) {
                pigs[i].show();
            }
        }
    }

    /**
     * 判断数组是否满
     *
     * @return
     */
    private boolean isFull() {
        return (pigs[pigs.length - 2] != null && pigs[pigs.length - 1] == null);
    }

    /**
     * 数组内有效的数据
     *
     * @return
     */
    private int efficient() {
        int sum = 0;
        for (Pig pig : pigs) {
            if (pig != null) {
                sum++;
            }
        }
        return sum;
    }

    /**
     * 根据名字查找下标
     *
     * @param name
     * @return
     */
    private int searchIndex(String name) {
        int index = -1;
        if (efficient() <= 0) {
            return index;
        }
        int i = 0;
        while (i < pigs.length) {
            try {
                if (name.equals(pigs[i].getName())) {
                    index = i;
                }
            } catch (Exception e) {
            }
            i++;
        }
        /*for (int i = 0; i < pigs.length; i++) {
            if (name.equals(pigs[i].getName())) {
                index = i;
            }
        }*/
        return index;
    }

    /**
     * 利用递归，防止小猪名字重复
     *
     * @return
     */
    private String inputName() {
        String name = in.next();
        if (searchIndex(name) >= 0) {
            System.out.println("已经存在了，请重新输入");
            name = inputName();
        }
        return name;
    }

    /**
     * 输入对象属性去实例化
     *
     * @return
     */
    private Pig example() {
        System.out.println("请依次输入小猪姓名");
        String name = inputName();
        System.out.println("请输入小猪性别 true||false");
        boolean sex = in.nextBoolean();
        System.out.println("请输入小猪重量");
        int weight = in.nextInt();
        return new Pig(name, sex, weight);
    }

}

