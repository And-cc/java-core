package collection.Set.TreeSet.实际案例;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: yqy
 * @Date: 2022/05/18/17:19
 * @Description: 实现中国省名拼音排序
 * 先长度，然后首字母
 */
public class Run {
    @Test
    public void test() {
        Set<String> set = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                } else {
                    return o1.compareTo(o2);
                }
            }
        });

        set.add("chongqing");
        set.add("beijing");
        set.add("shanghia");
        set.add("nanjing");
        set.add("xian");
        set.add("qinghai");
        set.add("hunan");
        set.add("haerbing");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("--------------倒序遍历--------------");
        Object[] array = set.toArray();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
