package demo06接口lambda内部类.接口.demo6默认方法冲突.解决方案;

/**
 * @Author: yqy
 * @Date: 2021/05/31/19:22
 * @Description:
 */
public class MyClass implements Person, Named {

    //覆盖getName方法
    @Override
    public String getName() {
        return Person.super.getName();
    }


}
