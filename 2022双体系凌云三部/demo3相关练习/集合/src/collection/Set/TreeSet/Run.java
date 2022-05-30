package collection.Set.TreeSet;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: yqy
 * @Date: 2022/05/18/15:37
 * @Description: 存储结构：红黑树
 * <p>
 * 基于排列顺序实现元素不重复
 * 实现了SortedSet接口，对集合元素自动排序
 * 元素对象必须实现Comparable接口，指定排序规则
 * 通过CompareTo方法确定是否为重复元素
 */
public class Run {
    /**
     * 基本数据类型添加
     */
    @Test
    public void test() {
        Set<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(3);//是从小到大添加进去的


        System.out.println(set.size());
        System.out.println(set);

        //判断
        System.out.println("是否有2？" + set.contains(2));
        System.out.println(set.isEmpty());

    }

    /**
     * 对象数据类型
     */
    @Test
    public void test2() {
        TreeSet<Kidney> kidneys = new TreeSet<>();
        Kidney k1 = new Kidney("水桶腰子", 99);
        Kidney k2 = new Kidney("金刚腰子", 66);
        Kidney k3 = new Kidney("砖石腰子", 89);
        Kidney k4 = new Kidney("金刚腰子", 89);
        //collection.Set.TreeSet.Kidney cannot be cast to java.lang.Comparable
        //没有实现Comparable接口都无法添加
        kidneys.add(k1);
        kidneys.add(k2);
        kidneys.add(k3);
        kidneys.add(k2);
        kidneys.add(k4);

        System.out.println(kidneys.size());
        System.out.println(kidneys);

    }


}
