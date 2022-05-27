package LeetCode.剑指Offer._220528_简单;

import java.util.Arrays;

/**
 * @Author: yqy
 * @Date: 2022/05/27/20:02
 * @Description:前 n 个数字二进制中 1 的个数
 */
public class _03 {
    public static void main(String[] args) {
        int[] ints = countBits(2);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] countBits(int n) {
        int[] ints=new int[n+1];
        for (int i = 0; i <ints.length; i++) {
            String s = Integer.toBinaryString(i);
            char[] c = s.toCharArray();
            int price=0;
            for (int j = 0; j < c.length; j++) {
                if (c[j]=='1'){
                    price++;
                }
            }
            ints[i]=price;
        }
        return ints;
    }
}
