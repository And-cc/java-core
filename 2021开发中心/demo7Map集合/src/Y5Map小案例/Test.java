package Y5Map小案例;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//计算一个字符串中每个字符的出现次数
/*
步骤：
   1.使用Scanner获取用户输入的字符串
   2.创建Map集合，key是字符串的字符，value是个数
   3.遍历字符串，获取每一个字符：
             （1）：String类的方法toCharArray把字符串转为数组，遍历数组
             （2）：String类的方法length()+charAt(索引)
   4.使用Map集合中的方法判断获取到的字符串是否存储在Map集合中
             （1）：使用Map集合中的方法containsKey(获取到的字符)，返回boolean
                   true：字符存在
                         通过字符（key），获取value（统计个数）
                         value++
                         再把新的value存储到Map集合中
                   false:字符不存在
                          把字符作为key，1作为value存进Map
             （2）：使用Map集合中的get(key),
                   返回null：key不存在
                   返回！null：key存在
    5.遍历Map集合，输出结果
 */
public class Test {
    public static void main(String[] args) {
        //1.使用Scanner获取用户输入的字符串
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一段字符串:");
        String s = scanner.next();
        //2.创建Map集合，key是字符串的字符，value是个数
        Map<Character,Integer> map=new HashMap<>();
        //3.遍历字符串，获取每一个字符：
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
        //4.判断获取到的字符串是否存储在Map集合中
            if (map.containsKey(chars[i])){
                //存在
                Integer value = map.get(chars[i]);
                value++;
                map.put(chars[i],value);
            }else {
                //不存在
                map.put(chars[i],1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey()+"字符出现了"+entry.getValue()+"次");
        }
    }
}
