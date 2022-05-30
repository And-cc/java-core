package Thread.线程通信;

/**
 * @Author: yqy
 * @Date: 2022/05/25/15:03
 * @Description: 线程交替打印0-100
 */
public class MyRunnable implements Runnable {
    private int num = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();//当我进入线程以后，我就把阻塞的线程打通，
                if (num <= 100) {
                    //notify(); 但是放在这里有问题
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " : " + num);
                    num++;

                    try {
                        wait();//阻塞当前线程
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}
