package protice1;

import java.util.concurrent.CountDownLatch;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Titcket.java
 * @Description TODO
 * @createTime 2022年05月23日 20:36:00
 */
public class Ticket implements Runnable{
    //传入的票数固定
    private static int n;

    private final CountDownLatch countDownLatch;

    public Ticket(int n, CountDownLatch countDownLatch) {
        this.n=n;
        this.countDownLatch = countDownLatch;
    }
    @Override
    public void run() {
        try {
            //让线程处于等待状态
                countDownLatch.await();
                smell();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }
        public void smell(){
            while (true){
                //让全部线程同步（字符串常量池只有一个）
                synchronized ("abc"){
                    if (n > 0) {
                        System.out.println(Thread.currentThread().getName() + "卖出第：" + n + "张票");
                        n--;
                    } else {
                        return;
                    }
                }
            }
        }
    }

