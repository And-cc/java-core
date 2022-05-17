package 常用实用类.dmeo1Object类.demo2Equals;

/**
 * @Author: yqy
 * @Date: 2021/06/03/13:07
 * @Description:
 */
public class Test {
    //Person类默认继承Object类，所以可以重写Object类中equals方法
    //boolean equals (Object obj) 指示某个对象是否于此对象”相等“
    public static void main(String[] args) {
        Person p1= new Person("迪丽热巴",118);
        Person p2= new Person("迪丽热巴",118);
        boolean b = p1.equals(null);
        System.out.println(b);//false

        /**
        * Object 类equals方法源码
         *  public boolean equals(object obj){
         *      return (this==obj);
         *  }
         *参数：Object obj 可以传递任意对象
         * 方法体：
         *      ==：比较运算符，返回值就是false或者ture
         *      基本数据类型:比较值
         *      引用数据类型：比较地址值
        */
        //所以，要想比较引用类型的内容而不是地址值，需要在类中重写equals
    }
}
