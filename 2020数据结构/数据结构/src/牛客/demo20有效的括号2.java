package 牛客;

/**
 * @Author: yqy
 * @Date: 2021/12/02/19:37
 * @Description:
 */
public class demo20有效的括号2 {
    public static void main(String[] args) {
        boolean valid = isValid("({){}[]");
        System.out.println(valid);
    }
    public static boolean isValid(String s) {
        boolean flag = false;
        if (s.length()==0 || s.length()%2!=0){
            return false;
        }
        int len=s.length()/2;
        for (int i = 0; i < len; i++) {
            s=s.replace("{}","").replace("()","").replace("[]","");
        }
        return s.length()==0;
    }
}
