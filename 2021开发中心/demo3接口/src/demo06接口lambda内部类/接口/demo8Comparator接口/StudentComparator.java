package demo06接口lambda内部类.接口.demo8Comparator接口;

import java.util.Comparator;

/**
 * @Author: yqy
 * @Date: 2021/05/31/22:06
 * @Description:
 */
public class StudentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary()> o2.getSalary())
            return -1;
        else if (o1.getSalary()< o2.getSalary())
            return 1;
        else {
            if (o1.getName().length()>o2.getName().length())
                return 1;
            else if (o1.getName().length()<o2.getName().length())
                return -1;
            else return 0;
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0]=new Employee("张三",4533);
        employees[1]=new Employee("王麻子",9999);
        employees[2]=new Employee("宫本嚣张",5500);
        java.util.Arrays.sort(employees,new StudentComparator());
        for (Employee employee : employees) {
            System.out.println(employee.getName()+"    :   "+employee.getSalary());
        }
    }
}
