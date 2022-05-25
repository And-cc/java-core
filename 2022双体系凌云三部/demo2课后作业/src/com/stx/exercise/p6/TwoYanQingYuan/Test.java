package com.stx.exercise.p6.TwoYanQingYuan;

/**
 * @Author: yqy
 * @Date: 2022/03/08/16:25
 * @Description:测试类
 */
public class Test {
    public static void main(String[] args) {

        Person df1 = new Person("严清远", 996, true, "吃烧白");
        Person df2 = new Person("田浪", 996, true, "吃烧白");
        Person df3 = new Person("程曦", 18, false, "吃烧白");
        Person df4 = new Person("李楠", 18, false, "吃烧白");
        Person df5 = new Person("王浩帆", 996, true, "吃烧白");
        Person df6 = new Person("何涛", 996, true, "吃烧白");
        Person[] df1Group = {df1, df2};
        Group dfgroups1 = new Group(1, "田浪", "巅峰小学生1", df1Group);

        Person[] df2Group = {df3, df4};
        Group dfgroups2 = new Group(2, "程曦", "巅峰小学生2", df2Group);

        Person[] df3Group = {df5, df6};
        Group dfgroups3 = new Group(3, "王浩帆", "巅峰小学生3", df3Group);

        Group[] groups = {dfgroups1, dfgroups2, dfgroups3};
        Class linyun = new Class(3, "唐贵乾", "凌云", groups);
        linyun.introduce();
    }
}
