package 账户存钱案例;

/**
 * @Author: yqy
 * @Date: 2022/05/25/14:33
 * @Description:
 */
public class Customer implements Runnable {
    private Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
           /* account.deposit(1000);
            张三存钱成功===》余额为：2100.0
            李四存钱成功===》余额为：2100.0
            张三存钱成功===》余额为：3100.0
            李四存钱成功===》余额为：3100.0
            李四存钱成功===》余额为：4100.0
            张三存钱成功===》余额为：5100.0*/
            account.depositPlus(1000);
            /*李四存钱成功===》余额为：1100.0
            李四存钱成功===》余额为：2100.0
            李四存钱成功===》余额为：3100.0
            张三存钱成功===》余额为：4100.0
            张三存钱成功===》余额为：5100.0
            张三存钱成功===》余额为：6100.0*/
        }
    }
}
