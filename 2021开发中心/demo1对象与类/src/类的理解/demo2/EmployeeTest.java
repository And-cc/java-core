package 类的理解.demo2;

import java.time.LocalDate;

/**
 * @Author: yqy
 * @Date: 2021/05/27/13:01
 * @Description:如何自定义一个类呢？
 */
//Employee 员工
public class EmployeeTest {
    public static void main(String[] args) {
         Employee[] employees=new Employee[3];
         employees[0]=new Employee("宫保鸡丁",5000,2013,02,23);
         employees[1]=new Employee("糖醋里脊",6666,2800,4,23);
         employees[2]=new Employee("麻辣火锅",10000,1999,12,23);

        for (Employee employee : employees) {
            employee.raiseSalary(15);
        }
        for (Employee employee : employees) {
            System.out.println("name:"+employee.getName()+"salary:"+employee.getSalary()+"birthDay:"+employee.getBirthDay());
        }
    }
}

class Employee{
    private String name; //姓名
    private double salary;//工资
    private LocalDate birthDay;//生日

    //构造方法
    public Employee(String n,double s,int year,int month,int day){
        name=n;
        salary=s;
        birthDay=LocalDate.of(year,month,day);
    }
    //自定义方法/行为
    public void raiseSalary(double x){
        double raise=salary * x /100;
        salary +=raise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
//思考：自定义的类需要属性和行为  在使用这个对象/类的时候 要给予这个类相应的状态
//            成员变量成员方法       new
