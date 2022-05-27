package 网络编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ClientDemo.java
 * @Description TODO
 * @createTime 2022年05月25日 19:16:00
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket socket = new Socket("127.0.0.1",666);
        //获取输出流，写数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,htp".getBytes());
        //接收服务器反馈
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        String date=new String(bytes,0,len);
        System.out.println("客户端："+date);
        //释放资源
        socket.close();
    }
}
