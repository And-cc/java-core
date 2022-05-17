package demo0理解继承;

/**
 * @Author: yqy
 * @Date: 2021/05/28/15:20
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        Son son = new Son();
        String surname = son.surname;
        int blood = son.blood;
        System.out.println(surname+"     "+blood);
        son.speak();
        System.out.print("\n");
        System.out.println("以上都是父类的属性和方法");
        System.out.println("子类也可以自定义方法，一般来说，子类比父类更强大，有更多的功能");
        son.setCar();
    }
}
