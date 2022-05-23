package protice;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Box.java
 * @Description TODO
 * @createTime 2022年05月19日 20:42:00
 */
public class Box {
    private int milk;
    //定义一个成员变量表示奶箱的状态
    private boolean state=false;

    //存储牛奶和获取牛奶的方法
    public synchronized void put(int milk){
        //如果有牛奶，等待消费
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没有牛奶就生产牛奶
        this.milk=milk;
        System.out.println("送奶工将第"+this.milk+"瓶奶装入奶箱");
        //生产完毕之后，修改奶箱状态
        state=true;
        //唤醒其他线程
        notifyAll();
    }
    public synchronized void get(){
        //如果没有牛奶，等待生产
        if(!state){
            try {
                wait();
                notifyAll();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("用户拿到第"+this.milk+"瓶奶");
        //消费完毕后，修改奶箱状态
        state=false;
        //唤醒其他线程
        notifyAll();
    }

}
