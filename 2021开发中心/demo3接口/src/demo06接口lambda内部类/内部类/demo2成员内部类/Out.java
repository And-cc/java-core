package demo06接口lambda内部类.内部类.demo2成员内部类;

/*
* 如果一个类定义在一个   *** 方法内部 ***，那么这就是一个局部内部类
* “局部”：只有当前所属的类才能使用他，除了这个方法外面就不能调用
 */

    /*   定义格式
                    修饰符 class 外部类名称{
                          修饰符 返回值类型 外部类方法名称（）{
                             class 局部内部类名称{
                              //.....
                             }
                          }
                    }
     */
public class Out {
    int num=30;
    public void methodOuter(){
        int num=20;
        class In{ //局部内部类
            final int num=10;
            //局部内部类，如果访问所在方法的局部变量，那么这个局部变量必须是【有效final】的
            /*
            原因：
            1.new 出来的对象在堆内存中
            2.局部变量是跟着方法走的，在栈内存中
            3.方法运行结束之后，立刻出栈，局部变量就会消失
            4.但是new出来的对象对在堆中持续存在，直到垃圾回收


             */

            public void methodIn(){
                System.out.println(num);//10
                System.out.println(this.num);//10
                System.out.println(Out.this.num);//30

               //局部内部类，如果访问所在方法的局部变量，那么这个局部变量必须是【有效final】的
            }
        }
        //成员内部类只能再方法内使用，
        In in = new In();
        in.methodIn();
    }
}
