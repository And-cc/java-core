package com.stx.teacher.entity;

import java.time.LocalDate;

/**
 * @author LiuChuan
 * @version 1.0.0
 * @description TODO
 * @createTime 2022年03月21日 10:27:00
 */
public class Person {
    private String id;
    private String name;
    private String sex;
    private int age;
    private LocalDate date;
    /**
     * 一个人有多种码
     * 健康码，行程码
     */
    private Code[] codes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Code[] getCodes() {
        return codes;
    }

    public void setCodes(Code[] codes) {
        this.codes = codes;
    }
}
