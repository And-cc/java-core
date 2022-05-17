package Y3Thread类常用方法.Y3暂停线程;

/*
     public static void sleep(long millis):使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
     毫秒数结束，继续执行
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println("main :"+i);
            //使用Thread的sleep方法让程序随眠一秒钟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
