package DataStructures.链表;

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode node1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode node2 = new HeroNode(2, "李逵", "黑旋风");
        HeroNode node3 = new HeroNode(3, "林冲", "豹子头");
        SingleLinkedList list = new SingleLinkedList();
        /*list.add(node1);
        list.add(node3);
        list.add(node2);
        list.list();*/
        System.out.println("排序后");
        list.addByOrder(node1);
        list.addByOrder(node3);
        list.addByOrder(node2);
        list.list();
        HeroNode node = new HeroNode(3, "林冲冲", "豹子头头头");
        System.out.println("更改后");
        list.updateInfo(node);
        list.list();
        list.deleteNode(1);
        System.out.println("删除后");
        list.list();
        System.out.println(SingleLinkedList.getLength(list.getHead()));
        HeroNode res=SingleLinkedList.findLastNode(list.getHead(),2);
        System.out.println(res);
    }
}

//定义SingleLinkedList管理我们的英雄
class SingleLinkedList{
    public HeroNode getHead(){
        return head;
    }
    //初始化头节点，不能动头节点,不存放数据
    private  HeroNode head=new HeroNode(0,"","");
    //添加节点到单项链表
    public void add(HeroNode heroNode){
        //1.找到链表的最后节点
        //2.将最后这个节点的next指向新的节点
        //因为head节点不能动，因此我们需要一个辅助遍历temp
        HeroNode temp=head;
        while (true){
            //找到链表的最后
            if(temp.next==null){
                break;
            }
            //如果没有找到，将temp后移
            temp=temp.next;
        }
        //当退出循环时，temp就指向了链表的最后
        temp.next=heroNode;
    }
    public void addByOrder(HeroNode heroNode){
        HeroNode t=head;
        boolean flag=false;
        while(true){
            if (t.next==null){
                break;//已在链表最后
            }
            if(t.next.no>heroNode.no){
                break;
            }else if (t.next.no==heroNode.no){
                flag=true;//编号已经存在
                break;
            }
            t=t.next;
        }
        if (flag){
            System.out.printf("准备插入的英雄的编号%d已经存在，不能加入",heroNode.no);
        }else {
            //插入到链表中
            heroNode.next=t.next;
            t.next=heroNode;
        }
    }
    //修改节点信息，根据no编号来修改，即no编号不能改
    public void updateInfo(HeroNode newHernNode){
        if (head.next==null){
            System.out.println("链表为空");
            return;
        }
        HeroNode t=head.next;
        boolean flag=false;
        while(true){
            if (t==null){
                break;
            }
            if (t.no==newHernNode.no){//找到了需要修改的节点
                flag=true;
                break;
            }
            t=t.next;
        }
        //根据flag判断是否要找到要修改的节点
        if (flag){
            t.name= newHernNode.name;
            t.nickname= newHernNode.nickname;
        }else{
            System.out.printf("找不到编号%d的节点，无法修改",newHernNode.no);
        }
    }
    //删除节点
    public void deleteNode(int no){
        //1.head不能动，因此需要一个temp辅助节点找到待删除节点的前一个节点
        //2.说明我们在比较时，是temp.next和需要删除的节点
        HeroNode temp=head;
        boolean flag=false;
        while(true){
            if (temp.next==null){
                break;
            }
            if (temp.next.no==no){
                //删除节点的前一个节点
                flag=true;
                break;
            }
            temp=temp.next;
        }
        if (flag){//找到节点
            //删除节点
            temp.next=temp.next.next;
        }else {
            System.out.printf("要删除的节点%d不存在\n",no);
        }
    }
    //显示链表【遍历】
    public void list(){
        if (head.next==null){
            System.out.println("链表为空");
            return;
        }
        //因为头节点不能动，因此我们需要一个辅助遍历temp
        HeroNode temp=head.next;
        while(true){
            if (temp==null){
                break;
            }
            //输出节点信息
            System.out.println(temp);
            //后移temp
            temp=temp.next;

        }
    }
    //获取单链表的节点的个数（如果是带头节点的链表，需要不统计头节点）
    public static int getLength(HeroNode head){
        if (head.next==null){
            return 0;
        }
        int length=0;
        HeroNode cur=head.next;
        while (cur!=null){
            length++;
            cur=cur.next;
        }
        return length;
    }
    //查找单链表中的倒数第k个节点
    public static HeroNode findLastNode(HeroNode head,int index){
        if (head.next==null){
            return null;
        }
        int size=getLength(head);
        if (index<=0 || index>size){
            return null;
        }
        HeroNode t=head.next;
        for (int i = 0; i < size-index; i++) {
            t=t.next;
        }
        return t;
    }
    //单链表的反转

}

//定义节点，每个HeroNode,对象就是一个节点
class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    public HeroNode(int hNo,String hName,String hNickname){
        this.no=hNo;
        this.name=hName;
        this.nickname=hNickname;
    }
    @Override
    public String toString() {
        return "HeroNode2{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
