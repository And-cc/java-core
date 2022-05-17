package LeetCode;

/**
 * @Author: yqy
 * @Date: 2022/03/03/21:35
 * @Description:
 */
public class Demo69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(17));
    }
    public static int mySqrt(int x) {
        if (x==0) return 0;
        int i= (int) Math.exp(0.5*Math.log(x));
        return (i+1)*(i+1) < x ? i+1:i;
    }
}
