package LeetCode.剑指Offer._220526;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yqy
 * @Date: 2022/05/27/14:01
 * @Description:数组相对排序
 */
public class _75 {
    public static void main(String[] args) {

    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            int temp= arr2[i];
            for (int j = 0; j < arr1.length; j++) {
                if (temp==arr1[j]){
                    //如果相等，就按照数组二排序
                    for (int k = 0; k < arr1.length; k++) {

                    }
                }else {
                    //如果不相等，就按照大小排序
                }
            }
        }
        return null;
    }
    public static int[] relativeSortArrayPlus(int[] arr1, int[] arr2) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] ints=new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            int temp=arr1[i], j=0;
            boolean flag=true;
            while (j< arr2.length){
                if (temp==arr2[j]){
                    flag=true;
                }
            }
            if (!flag){
                list.add(arr2[j]);
            }
        }
        int index=0;
        for (int i = 0; i < arr2.length; i++) {
            int temp=arr1[i];
            for (int j = 0; j < arr1.length; j++) {
                if (temp==arr2[j]){
                    ints[index]=arr2[j];
                    index++;
                }
            }
        }
        return null;
    }
}
