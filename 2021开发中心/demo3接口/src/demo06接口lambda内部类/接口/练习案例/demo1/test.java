package demo06接口lambda内部类.接口.练习案例.demo1;

import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2021/05/31/19:12
 * @Description:定义一个测试类TestInterface，创建两个ComaparableCircle对象，调用compareTo方法比较两个类的半径大小。
 */
public class test {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ComparableCircle c1 = new ComparableCircle();
    ComparableCircle c2 = new ComparableCircle();
    c1.setRadius(sc.nextDouble());
    c2.setRadius(sc.nextDouble());
    System.out.println(c1.compareto(c2));
 }

}
