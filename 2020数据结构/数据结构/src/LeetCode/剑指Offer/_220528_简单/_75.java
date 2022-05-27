package LeetCode.剑指Offer._220528_简单;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: yqy
 * @Date: 2022/05/27/20:24
 * @Description:数组相对排序
 */
public class _75 {
    public static void main(String[] args) {

    }
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> list=new LinkedList<>();
        for (int i = 0; i < arr1.length; i++) {
            int temp=arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                if (temp== arr2[j]){
                    list.add(temp);
                }
            }
        }
        return null;
    }
}
