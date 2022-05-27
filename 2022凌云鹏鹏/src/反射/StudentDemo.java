package 反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName StudentDemo.java
 * @Description 反射
 * @createTime 2022年05月27日 15:12:00
 */
public class StudentDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //获取Student类
        Class<?> a= Class.forName("反射.Student");
        //获取Student公共的带有参数的构造方法
        Constructor<?> constructor = a.getConstructor(String.class,int.class);
        //调用构造方法
        constructor.newInstance("凡鹏",22);
        System.out.println("=================================获取成员方法并调用=========================================");
        //获取公共的成员方法并调用
        Method m = a.getMethod("show", String.class);
        //创建Student对象
        Object o = a.getConstructor().newInstance();
        //调用show方法
        m.invoke(o,"凡鹏");
        System.out.println("===============================================================================");
        //获取所有的方法(不包含继承的)
        Method d = a.getDeclaredMethod("show1", int.class);
        //无视访问权限
        d.setAccessible(true);
        //调用show1方法
        d.invoke(o,22);
        System.out.println("===================获取成员变量并调用====================");
        //获取成员变量
        Field f = a.getDeclaredField("name");
        Field f1 = a.getDeclaredField("age");
        f.setAccessible(true);
        f1.setAccessible(true);
        //给成员变量赋值
        f.set(o,"凡鹏");
        f1.set(o,22);
        Method m2 = a.getDeclaredMethod("show2");
       m2.invoke(o);
    }
}
