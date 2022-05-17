package DataStructures.链表.双向链表;


/**
 * @Author: yqy
 * @Date: 2022/03/07/20:14
 * @Description:
 */
public class DoubleLinkedListMethod {
    private HeroNode2 head = new HeroNode2(0, "", "");

    public void add(HeroNode2 dll) {
        /**
         * 找到当前链表的最后节点，将最后节点的next指向新的节点
         */
        //因为head节点不能动，因此需要一个辅助遍历temp
        HeroNode2 temp = head;
        while (true) {
            //找到链表的最后
            if (temp.next == null) {
                break;
            }
            //如果没有找到最后,temp后移
            temp = temp.next;
        }
        temp.next = dll;
        dll.pre = temp;
    }

    public void update(HeroNode2 dll) {
        /**
         * 链表空直接退出
         */
        if (head.next == null) {
            System.out.println("链表空！");
            return;
        }

        HeroNode2 temp = head;
        boolean flag = false;
        while (true) {
            if (temp.no == dll.no) {
                flag = true;
                break;
            }
            if (temp.next == null) {
                break;//链表最后
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = dll.name;
            temp.nikeName = dll.nikeName;
        } else {
            System.out.printf("没有找到编号%d的节点\n", dll.no);
        }
    }

    public void showList() {
        //判断链表是否为空
        if (head.next == null) {
            System.out.println("链表空");
            return;
        }
        //因为head节点不能动，因此需要一个辅助遍历temp
        HeroNode2 temp = head;
        while (true) {
            //找到链表的最后
            if (temp == null) {
                break;
            }
            //输出节点信息
            System.out.println(temp);
            //temp后移
            temp = temp.next;
        }
    }

    public void delete(int no) {
        if (head.next == null) return;
        HeroNode2 temp = head.next;
        boolean flag = false;
        while (true) {
            //是否到达链表终点
            if (temp == null) {
                break;
            }
            if (temp.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            //删除节点
            temp.pre.next = temp.next;
            //如果是最后一个节点，不需要执行，会出现空指针
            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }
        } else {
            System.out.printf("没有找到编号%d的节点\n", no);
        }
    }

    public void addByOrder(HeroNode2 dll){
         HeroNode2 temp=head;
         boolean flag=false;
         while(true){
             if (temp.next==null){
                 break;
             }
             if (temp.next.no> dll.no){
                 break;
             }else if (dll.no==temp.next.no){
                 flag=true;
                 break;
             }
             temp=temp.next;
         }

         if (flag){
             System.out.printf("准备插入的英雄的编号%d已经存在！\n",dll.no);
         }else {
             if (temp.next!=null){
                 dll.next=temp.next;
                 temp.next.pre=dll;
             }
             temp.next=dll;
             dll.pre=temp;
         }
    }
}
