package Y3Thread类常用方法.Y2设置线程的名称;
/*
设置线程名称:(了解)
         1.使用thread类中的方法setName(名字)
               void setName(String name):改变线程名称，使之与参数name相同。
         2.创建一个带参的构造方法，参数传递线程名称；调用父类的带参构造方法，把线程名称传递给父类，让父类（Thread）给子线程取名
 */

public class Test {
    public static void main(String[] args) {
       /*
            MyThread myThread = new MyThread();
            //1.使用thread类中的方法setName(名字)
            myThread.setName("张三");
            myThread.start();
        */
        MyThread thread = new MyThread("张三");
        thread.start();
    }
}
