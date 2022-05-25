package 账户存钱案例;

/**
 * @Author: yqy
 * @Date: 2022/05/25/14:31
 * @Description:
 */
public class Run {
    /**
     * 银行有一个账户，两个人分别向这个账户存钱，没人每次存1000，没人存三次，每次存完打印账户余额
     */
    public static void main(String[] args) {
        Customer customer = new Customer(new Account(100));
        Thread thread1 = new Thread(customer);
        Thread thread2 = new Thread(customer);

        thread1.setName("张三");
        thread2.setName("李四");

        thread1.start();
        thread2.start();
    }
}
