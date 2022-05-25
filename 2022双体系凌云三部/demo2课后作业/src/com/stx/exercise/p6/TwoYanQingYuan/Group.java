package com.stx.exercise.p6.TwoYanQingYuan;

import java.util.Arrays;

/**
 * @Author: yqy
 * @Date: 2022/03/08/16:33
 * @Description:
 */
public class Group {
    private int id;
    private String groupLeader;
    private String name;
    private Person[] member;

    public Group(int id, String groupLeader, String name, Person[] member) {
        this.id = id;
        this.groupLeader = groupLeader;
        this.name = name;
        this.member = member;
    }

    public void introduce() {
        System.out.println("\n" + name + ":大家好，我们是" + id + "组，我们组长是：" + groupLeader +
                ",共有" + member.length + "人" + "-------------小组");
        for (Person person : member) {
            person.introduce();
        }
    }


}
