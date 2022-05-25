package 账户存钱案例;

/**
 * @Author: yqy
 * @Date: 2022/05/25/14:33
 * @Description:
 */
public class Account {
    private double balance;

    public Account(int balance) {
        this.balance = balance;
    }

    //存在线程安全问题。a进来睡着了，b又进来睡
    public void deposit(double amt){
        if (amt>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance+=amt;
            System.out.println(Thread.currentThread().getName()+"存钱成功===》余额为："+balance);
        }

    }
    //这里的synchronized隐式代指Customer类
    public synchronized void depositPlus(double amt){
        if (amt>0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance+=amt;
            System.out.println(Thread.currentThread().getName()+"存钱成功===》余额为："+balance);
        }

    }
}
