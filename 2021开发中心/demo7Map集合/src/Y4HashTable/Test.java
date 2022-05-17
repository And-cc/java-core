package Y4HashTable;

import java.util.HashMap;
import java.util.Hashtable;

/*
    java.util.HashTable<K,V>集合 implements Map<K,V>接口
            HashTable底层也是以是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
            HashMap底层也是以是一个哈希表，是一个线程不安全的集合，是多线程集合，速度块

            HashMap集合：可以存储null值，null键
            HashTable集合：不可以存储null值和null键

    HashTable和Vector集合一样，在jdk1.2版本之后被更先进的集合（hashMap,ArrayList）取代了
    HashTable的子类Properties依然活跃在历史舞台
    Properties集合是一个位移和IO流相结合的集合
 */
public class Test {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put(null,18);
        map.put(null,null);
        map.put("张三",null);
        System.out.println(map);//{null=null, 张三=null}
        Hashtable<String,Integer> table=new Hashtable<>();
        table.put(null,18);
        table.put("张三",null);
        table.put(null,null);
        System.out.println(table);
        //Exception in thread "main" java.lang.NullPointerException
    }
}
