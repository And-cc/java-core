package LeetCode;

/** bingo
 * @Author: yqy
 * @Date: 2022/03/03/18:55
 * @Description:最后一个单词的长度
 */
public class Demo58 {
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        int i = lengthOfLastWord(s);
        System.out.println(i);
    }
    public static int lengthOfLastWord(String s) {
        int j=0;
        //去掉首位空格
        String trim = s.trim();
        //从最后开始遍历
        for (int i = trim.length()-1; i >= 0; i--) {
            //找到空格就结素
            if(' ' == trim.charAt(i)){
                break;
            }
            j++;
        }
        return j;

    }
}
