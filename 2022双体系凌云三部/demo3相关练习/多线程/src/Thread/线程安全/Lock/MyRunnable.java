package Thread.线程安全.Lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: yqy
 * @Date: 2022/05/24/21:50
 * @Description:
 */
public class MyRunnable implements Runnable {
    private int ticket = 100;
    //private ReentrantLock lock = new ReentrantLock(true);
    //这里的参数ture：公平，a、b、c三线程同时抢票，a强到了，就不能再让他拿到了
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try {
                //线程开始之前，先把门锁住
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "买了一张，还剩" + (--ticket));
                } else {
                    break;
                }
            } finally {
                //线程结束之后，把锁打开
                lock.unlock();
            }
        }
    }
}
