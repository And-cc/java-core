package demo4文件.Y1概述;

import java.io.File;

/*
java.io.File：类是文件和目录路径名称的抽象表示，主要用于文件和目录的创建、查找和删除等操作
构造方法：
       public File(String pathname):通过将给定的路径名字符串转换为抽象路径名来创建新的File实例
       public File(String parent,String child):从父路径名字符串和子路径名字符串创建新的File实例
       public File(File parent,String child):从父抽象路径字符串和子路径名字字符串创建新的File实例
我们可以使用File类的方法：
       创建一个文件/文件夹
       删除一个文件/文件夹
       获取文件/文件夹
       判断文件/文件夹是否存在
       对文件夹进行遍历
       获取文件的大小
File是一个与系统无关的类，任何操作系统都可以使用这个类中的方法

重点：记住这三个单词
       File：文件
       directory：文件夹/目录
       path：路径
 */
public class Test {
    public static void main(String[] args) {
        //静态成员变量
        /*
            static String	pathSeparator  与系统相关的路径分隔符字符，为方便起见，表示为字符串。
            static char	pathSeparatorChar  与系统相关的路径分隔符。
            static String	separator      与系统相关的默认名称 - 分隔符字符，以方便的方式表示为字符串。
            static char	separatorChar      与系统相关的默认名称分隔符。
         */
        String s = File.pathSeparator;
        System.out.println(s);// ;---->路径分隔符 windows分号 linux: 冒号
        String s1 = File.separator;
        System.out.println(s1);// \--->文件名称分隔符  windows反斜杠\   linux: 正斜杠/
        /*
        操作路径不能写死了
        D:\IDEA\学习\Java核心技术        Windows
        D:/IDEA/学习/Java核心技术        Linux
        "D:"+File.separator+"IDEA"+File.separator+"学习"+File.separator+"Java核心技术"
         */

        //路径
        /*
        绝对路径：是一个完整的路径（以盘符【C盘、D盘】开始的路径）      D:\IDEA\学习\Java核心技术\File\src\Y1概述\Test.java
        相对路径：是一个简化的路径（相对指的是相对于当前项目的根目录【D:\IDEA\学习\Java核心技术\File\src\Y1概述】，如果使用这个根目录，路径可以简化书写Test.java）
        注意：
                1.路径是不区分大小写
                2.路径中的文件名称分隔符Windows使用反斜杠，反斜杠是转义字符，两个反斜杠代表一个普通的反斜杠
         */
    }
}
