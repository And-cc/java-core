package demo2字符流;

import org.junit.Test;

import java.io.*;

/**
 * @Author: yqy
 * @Date: 2022/05/13/15:12
 * @Description:从读到写
 */
public class demo3ReaderWriter {
    private static final File reader = new File("include/test.txt");
    private static final File writer = new File("include/writer.txt");

    @Test
    public void test() {
        FileReader rea = null;
        FileWriter wri = null;
        try {
            rea = new FileReader(reader);
            wri = new FileWriter(writer);//覆盖
            //wri = new FileWriter(writer,true);//追加
            int data;
            String s="";
            while((data=rea.read())!=-1){
                s+=(char)data;
            }
            wri.write(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                rea.close();
                wri.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
