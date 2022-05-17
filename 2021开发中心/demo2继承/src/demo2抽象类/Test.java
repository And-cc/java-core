package demo2抽象类;

/**
 * @Author: yqy
 * @Date: 2021/05/28/16:51
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[2];
        people[0]=new Employee("张三",5000,1989,06,23);
        people[1]=new Student("李四","流氓");
        for (Person person : people) {
            System.out.println(person.getName()+", "+person.getDescription());
        }
    }
}
