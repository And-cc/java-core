package demo7常用实用类.dmeo1Object类.demo3Objects;

import java.util.Objects;

/**
 * @Author: yqy
 * @Date: 2021/06/03/16:53
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        /*String s1="bb";
        String s2="bb";
        boolean b = s1.equals(s2);
        System.out.println(b);//true
        */

        /*
        String s1="aaa";
        String s2="null";
        boolean b = s1.equals(s2);
        System.out.println(b);//false
        //以前的版本s1.equals(s2)不允许有空值，现在可以
        */
        String s1="sss";
        String s2="null";
        boolean b = Objects.equals(s1, s2);
        System.out.println(b);//这是以前s1.equals(s2)抛异常后的解决方式

    }
}
