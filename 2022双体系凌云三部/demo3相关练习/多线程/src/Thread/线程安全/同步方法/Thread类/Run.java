package Thread.线程安全.同步方法.Thread类;

/**
 * @Author: yqy
 * @Date: 2022/05/24/19:13
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        ThreadMethod thread = new ThreadMethod();
        ThreadMethod thread1 = new ThreadMethod();
        ThreadMethod thread2 = new ThreadMethod();

        thread.start();
        thread1.start();
        thread2.start();
    }
}
