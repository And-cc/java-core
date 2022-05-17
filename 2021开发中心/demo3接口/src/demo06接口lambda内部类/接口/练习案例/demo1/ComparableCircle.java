package demo06接口lambda内部类.接口.练习案例.demo1;

/**
 * @Author: yqy
 * @Date: 2021/05/31/19:09
 * @Description:
 * 定义一个ComparableCircle类，
 * 继承Circle类并且实现CompareObject接口。
 * 在ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半径大小
 */
public class ComparableCircle extends Circle implements CompareObject<Circle>{
    @Override
    public int compareto(Circle o) {
       if (this.getRadius()==o.getRadius()) {
           return 0;
       } else if (this.getRadius()<=o.getRadius()){
           return -1;
       }else {
           return 1;
       }
    }
}
