package 常用实用类.dmeo5System.概念;

import java.util.Arrays;

//java.lang.System:获取于系统相关的信息或者系统级操作
/*
   常用方法：
        public static long currentTimeMills();返回以毫秒为单位的当前时间
        public static void arrayCopy(Object src,int srcPos,Object dest,int destPos,int length)
        ：将数组中指定的数据拷贝到另一数组中
 */
public class Test {
    public static void main(String[] args) {
        demo02();
        demo1();
    }

    private static void demo02() {
        //将数组A中前三个元素，复制到B的前三个位置上
        int[] A={1,2,3,4,5};
        int[] B={6,7,8,9,0};
        System.out.println("复制前："+ Arrays.toString(B));
        System.arraycopy(A,0,B,1,3);
        System.out.println("复制后："+ Arrays.toString(B));
    }

    private static void demo1() {
        System.out.println(System.currentTimeMillis());//用来测试程序的效率
        long start = System.currentTimeMillis();
        for (int i = 0; i<100; i++){
            System.out.print(i);
            if (i%20==0){
                System.out.println(" ");
            }
        }
        System.out.println("");
        long end = System.currentTimeMillis();
        System.out.println("用时"+(end-start));
    }
}
