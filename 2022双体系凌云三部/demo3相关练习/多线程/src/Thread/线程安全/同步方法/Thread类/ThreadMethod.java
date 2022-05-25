package Thread.线程安全.同步方法.Thread类;

/**
 * @Author: yqy
 * @Date: 2022/05/24/19:13
 * @Description:
 */
public class ThreadMethod extends Thread{
    private static int ticket=100;
    @Override
    public void run() {
      while (true){
          sell();
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
      }
    }
    private static synchronized void sell(){//ThreadMethod.class
        if (ticket>0){
            System.out.println(Thread.currentThread().getName()+"买了一张，还剩："+ (--ticket));
        }
    }
}
