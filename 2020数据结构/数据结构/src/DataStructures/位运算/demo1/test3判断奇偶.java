package DataStructures.位运算.demo1;

/**
 * @Author: yqy
 * @Date: 2022/02/22/11:09
 * @Description:
 */
public class test3判断奇偶 {
    public static void main(String[] args) {
        int n=3;
        if ((n & 1)==1){
            System.out.println("奇数");
        }else {
            System.out.println("偶数");
        }
    }
}
