package Y2异常处理;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
    throws关键字：第一种处理方式，把异常交给别人处理
    作用：
       当方法内部抛出对象的时候，我们就必须处理这个对象
       可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理（自己不处理，别人处理），最终交给jvm处理-----》中断处理
    使用格式：在方法声明时使用
          修饰符 返回值类型 方法名（参数列表） throws aaaException,bbbException...{
                   throw new aaaException("");
                   throw new bbbException("");
                   ....
          }
    注意：
        1.throws必须写在方法声明处
        2.throws关键字后边声明的异常必须是Eception或其子类
        3.方法内部如果抛出多个异常对象，那么throws后面也声明多个异常
           如果抛出异常对象有子父类关系，那么直接声明父类即可
        4.调用了一个声明抛出异常的方法，我们就必须处理声明的异常
          要么继续抛出，最终交给jvm处理-----》中断处理
          要么解决掉（try/catch环绕）

 */
public class Y3Throws {
    public static void main(String[] args) throws IOException {
        readFile("c:\\a.tx");
        System.out.println("正在读取文件");
    }
    //FileNotFoundException extends IOException :所以无需throws FileNotFoundException
    public static  void readFile(String fileName) throws FileNotFoundException,IOException{
        if (!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的路径不是c:\\a.txt");//编译期异常，必须处理
        }
        if (!fileName.endsWith(".txt")){
            throw  new IOException("文件后缀名不对");
        }
    }
}
