package demo06接口lambda内部类.接口.demo1接口的概念.csdn;

/**
 * @Author: yqy
 * @Date: 2021/05/31/18:59
 * @Description:
 */
public class Bat implements Flyable,Bitable {

    @Override
    public void bite() {
        System.out.println("吸血");
    }

    @Override
    public void fly() {
        System.out.println("用翅膀飞");
    }

    public static void main(String[] args) {
        Bat bat = new Bat();
        //方法的实现
        bat.bite();
        bat.fly();
        //可以直接调用常量
        System.out.println("bat翅膀数量："+Flyable.wingsNumber);
        System.out.println("bat牙齿数量："+Bitable.teethNumber);
    }
}
