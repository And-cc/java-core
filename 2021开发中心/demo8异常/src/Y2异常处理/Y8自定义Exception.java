package Y2异常处理;

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
