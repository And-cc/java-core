package Conllections;

import java.util.*;

/**
 * @Author: yqy
 * @Date: 2022/05/17/15:03
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        baseType();
        classType();
    }

    private static void baseType() {
        List<Integer> integers = new ArrayList<>();
        integers.add(9);
        integers.add(5);
        integers.add(18);
        integers.add(11);
        integers.add(2);
        Collections.sort(integers);
        System.out.println("升序排序" + integers);

        int i = Collections.binarySearch(integers, 10);
        System.out.println("二分查找" + i);

        Collections.reverse(integers);
        System.out.println("倒序排序" + integers);

        Collections.shuffle(integers);
        System.out.println("随机打乱" + integers);

        Collections.fill(integers, 6);
        System.out.println("全部填充" + integers);

    }

    private static void classType() {
        List<Kidney> list = new ArrayList<>();
        list.add(new Kidney("金刚不坏大铁腰", 2, 99.99));
        list.add(new Kidney("东方不败西瓜腰", 3, 66.666));
        list.add(new Kidney("东方不败西瓜腰", 2, 66.666));
        list.add(new Kidney("水桶腰", 3, 611.12121));
        list.add(new Kidney("傲娇金贵小蛮腰", 1, 77777.77));
        list.add(new Kidney("水桶腰", 5, 1));
        Collections.sort(list);
        Iterator<Kidney> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
