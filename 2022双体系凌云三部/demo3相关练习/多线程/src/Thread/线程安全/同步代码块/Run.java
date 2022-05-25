package Thread.线程安全.同步代码块;

/**
 * @Author: yqy
 * @Date: 2022/05/23/20:09
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        Window window=new Window();
        Thread t1=new Thread(window);
        Thread t2=new Thread(window);
        Thread t3=new Thread(window);

        t1.setName("窗口一：");
        t2.setName("窗口二：");
        t3.setName("窗口三：");

       /* t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
*/
        t1.start();
        t2.start();
        t3.start();
    }
}
