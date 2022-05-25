package com.stx.exercise.p6.TwoYanQingYuan;

/**
 * @Author: yqy
 * @Date: 2022/03/08/16:26
 * @Description:
 */
public class Person {
    private String name;
    private int age;
    /**
     * true:男
     * false:女
     */
    private boolean sex;
    private String hobby;

    public Person(String name, int age, boolean sex, String hobby) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.hobby = hobby;
    }

    public void introduce() {
        System.out.println(name + ":大家好，我叫" + name + "今年" + age + "岁了，我是" + (sex ? "男孩儿" : "女孩儿") + "我喜欢" + hobby);

    }

}
