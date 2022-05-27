package 反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 通过反射来向集合（Integer）中添加字符串
 * @createTime 2022年05月27日 14:04:00
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        ArrayList<Integer> ay = new ArrayList<>();
        Class<?> a = Class.forName("java.util.ArrayList");
        Method m = a.getMethod("add", Object.class);
        m.invoke(ay,"hello");
        m.invoke(ay,"反射");
        m.invoke(ay,"我来了");
        System.out.println(ay);
    }
}
