package Y3LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.linkedHashMap<K,V> extends HashMap<K,V>
    Map接口中的哈希表和链表实现，有顺序的集合

    底层原理：
        哈希表+链表（记录元素顺序）
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String,String> map=new LinkedHashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("d","d");
        System.out.println(map);
        /*
        有序的，怎么存，怎么取
        {a=a, c=c, b=b, d=d}
         */
    }
}
