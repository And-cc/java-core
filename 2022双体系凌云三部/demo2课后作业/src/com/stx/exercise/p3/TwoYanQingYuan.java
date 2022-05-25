package com.stx.exercise.p3;

/**
 * @Author: yqy
 * @Date: 2022/03/03/17:04
 * @Description:将字符串“want you to know one thing”,统计字母n和字母o的出现次数
 */
public class TwoYanQingYuan {
    public static void main(String[] args) {
        String str="want you to know one thing";
        int nTime = letterTime(str, 'n');
        int oTime = letterTime(str, 'o');
        System.out.println("字母n出现了："+nTime);
        System.out.println("字母o出现了："+oTime);
    }

    /**
     * 统计字母次数方法，传入字符串和一个字符，返回这个字符在字符串中出现的次数
     * @param str
     * @param c
     * @return
     */
    private static int letterTime(String str,char c){
        //先判断字符串是否合法
        if (str.length()==0 || str=="") return 0;
        //定义一个数字来统计出现次数
        int num=0;
        //去掉空格,其实无需去掉空格，所以注释了
        //String replace = str.replace(" ", "");
        //字符串转为数组统计次数
        char[] chars = str.toCharArray();
        //遍历数组
        for (char aChar : chars) {
            //每次相等次数加一
            if (aChar==c){
                num++;
            }
        }
        //返回参数
        return num;
    }
}
