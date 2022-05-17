package Y2异常处理.Y7异常的注意事项;

import java.util.ArrayList;
import java.util.List;

/*
     多个异常使用捕获又该如何处理呢？
     1.多个异常分别处理
     2.多个异常一次捕获，多次处理
                 注意：如果异常有子父类关系，那么先处理子类异常，再处理父类异常，否则报错
     3.多个异常一次捕获，一次处理
                 就是catch父类异常，
 */
public class Y1多异常捕获处理 {
    public static void main(String[] args) {
        //demo1();//运行时异常，虚拟机处理
        // demo2();//多个异常分别处理
        //demo3(); //多个异常一次捕获，多次处理
        //demo4();//多个异常一次捕获，一次处理
    }

    private static void demo5() {
    }

    private static void demo4() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list.get(3));//IndexOutOfBoundsException
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    private static void demo3() {
        try{
            int[] arr={1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
            List<Integer> list=new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list.get(3));//IndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("后续代码");
    }

    private static void demo2() {
        try{
            int[] arr={1,2,3};
            System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try {
           List<Integer> list = new ArrayList<>();
           list.add(1);
           list.add(2);
           list.add(3);
           System.out.println(list.get(3));//IndexOutOfBoundsException
        }catch (IndexOutOfBoundsException e){
           System.out.println(e);
        }
        System.out.println("后续代码仍然可以执行");
    }

    private static void demo1() {
        int[] arr={1,2,3};
        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(3));//IndexOutOfBoundsException
    }

}
