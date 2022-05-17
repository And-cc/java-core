package Y2List接口.LinkedList;

import java.util.LinkedList;

/*
   java.util.LinkedList:集合数据存储的结构是链表结构，

   注意：使用linkedlist集合特有的方法不能使用多态

        void addFirst(E e)  在该列表开头插入指定的元素。
        void addLast(E e)   将指定的元素追加到此列表的末尾。
        void	push(E e)   将元素推送到由此列表表示的堆栈上。        ==void addFirst(E e)

        E    getFirst()     返回此列表中的第一个元素。
        E    getLast()      返回此列表中的最后一个元素。

        E	removeFirst()   从此列表中删除并返回第一个元素。
        E	removeLast()    从此列表中删除并返回最后一个元素。
        E	 pop()          从此列表表示的堆栈中弹出一个元素。         ==E	removeFirst()
 */
public class Test {
    public static void main(String[] args) {
         demo1();
    }

    private static void demo1() {
        //创建linkedlist集合对象
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        System.out.println(linkedList);
        //linkedList.addFirst("start");//添加元素在开头
        linkedList.push("start");//等效于addfirst
        linkedList.addLast("end");//添加元素在结尾
        System.out.println(linkedList);

        //linkedList.clear();//清空集合中的元素
        if (!linkedList.isEmpty()){
            System.out.println(linkedList.pop());
            //System.out.println(linkedList.getFirst());//获取开头
            System.out.println(linkedList.getLast());//获取结尾
        }
    }
}
