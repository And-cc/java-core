package Y4线程安全.Y2线程同步.Y1同步代码块;

/*
同步代码块：synchronized关键字可以用于方法中的某个区域中，表示只对这个区域的资源实行互斥访问
格式：
    synchronized （同步锁）{
         需要同步的代码
    }
注意：
    1.通过代码块中的锁对象，可以使用任意的对象
    2.但是必须保证多个线程使用的锁对象是同一个
    3.锁对象作用：
           把同步代码块锁住，只让线程在同步代码块中执行
 */
public class Test {
    public static void main(String[] args) {
        //创建Runnable的实现类对象
        Aimpl a = new Aimpl();
        //创建Thread类对象，构造方法中传递Runable接口的实现类对象
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(a);
        Thread t3 = new Thread(a);
        //调用start方法开启多线程
        t1.start();
        t2.start();
        t3.start();
    }
}
