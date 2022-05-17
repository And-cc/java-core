package demo06接口lambda内部类.内部类.demo2成员内部类;


/*
*    权限修饰符小结：
*               public>protected>(default)>private
*               定义一个类的时候，权限修饰符规则：
*               外部类   ：public/(default)
*               成员内部类: public/(protected)/(default)/private
*               局部内部类:什么都不能写但不是(default)
*
 */
public class Test {
    public static void main(String[] args) {
         Out  out=new Out();
          out.methodOuter();
    }
}
