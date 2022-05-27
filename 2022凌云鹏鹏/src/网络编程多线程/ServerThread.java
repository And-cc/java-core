package 网络编程多线程;

import java.io.*;
import java.net.Socket;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName ServerThread.java
 * @Description TODO
 * @createTime 2022年05月25日 22:13:00
 */
public class ServerThread implements Runnable{
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            int count=0;
            File file = new File("2022凌云鹏鹏\\copy"+count+".txt");
            if(file.exists()){
                count++;
              file = new File("2022凌云鹏鹏\\copy"+count+".txt");
            }
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line;
            while ((line=br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            //给出反馈
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write("文件上传成功");
            bufferedWriter.newLine();
            bufferedWriter.flush();

            socket.close();
            //bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
