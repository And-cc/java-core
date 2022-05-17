package demo0理解继承;

/**
 * @Author: yqy
 * @Date: 2021/05/28/15:15
 * @Description:
 */
//子类也叫派生类
public class Son extends Father{
    //当子类继承（extends） 父类后就拥有父类的方法和属性
    public void setCar(){
        System.out.println("666");
    }
}
