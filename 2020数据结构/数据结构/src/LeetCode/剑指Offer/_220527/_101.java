package LeetCode.剑指Offer._220527;

/**
 * @Author: yqy
 * @Date: 2022/05/27/19:13
 * @Description:分割等和子集
 */
public class _101 {
    public static void main(String[] args) {
        int[] ints=new int[]{3,3,3,4,5};
        boolean b = canPartition(ints);
        System.out.println(b);
    }
    public static boolean canPartitionPlus(int[] nums) {
        //先算出总和
        int sum=0;
        for (int num : nums) {
            sum+=num;
        }
        //如果总和是奇数，直接false
        if (sum%2==1){
            return false;
        }
        //摸2，我们只需要算一半就可以
        int left=sum/2;
        for (int i = 0; i < nums.length; i++) {
            int temp=nums[i];
            for (int j = 0; j < nums.length; j++) {

            }
        }
        return false;
    }
    public static boolean canPartition(int[] nums) {
        int sum=0;
        for (int num : nums) {
            sum+=num;
        }
        if (sum%2==1){
            return false;
        }
        int index=sum/2;
        for (int i = 0; i < nums.length; i++) {
            if (index==nums[i]){
                return true;
            }
        }
        return false;
    }
}
