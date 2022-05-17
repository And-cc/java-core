package demo06接口lambda内部类.lambda.demo1lambda概念.book;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;


/**
 * @Author: yqy
 * @Date: 2021/06/01/13:05
 * @Description:
 */
public class lambdaTest {
    public static void main(String[] args) {
        String[] strings = {"张三","李四一","王五一二","秦六二","蔡七七七七七七","阿蛮"};
        System.out.println(Arrays.toString(strings));
        System.out.println("sorted in dictionary oder:");
        Arrays.sort(strings);   //默认方式    ---》按照字典顺序
        System.out.println(Arrays.toString(strings));
        System.out.println("sorted by lenth:");
        Arrays.sort(strings); //按照长度排序
        System.out.println(Arrays.toString(strings));

        Timer timer = new Timer(1000, event ->
                System.out.println("the time is：  " + new Date()));
        timer.start();
        JOptionPane.showConfirmDialog(null,"Quit program");
        System.exit(0);
    }
}
