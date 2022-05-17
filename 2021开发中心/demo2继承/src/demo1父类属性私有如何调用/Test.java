package demo1父类属性私有如何调用;

public class Test {
    public static void main(String[] args) {
        //子类 manager（经理）
        //父类 employee（员工）
        //关系 经理是员工
        Manager m = new Manager("张三", 8000, 1999, 12, 03);
        m.setBouns(4000);
        Employee[] employees = new Employee[3];
        employees[0]=m;
        employees[1]=new Employee("李四",5000,2001,2,6);
        employees[2]=new Employee("王五",4800,2001,03,6);
        for (Employee employee : employees) {
            System.out.println("name:"+employee.getName()+", salary:"+employee.getSalary()+", birthDay:"+employee.getBirthDay());
        }
    }
}
