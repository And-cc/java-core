package com.stx.exercise.p2;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2022/03/01/15:30
 * @Description:第二次作业
 */
public class TwoYanQingYuan {
    /**
     * 定义Scannner常量
     */
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        //提示用户输入小组人数
        int number = remind();
        //从键盘获取小组人数，申请与小组人数匹配的数组。
        double[] arrays = applyArray(number);
        //提示用户输入每个人的分数（double）并依次存入数组（循环来做）
        double[] scores = inputScore(arrays);
        //对数组排序。
        double[] doubles = bubbleSort(scores);
        //打印出排序后的数组。
        printArray(doubles);
        //计算平均分。
        BigDecimal average = countAverage(doubles);
        //输出平均分。
        printResult(average);
    }

    /**
     * 输入人数
     *
     * @return
     */
    public static int remind() {
        System.out.println("请输入小组人数：");
        return INPUT.nextInt();
    }

    /**
     * 申请数组
     *
     * @param length
     * @return
     */
    public static double[] applyArray(int length) {
        return new double[length];
    }

    /**
     * 接受成绩
     *
     * @param list
     * @return
     */
    public static double[] inputScore(double[] list) {
        System.out.println("请输入小组成员分数：");
        int i = 0;
        while (i < list.length) {
            System.out.println("共" + list.length + "人，还需要输入" + (list.length - i) + "次！");
            list[i] = INPUT.nextDouble();
            i++;
        }
        return list;
    }

    /**
     * 冒泡排序
     *
     * @param nums
     * @return
     */
    public static double[] bubbleSort(double[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    double temp;
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }

    /**
     * 打印数组
     *
     * @param doubles
     */
    public static void printArray(double[] doubles) {
        for (double i : doubles) {
            System.out.print(i + " ");
        }
    }

    /**
     * 计算平均分
     *
     * @param doubles
     * @return
     */
    public static BigDecimal countAverage(double[] doubles) {
        double sum = 0.0;
        for (double num : doubles) {
            sum += num;
        }
        //保留一位小数，直接忽略后面小数
        return new BigDecimal(sum).divide(BigDecimal.valueOf(doubles.length), 1, BigDecimal.ROUND_DOWN);
    }

    /**
     * 打印平均分
     *
     * @param decimal
     */
    public static void printResult(BigDecimal decimal) {
        System.out.println();
        System.out.println("平均分为：" + decimal);
    }
}
