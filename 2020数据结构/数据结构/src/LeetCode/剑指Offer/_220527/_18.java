package LeetCode.剑指Offer._220527;

/**
 * @Author: yqy
 * @Date: 2022/05/27/15:03
 * @Description:有效的回文
 */
public class _18 {
    public static void main(String[] args) {
        boolean flag = isPalindromePlus("race a car");
        System.out.println(flag);
    }

    public static boolean isPalindrome(String s) {
        StringBuffer str = new StringBuffer();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetterOrDigit(chars[i])) {
                str.append(chars[i]);
            }
        }
        StringBuffer reverse = str.reverse();
        return (str.toString()).equals(reverse.toString());
    }

    public static boolean isPalindromePlus(String s) {
        int i = 0;
        int j = s.length() - 1;
        boolean flag = true;
        char[] chars = s.toUpperCase().toCharArray();
        while (i < j) {
            while ((i < j) && (chars[i] < 48 || (chars[i] > 57 && chars[i] < 65) || chars[i] > 90)) {
                i++;
            }
            while ((i < j) && (chars[j] < 48 || (chars[j] > 57 && chars[j] < 65) || chars[j] > 90)) {
                j--;
            }
            if (chars[i] != chars[j]) {
                flag = false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }
}
