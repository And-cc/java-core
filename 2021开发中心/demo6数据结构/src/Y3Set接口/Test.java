package Y3Set接口;

import java.util.HashSet;
import java.util.Set;

/*
     java.util.Set:extends Collection接口
               特点:
                  1.不允许存储重复的元素
                  2.没有索引，没有带索引的方法，也不能通过普通的for循环遍历
     java.util.HashSet:implements set接口
                特点:
                  1.不允许重复元素
                  2.没有索引，没有带索引的方法，也不能通过普通的for循环遍历
                  3.是一个无序的集合，存储元素的顺序和取出元素的顺序有可能不一致
                  4.底层是一个hash表结构（查询速度非常快）
 */
public class Test {
    public static void main(String[] args) {
        //创建对象：多态
        Set<String> set=new HashSet<>();
        //添加元素
        set.add("hello");
        set.add("hai");
        set.add("你好");
        set.add("hello");//重复的元素无法存储
        //不能普通for循环遍历，试试foreach
        for (String s : set) {
            System.out.println(s);
        }

    }
}
