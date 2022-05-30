package Thread.简单卖票案例;

/**
 * @Author: yqy
 * @Date: 2022/05/23/20:06
 * @Description:
 */
public class Window extends Thread {
    private static int number = 10;

    @Override
    public void run() {
        while (true) {
            if (number > 0) {
                number--;
                System.out.println(getName() + "买了一张");
                System.out.println("还剩" + number + "张");
            } else {
                break;
            }
        }
    }
}
