package LeetCode._顺序刷题;

/**
 * @Author: yqy
 * @Date: 2022/03/07/16:47
 * @Description:
 */
public class Demo136 {

    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * @param nums
     * @return
     */
    public static int singleNumber(int[] nums) {
        int num=0;
        for (int i = 0; i < nums.length; i++) {
            num ^=nums[i];
        }
        return num;
    }
}
