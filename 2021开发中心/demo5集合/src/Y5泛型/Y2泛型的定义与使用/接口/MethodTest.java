package Y5泛型.Y2泛型的定义与使用.接口;


public class MethodTest {
    public static void main(String[] args) {
        //方法一：实现类已经指定类型
        Method1 method1 = new Method1();
        method1.method("helloMethod1");
        //方法二：对象指定类型
        Method2<String> stringMethod2 = new Method2<>();
        stringMethod2.method("helloMethod2");

    }
}
