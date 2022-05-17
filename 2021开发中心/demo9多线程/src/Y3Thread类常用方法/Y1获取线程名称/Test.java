package Y3Thread类常用方法.Y1获取线程名称;

/*
获取线程名称:
        1.使用Thread类中的方法getName()
                String getName()：返回该线程的名称
        2.可以先获取到当前正在执行的线程，使用线程中的方法getName()获取线程名称
           static Thread currentThread()：返回对当前正在执行的线程对象的引用（获取到当前正在执行的线程）
 */
public class Test {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();//Thread-0
        /*
        线程的名称：
              主线程：main
              新线程：Thread-0，Thread-1，...
         */
        new MyThread().start();//Thread-1
    }
}
