package Y2异常处理;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 Throwable三种异常处理方法：
               String getMessage(): 返回throwable的简短信息
               String toString():   返回此throwable的详细消息字符串
               void printStackTrace():  JVM打印异常对象，打印的异常信息是最全面的
 */
public class Y5Throwable三种异常处理方法 {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.tx");
        } catch (IOException e) {
            e.printStackTrace();

            System.out.println(e.getMessage());//传递的路径不是c:\a.txt
            System.out.println(e);//java.io.FileNotFoundException: 传递的路径不是c:\a.txt
            System.out.println(e.toString());//java.io.FileNotFoundException: 传递的路径不是c:\a.txt
        }
    }
    //FileNotFoundException extends IOException :所以无需throws FileNotFoundException
    public static  void readFile(String fileName) throws IOException{
        if (!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的路径不是c:\\a.txt");//编译期异常，必须处理
        }
        if (!fileName.endsWith(".txt")){
            throw  new IOException("文件后缀名不对");
        }
    }
}
