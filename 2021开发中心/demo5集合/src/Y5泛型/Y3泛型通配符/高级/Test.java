package Y5泛型.Y3泛型通配符.高级;

import java.util.ArrayList;
import java.util.Collection;

/*
     泛型的上限限定：? extends E 代表使用的泛型只能是E的本身或子类
     泛型的下限限定：? super   E 代表使用的泛型只能是E的本身或父类
  */
public class Test {
     public static void main(String[] args) {
          //Integer extends Number extends Object
          //String extends Object
          Collection<Integer> list1=new ArrayList<>();
          Collection<String> list2=new ArrayList<>();
          Collection<Number> list3=new ArrayList<>();
          Collection<Object> list4=new ArrayList<>();
/*
          getElement1(list1);
          getElement1(list2);//报错
          getElement1(list3);
          getElement1(list4);//报错

          getElement2(list1);//报错
          getElement2(list2);//报错
          getElement2(list3);
          getElement2(list4);

 */
     }
     //泛型的上限：此时的上限？必须是number类型或者number的子类
     public static void getElement1(Collection<? extends Number> coll){}
    //泛型的上限：此时的下限？必须是number类型或者number的父类
     public static void getElement2(Collection<? super Number> coll){}
}

