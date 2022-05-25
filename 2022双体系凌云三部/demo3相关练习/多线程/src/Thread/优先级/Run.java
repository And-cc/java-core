package Thread.优先级;

import org.junit.Test;

/**
 * @Author: yqy
 * @Date: 2022/05/23/19:34
 * @Description:
 */
public class Run {
    @Test
    public void test(){
        MyThread thread = new MyThread();
        thread.setName("分线程");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();

        Thread.currentThread().setName("主线程");
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for (int i = 0; i < 10; i++) {
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+"----"+i+"\t\t\t\t"+Thread.currentThread().getPriority());
            }
        }
    }
}
