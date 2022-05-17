package Y2创建线程类.Y2创建多线程程序的第二种方式;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:"+i);
        }
    }
}
