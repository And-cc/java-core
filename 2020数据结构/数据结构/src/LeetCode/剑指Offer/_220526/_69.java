package LeetCode.剑指Offer._220526;

/**
 * @Author: yqy
 * @Date: 2022/05/26/21:53
 * @Description:山峰数组的顶部
 */
public class _69 {
    public static void main(String[] args) {
        int[] ints = {3,4,5,1};
        int i = peakIndexInMountainArray(ints);
        System.out.println(i);
    }
    public static int peakIndexInMountainArray(int[] arr) {
        if (arr.length<3){
            return 0;
        }
        for (int i = 1; i < arr.length-1; i++) {
            int left=0,right=0;
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]){
                    left++;
                    continue;
                }
            }
            for (int j = arr.length-1; j >i ; j--) {
                if (arr[j]>arr[j-1]){
                    right++;
                    continue;
                }
            }
            if (left==0 && left==right){
                return i;
            }
        }
        return 0;
    }
}
