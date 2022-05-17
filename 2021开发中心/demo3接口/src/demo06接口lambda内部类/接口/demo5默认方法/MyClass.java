package demo06接口lambda内部类.接口.demo5默认方法;

/**
 * @Author: yqy
 * @Date: 2021/05/31/19:22
 * @Description:
 */
public class MyClass implements MyInterface {
    @Override
    public int add(int x, int y) {
        return x+y;
    }

    @Override
    public int multiply2(int z, int c) {
        return 0;
    }
}
