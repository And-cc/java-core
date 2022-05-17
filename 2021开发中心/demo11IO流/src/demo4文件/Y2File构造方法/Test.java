package demo4文件.Y2File构造方法;

import java.io.File;

//构造方法
        /*
        File(File parent, String child)  从父抽象路径名和子路径名字符串创建新的 File实例。
        File(String pathname)：
                             String pathname：字符串的路径名称
                             路径可以是文件结尾，也可以是文件夹结尾
                             路径可以是相对路径，也可以是绝对路径
                             路径可以是存在的，也可以是不存在的（创建File对象，只是把字符串路径封装为File对象，不考虑路径真假情况）
        File(String parent, String child)：
                             参数：把路径分成两部分
                             String parent:父路径
                             String child:子路径
                             好处：父路径和子路径，可以单独书写，使用起来非常灵活；父路径和子路径都可以变化
        File(URI uri)                    通过将给定的 file: URI转换为抽象路径名来创建新的 File实例。
         */
public class Test {
    public static void main(String[] args) {
        //nice();// File(String pathname)：
        //good("D:\\","a.txt");
        pretty();
    }

    private static void pretty() {
        /*
        public File(File parent,String child)
                    从父抽象路径名和子路径名字符串创建新的File实例。
                    参数：把路径分成两部分
                         File parent:父路径
                         String child:子路径
                    好处：父路径和子路径，可以单独书写，使用起来非常灵活；父路径和子路径都可以变化
                    父路径是File类型，可以使用File的方法对路径进行一些操作，再使用路径创建对象

        */
        File parent=new File("d:\\");
        File file=new File(parent,"b.txt");
        System.out.println(file);
    }

    private static void nice(){
        /*
             String pathname：字符串的路径名称
             路径可以是文件结尾，也可以是文件夹结尾
             路径可以是相对路径，也可以是绝对路径
             路径可以是存在的，也可以是不存在的（创建File对象，只是把字符串路径封装为File对象，不考虑路径真假情况）
         */
        File file=new File("D:\\IDEA\\学习\\Java核心技术\\demo11File\\src\\Y2File构造方法\\a.txt");//没有的路径
        System.out.println(file);//重写了Object类的toString方法
        File file1=new File("D:\\IDEA\\学习\\Java核心技术\\demo11File\\src\\Y2File构造方法");//存在的路径
        System.out.println(file1);
        File file2=new File("b.txt");
        System.out.println(file2);
        //真的假的，相对绝对 都可以
    }
    private static void good(String parent,String child){
        /*
        File(String parent, String child)：
                             参数：把路径分成两部分
                             String parent:父路径
                             String child:子路径
                             好处：父路径和子路径，可以单独书写，使用起来非常灵活；父路径和子路径都可以变化
         */
        File file=new File(parent,child);
        System.out.println(file);//D:\a.txt
    }

}
