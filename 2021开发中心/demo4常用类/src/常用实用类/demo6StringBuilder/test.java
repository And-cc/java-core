package 常用实用类.demo6StringBuilder;

//Java.lang.StringBuilder: 字符串缓冲区，提高效率
//        可变类，速度更快（单线程）
    /*
         构造方法：
               public StringBuilder():构造一个空的StringBuilder容器
               public StringBuilder(String str):构造一个空的StringBuilder容器,并把字符串添加进去
         常用方法：
               public StringBuilder append(....):添加任意类型的字符串形式，并返回当前对象自身
               public String toString():将当前的对象转换为String对象
               public StringBuilder reverse():反转内容
     */
public class test {
    public static void main(String[] args) {
        //构造方法
        /*StringBuilder builder = new StringBuilder();
        System.out.println("builder:"+builder);
        StringBuilder builder2 = new StringBuilder("aaaa");
        System.out.println("builder:"+builder2);*/

        //常用方法
        StringBuilder builder = new StringBuilder();
        builder.append("ccc");
        System.out.println(builder);
        /*
        链式编程：
         */
        builder.append("ccc").append(123).append(true);
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);


        //字符串和StringBuilder相互转化
        /*
           String->StringBuilder:StringBuilder构造方法
           StringBuilder->String:toString
         */
    }
}
