package LeetCode._顺序刷题;

import java.util.Arrays;

/**
 * @Author: yqy
 * @Date: 2022/03/07/17:05
 * @Description:
 */
public class Demo169 {
    public static void main(String[] args) {
        int[] s={2,2,1,1,1,1,2,2};
        System.out.println(majorityElement(s));
    }
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

}
