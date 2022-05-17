package Y4增强for;

import java.util.ArrayList;
import java.util.Collection;

/*
   增强for也称for each：专门用来遍历数组和集合的。
                       他的内部原理其实是个Iterator,所以，在遍历的过程中不能对元素进行增删操作
   格式：
       for(元素的数据类型 变量： 集合或数组){
           //...
       }

 */
public class Test {
    public static void main(String[] args) {
        demo1();
        System.out.printf("\n");
        demo2();
    }
    private static void demo2() {
        int a[]={1,2,3,3,4};
        for (int i:a) {
            System.out.printf("%d",i);
            System.out.printf(" ");
        }
    }
    private static void demo1() {
        Collection<String> s=new ArrayList<>();
        s.add("张三");
        s.add("李四");
        s.add("王五");
        s.add("秦六");
        s.add("赵七");
        s.add("魏九");
        for (String s1:s){
            System.out.print(s1+" ");
        }
    }
}
