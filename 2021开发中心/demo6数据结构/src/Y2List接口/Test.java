package Y2List接口;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
  java.util.List:接口继承自Collection接口，是单列集合的一个重要分支，习惯性的会将实现了list接口的对象称为list集合
            特点：
               1.元素存取有序的集合
               2.带索引，(可通过索引操作集合中的元素，与数组索引是一个道理)
               3.集合中可以有重复的元素，(通过元素的equals方法，比较是否为重复的元素)
            list接口中带索引的方法（特有）：
                  1.public void add(int index,E element):将指定的元素，添加到该集合中指定位置上
                  2.public E get(int index):返回集合中指定位置的元素
                  3.public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素
                  4.public E set(int index,E element):用指定元素替换集合中指定位置的元素，返回值的更新前的元素

 */
public class Test {
    public static void main(String[] args) {
        //创建一个list集合：多态
        List<String> list=new ArrayList<>();
        list.add("a");//Collection
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);//[a, b, c, d, e] 不是地址，重写了toString

        //1.public void add(int index,E element):将指定的元素，添加到该集合中指定位置上
        //在d和e之间加入666
        list.add(4,"666");
        System.out.println(list);
        //2.public E get(int index):返回集合中指定位置的元素
        //拿到6666
        System.out.println(list.get(4));
        //3.public E remove(int index):移除列表中指定位置的元素，返回的是被移除的元素
        //移除666
        String remove = list.remove(4);
        System.out.println(remove);
        System.out.println(list);
        //4.public E set(int index,E element):用指定元素替换集合中指定位置的元素，返回值的更新前的元素
        //把e换成666
        String set = list.set(4, "666");
        System.out.println(set);
        System.out.println(list);


        //三种遍历list集合方式
        //1.使用普通for
        System.out.printf("\n"+"//1.使用普通for         :");
        for (int i=0;i<list.size();i++){
            System.out.printf(list.get(i)+" ");
        }
        //2.使用for each
        System.out.printf("\n"+"//2.使用for each        :");
        for (String s : list) {
            System.out.printf(s+ " ");
        }
        //3.使用Iterator
        System.out.printf("\n"+"//3.使用Iterator        :");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.printf(iterator.next()+" ");
        }
    }
}
