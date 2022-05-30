package Thread.死锁;

/**
 * @Author: yqy
 * @Date: 2022/05/24/19:45
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer();
        StringBuffer str2 = new StringBuffer();

        new Thread() {
            @Override
            public void run() {
                synchronized (str1) {
                    str1.append("A");
                    str2.append("B");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (str2) {
                        str1.append("a");
                        str2.append("b");
                        System.out.println(str1);
                        System.out.println(str2);
                    }
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (str2) {
                    str1.append("C");
                    str2.append("D");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (str1) {
                        str1.append("c");
                        str2.append("d");
                        System.out.println(str1);
                        System.out.println(str2);
                    }
                }
            }
        }).start();
    }
}
