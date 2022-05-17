package Y5泛型.Y3泛型通配符;

import java.util.ArrayList;
import java.util.Iterator;

/*
      ?: 当使用泛型或者接口时，传递的数据中，泛型类型不确定，可以通过通配符<?>表示。
         但是：一旦使用泛型的通配符后，，只能使用Object的共性方法，集合中元素自身无法使用

      使用方式：不能创建对象时使用
               只能作为方法的参数
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> helloString=new ArrayList<>();
        helloString.add("hello");
        helloString.add("hai");
        helloString.add("你好");
        ArrayList<Integer> helloInteger=new ArrayList<>();
        helloInteger.add(1);
        helloInteger.add(2);
        helloInteger.add(3);
        helloInteger.add(4);

        printArray(helloString);
        printArray(helloInteger);
    }
    /*
    定义一个方法，能遍历所有arraylist集合
    这时候我们不知道arraylist集合使用什么数据类型，可以泛型的通配符，来接受数据
     */
    public static void printArray(ArrayList<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.printf(next+" ");
        }
        System.out.printf("\n");
    }
}
