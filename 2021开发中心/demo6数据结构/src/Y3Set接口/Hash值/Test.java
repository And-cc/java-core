package Y3Set接口.Hash值;

/*
    hash值：是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟的地址，不是数据实际存储的物理地址）

          在Object类有一个方法：
                    int hashCode()     返回该对象的hash码值
 */
public class Test {
    public static void main(String[] args) {
        //Person类继承 Object类，所以可以使用object类的hashcode方法
        Person person = new Person();
        int i = person.hashCode();
        System.out.println(i);
        System.out.println(person);
        /*
            toString的源码：
                public String toString() {
                    return getClass().getName() + "@" + Integer.toHexString(hashCode());
                }
         */


        /*
        String类的哈希值
                 String类重写Object类的hashCode方法
         */
        String s1=new String("hello");
        String s2=new String("hello");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode()==s2.hashCode());//true
    }
}
