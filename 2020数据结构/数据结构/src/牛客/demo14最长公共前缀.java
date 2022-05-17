package 牛客;

/**
 * @Author: yqy
 * @Date: 2021/12/02/16:05
 * @Description:
 */
public class demo14最长公共前缀 {
    public static void main(String[] args) {
        String[] a={"aaa","aa","aaa"};
        System.out.println(s(a));
    }
    public static String s(String[] ss) {
        String r = null;
        String preChar = ss[0];
        for (int i = 1; i < ss.length; i++) {
            r = hasPre(preChar, ss[i]);
            if (r.length()==0){
                break;
            }
        }
        return r;
    }
    private static String hasPre(String str1,String str2){
        int minLen=Math.min(str1.length(),str2.length());
        int index=0;
        while(index<minLen && str1.charAt(index)==str2.charAt(index)){
            index++;
        }
        return str1.substring(0,index);
    }
}
