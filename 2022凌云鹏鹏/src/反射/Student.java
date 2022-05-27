package 反射;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Student.java
 * @Description TODO
 * @createTime 2022年05月27日 15:12:00
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("我是"+name+"，我"+age+"岁了");
    }
    public void show(String name){
        System.out.println("我叫："+name);
    }
    private void show1(int age){
        System.out.println("我"+age+"岁了");
    }
    public void show2(){
        System.out.println("我是"+name+"，我"+age+"岁了");
    }
}
