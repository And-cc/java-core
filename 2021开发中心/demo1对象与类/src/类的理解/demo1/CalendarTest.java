package 类的理解.demo1;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @Author: yqy
 * @Date: 2021/05/27/12:33
 * @Description:对象是怎么存在的？
 */
public class CalendarTest {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int month = now.getMonthValue();
        int today = now.getDayOfMonth();

        now = now.minusDays(today - 1);    //得到这个月的第一天
        DayOfWeek dayOfWeek = now.getDayOfWeek();  //根据这个月的第一天，判断这天是周几，但是这时候的值是英语
        int value=dayOfWeek.getValue();    //把英语转换成数字   1~7

        System.out.println("one two the for fiv six sev");
        for (int i=1;i<value;i++){
            System.out.print("    ");     //第一行多余则空格补上
        }
        while(now.getMonthValue()==month){       //保证时间一定在这个月之内
            System.out.printf("%3d",now.getDayOfMonth());   //输出每一天
            if (now.getDayOfMonth()==today){                //判断 如果是这个月的今天填充* 否则空格
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
            now=now.plusDays(1);                  //循环一次就给日期+1
            if (now.getDayOfWeek().getValue()==1){     //每次到星期一就换行
                System.out.println();
            }
        }
        /*if (now.getDayOfWeek().getValue()!=1){
            System.out.println();
        }*/
    }
}
//思考：其实有一部分的类，在我们开始学习java的时候就已经创建好了，我们只需要调用
//就像我们刚出生一样，我们还没出生时间万物就已经存在了，既对象
