package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ServerDemo.java
 * @Description TODO
 * @createTime 2022年05月25日 19:17:00
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //创建服务器端的ServerSocket对象
        ServerSocket serverSocket = new ServerSocket(666);
        //监听客户端连接，返回一个Socket对象
        Socket socket = serverSocket.accept();
        //获取输入流，读数据，并把数据显示在控制台
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        String date=new String(bytes,0,len);
        System.out.println("服务器："+date);
        //给出反馈
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("数据已经收到".getBytes());
        //释放资源
        serverSocket.close();
    }
}
