package Y1冗余的Runnable代码;

public class Impl implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-----><-----");
    }
}
