package Y1概述;
/*
    集合：集合是Java提供的一种容器，可以用来存储多个数据
    集合与数组的区别：
              长度：数组长度是固定的，集合长度是可变的
              内容：数组存相同类型的元素(对象，和基本数据类型)
                   集合存储只能存储对象，但类型可以不一致(对象)
 */

import java.util.Collection;
import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        Collection<Integer> integers=new LinkedHashSet<>();
    }
}
/*
学习集合的目标：
1.会使用集合存储数据
2.会遍历集合，把数据取出来
3.掌握每种集合的特性
 */
