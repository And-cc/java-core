package Y4线程安全.Y2线程同步.Y2同步方法;
/*
使用同步方法：把方法内部的代码锁住，只让一个线程执行
使用步骤：
       1.把访问了共享数据的代码抽取出来，放到一个方法中
       2.在方法上添加synchronized修饰符
格式：
   修饰符 synchronized 返回值类型 方法名（参数列表）{
   可能会出现线程安全的代码（访问了共享数据的代码）
   }
 */
public class Aimpl implements Runnable{
    //定义一个多线程共享的票源
    private  int ticket=10;
    //设置线程任务，卖票
    @Override
    public  void run() {
        while(true){
            payTicket();
        }
    }

    //同步方法
    public synchronized void payTicket(){
        //先判断票存在
        if (ticket>0){
            //提高安全问题出现的概率，让程序睡眠
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //票存在，卖票
            System.out.println(Thread.currentThread().getName()+"--->正在卖第"+ticket+"张票");
            ticket--;
        }
    }
}
