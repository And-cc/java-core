package Y5泛型.Y2泛型的定义与使用.方法;

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
