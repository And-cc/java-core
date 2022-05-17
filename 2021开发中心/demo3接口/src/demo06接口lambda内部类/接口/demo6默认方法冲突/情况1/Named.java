package demo06接口lambda内部类.接口.demo6默认方法冲突.情况1;

/**
 * @Author: yqy
 * @Date: 2021/05/31/20:23
 * @Description:
 */
public interface Named {

    default String getName(){
        return getClass().getName()+"_"+hashCode()+"      Named";
    }
}
