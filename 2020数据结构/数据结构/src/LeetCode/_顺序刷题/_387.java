package LeetCode._顺序刷题;

import java.util.*;

/**
 * @Author: yqy
 * @Date: 2022/05/27/16:40
 * @Description:字符串中的第一个唯一字符
 */
public class _387 {
    public static void main(String[] args) {
        int i = firstUniqChar2("leetcode");
        System.out.println(i);
    }
    public static int firstUniqChar2(String s) {
        char[] c = s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < c.length; i++) {
            char of=c[i];
            Integer integer = map.get(of);
            if (integer==null){
                integer=0;
            }
            map.put(of,++integer);
        }
        Set<Character> characters = map.keySet();
        Iterator<Character> iterator = characters.iterator();
        while (iterator.hasNext()){
            Integer ints = map.get(iterator.next());
            if (ints==0){
                return s.indexOf(iterator.next());
            }
        }
        return -1;
    }
    public static int firstUniqChar(String s) {
        /**
         * 第一次遍历：依次拿到一个值
         * 第二次遍历：查看是否重复
         */
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            char of=c[i];
            boolean flag=false;
            for (int j =0; j < c.length; j++) {
                if (j==i){
                    continue;
                }
                if (of==c[j]){
                    flag=true;
                }
            }
            if (!flag){
                return i;
            }
        }
        return -1;
    }
}
