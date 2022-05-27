package LeetCode.剑指Offer._220527;

/**
 * @Author: yqy
 * @Date: 2022/05/27/15:40
 * @Description:最多删除一个字符得到回文
 */
public class _19 {
    public static void main(String[] args) {
        boolean b = validPalindrome("aaa");
        System.out.println(b);
    }
    public static boolean validPalindromePlus(String s) {
        char[] c = s.toCharArray();
        int i=0;
        while (i<s.length()){

            i++;
        }
        return false;
    }
    public static boolean validPalindrome(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            StringBuffer s1=new StringBuffer();
            for (int j = 0; j < c.length; j++) {
                if (i!=j){
                    s1.append(c[j]);
                }
            }
            String reverse=s1.toString();
            s1.reverse();
            if (s1.toString().equals(reverse.toString())){
                return true;
            }
        }
        return false;
    }
}
