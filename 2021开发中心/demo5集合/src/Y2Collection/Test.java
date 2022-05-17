package Y2Collection;

import java.util.ArrayList;
import java.util.Collection;


/*
   java.util.Collection（接口）：所有的实现类都可以使用这些方法
      创建对象：多态
              Collection<参数> 对象名=new 实现类<>();

      常用方法：boolean add(E a);        添加元素
              boolean remove(E a);     删除某个元素
              void clear();            清空所有元素
              boolean contains(E a);   判断集合是否有某个元素
              boolean isEmpty();       判断集合是否为空
              int Size();              获取集合长度
              Object[] toArray();      将集合转换为一个数组
 */
public class Test {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        list.remove("aaa");
        System.out.println(list);
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        System.out.println(list.size());
        Object[] array = list.toArray();
        for (Object o : array) {
            System.out.println("数组:"+o);
        }
    }
}
