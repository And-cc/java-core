package demo2字符流;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @Author: yqy
 * @Date: 2022/05/13/14:58
 * @Description:
 */
public class demo2TestWriter {
    private  static  final File file=new File("include/writer.txt");
    @Test
    public void test(){
        FileWriter fileWriter=null;
        try {
            //写出时，加入没有文件，会自动帮我们创建
            //如果第二次操作同一个文件是会覆盖原文件
            fileWriter=new FileWriter(file);
            fileWriter.write("I love you撒地方!");
            fileWriter.write("卧槽!");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //当然我们也可以通过设置，让其再后面追加而不是覆盖
    @Test
    public void test2(){
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(file,true);
            fileWriter.write("追加");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
