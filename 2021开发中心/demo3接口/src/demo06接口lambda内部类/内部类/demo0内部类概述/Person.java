package demo06接口lambda内部类.内部类.demo0内部类概述;

/**
 * @Author: yqy
 * @Date: 2021/06/02/17:25
 * @Description:成员内部类定义
 */
//外部类
public class Person {
    //外部类成员变量
    private String name;
    //外部类方法
    public void personMethod() {
        System.out.println("外部类方法");
        //外部类调用内部类
        heart h=new heart();
        h.beat();
        //升级版 匿名对象
        new heart().beat();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //成员内部类
    public class heart{
        //内部类方法
       public void beat(){
           System.out.println("bong bong bong");
           System.out.println("我叫："+name);//正确写法，内部类调用外部类
       }
    }
}
