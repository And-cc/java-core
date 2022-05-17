package DataStructures.链表.环形链表;

/**
 * @Author: yqy
 * @Date: 2022/03/08/9:31
 * @Description:
 */
public class CircleLinkedList {
    //创建一个开始节点
    private Boy first = null;

    public void add(int nums) {
        /**
         * nums是添加的个数
         */
        if (nums < 1) {
            return;
        }
        /**
         * 辅助指针，用来帮助构建环形链表
         */
        Boy curBoy = null;
        for (int i = 1; i <= nums + 1; i++) {
            Boy boy = new Boy(i);
            /**
             * 第一个小孩，标记first
             */
            if (i == 1) {
                /**
                 * 自己指向自己，形成环
                 */
                first = boy;
                first.setNext(first);
                curBoy = first;
            } else {
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }
        }
    }

    public void showLinkedList() {
        if (first == null) {
            System.out.println("null~~~~~~");
            return;
        }
        Boy yanHandsome = first;
        while (yanHandsome.getNext() != first) {
            System.out.println(yanHandsome.getNo());
            yanHandsome = yanHandsome.getNext();
        }
    }

    /**
     * 根据用户输入，计算出小孩出圈的顺序
     *
     * @param startNo  从第几个小孩开始数
     * @param countNum 一次数几下
     * @param nums     最初有多少小孩在圈中
     */
    public void countBoy(int startNo, int countNum, int nums) {
        /**
         * 需求创建一个辅助变量helper，事先应该指向环形链表最后这个节点
         * 当小孩报数前，让first和helper指针移动m-1次
         * 这时候可以将first指向小孩节点出圈，原来first节点就没有任何引用，会回收
         */
        if (first == null || startNo < 1 || startNo > nums) {
            System.out.println("参数输入有误，请重新输入");
            return;
        }
        //辅助
        Boy helper = first;
        while (true) {
            if (helper.getNext() == first) {
                break;
            }
            helper = helper.getNext();
        }
        for (int i = 0; i < startNo - 1; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }
        while(true){
            if (helper==first){
                //圈中只剩一个节点
                break;
            }
            for (int i = 0; i < countNum-1; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            System.out.printf("小孩%d出圈\n",first.getNo());
            first=first.getNext();
            helper.setNext(first);
        }
        System.out.printf("最后留在圈中小孩编号%d\n",first.getNo());
    }
}
