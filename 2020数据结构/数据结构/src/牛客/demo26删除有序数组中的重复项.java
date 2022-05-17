package 牛客;

/**
 * @Author: yqy
 * @Date: 2021/12/02/19:47
 * @Description:
 */
public class demo26删除有序数组中的重复项 {

    public static void main(String[] args) {
        int[] s={0,0,1,1,1,2,2,3,3,4};
        for (int i1 : s) {
            System.out.println(i1);
        }
        System.out.println("fdsaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int i = removeDuplicates(s);
        for (int i1 : s) {
            System.out.println(i1);
        }
        System.out.println(i);
    }
    public static int removeDuplicates(int[] nums) {
        if(nums==null || nums.length==1){
            return nums.length;
        }
        int j=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j]==nums[i]){
                j++;
            }
        }
        return 0;
    }
}
