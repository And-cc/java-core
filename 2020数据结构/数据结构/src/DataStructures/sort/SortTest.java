package DataStructures.sort;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2022/03/10/15:45
 * @Description:
 */
public class SortTest {
    private static Scanner sc=new Scanner(System.in);
    private static Random random = new Random();
    //冒泡 < 选择 < 插入
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        int in = sc.nextInt();

        //--------------------------------------------------
        //生成in长度的数组
        int[] bubble=createArray(in);

        BubbleSort bubbleSort = new BubbleSort();
        //开始时间
        long l = System.currentTimeMillis();
        //执行算法
        int[] bubbleSortPlusDesc = bubbleSort.bubbleSortPlusDesc(bubble);
        //打印
        //System.out.println(Arrays.toString(bubbleSortPlusDesc));
        //结束时间
        System.out.println(System.currentTimeMillis()-l);

        //--------------------------------------------------

        SelectSort selectSort = new SelectSort();

        int[] select=createArray(in);
        long ll = System.currentTimeMillis();
        int[] selectSortDesc = selectSort.selectSortDesc(select);
        //System.out.println(Arrays.toString(selectSortDesc));
        System.out.println(System.currentTimeMillis()-ll);

        //--------------------------------------------------
        InsertSort insertSort = new InsertSort();

        int[] arr=createArray(in);

        long start = System.currentTimeMillis();
        int[] insertSortDesc = insertSort.insertSortDesc(arr);
        //System.out.println(Arrays.toString(insertSortDesc));
        System.out.println(System.currentTimeMillis() - start);
        //--------------------------------------------------
        ShellSort shellSort = new ShellSort();

        int[] shell=createArray(in);
        long shellStart = System.currentTimeMillis();
        int[] shellSortArr = shellSort.shellInsertSort(shell);
        //System.out.println(Arrays.toString(shellSortArr));
        System.out.println(System.currentTimeMillis() - shellStart);
    }
    private static int[] createArray(int in){
        int arr[]=new int[in];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(in);
        }
        return arr;
    }
}
