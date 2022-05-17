package demo06接口lambda内部类.接口.demo6默认方法冲突.情况2;

/**
 * @Author: yqy
 * @Date: 2021/05/31/19:22
 * @Description:
 * Named接口没有为getName提供默认实现
 */
public class MyClass implements Person, Named {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.getName());

    }


    @Override
    public String getName() {
        return null;
    }
}
