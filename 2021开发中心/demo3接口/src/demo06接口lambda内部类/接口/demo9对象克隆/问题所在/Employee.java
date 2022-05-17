package demo06接口lambda内部类.接口.demo9对象克隆.问题所在;

import demo06接口lambda内部类.接口.demo1接口的概念.book.Comparable;

public class Employee {
     private String name;
     private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary+Comparable.x;
    }

    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary+=raise;
    }
}
