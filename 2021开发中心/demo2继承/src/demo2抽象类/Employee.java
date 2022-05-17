package demo2抽象类;

import java.time.LocalDate;

/**
 * @Author: yqy
 * @Date: 2021/05/28/16:45
 * @Description:
 */
public class Employee extends Person{
    private double salary;
    private LocalDate birthDay;

    public Employee(String name,double salary,int year,int month, int day) {
        super(name);
        this.salary=salary;
        this.birthDay=LocalDate.of(year,month,day);
    }
    public  void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary +=raise;
    }
    @Override
    public String getDescription() {
        return String.format("工资%.2f的员工",salary);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }
}
