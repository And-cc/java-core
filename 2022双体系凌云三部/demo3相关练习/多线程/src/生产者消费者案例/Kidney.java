package 生产者消费者案例;

/**
 * @Author: yqy
 * @Date: 2022/05/25/15:28
 * @Description: 腰子类
 */
public class Kidney {
    /**
     * 只有噶到一个腰子，才能拿去安装
     */

    //腰子库存
    private int k_num = 0;

    //噶腰子方法
    public synchronized void karma() {
        if (k_num < 20) {
            k_num++;
            System.out.println(Thread.currentThread().getName() + "目标20个腰子，目前在噶第" + k_num + "个");
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //安装腰子方法
    public synchronized void install() {
        if (k_num > 0) {
            System.out.println(Thread.currentThread().getName() + "目前在安装第" + k_num + "个");
            k_num--;
            notify();
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
