package LeetCode._顺序刷题;

/**
 * @Author: yqy
 * @Date: 2022/03/07/17:29
 * @Description:
 */
public class Demo205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("bsa", "aas"));
        System.out.println("aa".indexOf('a'));
    }

    public static boolean isIsomorphic(String s, String t) {
        for(int i = 0; i < s.length(); i++){
            if(s.indexOf(s.charAt(i)) != t.indexOf(t.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /*public static boolean isIsomorphic(String s, String t) {
        if (s.length()==0 || t.length()==0 || s.length()!=t.length()) return false;
        int length=s.length();
        StringBuilder stringBuilder=new StringBuilder();
        //如果两个值相等，保存下标
        for (int i = 0; i < length; i++) {
            for (int j = length; j >i; j--) {
                if (s.charAt(i)==s.charAt(j)){
                    stringBuilder.append(i+" ");
                    stringBuilder.append(j+" ");
                }
            }
        }
        return false;
    }*/
}
