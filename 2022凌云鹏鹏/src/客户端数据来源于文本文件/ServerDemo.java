package 客户端数据来源于文本文件;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ServerDemo.java
 * @Description TODO
 * @createTime 2022年05月25日 21:31:00
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(996);
        Socket socket = serverSocket.accept();
        //接收数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //把数据写入文本文件
        BufferedWriter bw = new BufferedWriter(new FileWriter("2022凌云鹏鹏\\copy.txt"));
        String line;
        while ((line= br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        //给出反馈
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("文件上传成功");
        bufferedWriter.newLine();
        bufferedWriter.flush();
        //释放资源
        bw.close();
        socket.close();
    }
}
