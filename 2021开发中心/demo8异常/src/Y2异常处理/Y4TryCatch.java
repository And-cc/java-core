package Y2异常处理;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
     Try/Catch:异常处理的第二方式，自己处理异常
     格式：
          try{
             可能产生异常的代码
          }catch(接受try中的异常){
           异常的处理逻辑器，产生异常对象之后 ，怎么处理异常对象
           一般在工作中，会把异常信息记录日志
          }...
          catch(异常类名 变量名){

          }
      注意：
         1.try中可能会抛出多个异常，那么可以使用多个catch来处理这些异常对象
         2.如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完catch处理逻辑，继续执行trycatch之后的代码
           如果try中没有产生异常，就不会执行catch中异常的处理逻辑，执行完try中代码，继续执行trycatch之后的代码
 */
public class Y4TryCatch {
    public static void main(String[] args) {
        try {
            readFile("d:\\a.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("正在catch");
        }
        System.out.println("正在读取文件");
    }
    //FileNotFoundException extends IOException :所以无需throws FileNotFoundException
    public static  void readFile(String fileName) throws IOException{
        if (!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的路径不是c:\\a.txt");//编译期异常，必须处理
        }
        if (!fileName.endsWith(".txt")){
            throw  new IOException("文件后缀名不对");
        }
    }
}
