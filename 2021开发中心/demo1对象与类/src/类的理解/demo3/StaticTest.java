package 类的理解.demo3;

/**
 * @Author: yqy
 * @Date: 2021/05/27/16:35
 * @Description:
 * static静态 有什么作用？如何去使用？
 */
public class StaticTest {
    public static void main(String[] args) {
     Employee[] employees=new Employee[3];
     employees[0]=new Employee("jack",1823);
     employees[1]=new Employee("tom",1500);
     employees[2]=new Employee("dick",800);

        for (Employee employee : employees) {
            employee.setId();
            System.out.println("name:"+employee.getName()+",id:"+employee.getId()+",salary:"+employee.getSalary());
        }
        int n=Employee.getNextId(); //调用静态方法
        System.out.println("Next available id="+n);
    }
}

class Employee{
    private  static  int nextId=15;  //静态成员变量    初始化15从15开始，如果不赋值，则为0
    private String name;
    private double salary;
    private int id;
    public Employee(String n,double e){
        name=n;
        salary=e;
        id=0;
    }
    public String getName(){
        return  name;
    }
    public double getSalary(){
        return salary;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        id=nextId;
        nextId++;
    }
    public  static int getNextId(){
        return nextId;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("皮蛋霞霞", 2000);
        System.out.println(employee.getName()+""+employee.getSalary());
    }
}
//思考：static 方便在没有创建对象的情况下进行调用(方法/变量)
