package Y4线程安全.Y2线程同步.Y3锁机制;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
解决线程安全的第三种方案：使用lock锁
java.util.concurrent.locks.lock接口
lock实现提供了比使用synchronized方法和语句可获得更广泛的锁定操作
lock接口中的方法：
        void lock（）获取锁
        void unlock（）释放锁
java.util.concurrent.locks.ReentrantLock implements  Lock接口
使用步骤：
        1.在成员位置创建一个ReentrantLock对象
        2.在有可能出现安全问题的代码前调用Lock接口中的方法lock获取锁
        3.在有可能出现安全问题的代码后调用Lock接口中的方法unlock释放锁
 */
public class Aimpl implements Runnable{
    private  int ticket=10;
    //1.在成员位置创建一个ReentrantLock对象
    Lock lock=new ReentrantLock();
    /*@Override
    public  void run() {
        while(true){
            // 2.在有可能出现安全问题的代码前调用Lock接口中的方法lock获取锁
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
                ticket--;
            }
            //3.在有可能出现安全问题的代码后调用Lock接口中的方法unlock释放锁
            lock.unlock();
        }
    }*/

    @Override
    //最好是用finally，无论程序是否异常，都把锁释放
    public  void run() {
        while(true){
            // 2.在有可能出现安全问题的代码前调用Lock接口中的方法lock获取锁
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "--->正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //3.在有可能出现安全问题的代码后调用Lock接口中的方法unlock释放锁
                    lock.unlock();
                }
            }
        }
    }

}
