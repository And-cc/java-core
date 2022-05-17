package DataStructures.sort;

/**
 * @Author: yqy
 * @Date: 2022/03/10/15:39
 * @Description:冒泡排序
 */
public class BubbleSort {

    public int[] bubbleSort(int[] arr){
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public int[] bubbleSortPlus(int[] arr){
        int temp=0;
        boolean flag=false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    flag=true;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if (!flag){
                break;
            }else {
                flag=false;
            }
        }
        return arr;
    }
    public int[] bubbleSortPlusDesc(int[] arr){
        int temp=0;
        boolean flag=false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]<arr[j+1]){
                    flag=true;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if (!flag){
                break;
            }else {
                flag=false;
            }
        }
        return arr;
    }
}
