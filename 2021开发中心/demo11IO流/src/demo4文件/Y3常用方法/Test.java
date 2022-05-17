package demo4文件.Y3常用方法;

import java.io.File;

/**
 * @Author: yqy
 * @Date: 2021/07/19/22:53
 * @Description:
 */
public class Test {
    /*
    public String getName()返回由此抽象路径名表示的文件或目录的名称。
    public String getPath()将此抽象路径名转换为路径名字符串
    public String getAbsolutePath()返回此抽象路径名的绝对路径名字符串。
    public long length()返回由此抽象路径名表示的文件的长度。
     */
    public static void main(String[] args) {
        good();

    }

    private static void good() {
        //public String getAbsolutePath()：获取构造方法中传递的路径，无论路径是绝对的还是相对的，该方法返回的都是绝对路径
        File f1=new File("D:\\IDEA\\学习\\Java核心技术\\demo11File\\src\\Y3常用方法\\Test.java");
        System.out.println(f1.getAbsoluteFile());
        File f2=new File("JavaTest.txt");
        System.out.println(f2.getAbsoluteFile());
    }
}
