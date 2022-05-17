package 牛客;

/**
 * @Author: yqy
 * @Date: 2021/12/01/22:40
 * @Description:
 */
public class demo7整数反转 {
    public static void main(String[] args) {
        int a=1234;
        System.out.println(0%10);
        /*int reverse = reverse(1234);
        System.out.println(reverse);*/
    }


    public static int reverse(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
}

