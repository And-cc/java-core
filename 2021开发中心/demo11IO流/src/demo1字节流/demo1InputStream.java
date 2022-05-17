package demo1字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: yqy
 * @Date: 2022/05/12/21:05
 * @Description:字节输入流的抽象类
 * 字节流（8bit）：媒体文件
 */
public class demo1InputStream {
    public static void main(String[] args) {
        //read():读入一个字节 =》返回值表示读入的数据
        //read(byte[])：读入多个字节 =》 返回值表示本次读入了多少个字节
        //close:关闭输入流 =》程序创建
        //IOException:大部分io流都会抛出该异常
        try {
            run();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void run() throws IOException {
        InputStream in= new FileInputStream("d:/test.txt");
        try {
            int n;
            while((n=in.read())!=-1){
                System.out.println((char)n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            in.close();
        }
    }

}
