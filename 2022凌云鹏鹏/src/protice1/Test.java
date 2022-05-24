package protice1;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2022年05月23日 20:37:00
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("票数：");
        int i = scanner.nextInt();
        System.out.print("窗口数：");
        int m = scanner.nextInt();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        for (int j = 0; j < m; j++) {
            Thread thread = new Thread(new Ticket(i,countDownLatch));
            thread.start();
            //等待的线程数减1，当减到0的时候，全部等待的线程启动
         countDownLatch.countDown();
        }
    }
}
