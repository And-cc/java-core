package demo1父类属性私有如何调用;

import java.time.LocalDate;

public class Employee {
    //定义私有属性，那么子类怎么调用呢？
    private String name;
    private double salary;
    private LocalDate birthDay;
    public Employee(String name,double salary,int year,int month, int day){
        this.name=name;
        this.salary=salary;
        this.birthDay=LocalDate.of(year,month,day);
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public LocalDate getBirthDay(){
        return birthDay;
    }
    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary +=raise;
    }
}
