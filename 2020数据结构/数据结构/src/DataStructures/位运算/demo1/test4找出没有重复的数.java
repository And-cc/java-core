package DataStructures.位运算.demo1;

/**
 * @Author: yqy
 * @Date: 2022/02/22/11:18
 * @Description:
 */
public class test4找出没有重复的数 {
    public static void main(String[] args) {
        int[] arr={12, 22,31, 4, 6,6,5, 12, 22, 31, 4};
        int i = new test4().find(arr);
        System.out.println(i);
    }
}
