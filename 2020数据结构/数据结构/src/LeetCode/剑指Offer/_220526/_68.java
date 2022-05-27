package LeetCode.剑指Offer._220526;

/**
 * @Author: yqy
 * @Date: 2022/05/26/21:44
 * @Description:查找插入位置
 */
public class _68 {
    public static void main(String[] args) {
        int i = searchInsert(new int[]{1, 3, 5, 6}, 7);
        System.out.println(i);
    }
    public static int searchInsert(int[] nums, int target) {
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            if (target<=nums[i]){
                //找到位置了
                return i;
            }
        }
        if (index==0){
            index=nums.length;
        }
        return index;
    }
}
