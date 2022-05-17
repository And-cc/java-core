package Y2创建线程类.Y2创建多线程程序的第二种方式;
/*
创建多线程程序的第二种方式(建议使用):实现Runnable接口
  java.lang.Runnable:（接口）应该由那些打算通过某一线程执行其实例的类来实现。类必须定义一个成为run的无参数方法
  java.lang.Thread:（类）构造方法
                  1.Thread(Runnable target)分配新的Thread对象
                  2.Thread(Runnable target,String name)分配新的Thread对象

实现步骤：
      1.创建一个Runnable接口的实现类
      2.在实现类中重写Runnable接口的run方法，设置线程任务
      3.创建一个Runnable接口的实现类对象
      4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
      5.调用Thread类中的start方法，开启新的线程执行run方法

Runnable接口创建多线程程序的好处：
      1.避免了单继承的局限性
                       一个类只能继承一个类，类继承了Thread类就不能继承其他的类，实现了Runnable接口，还可以继承其他的类，实现其他的接口
      2.增强了程序的扩展性，降低了程序的耦合性（解耦）
                       实现了Runnable接口的方式，把设置线程任务和开启新的线程进行了分离（解耦）
                       实现类中，重写了run方法：用来设置线程任务
                       创建Thread类对象，调用start方法，用来开启新的线程
 */
public class Test {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();
        /*
        Thread thread = new Thread(runnable);
        thread.start();
        */
        new Thread(runnable).start();
        new Thread(new RunnableImpl2()).start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}
