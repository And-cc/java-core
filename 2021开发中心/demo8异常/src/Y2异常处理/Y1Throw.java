package Y2异常处理;

//java异常处理的五个关键字：try、catch、finally、throw、throws
/*
       throw：
            作用：可以使用throw关键字在指定的方法中抛出指定的异常
            使用格式：throw new xxxException（"异常产生的原因"）
            注意：
                1.throw必须写在方法内部
                2.throw关键字后边new的对象必须是Exception或者Exception子类对象
                3.throw关键字抛出指定的异常对象，我们就必须处理这个对象
                  throw关键字后边创建的是RuntimeException或是其子类，我们可以不处理，默认交给jvm处理（打印异常对象，中断程序）
                  throw关键字后边创建的是编译异常（写代码时候报错），我们就必须处理这个异常，要么try/catch，要么添加异常到方法签名
 */
public class Y1Throw {
    public static void main(String[] args) {
        /*
        以后（工作中）我们首先必须对方法传递过来的参数进行合法性检验
        如果参数不合法，我们就必须使用抛出异常的方式，告知方法的调用者，传递的参数有问题
         */
      int[] arr= {1,2,3};
        int i = getElement(arr, 3);
        System.out.println(i);
    }
    public static int getElement(int[] arr,int index){
        //我们可以对传递过来的数组进行合法性检验
        if (arr==null){//空指针异常
            throw new NullPointerException("数组为空");
        }
        if (index> arr.length||index<0){//数组下标越界异常
            throw new ArrayIndexOutOfBoundsException("下标越界了");
        }
        int ele=arr[index];
        return ele;
    }
}
