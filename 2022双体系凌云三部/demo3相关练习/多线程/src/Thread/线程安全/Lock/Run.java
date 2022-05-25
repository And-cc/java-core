package Thread.线程安全.Lock;

/**
 * @Author: yqy
 * @Date: 2022/05/25/14:15
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
