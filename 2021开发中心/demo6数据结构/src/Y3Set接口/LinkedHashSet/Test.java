package Y3Set接口.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
      Hash保证元素唯一，但是没有顺序；
                    可以使用：java.util.linkedHashset

     java.util.linkedHashset：extends HashSet
                  特点：
                    1.底层是一个hash表（数组+链表/红黑树）+链表：多了一条链表（记录元素的存储顺序）

 */
public class Test {
    public static void main(String[] args) {
        //创建对象
        HashSet<String> set=new HashSet<>();
        set.add("hai");
        set.add("hello");
        set.add("hello");
        set.add("你好");
        System.out.println(set);//[hai, 你好, hello]-----无序，不重复

        //创建对象
        HashSet<String> linked=new LinkedHashSet<>();
        linked.add("hai");
        linked.add("hello");
        linked.add("hello");
        linked.add("你好");
        System.out.println(linked);//[hai, hello, 你好]-----有序，不重复
    }
}
