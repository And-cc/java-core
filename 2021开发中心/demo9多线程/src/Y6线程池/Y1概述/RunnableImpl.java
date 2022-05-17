package Y6线程池.Y1概述;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-------<>");
    }
}
