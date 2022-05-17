package LeetCode;

/**
 * @Author: yqy
 * @Date: 2022/03/07/17:10
 * @Description:
 */
public class Demo190 {
    public static void main(String[] args) {
        System.out.println(reverseBits(00000));

    }
    public static int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }
}
