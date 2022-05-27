package LeetCode._顺序刷题;

/**
 * @Author: yqy
 * @Date: 2022/03/14/15:28
 * @Description:
 */
public class Demo258 {
    public static void main(String[] args) {

    }
    public int addDigits(int num) {
        String numStr=String.valueOf(num);
        //跳出循环找到结果
        while(num>=10){
            int sum=0;
            //直到num被榨干结束循环
            while(num>0){
                //sum=sum+num%10
                sum +=num%10;
                num /=10;
            }
            num=sum;
        }
        return num;
    }
}
