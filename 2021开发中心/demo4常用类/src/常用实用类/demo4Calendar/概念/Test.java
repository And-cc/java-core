package 常用实用类.demo4Calendar.概念;

//java.util.Calendar（抽象类）：日历类
/*
   Calendar是一个抽象类，提供了很多操作日历字段的方法（year，month，day_of_month,hour）
   Calendar类无法直接创建对象，只能通过getInstance（），该方法返回Calendar的子类对象
   static Calendar getInstance（）
 */

import java.util.Calendar;

import static java.util.Calendar.YEAR;

public class Test {
    /*
    Calendar常用方法
    1.public int get(int field)               field:日历字段（year，month，day_of_month,hour）
    2.public void set(int field,int value)
    3.public abstract void add(int field,int amount)     amount:时间量
    4.public Date getTime()                              把calendar对象转换为日期
     */
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        //1.get()
        System.out.println(calendar.get(YEAR));
        //2.set()
        calendar.set(YEAR,2020);
        System.out.println(calendar.get(YEAR));
        //3.add
        calendar.add(YEAR,20);
        System.out.println(calendar.get(YEAR));
        //4.getTime
        System.out.println(calendar.getTime());
    }
}
