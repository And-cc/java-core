package Thread.优先级;

/**
 * @Author: yqy
 * @Date: 2022/05/23/19:32
 * @Description:
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + "::" + i + "\t\t\t\t" + Thread.currentThread().getPriority());
            }
        }
    }
}
