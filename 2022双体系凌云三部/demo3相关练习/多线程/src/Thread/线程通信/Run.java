package Thread.线程通信;

/**
 * @Author: yqy
 * @Date: 2022/05/25/15:03
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.setName("甲");
        thread2.setName("乙");
        thread1.start();
        thread2.start();
    }
}
