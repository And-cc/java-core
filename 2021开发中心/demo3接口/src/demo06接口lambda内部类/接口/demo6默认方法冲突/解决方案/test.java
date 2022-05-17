package demo06接口lambda内部类.接口.demo6默认方法冲突.解决方案;

import demo06接口lambda内部类.接口.demo6默认方法冲突.解决方案.MyClass;

/**
 * @Author: yqy
 * @Date: 2021/05/31/19:23
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        MyClass m=new MyClass();
        System.out.println(m.getName()); //demo06接口lambda内部类.接口.demo6默认方法冲突.MyClass_21685669      Person
        //因为实现类实现的是person里面的getName
    }
}
