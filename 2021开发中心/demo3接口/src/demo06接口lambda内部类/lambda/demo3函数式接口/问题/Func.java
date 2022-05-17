package demo06接口lambda内部类.lambda.demo3函数式接口.问题;

/**
 * @Author: yqy
 * @Date: 2021/06/01/17:45
 * @Description:
 */
@FunctionalInterface     //no target method
public interface Func {
    void run();
    //void too();        //明确说了只有一个抽象方法 这里会报错

}
