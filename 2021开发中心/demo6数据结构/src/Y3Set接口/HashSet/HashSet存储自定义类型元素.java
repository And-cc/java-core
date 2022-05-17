package Y3Set接口.HashSet;
/*
   给Hashset中存放自定义类型元素时，需要对象的hashcode和equals方法，建立自己的比较方式，才能保证HashSet集合中对象唯一
 */


import java.util.HashSet;
import java.util.Set;

//要求：同同年龄的人，视为同一个人，只能存储一次
public class HashSet存储自定义类型元素 {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        Person s1 = new Person("张三", 20);
        Person s2 = new Person("张三", 20);
        Person s3 = new Person("张三", 21);
        people.add(s1);
        people.add(s2);
        people.add(s3);
        System.out.println(people);
        //[Person{name='张三', age=21}, Person{name='张三', age=20}, Person{name='张三', age=20}]
        //因为没有重写Equals方法和hashCode方法

        Set<Student> students = new HashSet<>();
        Student s11 = new Student("张三", 20);
        Student s22 = new Student("张三", 20);
        Student s33 = new Student("张三", 21);
        students.add(s11);
        students.add(s22);
        students.add(s33);
        System.out.println(students);
        //[Student{name='张三', age=21}, Student{name='张三', age=20}]
    }
}
