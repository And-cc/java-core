package Y2异常处理;
/*
   Objects类中的静态方法：
   public static <T> requireNonNull(T obj):查看指定引用对象是不是null
   源码：
   public static <T> requireNonNull(T obj){
          if（obj==null）{
              throw new NullPointerException();
          }
          return obj;
   }
 */

import java.util.Objects;

public class Y2Object非空判断 {
    public static void main(String[] args) {
        method(null);
    }
    public static void method(Object obj){
        //对传递过来的参数进行合法性检验，判断是否为null
        /* if(obj==null){
            throw new NullPointerException("传递的对象的值是空");
        }*/
        /*
        Objects.requireNonNull(obj);
        */
        Objects.requireNonNull(obj,"对象为空");
    }
}
