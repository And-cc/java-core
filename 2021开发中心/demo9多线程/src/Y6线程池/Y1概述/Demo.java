package Y6线程池.Y1概述;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
问题：如果并发的线程太多，并且每个线程执行很短的时间就结束，这样频繁的创建线程大大降低系统效率，因为线程的创建和销毁需要时间
线程池：其实就是同一个容纳多个线程的容器，其中的线程可以重复使用，省去了频繁创建线程对象的操作，无需反复创建线程而消耗过多资源
线程池原理-------->集合：把线程对象添加到集合中
线程池三个好处：
           1.降低资源损耗
           2.提高响应速度
           3.提高线程可管理性

jdk1.5之后提供Java.util.concurrent.Executors:线程池的工厂类，用来生产线程池
    Executors类中的静态方法：
            static  ExecutorService  newFixedThreadPool(int nThreads)创建一个可重用固定线程数量的线程池
            参数：
                int nThreads：创建线程的数量
            返回值：
                ExecutorService接口，返回的是ExecutorService接口的实现类对象，我们可以使用ExecutorService接口接受（面向接口编程）
Java.util.concurrent.ExecutorService：线程池接口，用来从线程中获取线程，调用start方法，执行线程任务
            submit(Runnable task) 提交一个Runnable任务用于执行
            void shutdown()       关闭/销毁线程池

*/
public class Demo {
    //代码实现步骤
    /*
    1.使用线程池工厂类Executors里面提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
    2.创建一个类，实现Runnable接口，重写run方法，设置线程任务
    3.调用ExecutorService中方法submit，传递线程任务（实现类），开启线程，执行run方法
    4.调用ExecutorService中方法shutdown，销毁线程池（不建议执行）
     */
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(new RunnableImpl());
        pool.submit(new RunnableImpl());
        pool.submit(new RunnableImpl());
        pool.shutdown();
        //pool.submit(new RunnableImpl());
    }
}
