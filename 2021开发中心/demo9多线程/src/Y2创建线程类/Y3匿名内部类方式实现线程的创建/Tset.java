package Y2创建线程类.Y3匿名内部类方式实现线程的创建;

/*
匿名内部类方式实现线程的创建：简化代码
格式：
     new Thread(){
            @Override
            public void run() {
               ....
            }
        }.start();

 */
public class Tset {
    public static void main(String[] args) {
        //匿名内部类
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("匿名内部类：" +i);
                }
            }
        }.start();
        //线程的接口Runnable多态
        Runnable r=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("Runnable多态：" +i);
                }
            }
        };
       new Thread(r).start();
       //简化接口的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println("Runnable多态精简版：" +i);
                }
            }
        }).start();
    }
}
