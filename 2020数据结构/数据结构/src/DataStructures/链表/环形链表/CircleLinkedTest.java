package DataStructures.链表.环形链表;

/**
 * @Author: yqy
 * @Date: 2022/03/08/14:36
 * @Description:
 */
public class CircleLinkedTest {
    public static void main(String[] args) {
        CircleLinkedList list = new CircleLinkedList();
        list.add(5);
        list.showLinkedList();
        list.countBoy(1, 2, 5);
    }
}
