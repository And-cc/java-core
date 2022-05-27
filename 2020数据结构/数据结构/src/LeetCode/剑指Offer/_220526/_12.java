package LeetCode.剑指Offer._220526;

/**
 * @Author: yqy
 * @Date: 2022/05/26/17:30
 * @Description:左右两边子数组的和相等
 */
public class _12 {
    public static void main(String[] args) {
        int[] num = new int[]{2, 1, -1};
        int index = pivotIndex(num);
        System.out.println(index);
    }

    public static int pivotIndex(int[] nums) {
        //遍历数组，拿到i值
        for (int i = 0; i < nums.length; i++) {
            int left = 0, right = 0;
            //判断如果是第一个元素，他左边是没有的，给他一个默认值
            if (i == 0) {
                left = 0;
            } else {
                for (int j = 0; j < i; j++) {
                    left += nums[j];
                }
            }
            //判断如果是最后元素，他右边是没有的，给他一个默认值
            if (i == nums.length - 1) {
                right = 0;
            } else {
                for (int j = nums.length - 1; j > i; j--) {
                    right += nums[j];
                }
            }
            if (right == left) {
                return i;
            }
        }
        return -1;
    }
}
