package Thread.线程安全.同步方法;

/**
 * @Author: yqy
 * @Date: 2022/05/24/19:02
 * @Description:
 */
public class Run{
    public static void main(String[] args) {
        MyMethod method = new MyMethod();
        Thread thread = new Thread(method);
        Thread thread1 = new Thread(method);
        Thread thread2 = new Thread(method);
        thread.start();
        thread1.start();
        thread2.start();
    }
}
