package LeetCode;

/**
 * @Author: yqy
 * @Date: 2022/03/03/17:39
 * @Description:
 */
public class Demo28 {
    public static void main(String[] args) {
        String s1=null;
        String s2="";
//        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(strStr("aaabbb","ab"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length()==0 ||needle==null) return 0;
        int i=haystack.length();int j=needle.length();
        for (int k = 0; k < i; k++) {

        }
        //int i = haystack.indexOf(needle);
        return i;
    }
}
