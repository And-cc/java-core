package LeetCode;

/**
 * @Author: yqy
 * @Date: 2022/03/07/16:27
 * @Description:
 */
public class Demo125 {
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    /**
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s) {
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }
        StringBuilder reverse=new StringBuilder(str).reverse();
        return str.toString().equals(reverse.toString());

    }
}
