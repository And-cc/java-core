package Y5线程通信.Y2等待唤醒机制;
/*
注意事项：
       包子铺线程与包子线程关系--》互斥
       必须使用同步技术保证两个线程只能有一个执行
       锁对象必须保证唯一，可以使用包子对象作为锁对象
       包子铺类和吃货的类需要把包子对象作为参数传递进来
                  1.需要在成员变量位置创建一个包子变量
                  2.使用带参构造方法，为这个包子赋值
 */
public class BaoZiShop extends Thread{
    //1.需要在成员变量位置创建一个包子变量
    private BaoZi baoZi;
    // 2.使用带参构造方法，为这个包子赋值
    public BaoZiShop(BaoZi baoZi) {
        this.baoZi = baoZi;
    }
    //生产包子
    @Override
    public void run() {
        //定义一个变量
        int num = 0;
        while (true) {
            synchronized (baoZi) {
                if (baoZi.state==true) {//true：有包子，等待（wait）顾客吃包子
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //没有包子，生产包子（两种包子交替）
                if (num % 2 == 0) {
                    //生产薄皮三鲜包子
                    baoZi.skin = "薄皮";
                    baoZi.Stuffing = "三鲜";
                } else {
                    //生产厚皮酱肉包子
                    baoZi.skin = "厚皮";
                    baoZi.Stuffing = "酱肉";
                }
                num++;
                System.out.println("客官，正在生产" + baoZi.skin + baoZi.Stuffing + "。 骚等片刻");
                //包子生产3秒钟
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //店铺生产好了包子，修改包子状态true
                baoZi.state = true;
                baoZi.notify();
                System.out.println("客官，您点的" + baoZi.skin + baoZi.Stuffing + "好啦！ 请慢用！");

            }
        }
    }
}

