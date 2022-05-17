package Y5线程通信.Y2等待唤醒机制;


public class Customer extends Thread{
    private BaoZi bz;
    public Customer(BaoZi bz) {
        this.bz = bz;
    }
    @Override//设置线程任务：吃包子
    public void run() {
        while (true){
            synchronized(bz){
                if (bz.state==false){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //有包子该怎么做
                System.out.println("及时雨宋江正在吃"+bz.skin+bz.Stuffing+"包子");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("花了三秒才吃掉");
                //吃完后，包子就没了，又让包子店从做
                bz.state=false;
                bz.notify();
                System.out.println("及时雨宋江吃掉了"+bz.skin+bz.Stuffing+"包子，大朗，再来几个包子");
                System.out.println("----------------------------");
            }
        }
    }
}
