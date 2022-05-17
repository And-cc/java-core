package Y2体验lambda表达式;
/*
jdk1.8:lambda表达式（函数式编程）
lambda表达式的标准格式:
         a.一些参数
         b.一个箭头
         c.一段代码
      格式：
         (参数列表)->{一些重写方法的代码}
      解释说明格式：
         ():接口中抽象方法的参数列表，没有参数，就空着；有参数就写出参数，多个参数使用逗号分隔
         ->:传递的意思，把参数传递给方法体{}
         {}: 重写接口的抽象方法的方法体
好处：
         1.省去实现类的定义
         2.匿名内部类的语法太复杂
 */
public class Test {
    public static void main(String[] args) {

        //匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "-----><-----");
            }
        }).start();
        //lambda表达式，实现多线程
        new Thread(()-> {
            System.out.println(Thread.currentThread().getName() + "-----><-----");
        }
        ).start();
    }
}
