package 网络编程多线程;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ServerDemo.java
 * @Description TODO
 * @createTime 2022年05月25日 22:12:00
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(2000);
        while (true){
            Socket socket = serverSocket.accept();
            new Thread(new ServerThread(socket)).start();
        }

    }
}
