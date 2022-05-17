package DataStructures.链表.单链表;

/**
 * @Author: yqy
 * @Date: 2022/03/07/9:33
 * @Description:
 */
public class HeroNode {
     int no;
     String name;
     String nikeName;
     HeroNode next;

    public HeroNode(int no,String name,String nikeName){
        this.no=no;
        this.name=name;
        this.nikeName=nikeName;
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
