package Y1概述;

/*
      java.util.Map<k,v> 集合：
          特点:
             1.map集合是一个双列集合，几个元素包含两个值（一个key，一个value）
             2.map集合中的元素，key和value的数据类型可以不相同，也可以相同
             3.map集合中的元素，key是不允许重复的，value是可以重复的
             4.map集合中的元素，key和value是一一对应的

      java.util.hashMap<k,v>集合 implement Map<k,v>接口：
          特点:
             1.HashMap集合底层是哈希表，查询速度块
             2.HashMap是一个无序集合，存储元素和取出元素的顺序有可能不一致

       java.util.LinkedHashMap<k,v>集合 implement hashMap<k,v>接口：
          特点:
             1.LinkedHashMap集合底层是哈希表+链表（保证迭代的顺序）
             2.HashMap是一个有序序集合，存储元素和取出元素的顺序一致
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
  Map<k,v>常用方法:
              1. V	put(K key, V value)               :把指定的键与值添加到Map集合中
              2. V	remove(Object key)         :把指定的键所对应的键值对元素在Map集合中删除，返回被删除元素的值
              3. V	get(Object key)                  :根据指定的键，在Map集合中获取对应的值
              4. boolean  containsKey(Object key)    :判断集合中是否含有指定的键
              5. Set<k> keySet()                     :获取map集合中所有的键，存储到set集合中
              6. Set<Map.Entry<K,V>> entrySet()      :获取map集合中所有的键值对对象的集合（set集合）
 */
public class Test {
    public static void main(String[] args) {
        //demo1();        //put
        //demo2();        //remove
        //demo3();        //get
        //demo4();        //containsKey
        //demo5();        //keySet遍历map
        //demo6();        //entrySet遍历map
    }
    private static void demo1() {
         /*
        public V put(K key, V value):把指定的键与指定的值添加到Map集合中
               返回值：V
                 注意：存储键值对的时候，key不重复，返回值V是null
                      存储键值对的时候，key重复，会使用新的value替换map中重复的value值，返回被替换的值
         */

        //创建对象，多态
        Map<String,String> map=new HashMap<>();
        String v1 = map.put("张三", "三张");
        String v2 = map.put("张三", "三三张");
        System.out.println(v1);//没重复，null
        System.out.println(v2);//重复，三张
        System.out.println(map);//{张三=三三张}   集合中只存了一个
        map.put("李四", "四李");
        map.put("王五", "五王");
        map.put("秦六", "六秦");
        System.out.println(map);
    }
    private static void demo2() {
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",180);
        map.put("李四",160);
        map.put("王五",170);
        System.out.println(map);
        Integer remove = map.remove("王五");
        System.out.println(remove);//170
        System.out.println(map);
    }
    private static void demo3() {
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",180);
        Integer v1 = map.get("张三");
        Integer v2 = map.get("李四");
        System.out.println("v1:"+v1+"v2:"+v2);
    }
    private static void demo4() {
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",180);
        map.put("李四",177);
        map.put("王五",157);
        boolean k1 = map.containsKey("张三");
        boolean k2 = map.containsKey("秦六");
        System.out.println("k1:"+k1+"      "+"k2:"+k2);
    }
    private static void demo5() {
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",180);
        map.put("李四",160);
        map.put("王五",170);
        //keySet遍历：先把map中所有的键放进set，然后通过键去拿值
        Set<String> set = map.keySet();
                //iterator
                Iterator<String> iterator = set.iterator();
                while (iterator.hasNext()){
                    String next = iterator.next();
                    System.out.println(map.get(next));
                }
                //for each
                for (String s : set) {
                    System.out.println(map.get(s));
                }
                //for------------->null
                for (int i = 0; i < set.size(); i++) {
                    System.out.println(map.get(i));
                }
    }
    private static void demo6() {
        Map<String,Integer> map=new HashMap<>();
        map.put("张三",180);
        map.put("李四",160);
        map.put("王五",170);
        /*entrySet遍历：像是夫妻领了结婚证，可以通过结婚证找到 K 和 V
                       和keySet一样，把结婚证放进Set集合，
                       然后通过结婚证 拿K() 和 拿V()
         */
        Set<Map.Entry<String, Integer>> set = map.entrySet();
                //iterator
                Iterator<Map.Entry<String, Integer>> it = set.iterator();
                while (it.hasNext()){
                    Map.Entry<String, Integer> next = it.next();
                    System.out.println("key  :"+next.getKey());
                    System.out.println("value  :"+next.getValue());
                }
                //for each
                for (Map.Entry<String, Integer> entry : set) {
                    System.out.println("key  :"+entry.getKey());
                    System.out.println("value  :"+entry.getValue());
                }
    }
}
