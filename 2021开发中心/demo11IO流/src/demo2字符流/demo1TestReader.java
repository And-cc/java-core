package demo2字符流;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * @Author: yqy
 * @Date: 2022/05/13/14:18
 * @Description:
 * 字字符流（16bit）char:文本
 */
public class demo1TestReader {
    private static final File file=new File("include/test.txt");

    //字符文件基础读
    @Test
    public void test() throws IOException {
        FileReader reader = new FileReader(file);
        int read = reader.read();
        while(read !=-1){
            System.out.print((char)read+"\t\t");
            read=reader.read();
        }
        reader.close();
    }
    //字符文件优化读
    @Test
    public void test2() throws IOException {
        FileReader reader = new FileReader(file);
        int data;
        while((data=reader.read())!=-1){
            System.out.print((char)data);
        }
        reader.close();
    }
    //字符文件处理读
    @Test
    public void test3(){
        FileReader reader=null;
        try{
            reader=new FileReader(file);
        int data;
        while((data=reader.read())!=-1){
            System.out.print((char)data);
         }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test4(){
        FileReader fileReader=null;
        try {
            fileReader=new FileReader(file);
            char[] chars=new char[5];
            int read ;//读到的个数
            while((read=fileReader.read(chars))!=-1){
                //正确写法方式一
                /*for (int i = 0; i <read ; i++) {
                    System.out.print(chars[i]);
                }
                System.out.println();*/
                //正确写法方式二
                String s = new String(chars, 0, read);
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
