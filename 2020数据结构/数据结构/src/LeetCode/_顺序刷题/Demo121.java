package LeetCode._顺序刷题;

/**
 * @Author: yqy
 * @Date: 2022/03/07/16:04
 * @Description:
 */
public class Demo121 {
    public static void main(String[] args) {
        int[] ints={7,1,5,3,6,4};
        int i = maxProfit(ints);
        System.out.println(i);
    }
    public static int maxProfit(int[] prices) {
        /**
         * 超时，双重循环太慢了
         */
        /*int max=0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int temp=prices[j]-prices[i];
                if (temp>max){
                    max=temp;
                }
            }
        }
        return max;*/

        /**
         *
             记录【今天之前买入的最小值】
             计算【今天之前最小值买入，今天卖出的获利】，也即【今天卖出的最大获利】
             比较【每天的最大获利】，取最大值即可
         */
        if (prices.length==0 || prices==null){
            return 0;
        }
        int max=0,min=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<min){
                min=prices[i];
            }else if (prices[i]-min>max){
                max=prices[i]-min;
            }
        }
        return  max;
    }
}
