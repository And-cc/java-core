package demo06接口lambda内部类.接口.demo6默认方法冲突.情况3;

/**
 * @Author: yqy
 * @Date: 2021/05/31/19:21
 * @Description:
 *
 */
public interface Person {
    default String getName(){
        return getClass().getName()+"_"+hashCode()+"      Person";
    }
}
