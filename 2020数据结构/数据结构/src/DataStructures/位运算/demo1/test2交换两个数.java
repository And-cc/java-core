package DataStructures.位运算.demo1;

/**
 * @Author: yqy
 * @Date: 2022/02/22/10:49
 * @Description:交换两个数
 */
public class test2交换两个数 {
    public static void main(String[] args) {
        int x=4;
        int y=10;
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x);
        System.out.println(y);
    }
}
