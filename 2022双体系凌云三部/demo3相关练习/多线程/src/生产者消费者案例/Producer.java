package 生产者消费者案例;

/**
 * @Author: yqy
 * @Date: 2022/05/25/15:27
 * @Description: 噶腰子生产商
 */
public class Producer extends Thread {
    private Kidney kidney;

    public Producer(Kidney kidney) {
        this.kidney = kidney;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "嘿嘿嘿！我要开始噶腰子咯");
        while (true) {
            //养精蓄锐噶腰子
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            kidney.karma();
        }
    }
}
