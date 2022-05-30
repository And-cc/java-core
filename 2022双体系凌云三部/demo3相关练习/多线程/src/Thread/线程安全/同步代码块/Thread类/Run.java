package Thread.线程安全.同步代码块.Thread类;

/**
 * @Author: yqy
 * @Date: 2022/05/24/16:33
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        MyThread m2 = new MyThread();
        MyThread m3 = new MyThread();

        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.NORM_PRIORITY);
        m3.setPriority(Thread.MIN_PRIORITY);

        m1.setName("窗口一：");
        m2.setName("窗口二：");
        m3.setName("窗口三：");

        m2.start();
        m1.start();
        m3.start();


    }
}
