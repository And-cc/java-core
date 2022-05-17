package demo06接口lambda内部类.接口.demo9对象克隆.问题所在;

/**
 * @Author: yqy
 * @Date: 2021/05/31/22:17
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("王五");
        Employee employee1=employee;
        employee1.setName("李四");
        System.out.println("e name:"+employee.getName());
        System.out.println("e1 name:"+employee1.getName());
    }
}
