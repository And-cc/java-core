package DataStructures.链表.单链表;

/**
 * @Author: yqy
 * @Date: 2022/03/07/10:05
 * @Description:
 */
public class LinkedListTest {
    public static void main(String[] args) {
        HeroNode heroNode = new HeroNode(1, "宋江", "及时雨");
        HeroNode heroNode1 = new HeroNode(2, "李逵", "黑旋风");
        HeroNode heroNode2 = new HeroNode(4, "林冲", "豹子头");
        HeroNode heroNode3= new HeroNode(5, "卢俊义", "玉麒麟");
        HeroNode heroNode4 = new HeroNode(3, "史进", "九纹龙");
        SingleLinkedList list = new SingleLinkedList();
        list.addByOrder(heroNode4);
        list.addByOrder(heroNode);
        list.addByOrder(heroNode2);
        list.addByOrder(heroNode1);
        list.addByOrder(heroNode3);
        list.showList();

        HeroNode heroNode5 = new HeroNode(3, "吴用", "智多星");
        list.update(heroNode5);
        list.showList();
        list.delete(3);
        list.showList();

        System.out.println(list.validNode());
        HeroNode node = list.reciprocalNode(4);
        System.out.println(node);

        list.reverse(heroNode);
        list.showList();
    }
}
