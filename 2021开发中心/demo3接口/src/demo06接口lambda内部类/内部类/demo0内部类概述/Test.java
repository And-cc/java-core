package demo06接口lambda内部类.内部类.demo0内部类概述;

/*
* 如果一个事物内部包含另外一个事物，这么被包含的类就是内部类
* 例如：人体和心脏，心脏只能在人体才有用，淘出来放在手上是无效的
*
* 分类：
*     1.成员内部类
*     2.局部内部类（包含匿名内部类）
*
* 成员内部类定义格式：
* 修饰符 class  外部类名称{
*    修饰符 class  内部类名称{
*      //....
*   }
* }
*
* 注意：内部类访问外部，随意访问，权限不受影响
*      外部类方位内部，需要内部类对象
* */
/**
* @Author: yqy
* @Date: 2021/6/2
* @Description: 成员内部类使用
*/
/*
 * 方式一：间接方式：在外部类方法中，使用内部类，然后main方法只是调用外部类方法
 * 方式二：直接方式：公式：
 *                类名称 对象名=new 类名称();
 *               外部类名称.内部类名称 对象名=new 外部类名称().new 内部类名称();
 */
public class Test {
    public static void main(String[] args) {
         //方式一：间接调用
        Person person = new Person(); //外部内对象
        person.setName("严清远");
        person.personMethod();//通过外部类对象，调用外部类方法，里面间接再使用内部类（ 外部类对象-》外部类方法-》内部类）

        System.out.println("---------------------");
        //方式二：直接调用
        Person.heart h1=new Person().new heart();
        h1.beat();
    }
}
