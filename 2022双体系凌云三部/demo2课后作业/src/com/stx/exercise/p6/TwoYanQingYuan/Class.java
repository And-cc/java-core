package com.stx.exercise.p6.TwoYanQingYuan;

/**
 * @Author: yqy
 * @Date: 2022/03/08/16:38
 * @Description:
 */
public class Class {
    private int id;
    private String monitor;
    private String name;
    private Group[] member;

    public Class(int id, String monitor, String name, Group[] member) {
        this.id = id;
        this.monitor = monitor;
        this.name = name;
        this.member = member;
    }

    public void introduce() {
        System.out.println(name + ":大家好，我们是" + name + id + "班,我们班长是：" + monitor +
                "，我们班一共有" + member.length + "个组" + "-------------班级" + "\n");

        for (Group group : member) {
            group.introduce();
        }
    }

}
