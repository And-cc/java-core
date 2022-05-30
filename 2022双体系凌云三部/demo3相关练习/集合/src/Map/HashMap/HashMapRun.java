package Map.HashMap;

import org.junit.Test;

import java.security.Key;
import java.util.*;

/**
 * @Author: yqy
 * @Date: 2022/05/18/10:10
 * @Description: 存储结构：数组+（链表/红黑树） ==》当链表元素中元素达到十六个就转换为红黑树存储
 */
public class HashMapRun {
    /**
     * 基本数据类型
     */
    @Test
    public void testMap() {
        Map<String, List<Map<String, Object>>> listMap = new HashMap<>();
        Map<String, String> map = new HashMap<>();
        map.put("y", "y");
        map.put("y", "y1");//这里其实被把前面的覆盖掉了
        //key不可以重复
        //value可以重复
        map.put("z", "y");
        map.put("k", "y");
        System.out.println(map.size());
        System.out.println(map.get("y"));

        //遍历
        //使用keySet
        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s + "====" + map.get(s));
        }
        //Entry遍历
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "====Entry====" + entry.getValue());
        }

    }

    /**
     * 对象数据类型
     */
    @Test
    public void test() {
        Map<Kidney, List<Kidney>> map = new HashMap<>();
        Kidney k1 = new Kidney("无敌战神腰子", 2, 7777.22);
        Kidney k3 = new Kidney("虎背熊腰", 3, 8888888.11);
        Kidney k2 = new Kidney("30秒小金刚大腰子", 7, 777887.22);
        Kidney k4 = new Kidney("30秒小金刚大腰子", 7, 777887.22);
        List<Kidney> kidneyList = new LinkedList<>();
        kidneyList.add(k1);
        kidneyList.add(k4);
        kidneyList.add(k3);
        kidneyList.add(k2);
        map.put(k1, kidneyList);
        map.put(k4, kidneyList);
        map.put(k2, kidneyList);
        map.put(k3, kidneyList);

        System.out.println(map.size());
        System.out.println(map);

        //遍历1
        Set<Kidney> kidneys = map.keySet();
        for (Kidney kidney : kidneys) {

            List<Kidney> list = map.get(kidney);
            System.out.println(kidney + "包含");
            for (Kidney kidney1 : list) {
                System.out.println(kidney1.toString());
            }
            System.out.println("___________");
        }

        //删除
        List<Kidney> remove = map.remove(new Kidney("30秒小金刚大腰子", 7, 777887.22));
        System.out.println(remove);
        System.out.println("-----------------------------------------------------------------------------");
        //遍历2
        Set<Map.Entry<Kidney, List<Kidney>>> entries = map.entrySet();
        for (Map.Entry<Kidney, List<Kidney>> entry : entries) {
            System.out.println(entry + "_______" + entry.getValue());
        }

        //判断
        boolean flag = map.containsKey(new Kidney("无敌战神腰子", 2, 7777.22));
        boolean b = map.containsValue(kidneyList);
        boolean b1 = map.isEmpty();
        System.out.println("是否有头：" + flag + "\n是否有值" + b + "\n是否为空？" + b1);


    }
}
