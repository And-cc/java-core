package Thread.Runnable;

import org.junit.Test;

/**
 * @Author: yqy
 * @Date: 2022/05/19/17:33
 * @Description:
 */
public class Run {
    @Test
    public void test() {
        MyRunable runable = new MyRunable();
        /**
         * runnable接口实现的要放到thread里，
         * 调用thread.start才能执行
         */
        Thread thread = new Thread(runable);
        thread.start();
    }
}
