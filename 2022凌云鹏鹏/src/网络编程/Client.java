package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Client.java
 * @Description TODO
 * @createTime 2022年05月25日 18:42:00
 */
public class Client {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println("获取本机IP");
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip);

        System.out.println("获取主机名称");
        String hostName = ip.getHostName();
        System.out.println(hostName);

        System.out.println("获得IP地址");
        System.out.println(ip.getHostAddress());

        System.out.println("确定主机名称的IP地址");
        System.out.println(InetAddress.getByName("localhost"));

    }
}
