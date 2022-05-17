package DataStructures.链表.单链表;

/**
 * @Author: yqy
 * @Date: 2022/03/07/9:36
 * @Description:
 */
public class SingleLinkedList {
    //初始化头结点,不存放具体数据
    private HeroNode head=new HeroNode(0,"","");

    public boolean isEmpty(){
        if (head.next==null){
            System.out.println("链表空！");
            return true;
        }else {
            return false;
        }
    }
    public void add(HeroNode heroNode){
        /**
         * 找到当前链表的最后节点，将最后节点的next指向新的节点
         */
        //因为head节点不能动，因此需要一个辅助遍历temp
        HeroNode temp=head;
        while(true){
            //找到链表的最后
            if (temp.next ==null){
                break;
            }
            //如果没有找到最后,temp后移
            temp=temp.next;
        }
        //当退出循环时，temp就指向链表最后
        temp.next=heroNode;
    }
    public void addByOrder(HeroNode node){
        /**
         * 1.找到新添加节点的位置，是通过辅助变量，通过遍历来完成
         */
        /**
         * 2.新的节点.next=temp.next
         */
        /**
         * 3.temp.next=新的节点
         */
        HeroNode temp=head;
        //标识添加的编号是否存在
        boolean flag=false;
        while(true){
            if (temp.next==null){
                break;
            }

            if (temp.next.no>node.no){
                //位置找到
                break;
            }else if (temp.next.no == node.no){
                //已经存在了
                flag=true;
                break;
            }
            temp=temp.next;
        }
        //循环结束，temp走到该插入的位置
        if (flag){
            //已经存在
            System.out.printf("准备插入的英雄的编号%d已经存在！\n",node.no);
        }else {
            node.next=temp.next;
            temp.next=node;
        }

    }
    public void update(HeroNode node){
        if (head.next==null){
            System.out.println("链表空！");
            return;
        }
        HeroNode temp=head;
        boolean flag=false;
        while (true){
            if (temp.next==null){
                break;//链表最后
            }
            if (node.no == temp.no){
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if (flag){
            temp.name= node.name;
            temp.nikeName= node.nikeName;
        }else {
            System.out.printf("没有找到编号%d的节点\n",node.no);
        }
    }
    public void delete(int no){
         if (isEmpty()){
             return;
         }
         HeroNode temp=head;
         boolean flag=false;
         while(true){
             //是否到达链表终点
             if (temp.next==null){
                 break;
             }
             if (temp.next.no==no){
                 flag=true;
                 break;
             }
             temp=temp.next;
         }
         if (flag){
             //删除节点
             /**
              * 被删除的节点，将不会有其他引用指向，会被垃圾回收机制回收
              */
             temp.next=temp.next.next;
         }else {
             System.out.printf("没有找到编号%d的节点\n",no);
         }
    }
    public void showList(){
        //判断链表是否为空
        if (head.next==null){
            System.out.println("链表空");
            return;
        }
        //因为head节点不能动，因此需要一个辅助遍历temp
        HeroNode temp=head;
        while(true){
            //找到链表的最后
            if (temp ==null){
                break;
            }
            //输出节点信息
            System.out.println(temp);
            //temp后移
            temp=temp.next;
        }
    }

    /**
     * 有效节点个数
     */
    public int validNode(){
        HeroNode temp=head;
        int sum=0;
        while(true){
            if (temp.next==null){
                //链表终点
                break;
            }
            temp=temp.next;
            sum++;
        }
        return sum;
    }

    /**
     * 倒数第k个节点
     */
    public HeroNode reciprocalNode(int k){
        HeroNode temp=head;
        int i = validNode();
        if (k<1 || k>i){
            System.out.print("输入节点有误 ：");
            return null;
        }
        int time=0;
        while(true){
            if (time==i-k+1){
                break;
            }
            if (temp.next==null){
                break;
            }
            temp=temp.next;
            time++;
        }
        return temp;
    }

    /**
     * 单链表的反转
     */
    public void reverse(HeroNode node){
        //如果链表为空或者只有一个节点，无需反转，直接返回
        if (head.next==null || head.next.next==null){
            return;
        }
        //辅助指针，帮助遍历
        HeroNode cur=head.next;
        //指向当前节点的下一个节点
        HeroNode next=null;
        HeroNode reverseHead=new HeroNode(0,"","");
        //遍历原来的链表
        while(cur!=null){
            next=cur.next;
            //将cur的下一个节点指向新的链表的最前端
            cur.next=reverseHead.next;
            reverseHead.next=cur;
            //cur往后挪
            cur=next;
        }
        head.next=reverseHead.next;
    }
}
