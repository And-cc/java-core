package demo06接口lambda内部类.接口.demo5默认方法;

/**
 * @Author: yqy
 * @Date: 2021/05/31/19:21
 * @Description:
 */
public interface MyInterface {
    int add(int x, int y);
    // 默认方法
    default int multiply(int x, int y) {
        return x * y;
    }
    default int multiply2(int z,int c){
        return z+c;
    }
}
