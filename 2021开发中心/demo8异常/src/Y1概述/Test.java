package Y1概述;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    异常：指的是程序再执行过程中，出现非正常的情况，最终会导致vm非正常停止
        异常本身是一个类，产生异常就是创建异常对象并抛出
        处理方式：中断处理

     java.lang.Throwable:类是java语言中所有错误或异常的超类
               Exception:编译期异常，进行编译（写代码）Java程序出现的问题
                    RuntimeException:运行期异常，java程序运行过程中出现的问题
                    异常就相当于程序得了一个小毛病（感冒，发烧），
                    把异常处理掉，程序可以继续执行（吃药、打针）:添加异常到签名 或者  try/catch环绕
               Error:错误
                    错误就相当于程序得了一个无法治愈的毛病（非典，艾滋），
                    必须就改源代码，程序才能继续执行
 */
public class Test {
    public static void main(String[] args) {
        //编译期间异常Exception

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        try {
            date= format.parse("1999-1223");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("666");


        //运行期异常RuntimeException
        int[] arr={1,2,3};
        try {
            System.out.println(arr[30]);//即使明知道越界，但是编译器看不出来，只有在运行期间才可以
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("代码继续执行");

        //error:错误---》改代码
        int[] arr1=new int[1024*1024*1024];
        System.out.println("后续代码");
    }
}
