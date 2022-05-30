package LeetCode.剑指Offer._220530.高效制胜;

/**
 * @Author: yqy
 * @Date: 2022/05/30/21:46
 * @Description:
 */
public class _1 {
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(temp==nums[j]){
                    int[] indexs=new int[2];
                    indexs[0]=i;
                    indexs[1]=j;
                    return indexs;
                }
            }
        }
        return null;
    }
}
