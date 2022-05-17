package Y3Thread类常用方法.Y2设置线程的名称;


public class MyThread extends Thread{
    // 2.创建一个带参的构造方法
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
