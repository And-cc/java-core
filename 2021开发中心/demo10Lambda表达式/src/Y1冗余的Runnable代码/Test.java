package Y1冗余的Runnable代码;
/*
Thread类需要Runnable接口作为参数，其中抽象类run方法是用来指定线程任务内容的核心
为了指定run的方法体，需要Runnable实现类
 */
public class Test {
    public static void main(String[] args) {
        //方式一
        Impl impl = new Impl();
        Thread thread = new Thread(impl);
        thread.start();
        //方式二
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-----><-----");
            }
        };
        new Thread(runnable).start();
        //方式三:匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-----><-----");
            }
        }).start();
    }
}
