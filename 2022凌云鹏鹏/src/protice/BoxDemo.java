package protice;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName BoxDemo.java
 * @Description TODO
 * @createTime 2022年05月19日 20:43:00
 */
public class BoxDemo {
    public static void main(String[] args) {
        //创建奶箱对象
        Box b = new Box();
        //创建生产者对象，把奶箱对象作为构造方法参数传递
        Producer p= new Producer(b);
        //创建消费者对象，把奶箱对象作为构造方法参数传递
        Customer c = new Customer(b);
        //创建两个线程对象，将生产者和消费者对象作为构造方法参数传递
        Thread thread = new Thread(p);
        Thread thread1 = new Thread(c);
        //启动线程
        thread.start();
        thread1.start();
    }
}
