package Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author: yqy
 * @Date: 2022/05/25/16:04
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        MyCallable callable = new MyCallable();
        FutureTask task = new FutureTask(callable);
        new Thread(task).start();
        try {
            Object o = task.get();
            System.out.println(o);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
