package 生产者消费者案例;

/**
 * @Author: yqy
 * @Date: 2022/05/25/15:27
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        Kidney kidney = new Kidney();
        Consumer consumer = new Consumer(kidney);
        Consumer consumer2 = new Consumer(kidney);
        Producer producer = new Producer(kidney);

        Thread c = new Thread(consumer);
        Thread c2 = new Thread(consumer2);
        Thread p = new Thread(producer);

        c.setName("张三");
        c2.setName("王麻子");
        p.setName("李四");

        c2.start();
        p.start();
        c.start();

    }
}
