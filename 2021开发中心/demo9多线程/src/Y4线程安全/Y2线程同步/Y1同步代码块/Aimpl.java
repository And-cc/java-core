package Y4线程安全.Y2线程同步.Y1同步代码块;

/*
实现卖票案例
 */
public class Aimpl implements Runnable{
    //定义一个多线程共享的票源
    private  int ticket=10;
    //创建一个锁对象
    Object obj=new Object();

    //设置线程任务，卖票
    @Override
    public  void run() {
        while(true){
           //同步代码块
            synchronized (obj) {
                if (ticket > 0) {
                    //提高安全问题出现的概率，让程序睡眠
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //票存在，卖票
                    System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
                    ticket--;
                }
            }
        }
    }
}
