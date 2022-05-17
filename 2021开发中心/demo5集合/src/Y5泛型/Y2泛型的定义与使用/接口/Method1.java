package Y5泛型.Y2泛型的定义与使用.接口;

//方法一；实现类指定类型，那么重写方法默认该类型
public class Method1 implements Hello<String>{

    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
