package DataStructures.链表.双向链表;

/**
 * @Author: yqy
 * @Date: 2022/03/07/20:12
 * @Description:
 */
public class HeroNode2 {
    int no;
    String name;
    String nikeName;
    HeroNode2 next;
    HeroNode2 pre;

    public HeroNode2(int no, String name, String nikeName) {
        this.no = no;
        this.name = name;
        this.nikeName = nikeName;
    }

    @Override
    public String toString() {
        return "HeroNode2{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nikeName='" + nikeName + '\'' +
                '}';
    }
}
