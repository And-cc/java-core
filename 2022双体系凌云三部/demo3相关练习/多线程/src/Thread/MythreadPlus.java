package Thread;

/**
 * @Author: yqy
 * @Date: 2022/05/19/17:19
 * @Description:
 */
public class MythreadPlus extends Thread{
    private static int number=100;
    @Override
    public void run() {
        boolean flag=true;
        while (flag){
            /**
             * 用一把锁锁住，当我准备卖这张票，还没卖完，就不开锁，
             *             只有当我把这张票卖完了，才会把锁打开，让别人去抢剩下的票
             */
            synchronized (MythreadPlus.class){
                if (number>0){
                    /*try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    number--;
                    System.out.println(Thread.currentThread().getName()+"买了一张");
                    System.out.println("还剩"+number+"张");

                }  else {
                    flag=false;
                }
            }
        }
    }
}
