package demo7常用实用类.demo3DateFormat.练习案例;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//练习：
      /*
      请使用日期时间相关的api，计算出一个人已经出生了多少天？
      */
public class Test {
       //分析
       /*
        1.获取出生日期，Scanner.next()方法
        2.把获取到的日期解析
        3.把出生日期转化为毫秒值
        4.获取当前日期，转化为毫秒值
        5.用现在时间的毫秒值减去出生日期毫秒值
        6.转化为天数
         */
    public static void main(String[] args) throws ParseException {
        //1.获取出生日期，Scanner.next()方法
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式为yyyy-MM-dd");
        String birthDay = scanner.next();
        //2.把获取到的日期解析
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDay2 = s.parse(birthDay);
        //3.把出生日期转化为毫秒值
        long birthDay2Time = birthDay2.getTime();
        //4.获取当前日期，转化为毫秒值
        Date date = new Date();
        long nowDate = date.getTime();
        //5.用现在时间的毫秒值减去出生日期毫秒值
        long day = nowDate - birthDay2Time;
        // 6.转化为天数
        System.out.println("您至今出生了："+day/1000/24/60/60+"天.");
    }
}
