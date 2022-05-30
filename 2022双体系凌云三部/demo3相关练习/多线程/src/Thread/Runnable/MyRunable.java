package Thread.Runnable;

/**
 * @Author: yqy
 * @Date: 2022/05/19/17:32
 * @Description:
 */
public class MyRunable implements Runnable {
    private static int num = 10;

    @Override
    public void run() {
        while (true) {
            num--;
            System.out.println(num);
            if (num <= 0) {
                return;
            }
        }
    }
}
