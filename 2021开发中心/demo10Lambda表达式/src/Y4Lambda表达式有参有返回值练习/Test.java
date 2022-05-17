package Y4Lambda表达式有参有返回值练习;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Person[] arr={
                new Person("卡莎",18),
                new Person("亚索",20),
                new Person("永恩",19),
                new Person("诺手",30)
        };
        //对数组中person对象使用Arrays的sort方法通过年龄进行（前边-后边）升序排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        //使用Lambda表达式，简化匿名内部类----->降序排序
        Arrays.sort(arr,(Person p1,Person p2)->{
            return p2.getAge()- p1.getAge();
        });

        //遍历数组
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
