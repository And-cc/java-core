package LeetCode;

/**
 * @Author: yqy
 * @Date: 2022/03/08/11:31
 * @Description:
 */
public class Demo203 {
    /*public static ListNode removeElements(ListNode head, int val) {
        if(head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode next;
        while(true){
            next=temp.next;
            if(next.next==null){
                break;
            }
            if (val==next.val){
                temp.next=next.next;
                continue;
            }
            temp=temp.next;
        }
        return temp;
    }*/
    public ListNode removeElements(ListNode head, int val) {
        if (head.next==null){
            return head;
        }
        ListNode temp=head;
        while(temp.next!=null){

            temp=temp.next;
        }

        return temp;
    }
}

