package demo1字节流;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yqy
 * @Date: 2022/05/12/21:05
 * @Description:字节输入流的抽象类
 * 字节流（8bit）：媒体文件
 */
//read():读入一个字节 =》返回值表示读入的数据
//read(byte[])：读入多个字节 =》 返回值表示本次读入了多少个字节
//close:关闭输入流 =》程序创建
//IOException:大部分io流都会抛出该异常
public class demo1InputStream {
    @Test
    public void firstInputStream(){
        File file=new File("include/girl.jpg");
        FileInputStream fi=null;
        try{
            fi=new FileInputStream(file);
            int read ;
            List<Byte> stream=new ArrayList<>();
            while((read=fi.read())!=-1){
                stream.add((byte) read);
            }
            System.out.println(stream);
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fi!=null){
                try {
                    fi.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
