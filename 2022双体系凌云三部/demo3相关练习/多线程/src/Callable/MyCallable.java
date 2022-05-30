package Callable;

import java.util.concurrent.Callable;

/**
 * @Author: yqy
 * @Date: 2022/05/25/16:07
 * @Description:
 */
public class MyCallable implements Callable {
    /**
     * 遍历一百以内的偶数，并返回和
     *
     * @return
     * @throws Exception
     */
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
