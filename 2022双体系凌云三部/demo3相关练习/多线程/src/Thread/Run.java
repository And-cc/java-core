package Thread;

import org.junit.Test;

/**
 * @Author: yqy
 * @Date: 2022/05/19/16:12
 * @Description:
 */
public class Run {
    @Test//抢票,卖的票已经被别人卖了，但是又把这张票卖出去了
    public void test() {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
    }

    @Test
    public void restPlus() {
        MythreadPlus plus1 = new MythreadPlus();
        MythreadPlus plus2 = new MythreadPlus();
        MythreadPlus plus3 = new MythreadPlus();
        plus1.start();
        plus2.start();
        plus3.start();

    }

    @Test
    public void testNoName() {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ":::" + i);
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ":::" + i);
                    }
                }
            }
        }.start();
    }

}
