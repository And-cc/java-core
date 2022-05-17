package 常用实用类.demo2Date;

import java.util.Date;

/**
* java.util.Date:表示时间的类，精确到毫秒     1000毫秒（ms）=1秒（s）
 * 毫秒作用：时间计算
*/
public class demo1概述 {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }
    //Date类的空参数构造方法：
        /*
        Date（）获取的就是当前系统的日期和时间
        */
    private static void demo1() {
        Date date = new Date();
        System.out.println(date);//Thu Jun 03 17:20:41 CST 2021
    }
    // Date类的带参数构造方法：
        /*
        Date（long date）:传递毫秒值，把毫秒转换为Data日期
        */
    private static void demo2() {
        Date date = new Date(1000);
        System.out.println(date);//Thu Jun 03 17:20:41 CST 2021
    }
    //Date类的成员方法
    /*
    long getTime() 返回1970年...至今的毫秒数
     */
    private static void demo3() {
        Date date = new Date();
        System.out.println(date.getTime());
    }
}
