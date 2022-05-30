package 实际应用;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: yqy
 * @Date: 2022/05/18/17:09
 * @Description: Comparator:实现定制比较（比较器）
 * Comparable：可比较的
 */
public class Run {
    @Test
    public void test() {
        List<Kidney> kidney = new LinkedList<>();
        Kidney k1 = new Kidney("金刚不坏大腰子", 66666, 2, "虎");
        Kidney k2 = new Kidney("滴滴答答可爱腰子", 622226666, 2, "马");
        Kidney k3 = new Kidney("傲娇金贵小腰子", 111111, 2, "猪");
        kidney.add(k1);
        kidney.add(k3);
        kidney.add(k2);
        kidney.add(k2);
        System.out.println(kidney);
    }
}
