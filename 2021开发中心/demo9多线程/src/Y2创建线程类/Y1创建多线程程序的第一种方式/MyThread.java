package Y2创建线程类.Y1创建多线程程序的第一种方式;

//1.创建Thread类的子类
public class MyThread extends Thread{
    //2.在Thread类的子类重写run()方法，设置线程任务（开启线程要做什么？）

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:"+i);
        }

    }
}
