package LeetCode;

/**
 * @Author: yqy
 * @Date: 2022/03/04/9:14
 * @Description:
 */
public class Demo83 {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null){
            return head;
        }
        ListNode cur=head;
        while (cur.next!=null){
            if (cur.val==cur.next.val){
                cur.next=cur.next.next;
            }else {
                cur=cur.next;
            }
        }
        return head;
    }
    /*public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }*/
}
