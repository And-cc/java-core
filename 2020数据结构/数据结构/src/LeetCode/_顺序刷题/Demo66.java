package LeetCode._顺序刷题;

import java.util.Arrays;

/**
 * @Author: yqy
 * @Date: 2022/03/03/20:20
 * @Description:
 */
public class Demo66 {
    public static void main(String[] args) {
        int[] nums={9,8,7,6,5,4,3,2,1,9};
        int[] ints = plusOne(nums);
        System.out.println(Arrays.toString(ints));
    }

    /*public static int[] plusOne(int[] digits) {
        //统计加之后的和
        int sum=0;

        int k=digits.length-1;

        for (int i = 0; i < digits.length; i++) {
            sum= (int) (sum+digits[i]*Math.pow(10,k));
            k--;
        }
        sum++;//1234
        int[] s={1,2,3,4};
        String s1 = String.valueOf(sum);
        char[] chars = s1.toCharArray();
        int[] result=new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];

            result[i]=Integer.parseInt(String.valueOf(chars[i]));
        }

        return result;
    }*/
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0; i--) {
            //如果最后一位不是9，那么就直接加一
            if (digits[i]!=9){
                digits[i]=digits[i]+1;
                return digits;
            }
            //如果是9，那么最后一位要变成0，前面要进位
            digits[i]=0;
        }
        //跳出循环还没结束，表明全是999
        int[] result=new int[digits.length+1];
        result[0]=1;
        return result;
    }
}
