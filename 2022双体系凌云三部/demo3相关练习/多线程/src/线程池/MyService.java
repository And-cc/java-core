package 线程池;

/**
 * @Author: yqy
 * @Date: 2022/05/25/16:26
 * @Description:
 */
public class MyService implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "  :  " + i);
            }
        }
    }
}
