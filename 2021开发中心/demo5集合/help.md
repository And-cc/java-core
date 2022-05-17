# Java集合（我的简单理解）

## 集合Collection

### 概述

> ```java
> /*
>     集合：集合是Java提供的一种容器，可以用来存储多个数据
>     集合与数组的区别：
>               长度：数组长度是固定的，集合长度是可变的
>               内容：数组存相同类型的元素(对象，和基本数据类型)
>                    集合存储只能存储对象，但类型可以不一致(对象)
>  */
> ```

### 简单使用

```java
/*
   java.util.Collection（接口）：所有的实现类都可以使用这些方法
      创建对象：多态
              Collection<参数> 对象名=new 实现类<>();

      常用方法：boolean add(E a);        添加元素
              boolean remove(E a);     删除某个元素
              void clear();            清空所有元素
              boolean contains(E a);   判断集合是否有某个元素
              boolean isEmpty();       判断集合是否为空
              int Size();              获取集合长度
              Object[] toArray();      将集合转换为一个数组
 */
public class Test {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);
        list.remove("aaa");
        System.out.println(list);
        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
        list.add("ddd");
        list.add("eee");
        list.add("fff");
        System.out.println(list.size());
        Object[] array = list.toArray();
        for (Object o : array) {
            System.out.println("数组:"+o);
        }
    }
}
```

## 迭代器Iterator

### 简单使用

```java
/*
   java.util.Iterator(迭代器)：Collection的通用获取方式
   1.使用集合的方法Iterator()获取迭代器的实现类，使用Iterator接口（多态接收）
   2.Iterator接口中的hasNext判断还有没有下一个元素
   3.使用Iterator接口中的Next取出集合中的下一个元素

   常用方法：
        public  boolean hasNext()    迭代下一个元素，有则返回true
        public  E       next()       返回迭代中的下一个元素。
 */
public class Test {
    public static void main(String[] args) {
        Collection<String> strings=new ArrayList<>();
        strings.add("张三");
        strings.add("李四");
        strings.add("王五");
        strings.add("秦六");
        /*
        1.使用集合的方法Iterator()获取迭代器的实现类，使用Iterator接口（多态接收）
            Iterator<E>接口也有泛型，跟着集合走
         */
        Iterator<String> iterator = strings.iterator();
        //2.Iterator接口中的hasNext判断还有没有下一个元素
        while (iterator.hasNext()){
            //3.使用Iterator接口中的Next取出集合中的下一个元素
            System.out.println(iterator.next());
        }
    }
}
```

## 增强for

```java
/*
   增强for也称for each：专门用来遍历数组和集合的。
                       他的内部原理其实是个Iterator,所以，在遍历的过程中不能对元素进行增删操作
   格式：
       for(元素的数据类型 变量： 集合或数组){
           //...
       }

 */
public class Test {
    public static void main(String[] args) {
        demo1();
        System.out.printf("\n");
        demo2();
    }
    private static void demo2() {
        int a[]={1,2,3,3,4};
        for (int i:a) {
            System.out.printf("%d",i);
            System.out.printf(" ");
        }
    }
    private static void demo1() {
        Collection<String> s=new ArrayList<>();
        s.add("张三");
        s.add("李四");
        s.add("王五");
        s.add("秦六");
        s.add("赵七");
        s.add("魏九");
        for (String s1:s){
            System.out.print(s1+" ");
        }
    }
}
```

## 泛型

### 概述

```java
/*
      不使用泛型：
            好处：默认类型Obejct,可以存储任意类型数据
            弊端：不安全，会引发异常
       使用泛型：
            好处：
               1.避免了类转换麻烦，存什么类型，就能取什么类型
               2.把运行期异常（代码运行之后才会有的异常），提升到了编译期
            弊端：泛型是什么类型，只能存储什么类型
 */
public class Test {
    public static void main(String[] args) {
        //demo1();
        demo2();

    }
    private static void demo2() {
         ArrayList<String> s=new ArrayList<>();
         s.add("hello");
        // s.add(1);
        Iterator<String> iterator = s.iterator();
        while (iterator.hasNext()){
            String s1 = iterator.next();
            System.out.println(s1+">"+s1.length());
        }
    }
    private static void demo1() {
        ArrayList list=new ArrayList();
        list.add("hello");
        list.add(1);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);//不能使用.length 需要转型String
            String s = (String) next;
            System.out.println(s.length());//java.lang.Integer cannot be cast to java.lang.String
        }
    }
}
```

### 泛型的定义与使用

#### 泛型类

```java
public class Hello<T> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
```

#### 泛型方法

```java
/*
      定义含有泛型的方法：泛型定义在方法的修饰符和返回值之间

      格式：
         修饰符 <泛型> 返回值 方法名（参数列表（使用泛型））{
              //......
         }
 */
public class Hello {
    //定义含有泛型方法
  public <T> void helloMethod(T t){
      System.out.println(t);
  }
  //定义含有泛型静态方法
    public static <T> void helloStaticMethod(T t){
        System.out.println(t);
    }
}
```

#### 泛型接口

##### 接口

```java
public interface Hello<T> {
    void method(T t);
}
```

##### 实现类A

```java
//方法一；实现类指定类型，那么重写方法默认该类型
public class Method1 implements Hello<String>{
    @Override
    public void method(String s) {
        System.out.println(s);
    }
}
```

##### 实现类B

```java
//方法2：接口实现类继续延续泛型，让对象指定类型
public class Method2<T> implements Hello<T> {
    @Override
    public void method(T t) {
        System.out.println(t);
    }
}
```

##### 测试/总结

```java
public class MethodTest {
    public static void main(String[] args) {
        //方法一：实现类已经指定类型
        Method1 method1 = new Method1();
        method1.method("helloMethod1");
        //方法二：对象指定类型
        Method2<String> stringMethod2 = new Method2<>();
        stringMethod2.method("helloMethod2");
    }
}
```

### 泛型通配符

#### 概述

```java
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
```

#### 泛型上下限定

```java
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
          getElement1(list1);
          getElement1(list2);//报错
          getElement1(list3);
          getElement1(list4);//报错

          getElement2(list1);//报错
          getElement2(list2);//报错
          getElement2(list3);
          getElement2(list4);
     }
     //泛型的上限：此时的上限？必须是number类型或者number的子类
     public static void getElement1(Collection<? extends Number> coll){}
    //泛型的上限：此时的下限？必须是number类型或者number的父类
     public static void getElement2(Collection<? super Number> coll){}
}
```

## 斗地主案例

```java
/*
    一：准备牌
    二：洗牌
          使用集合工具类Collections中的方法
          static void shuffle(list<?> list )使用默认随机源对指定列表进行置换
    三：发牌
    四：看牌
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        //一：准备牌
            ArrayList<String> poker=new ArrayList<>();
            poker.add("大王");
            poker.add("小王");
            String[] color={"♥","♣","♦","♠"};
            String[] numbers={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
            for (String c:color){
                for (String num:numbers){
                    poker.add(c+num);
                }
            }          
        //二：洗牌
            Collections.shuffle(poker);         
        //三：发牌
            ArrayList<String> player01=new ArrayList<>();
            ArrayList<String> player02=new ArrayList<>();
            ArrayList<String> player03=new ArrayList<>();
            ArrayList<String> dipai=new ArrayList<>();

            for (int i=0;i<poker.size();i++){
                //获取每一张牌
                String pk = poker.get(i);
                //轮流发牌
                if (i>=51){
                    dipai.add(pk);
                }else if (i%3==0){
                    player01.add(pk);
                }else if (i%3==1){
                    player02.add(pk);
                }else if (i%3==2){
                    player03.add(pk);
                }
            }
        //四：看牌
            System.out.println("player01:"+player01);
            System.out.println("player02:"+player02);
            System.out.println("player03:"+player03);
            System.out.println("dipai:"+dipai);
    }
}
```

