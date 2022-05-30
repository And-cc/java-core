package 线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: yqy
 * @Date: 2022/05/25/16:23
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        /*service.execute();//适合适用于Runnable
        service.submit();//适合适用于callable*/
        service.execute(new MyService());
        service.execute(new MyService2());

        service.shutdown();
    }
}
