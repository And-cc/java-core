package demo06接口lambda内部类.接口.demo1接口的概念.book;

import demo06接口lambda内部类.接口.demo1接口的概念.book.Employee;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0]=new Employee("张三",5000);
        employees[1]=new Employee("李四",4000);
        employees[2]=new Employee("王五",3000);
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println("name:"+employee.getName()+", salary:"+employee.getSalary());
        }
    }
}
