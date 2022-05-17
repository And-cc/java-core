package 牛客;

/**
 * @Author: yqy
 * @Date: 2021/12/02/15:25
 * @Description:
 */
public class demo13罗马数字转整数 {
    public static void main(String[] args) {
        int i = romanToInt("MCMXCIV");
        //System.out.println(i);
    }

    public static int romanToInt(String s) {
        int sum=0;
        int preNum=getValue(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            int num=getValue(s.charAt(i));
            if (preNum<num){
                sum -=preNum;
            }else {
                sum +=preNum;
            }
            preNum=num;
        }
        sum +=preNum;
        return sum;
    }
    private static int getValue(char ch) {
        switch(ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
