package DataStructures.sort;

/**
 * @Author: yqy
 * @Date: 2022/03/14/10:05
 * @Description:
 */
public class ShellSort {

    /**
     * 希尔排序，交换版
     * @param arr
     * @return
     */
    public int[] shellSort(int[] arr){
        int temp=0;
        //确定步长
        for (int gap = arr.length/2; gap >0 ; gap/=2) {

            for (int i = gap; i <arr.length ; i++) {
                //遍历各组中的所有数据
                for (int j = i-gap; j >=0; j-=gap) {
                    if (arr[j]>arr[j+gap]){
                        temp=arr[j];
                        arr[j]=arr[j+gap];
                        arr[j+gap]=temp;
                    }
                }
            }
        }
        return arr;
    }

    public int[] shellInsertSort(int[] arr){
        for (int k = arr.length/2; k >0 ; k/=2) {
            for (int i = k; i <arr.length ; i++) {
                int j=i;
                int temp=arr[j];
                /**
                 * 需要交换
                 */
                if (arr[j]<arr[j-k]){
                    while(j-k>=0 && temp>arr[j-k]){
                        arr[j]=arr[j-k];
                        j-=k;
                    }
                    /**
                     * 退出循环就是找到位置
                     */
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
