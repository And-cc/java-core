package 生产者消费者案例;

/**
 * @Author: yqy
 * @Date: 2022/05/25/15:28
 * @Description:  腰子超市
 */
public class Consumer  extends Thread{
    private Kidney kidney;

    public Consumer(Kidney kidney) {
        this.kidney = kidney;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            kidney.install();
        }
    }
}
