package com.stx.exercise.p11.pojo;

/**
 * @Author: yqy
 * @Date: 2022/03/27/20:09
 * @Description:用户类
 */
public class User {
    private int id;
    private int sno;
    private String name;
    private String pwd;

    public User(int id, int sno, String name, String pwd) {
        this.id = id;
        this.sno = sno;
        this.name = name;
        this.pwd = pwd;
    }

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
