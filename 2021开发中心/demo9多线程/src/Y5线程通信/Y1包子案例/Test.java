package Y5线程通信.Y1包子案例;

/*
等待唤醒案例：线程之间通信
          创建一个顾客线程（消费者）：告知老板要的包子的种类和数量，调用wait方法，放弃cpu的执行，进入到waiting状态（无限等待）
          创建一个老板状态（生产者）：花了5秒做包子，做好包子后，调用notify方法唤醒顾客吃包子
注意：
   顾客和老板线程必须使用同步代码块包裹起来，保证等待和唤醒只能有一个执行
   同步使用的锁对象必须保证唯一
   只有锁对象才能调用wait和notify方法

Object类中的方法
    void wait()在其他线程调用此对象的notify（）方法或notifyAll（）方法前，导致当前线程等待
    void notify()唤醒在此对象监视器上等待的单个线程，会继续执行wait方法之后的代码
 */
public class Test {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj=new Object();
        //创建一个顾客线程
        new Thread(){
            @Override
            public void run() {
               while (true){
                   //保证等待和唤醒只能有一个执行,需要使用同步进行
                   synchronized (obj){
                       System.out.println("我要八个包子，嘛溜的");
                       //调用wait方法，放弃cpu的执行，进入到waiting状态（无限等待）
                       try {
                           obj.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       //当等待的线程被唤醒之后，继续执行以下代码
                       System.out.println("再来八个");
                   }
               }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    //花了5秒做包子，随眠五秒
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //保证等待和唤醒只能有一个执行,需要使用同步进行
                    synchronized (obj){
                        System.out.println("客官，你的包子好了");
                        //调用notify方法唤醒顾客吃包子
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
