package Y5泛型.Y2泛型的定义与使用.接口;

//方法2：接口实现类继续延续泛型，让对象指定类型
public class Method2<T> implements Hello<T> {
    @Override
    public void method(T t) {
        System.out.println(t);
    }
}
