package demo06接口lambda内部类.接口.demo5默认方法;

/**
 * @Author: yqy
 * @Date: 2021/05/31/19:23
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        int add = myClass.add(5, 6);
        int multiply = myClass.multiply(5, 6);
        int multiply2 = myClass.multiply2(5, 6);
        System.out.println("正常的抽象方法：add"+add+",default重写方法"+multiply+"default未重写方法"+multiply2);
    }
}
