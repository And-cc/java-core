package Map.TreeMap;

import org.junit.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Author: yqy
 * @Date: 2022/05/19/15:31
 * @Description:
 */
public class Run {
    //有序的map
    @Test
    public void test() {
        Map<String, String> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length()) {
                    return o1.length() - o2.length();
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
        map.put("beijing", "北京");
        map.put("shanghai", "上海");
        map.put("nanjing", "南京");
        map.put("xian", "西安");
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s + " : " + map.get(s));
        }
    }
}
