package LeetCode._顺序刷题;

/**
 * @Author: yqy
 * @Date: 2022/03/07/15:31
 * @Description:
 */
public class Demo88 {
    public static void main(String[] args) {
        int[] ints={1,2,3,0,0,0};
        int[] ints1={2,5,6};
        merge(ints1,3,ints1,3);
        for (int anInt : ints) {
            System.out.print(anInt+"\t");
        }

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        /*int[] array=new int[m+n];
        for (int i = 0; i < m; i++) {
            array[i]=nums1[i];
        }
        for (int i = 0; i < n; i++) {
            array[i]=nums2[i];
        }*/
        /*int time=0;
        while(time<array.length){

        }*/
        for (int i = 0; i < n; i++) {
            nums1[m+i]=nums2[i];
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length-i-1; j++) {
                if (nums1[j]>nums1[j+1]){
                    int temp=nums1[j];
                    nums1[j]=nums1[j+1];
                    nums1[j+1]=temp;
                }
            }
        }
    }
}
