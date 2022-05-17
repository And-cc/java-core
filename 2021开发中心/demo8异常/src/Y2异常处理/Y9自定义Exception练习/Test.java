package Y2异常处理.Y9自定义Exception练习;

import java.util.ArrayList;
import java.util.Scanner;

//模拟注册操作，如果用户名已存在，则抛出异常并提示：该用户名已被注册。
/*
分析：
  1.使用数组保存已经注册过的用户名（数据库）
  2.使用Scanner获取用户想要注册的用户名
  3.定义一个方法对用户输入的注册的用户名进行判断
        ：遍历数组中存储过的用户名
          使用遍历到的每一个用户名和用户输入的用户名比较
                  true：用户名已存在
                  false：继续遍历比较
          如果循环结束了，还没有找到重复的用户名，提示用户”注册成功“
 */
public class Test {
    static String[] userNames={"张三","李四"};
    public static void main(String[] args)  {
        System.out.println("输入你想注册的用户名");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        //checkUserName(name);
        checkUserName2(name);
        /*
          编译期异常Exception需要return停止，不让其注册成功
          编译期异常RuntimeException不需要return停止，jvm会直接中断，不让其注册成功
         */

    }
    public static void checkUserName(String name) /*throws RegisterException*/ {
        for (String s : userNames) {
            if (s.equals(name)){
                try {
                    throw new RegisterException("用户名已被注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;//结束方法，不让其继续往下执行
                }
            }
        }
        System.out.println("注册成功");
    }
    public static void checkUserName2(String name) {
        for (String s : userNames) {
            if (s.equals(name)){
                throw new RegisterRuntimeException("用户名已被注册");
            }
        }
        System.out.println("注册成功");
    }
}
