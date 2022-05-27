package 网络编程键盘输入数据;

import java.io.*;
import java.net.Socket;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ClientDemo.java
 * @Description 客户端
 * @createTime 2022年05月25日 20:36:00
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //创建客户对象
        Socket socket = new Socket("127.0.0.1",1000);
        //通过键盘录入数据
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //封装输出流对象(将字节输出流转化为字符流再用BufferWriter包装与前面键盘输入的数据对应)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String line;
        while ((line=br.readLine())!=null){
            if(line.equals("886")){
                break;
            }
            //获取输出流对象
//            OutputStream outputStream = socket.getOutputStream();
//            outputStream.write(line.getBytes());
            //写一行
            bw.write(line);
            //换行
            bw.newLine();
            //刷新
            bw.flush();
        }
        //释放资源
        socket.close();
    }
}

