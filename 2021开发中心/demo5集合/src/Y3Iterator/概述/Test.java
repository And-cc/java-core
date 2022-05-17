package Y3Iterator.概述;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
   java.util.Iterator(迭代器)：Collection的通用获取方式
   1.使用集合的方法Iterator()获取迭代器的实现类，使用Iterator接口（多态接收）
   2.Iterator接口中的hasNext判断还有没有下一个元素
   3.使用Iterator接口中的Next取出集合中的下一个元素

   常用方法：
        public  boolean hasNext()    迭代下一个元素，有则返回true
        public  E       next()       返回迭代中的下一个元素。
 */
public class Test {
    public static void main(String[] args) {
        Collection<String> strings=new ArrayList<>();
        strings.add("张三");
        strings.add("李四");
        strings.add("王五");
        strings.add("秦六");
        /*
        1.使用集合的方法Iterator()获取迭代器的实现类，使用Iterator接口（多态接收）
            Iterator<E>接口也有泛型，跟着集合走
         */
        Iterator<String> iterator = strings.iterator();
        //2.Iterator接口中的hasNext判断还有没有下一个元素
        while (iterator.hasNext()){
            //3.使用Iterator接口中的Next取出集合中的下一个元素
            System.out.println(iterator.next());
        }
    }


}
