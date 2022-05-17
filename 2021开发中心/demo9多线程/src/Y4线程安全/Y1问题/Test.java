package Y4线程安全.Y1问题;

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
