package com.stx.emp.twotianlang.demo;
import java.util.Date;
/**
 * @author 田浪
 */
public class Person {
    private String name;
    private String  gender;
    private int age;
    private String idCode;
    private Date time;
    private String area;
    private Code healthCard;
    private Code travelCard;
    public Person() {

    }
    public Person(String name, String gender, int age, String idCode, Date time, String area, Code healthCard, Code travelCard) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.idCode = idCode;
        this.time = time;
        this.area = area;
        this.healthCard = healthCard;
        this.travelCard = travelCard;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Code getHealthCard() {
        return healthCard;
    }

    public void setHealthCard(String newCode) {
        Code code=new HealthCode(newCode);
        this.healthCard = code;
    }

    public Code getTravelCard() {
        return travelCard;
    }
    public void setTravelCard(String newCode) {
        Code code=new TravelCode(newCode);
        this.travelCard = code;
    }
}
