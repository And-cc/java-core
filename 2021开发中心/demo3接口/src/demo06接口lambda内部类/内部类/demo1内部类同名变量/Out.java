package demo06接口lambda内部类.内部类.demo1内部类同名变量;

/**
 * @Author: yqy
 * @Date: 2021/06/02/17:44
 * @Description:
 * 如果出现重名现象（就近原则），那么格式是：外部类名称.this.外部类成员变量名
 */
public class Out {
    int num=10;//外部类成员变量
    class  in{
        int num=20;//内部类成员变量
        public void inMethod(){
            int num=30;//内部类方法局部变量
            System.out.println(num);//30,局部变量，就近原则
            System.out.println(this.num);//20,内部类成员变量
            System.out.println(Out.this.num);//30,外部类成员变量
        }
    }
}
