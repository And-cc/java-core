# 异常

> ```java
> 异常：指的是程序在执行过程中，出现非正常的情况，最终会导致vm非正常停止
>      异常本身是一个类，产生异常就是创建异常对象并抛出
>      处理方式：中断处理
> ```

> ```java
> java.lang.Throwable:类是java语言中所有错误或异常的超类
>           Exception:编译期异常，进行编译（写代码）Java程序出现的问题
>                RuntimeException:运行期异常，java程序运行过程中出现的问题
>                异常就相当于程序得了一个小毛病（感冒，发烧），
>                把异常处理掉，程序可以继续执行（吃药、打针）:添加异常到签名 或者  try/catch环绕
>           Error:错误
>                错误就相当于程序得了一个无法治愈的毛病（非典，艾滋），
>                必须就改源代码，程序才能继续执行
> ```

### 测试代码

```java
public class Test {
    public static void main(String[] args) {
        //编译期间异常Exception
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date=null;
        date= format.parse("1999-1223");
        System.out.println(date);
        System.out.println("666");

        //运行期异常RuntimeException
        int[] arr={1,2,3};
        System.out.println(arr[30]);//即使明知道越界，但是编译器看不出来，只有在运行期间才可以
        System.out.println("代码继续执行");

        //error:错误---》改代码
        int[] arr1=new int[1024*1024*1024];
        System.out.println("后续代码");
    }
}
```

## 异常处理

> ```java
> java异常处理的五个关键字：try、catch、finally、throw、throws
> ```

### Throw

> ```java
> throw：
>      作用：可以使用throw关键字在指定的方法中抛出指定的异常
>      使用格式：throw new xxxException（"异常产生的原因"）
>      注意：
>          1.throw必须写在方法内部             
>          2.throw关键字后边new的对象必须是Exception或者Exception子类对象
>          3.throw关键字抛出指定的异常对象，我们就必须处理这个对象
>            throw关键字后边创建的是RuntimeException或是其子类，我们可以不处理，默认交给jvm处理（打 印异常对象，中断程序）
>            throw关键字后边创建的是编译异常（写代码时候报错），我们就必须处理这个异常，要么try/catch，要么添加异常到方法签名
> ```

### Object非空判断

> ```java
> Objects类中的静态方法：
> public static <T> requireNonNull(T obj):查看指定引用对象是不是null
> 源码：
> public static <T> requireNonNull(T obj){
>        if（obj==null）{
>            throw new NullPointerException();
>        }
>        return obj;
> }
> ```

### Throws

> ```java
> throws关键字：第一种处理方式，把异常交给别人处理
> 作用：
>    当方法内部抛出对象的时候，我们就必须处理这个对象
>    可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理（自己不处理，别人处理），最    终交给jvm处理-----》中断处理
> 使用格式：在方法声明时使用
>       修饰符 返回值类型 方法名（参数列表） throws aaaException,bbbException...{
>                throw new aaaException("");
>                throw new bbbException("");
>                ....
>       }
> 注意：
>     1.throws必须写在方法声明处
>     2.throws关键字后边声明的异常必须是Eception或其子类
>     3.方法内部如果抛出多个异常对象，那么throws后面也声明多个异常
>        如果抛出异常对象有子父类关系，那么直接声明父类即可
>     4.调用了一个声明抛出异常的方法，我们就必须处理声明的异常
>       要么继续抛出，最终交给jvm处理-----》中断处理
>       要么解决掉（try/catch环绕）
> ```

### Try Catch

> ```java
> Try/Catch:异常处理的第二方式，自己处理异常
> 格式：
>      try{
>         可能产生异常的代码
>      }catch(接受try中的异常){
>       异常的处理逻辑器，产生异常对象之后 ，怎么处理异常对象
>       一般在工作中，会把异常信息记录日志
>      }...
>      catch(异常类名 变量名){
> 
>      }
>  注意：
>     1.try中可能会抛出多个异常，那么可以使用多个catch来处理这些异常对象
>     2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完catch处理逻辑，继续执行trycatch之后的代码
>       如果try中没有产生异常，就不会执行catch中异常的处理逻辑，执行完try中代码，继续执行trycatch之后的代码
> ```

### Throwable三种异常处理方法

> ```java
> String getMessage(): 返回throwable的简短信息
> String toString():   返回此throwable的详细消息字符串
> void printStackTrace():  JVM打印异常对象，打印的异常信息是最全面的
> ```

### Finally

> ```java
> finally:
>  格式：
>        try{
>           可能产生异常的代码
>        }catch(接受try中的异常){
>         异常的处理逻辑器，产生异常对象之后 ，怎么处理异常对象
>         一般在工作中，会把异常信息记录日志
>        }...
>        catch(异常类名 变量名){
> 
>        }finally{
>           无论是否出现异常都会执行
>        }
>    注意：
>       1.finally不能单独使用，必须和try一起使用
>       2.finally一般用于资源释放（资源回收），无论程序是否出现异常，最后都要释放资源（io）
> ```

### 异常的注意事项

#### 1.多异常捕获处理

> ```java
> 多个异常使用捕获又该如何处理呢？
> 1.多个异常分别处理
> 2.多个异常一次捕获，多次处理
>             注意：如果异常有子父类关系，那么先处理子类异常，再处理父类异常，否则报错
> 3.多个异常一次捕获，一次处理
>             就是catch父类异常，
> ```

#### 2. Finally有return语句

> ```java
> //如果finally有return语句，永远返回finally中的结果，避免该情况
> ```

#### 3.子父类异常

> ```java
> 子父类异常：
>           1.如果父类抛出多各异常，子类重写父类方法时，抛出和父类相同的异常或者是父类异常的子类或者不抛出
>           2.父类方法没有抛异常，子类重写父类该方法时也不可抛异常。此时子类产生该异常，只能捕获处理，不能声明抛出
>     
>      注意：
>          父类异常是什么样，子类异常就什么样
> ```

##### 测试

```java
public class Father {
    public void hello() throws NullPointerException,ClassCastException{}
    public void hello2() throws IndexOutOfBoundsException{}
    public void hello3() throws IndexOutOfBoundsException{}
    public void hello4(){}
}
class Son extends Father{
    //子类重写父类方法时，抛出和父类相同的异常
    public void hello() throws NullPointerException, ClassCastException {}
    //父类异常的子类
    public void hello2() throws ArrayIndexOutOfBoundsException {}
    //不抛出
    public void hello3(){}
    //父类方法没有抛异常，子类重写父类该方法时也不可抛异常
    public void hello4()/*throws Exception*/ {
        //此时子类产生该异常，只能捕获处理，不能声明抛出(抛出的话父类也要抛)
        try {
            throw new Exception("666");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

### 自定义异常

```java
//自定义异常类:java提供的异常类，不够我们使用，需要自定义一些异常类
/*
 格式：public class XXXexception extends Exception|RuntimeException{
       添加一个空参数的构造方法
       添加一个带异常信息的构造方法
      }
 注意：
    1.自定义异常类一般都是以Exception结尾，说明该类是一个异常类
    2.自定义异常类必须继承Exception|RuntimeException
              继承Exception：自定义异常类就是编译期异常，如果方法内部抛出了编译期异常，就必须处理这个异常要么throws，要么try、catch
              继承RuntimeException：自定义异常就是一个运行期异常，无需处理，交给虚拟机处理（中断处理）
 */
public class Y8自定义Exception extends Exception{
    /*
       查看源码发现，方法内部会调用父类的构造方法，让父类来处理这个异常信息
     */
    //添加一个空参数的构造方法
    public Y8自定义Exception(){
       super();
    }
    //添加一个带异常信息的构造方法
    public Y8自定义Exception(String s){
        super(s);
    }
}
```

### 自定义Exception练习

####  RegisterException

```java
public class RegisterException extends Exception{
    public RegisterException() {
        super();
    }
    public RegisterException(String message) {
        super(message);
    }
}
```

#### RegisterRuntimeException

```java
public class RegisterRuntimeException extends RuntimeException{
    public RegisterRuntimeException() {
    }
    public RegisterRuntimeException(String message) {
        super(message);
    }
}
```

#### test

```java
//模拟注册操作，如果用户名已存在，则抛出异常并提示：该用户名已被注册。
/*
分析：
  1.使用数组保存已经注册过的用户名（数据库）
  2.使用Scanner获取用户想要注册的用户名
  3.定义一个方法对用户输入的注册的用户名进行判断
        ：遍历数组中存储过的用户名
          使用遍历到的每一个用户名和用户输入的用户名比较
                  true：用户名已存在
                  false：继续遍历比较
          如果循环结束了，还没有找到重复的用户名，提示用户”注册成功“
 */
public class Test {
    static String[] userNames={"张三","李四"};
    public static void main(String[] args)  {
        System.out.println("输入你想注册的用户名");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        //checkUserName(name);
        checkUserName2(name);
        /*
          编译期异常Exception需要return停止，不让其注册成功
          编译期异常RuntimeException不需要return停止，jvm会直接中断，不让其注册成功
         */

    }
    public static void checkUserName(String name) /*throws RegisterException*/ {
        for (String s : userNames) {
            if (s.equals(name)){
                try {
                    throw new RegisterException("用户名已被注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;//结束方法，不让其继续往下执行
                }
            }
        }
        System.out.println("注册成功");
    }
    public static void checkUserName2(String name) {
        for (String s : userNames) {
            if (s.equals(name)){
                throw new RegisterRuntimeException("用户名已被注册");
            }
        }
        System.out.println("注册成功");
    }
}
```

