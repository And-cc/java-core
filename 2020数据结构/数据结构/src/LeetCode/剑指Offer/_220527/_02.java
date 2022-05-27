package LeetCode.剑指Offer._220527;

/**
 * @Author: yqy
 * @Date: 2022/05/27/14:49
 * @Description:二进制加法
 */
public class _02 {
    public static void main(String[] args) {
        String s = addBinary("11", "10");
        System.out.println(s);
    }
    public static String addBinary(String a, String b) {
        return Integer.toBinaryString(
                Integer.parseInt(a,2)+
                        Integer.parseInt(b,2)
        );
    }
}
