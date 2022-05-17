package 常用实用类.demo3DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
        java.text.DateFormat（抽象类）:日期于文本的相互转换

        格式化：（日期->文本）
              String format(Date date)

        解析： （文本->日期）
              Date parse(String source)

        使用：DateFormat是抽象类，无法直接使用，那么可以间接使用子类simpleFormat类

 */
public class demo1概述 {
    //构造方法
    /*
      simpleDateFormat(String pattern)
                 参数：String pattern 指定的模式
                 模式（pattern）：  yyyy:MM:dd  HH:mm:ss
      这个怎么玩？
              1.创建simpleDateFormat对象，构造方法中传递指定的模式
              2(格式化).调用simpleDateFormat对象的方法format，按照构造方法中指定的模式，把日期转为符合模式的文本（String）
              2(解析).调用simpleDateFormat对象的方法parse，按照构造方法中指定的模式，把文本（String）转为符合模式的日期（Date）
     */
    public static void main(String[] args) throws ParseException {
        //1.创建simpleDateFormat对象，构造方法中传递指定的模式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd  HH:mm:ss");
        Date date=new Date();
        //2(格式化).调用simpleDateFormat对象的方法format，按照构造方法中指定的模式，把日期转为符合模式的文本（String）
        String s = simpleDateFormat.format(date);
        System.out.println(s);
        //2(解析).调用simpleDateFormat对象的方法parse，按照构造方法中指定的模式，把文本（String）转为符合模式的日期（Date）
        Date parse = simpleDateFormat.parse(s);
        System.out.println(parse);
    }

}
