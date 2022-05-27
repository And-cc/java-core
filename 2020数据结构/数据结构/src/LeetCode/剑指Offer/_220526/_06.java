package LeetCode.剑指Offer._220526;

/**
 * @Author: yqy
 * @Date: 2022/05/26/17:14
 * @Description:排序数组中两个数字之和
 */
public class _06 {
    public static void main(String[] args) {
        int[] x={1,2,4,6,10};
        int[] sum = twoSum(x, 8);
        for (int i : sum) {
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        int[] arr=new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int temp=target-numbers[i];
            for (int j = numbers.length-1; j >i; j--) {
                if (temp==numbers[j]){
                    arr[0]=i;
                    arr[1]=j;
                    continue;
                }
            }
        }
        return arr;
    }
}
