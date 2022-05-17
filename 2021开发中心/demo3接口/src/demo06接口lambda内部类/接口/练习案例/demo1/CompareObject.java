package demo06接口lambda内部类.接口.练习案例.demo1;

/**
 * @Author: yqy
 * @Date: 2021/05/31/19:07
 * @Description:定义一个接口用来实现两个对象的比较
 */
public interface CompareObject<object> {
    int compareto(object o);
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
}
