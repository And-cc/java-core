package demo06接口lambda内部类.接口.demo1接口的概念.csdn;

/**
* @Author: yqy
* @Date: 2021/5/31
* @Description: 飞行的接口
*/
public interface Flyable {/*
    如果一个类中，既有抽象方法，又有非抽象方法，那么该类只能定义为抽象类，不能定义为接口
    如果一个类中，只有抽象方法，没有非抽象方法，那么该类可以定义为接口
                            一般就定义为接口
    定义一个接口，使用interface关键字  接口，类，枚举，注解等都是java中的类型
    接口中所有的方法，都是抽象方法
        所以也可以说，接口就是一个特殊的抽象类

    接口中除了定义方法外，还可以定义成员变量
                特点；方法和属性默认都是public修饰，也可以使用protected，但不能用private
                      所有的属性都是静态的常量，默认省略了static和final修饰符，属性的值必须实例化（初始化）

 */
    public final int wingsNumber = 2;
    public abstract void fly();
}
