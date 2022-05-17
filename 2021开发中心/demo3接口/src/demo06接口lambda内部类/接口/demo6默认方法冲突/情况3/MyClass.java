package demo06接口lambda内部类.接口.demo6默认方法冲突.情况3;

/**
 * @Author: yqy
 * @Date: 2021/05/31/19:22
 * @Description:
 * 类继承了一个超类,同时实现了一个接口,并从超类和接口继承了相同的方法
 */
public class MyClass extends Named implements Person{

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.getName());  //超类优先
        //demo06接口lambda内部类.接口.demo6默认方法冲突.情况3.MyClass_21685669      Named
    }


}
