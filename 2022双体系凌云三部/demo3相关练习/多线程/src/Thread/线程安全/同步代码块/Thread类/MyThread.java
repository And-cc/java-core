package Thread.线程安全.同步代码块.Thread类;

import java.util.Map;
import java.util.Set;

/**
 * @Author: yqy
 * @Date: 2022/05/24/16:33
 * @Description:
 */
public class MyThread extends Thread {
    private static int ticket = 50;
    private static Object object = new Object();//保证唯一必须static

    @Override
    public void run() {
        while (true) {
            /*synchronized (object){*/
            synchronized (MyThread.class) {

                if (ticket > 0) {
                    System.out.println(getName() + "买了一张，还剩" + --ticket);
                } else {
                    break;
                }
            }
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
