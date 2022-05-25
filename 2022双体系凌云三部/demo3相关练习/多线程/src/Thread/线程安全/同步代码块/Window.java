package Thread.线程安全.同步代码块;

/**
 * @Author: yqy
 * @Date: 2022/05/23/20:06
 * @Description:
 */
public class Window implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        /*
          参数为同步监视器，俗称：“锁”,这个锁就是任何一个类对象
          但是也有要求，就是多个线程必须共用同一个锁。
        */
        while (true) {
           synchronized (this) {
               if (ticket > 0) {
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                   System.out.println(Thread.currentThread().getName() + "买了一张，还剩" + --ticket);
               } else {
                   break;
               }
           }
        }
    }
}
