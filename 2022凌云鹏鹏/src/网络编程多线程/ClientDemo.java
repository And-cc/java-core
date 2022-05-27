package 网络编程多线程;

import java.io.*;
import java.net.Socket;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ClientDemo.java
 * @Description TODO
 * @createTime 2022年05月25日 22:12:00
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",2000);
        //获取文件
        BufferedReader br= new BufferedReader(new FileReader("2022凌云鹏鹏\\s.txt"));
        //封装输出流写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line;
        while ((line= br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //表示输出结束了，告诉服务端我已经写完了
        socket.shutdownOutput();

        //接收反馈
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //获取读到的那一行数据
        String date =bufferedReader.readLine();
        System.out.println("服务端的反馈："+date);
        //释放资源
        br.close();
        socket.close();
    }
}
