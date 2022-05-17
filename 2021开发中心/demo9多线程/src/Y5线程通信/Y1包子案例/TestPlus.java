package Y5线程通信.Y1包子案例;

/*
进入到TimeWaiting(计时等待)有两种方式
      1.使用sleep（long m）方法，在毫秒值结束之后，线程睡醒进入到Runnable/blocked状态
      2.使用wait（long m）方法，wait方法如果在毫秒值结束之后，还没有被notify唤醒，线程睡醒进入到Runnable/blocked状态
唤醒的方法：
      1.void notify（）唤醒在此对象上监视器上的单个线程
      2.void notifyAll（）唤醒在此程序对象监视器上等待的所有线程
 */
public class TestPlus {
    public static void main(String[] args) {
        //使用wait（long m）进入到TimeWaiting(计时等待)
        /*  //创建锁对象，保证唯一
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
                           obj.wait(5000);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                       //当等待的线程被唤醒之后，继续执行以下代码
                       System.out.println("再来八个");
                   }
               }
            }
        }.start();*/




        //唤醒的方法：void notifyAll（）
        Object obj=new Object();
        //创建一个顾客线程
        new Thread(){
            @Override
            public void run() {
                while (true){
                    //保证等待和唤醒只能有一个执行,需要使用同步进行
                    synchronized (obj){
                        System.out.println("及时雨宋江：我要八个包子，嘛溜的");
                        //调用wait方法，放弃cpu的执行，进入到waiting状态（无限等待）
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //当等待的线程被唤醒之后，继续执行以下代码
                        System.out.println("及时雨宋江：再来八个");
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    //保证等待和唤醒只能有一个执行,需要使用同步进行
                    synchronized (obj){
                        System.out.println("豹子头林冲：我要八个包子，嘛溜的");
                        //调用wait方法，放弃cpu的执行，进入到waiting状态（无限等待）
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        //当等待的线程被唤醒之后，继续执行以下代码
                        System.out.println("豹子头林冲：再来八个");
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
                        System.out.println("西门庆：客官，你的包子好了");
                        //调用notify方法唤醒顾客吃包子
                        //obj.notify();
                        obj.notifyAll();
                        System.out.println( );
                    }
                }
            }
        }.start();
    }
}
