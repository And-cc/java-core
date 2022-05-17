package demo06接口lambda内部类.接口.练习案例.demo1;

/**
 * @Author: yqy
 * @Date: 2021/05/31/19:08
 * @Description:
 */
public class Circle {
    private double radius;//半径
    private final double PI=3.14;

    public double findArea(){
        return PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
