package 类的理解.demo4;

/**
 * @Author: yqy
 * @Date: 2021/05/27/17:11
 * @Description:
 */
public class ParamTest {
    public static void main(String[] args) {
        /**
        * @Author: yqy
        * @Date: 2021/5/27
        * @Description:
        */
        System.out.println("Testing triplevalue:");
        double percent=10;
        System.out.println("before: percent="+percent);
        tripleValue(percent);
        System.out.println("After: percent="+percent);

        /**
        * @Author: yqy
        * @Date: 2021/5/27
        * @Description:
        */
        System.out.println("\nTesting tripleSalary:");
        Employee employee = new Employee("多来A梦", 1523);
        System.out.println("before: salary="+ employee.getSalary());
        tripleSalary(employee);
        System.out.println("after: salary="+ employee.getSalary());
        /**
        * @Author: yqy
        * @Date: 2021/5/27
        * @Description:
        */
        System.out.println("\nTesting swap:");
        Employee a = new Employee("jack", 500);
        Employee b = new Employee("杰克", 9999);
        System.out.println("before: a="+a.getName());
        System.out.println("before: b="+b.getName());
        swap(a,b);
        System.out.println("after: a="+a.getName());
        System.out.println("after: b="+b.getName());
    }
    public static void tripleValue (double x) {
        x=3*x;
        System.out.println("end of method: x="+x);
    }
    public static void tripleSalary(Employee x){
        x.raiseSalary(200);
        System.out.println("end of method: Salary="+x.getSalary());
    }
    public static void swap(Employee x, Employee y){
        Employee temp=x;
        x=y;
        y=temp;
        System.out.println("end of method: x="+x.getName());
        System.out.println("end of method: y="+y.getName());
    }
}

class Employee {
    private String name;
    private double salary;
    public Employee(String n, double s){
        name=n;
        salary=s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void raiseSalary(double byPercent){
        double raise=salary*byPercent/100;
        salary +=raise;
    }
}
//思考：参数类型：基本数据类型，也可以是对象
       //1.不能修改基本数据类型的参数
       //2.方法可以改变对象参数的状态
       //3.方法不能让一个对象参数引用一个新的对象
