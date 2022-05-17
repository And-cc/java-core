package LeetCode;

/**
 * @Author: yqy
 * @Date: 2022/03/03/16:29
 * @Description:
 */
public class Demo53 {
    public static void main(String[] args) {
        int[] nu= {-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(nu);
        System.out.println(i);
    }
    public static int maxSubArray(int[] nums) {
        //定义一个返回值
        int per=0,maxAns=nums[0];

        for (int i = 0; i < nums.length; i++) {

            //用来比较一段的长度
            per=Math.max(per+nums[i],nums[i]);
            //比较最大值
            maxAns=Math.max(maxAns,per);
        }
        return maxAns;
    }
}
