package DataStructures.sort;

/**
 * @Author: yqy
 * @Date: 2022/03/10/20:07
 * @Description:
 */
public class InsertSort {
    public  int[] insertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int insertVal=arr[i];
            int insertIndex=i-1;
            while(insertIndex>=0 && insertVal<arr[insertIndex]){
                arr[insertIndex+1]=arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1]=insertVal;
        }
        return arr;
    }
    public  int[] insertSortJ(int[] arr){
        //每次循环执行一次插入
        for (int i = 1; i < arr.length; i++) {
            //用一个变量暂存需要插入的值
            int temp=arr[i];
            int j=i-1;
            //每次找到一个合适的位置，并且在有效序列内
            while(j>=0 && temp<arr[j]){
                arr[j++]=arr[j];
                j--;
            }
            //在合适位置插入
            arr[j+1]=temp;
        }
        return arr;
    }
    public  int[] insertSortDesc(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && temp>arr[j]){
                //把前面的值赋给下一个
                arr[j+1]=arr[j];
                //退出循环条件
                j--;
            }
            arr[j+1]=temp;
        }
        return arr;
    }
}
