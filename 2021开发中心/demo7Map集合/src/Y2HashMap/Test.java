package Y2HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
     HashMap存储自定义类型键值
     Map集合必须保证key的值是唯一的：
                作为key的元素，必须重写hashcode方法和equals方法，以保证唯一
 */
public class Test {
    public static void main(String[] args) {
           //demo1();
           //demo2();
    }
    /*
                   HashMap存储自定义类型键值
                   key：Student类型
                        Student重写hashcode方法和equals方法，以保证key唯一
                   value：String
                        value可以重复
   */
    private static void demo2() {
         HashMap<Student,String> map=new HashMap<>();
         map.put(new Student("张三",18),"清华");
         map.put(new Student("李四",19),"北大");
         map.put(new Student("张三",17),"中科大");//同名且同年龄才视为同一个key
         map.put(new Student("曹六",16),"蓝翔");
         //使用entrySet遍历
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        Iterator<Map.Entry<Student, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Student, String> next = iterator.next();
            System.out.println(next.getKey()+"  :  "+next.getValue());
        }
    }
    /*
               HashMap存储自定义类型键值
               key：String类型
                    String重写hashcode方法和equals方法，可以保证key唯一
               value：person类型
                    value可以重复
            */
    private static void demo1() {
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京",new Person("张三",18));
        map.put("上海",new Person("李四",5));
        map.put("北京",new Person("王五",21));
        map.put("曹县",new Person("曹六",666));
        //使用keySet遍历
        Set<String> set = map.keySet();
        for (String s : set) {
            Person person = map.get(s);
            System.out.println(s+"->"+person);
        }
    }
}
