package Y2异常处理;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
   finally:
    格式：
          try{
             可能产生异常的代码
          }catch(接受try中的异常){
           异常的处理逻辑器，产生异常对象之后 ，怎么处理异常对象
           一般在工作中，会把异常信息记录日志
          }...
          catch(异常类名 变量名){

          }finally{
             无论是否出现异常都会执行
          }
      注意：
         1.finally不能单独使用，必须和try一起使用
         2.finally一般用于资源释放（资源回收），无论程序是否出现异常，最后都要释放资源（io）
 */
public class Y6Finally {
    public static void main(String[] args) {
        try {
            readFile("d:\\a.txt1");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //无论是否出现异常都会执行
            System.out.println("资源释放");
        }
    }
    //FileNotFoundException extends IOException :所以无需throws FileNotFoundException
    public static  void readFile(String fileName) throws IOException{

        if (!fileName.endsWith(".txt")){
            throw  new IOException("文件后缀名不对");
        }
        if (!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的路径不是c:\\a.txt");//编译期异常，必须处理
        }
    }
}
