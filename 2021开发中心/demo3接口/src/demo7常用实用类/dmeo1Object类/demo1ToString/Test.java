package demo7常用实用类.dmeo1Object类.demo1ToString;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2021/06/03/12:56
 * @Description:
 */
public class Test {
    //demo1ToString类默认继承Object类，所以可以重写Object类中toString
    public static void main(String[] args) {
        demo1ToString d=new demo1ToString("严清远",18);
        System.out.println(d);
        System.out.println(d.toString()); //类中没有重写toString则是地址值

        //由输出结果可知：d==d.toString()   就是看类中有无重写，没重写地址值


        Random random=new Random();
        System.out.println(random);//java.util.Random@7f31245a
        //没有重写toString
        Scanner scanner=new Scanner(System.in);
        System.out.println(scanner);//java.util..............
        //重写了toString
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        System.out.println(arrayList);//[1, 2]
        //重写了toString
    }

}
