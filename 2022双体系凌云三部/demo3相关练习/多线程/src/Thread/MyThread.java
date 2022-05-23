package Thread;

/**
 * @Author: yqy
 * @Date: 2022/05/19/17:10
 * @Description:
 * 问题：几个人都卖的这张票，但是票只有一张
 */
public class MyThread extends Thread{
    private  int number=10;
    @Override
    public void run() {
        boolean flag=true;
        while (flag){
           if (number>0){
               number--;
               System.out.println(Thread.currentThread().getName()+"买了一张");
               System.out.println("还剩"+number+"张");
           }  else {
               flag=false;
           }
        }
    }
}
