package DataStructures.链表.双向链表;

/**
 * @Author: yqy
 * @Date: 2022/03/07/20:27
 * @Description:
 */
public class DoubleTest {
    public static void main(String[] args) {
        HeroNode2 node1 = new HeroNode2(1, "卢俊义", "jsdfalkj");
        HeroNode2 node2 = new HeroNode2(2, "宋江", "jsdfalkj");
        DoubleLinkedListMethod method = new DoubleLinkedListMethod();
        method.add(node1);
        method.add(node2);
        method.showList();
        System.out.println("add~~~~~");
        HeroNode2 node22 = new HeroNode2(2, "宋江", "及时雨");
        method.update(node22);
        method.showList();
        System.out.println("update~~~~~");

        method.delete(2);
        method.showList();
        System.out.println("delete~~~~~");
        HeroNode2 node3 = new HeroNode2(3, "鲁智深", "倒把垂杨柳");
        method.addByOrder(node3);
        method.addByOrder(node22);
        method.addByOrder(node1);
        method.showList();
    }
}
