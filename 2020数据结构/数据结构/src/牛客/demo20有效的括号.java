package 牛客;

/**
 * @Author: yqy
 * @Date: 2021/12/02/18:18
 * @Description:
 */
public class demo20有效的括号 {
    public static void main(String[] args) {
        boolean valid = isValid("(){}[]");
        System.out.println(valid);
    }
    public static boolean isValid(String s) {
        /*boolean flag = false;
        if (s.length()==0 || s.length()%2!=0) {
            return flag;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i+=2) {
            char p = p(chars[i]);
            if (p==chars[i+1]){
                flag= true;
            }
        }
        return flag;*/
        boolean flag = false;
        if (s.length()==0 || s.length()%2!=0){
            return false;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i+=2) {
            char p = p(chars[i]);
            if (p==chars[i]){
                flag=true;
            }
        }
        return flag;
    }
    private static char p(char c){
        switch (c){
            case '(': return  ')';
            case '{': return  '}';
            case '[': return  ']';
            default:return ' ';
        }
    }
}
