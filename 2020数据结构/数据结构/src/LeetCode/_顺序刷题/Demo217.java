package LeetCode._顺序刷题;

/**
 * @Author: yqy
 * @Date: 2022/03/14/17:11
 * @Description:
 */
public class Demo217 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        boolean b = containsDuplicate(arr);
        System.out.println(b);
    }

    public static boolean containsDuplicate(int[] nums) {
        if (nums.length==0){
            return false;
        }
        /*for (int i = 0; i < nums.length-1; i++) {
            for (int j = 0; j < nums.length-i-1; j++) {
                if (nums[j]==nums[j+1]){
                   return true;
                }
            }
        }*/
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
