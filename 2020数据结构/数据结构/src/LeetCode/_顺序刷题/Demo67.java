package LeetCode._顺序刷题;

/**
 * @Author: yqy
 * @Date: 2022/03/03/21:19
 * @Description:
 */
public class Demo67 {
    public static void main(String[] args) {
        String s = addBinary("11", "1");
        System.out.println(s);
    }
    public static String addBinary(String a, String b) {
        return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
    }
    /*public static String addBinary(String a, String b) {
        //这个有限制，
        //return Integer.toBinaryString(Integer.parseInt(a,2)+Integer.parseInt(b,2));
        long i= Long.parseLong(a);
        long j=Long.parseLong(b);

    }*/
}
