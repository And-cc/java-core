package DataStructures.链表.环形链表;

/**
 * @Author: yqy
 * @Date: 2022/03/08/9:30
 * @Description:
 */
public class Boy {
    private int no;
    private Boy next;
    public Boy(int no){
        this.no=no;
    }


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
    @Override
    public String toString() {
        return "Boy{" +
                "no=" + no +
                '}';
    }

}
