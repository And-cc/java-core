package _01;

/**
 * @Author: yqy
 * @Date: 2022/05/30/20:01
 * @Description:
 */
public class _01 {
    public static void main(String[] args) {
        System.out.println("main开始执行");
        method();
        System.out.println("mian执行结束");
    }

    private static void method() {
        System.out.println("1开始执行");
        method2();
        System.out.println("1执行结束");
    }

    private static void method2() {
        System.out.println("2开始执行");
        method3();
        System.out.println("2执行结束");
    }

    private static void method3() {
        System.out.println("3开始执行");
        System.out.println("3执行结束");
    }
}
