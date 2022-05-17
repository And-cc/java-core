package Y5泛型.Y2泛型的定义与使用.方法;


public class HelloTest {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.helloMethod("Stirng");
        hello.helloMethod(666);
        hello.helloMethod(8.8);
        hello.helloMethod('a');
        Hello.helloStaticMethod("Stirng");
        Hello.helloStaticMethod(777);

    }
}
