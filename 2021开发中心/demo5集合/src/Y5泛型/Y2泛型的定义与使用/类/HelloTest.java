package Y5泛型.Y2泛型的定义与使用.类;


public class HelloTest {
    public static void main(String[] args) {
        Hello<String> h = new Hello<>();
        //h.setName(1);
        h.setName("hello");
        System.out.println(h.getName());


    }
}
