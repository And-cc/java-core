package LeetCode;

/**
 * @Author: yqy
 * @Date: 2022/03/03/14:22
 * @Description:删除有序数组中的重复项
 */
public class Demo26 {
    public static void main(String[] args) {
        int[] nums={0,0,1,2,5,5,5,6,7,7,9,99};
        int i = removeDuplicates(nums);
        System.out.println(i);
    }

    /**
     *
     * @param nums
     * @return 返回删除后数组的新长度
     */
    public static int removeDuplicates(int[] nums) {
        if (nums.length==0 || nums==null) return 0;
        int p=0,q=1;
        while(q<nums.length){
            if (nums[p]!=nums[q]){
                nums[p+1]=nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }
}
