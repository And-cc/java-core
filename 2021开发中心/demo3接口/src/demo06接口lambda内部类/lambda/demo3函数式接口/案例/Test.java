package demo06接口lambda内部类.lambda.demo3函数式接口.案例;

/**
 * @Author: yqy
 * @Date: 2021/06/01/17:54
 * @Description:
 */
public class Test implements Func{
    public static void main(String[] args) {
        Test test = new Test();
        test.foo();
        test.run();
        test.voo();
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void foo() {
        System.out.println("foo");
    }

    @Override
    public void voo() {
        System.out.println("voo");
    }
}
