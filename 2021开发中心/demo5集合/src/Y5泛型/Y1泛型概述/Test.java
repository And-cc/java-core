package Y5泛型.Y1泛型概述;

import java.util.ArrayList;
import java.util.Iterator;

/*
      不使用泛型：
            好处：默认类型Obejct,可以存储任意类型数据
            弊端：不安全，会引发异常
       使用泛型：
            好处：
               1.避免了类转换麻烦，存什么类型，就能取什么类型
               2.把运行期异常（代码运行之后才会有的异常），提升到了编译期
            弊端：泛型是什么类型，只能存储什么类型
 */
public class Test {
    public static void main(String[] args) {
        //demo1();
        demo2();

    }

    private static void demo2() {
         ArrayList<String> s=new ArrayList<>();
         s.add("hello");
        // s.add(1);
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()){
            String s1 = iterator.next();
            System.out.println(s1+">"+s1.length());
        }
    }
    private static void demo1() {
        ArrayList list=new ArrayList();
        list.add("hello");
        list.add(1);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);//不能使用.length 需要转型String
            String s = (String) next;
            System.out.println(s.length());//java.lang.Integer cannot be cast to java.lang.String
        }

    }
}
