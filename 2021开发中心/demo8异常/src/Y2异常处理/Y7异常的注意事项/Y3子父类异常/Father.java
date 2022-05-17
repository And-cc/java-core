package Y2异常处理.Y7异常的注意事项.Y3子父类异常;

/*
    子父类异常：
          1.如果父类抛出多各异常，子类重写父类方法时，抛出和父类相同的异常或者是父类异常的子类或者不抛出
          2.父类方法没有抛异常，子类重写父类该方法时也不可抛异常。此时子类产生该异常，只能捕获处理，不能声明抛出
     注意：
         父类异常是什么样，子类异常就什么样
 */
public class Father {
    public void hello() throws NullPointerException,ClassCastException{}
    public void hello2() throws IndexOutOfBoundsException{}
    public void hello3() throws IndexOutOfBoundsException{}
    public void hello4(){}
}
class Son extends Father{
    //子类重写父类方法时，抛出和父类相同的异常
    public void hello() throws NullPointerException, ClassCastException {}
    //父类异常的子类
    public void hello2() throws ArrayIndexOutOfBoundsException {}
    //不抛出
    public void hello3(){}
    //父类方法没有抛异常，子类重写父类该方法时也不可抛异常
    public void hello4()/*throws Exception*/ {
        //此时子类产生该异常，只能捕获处理，不能声明抛出(抛出的话父类也要抛)
        try {
            throw new Exception("666");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
