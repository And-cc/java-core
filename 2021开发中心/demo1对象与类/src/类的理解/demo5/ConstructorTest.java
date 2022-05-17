package 类的理解.demo5;

import java.util.Random;

/**
 * @Author: yqy
 * @Date: 2021/05/27/17:44
 * @Description:如何自定义构造方法？
 */
public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] employees=new Employee[3];
        employees[0]=new Employee("jack",3000);
        employees[1]=new Employee(5500);
        employees[2]=new Employee();
        for (Employee employee : employees) {
            System.out.println("name:"+employee.getName()+",  id:"+employee.getId()+",  salary:"+employee.getSalary());
        }
    }
}

class Employee{
    private static int nextId;
    private int id;
    private String name="";
    private double salary;
    static {
        Random random = new Random();
        nextId = random.nextInt(10000);
    }

    {
        id=nextId;
        nextId++;
    }
    public Employee(String n,double s){
        name=n;
        salary=s;
    }
    public Employee(double s){
        this("Employee #"+nextId,s); //this代指第一个构造函数，它是根据内容来指定的
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
//思考：自定义构造方法既是对方法的重载，名字相同，但是参数不同
