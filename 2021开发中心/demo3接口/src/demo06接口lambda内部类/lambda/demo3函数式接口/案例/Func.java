package demo06接口lambda内部类.lambda.demo3函数式接口.案例;

/**
 * @Author: yqy
 * @Date: 2021/06/01/17:52
 * @Description:
 */
@FunctionalInterface
public interface Func extends NonFunc{
    void run();

   default void foo(){

   }
   default void voo(){

   }
}
