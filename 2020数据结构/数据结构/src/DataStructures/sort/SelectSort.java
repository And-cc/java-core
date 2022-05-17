package DataStructures.sort;

/**
 * @Author: yqy
 * @Date: 2022/03/10/16:13
 * @Description:选择排序
 */
public class SelectSort {
    public int[] selectSort(int[] arr){
        /**
         * 循环数组长度减一次，因为最后一次不用排
         */
        for (int i = 0; i < arr.length-1; i++) {
            //用来存需要交换的下标
            int minIndex=i;
            //用来存需要交换的数据
            int min=arr[i];
            /**
             * 从i+1开始循环
             */
            for (int j = i+1; j < arr.length; j++) {
                //如果这个值不是最小的，就会循环到整个数组最小的值
                if (min >arr[j]){
                    //把这个值存到辅助
                    min=arr[j];
                    //下标也存进去
                    minIndex=j;
                }
            }
            //如果需要交换的就是当前值，也就是没有更小的
            if (minIndex!=i){
                //当前值赋给新的
                arr[minIndex]=arr[i];
                //新的从辅助哪里取值
                arr[i]=min;
            }
        }

        return arr;
    }

    public int[] selectSortDesc(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int maxIndex=i;
            int max=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (max < arr[j]){
                    max=arr[j];
                    maxIndex=j;
                }
            }
            if (maxIndex!=i){
                arr[maxIndex]=arr[i];
                arr[i]=max;
            }
        }
        return arr;
    }
}
