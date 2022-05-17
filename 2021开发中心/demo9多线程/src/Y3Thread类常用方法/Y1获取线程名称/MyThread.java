package Y3Thread类常用方法.Y1获取线程名称;

//1.创建Thread类的子类
public class MyThread extends Thread{
    //2.在Thread类的子类重写run()方法，设置线程任务（开启线程要做什么？）

    @Override
    public void run() {
        /*
            //1.使用Thread类中的方法getName()
            String name = getName();
            System.out.println(name);
        */



        /*
            //2.可以先获取到当前正在执行的线程，
            Thread thread = Thread.currentThread();
            // System.out.println(thread);//Thread[Thread-0,5,main]
            String name = thread.getName();
            System.out.println(name);
        */

        //链式编程
        System.out.println(Thread.currentThread().getName());

    }
}
