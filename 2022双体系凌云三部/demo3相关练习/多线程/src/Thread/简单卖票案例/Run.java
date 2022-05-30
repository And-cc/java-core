package Thread.简单卖票案例;

import org.junit.Test;

/**
 * @Author: yqy
 * @Date: 2022/05/23/20:09
 * @Description:
 */
public class Run {
    @Test
    public void test() {
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();

        window1.setName("窗口一");
        window2.setName("窗口二");
        window3.setName("窗口三");

        window1.start();
        window2.start();
        window3.start();
    }
}
