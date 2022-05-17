package DataStructures.队列;

import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2021/12/09/14:59
 * @Description:目前队列只能使用一次，不能复用，需要升级环形队列
 */
public class ArrayQueue {
    public static void main(String[] args) {
        ArrayQueuePO po = new ArrayQueuePO(3);
        char key=' ';
        Scanner scanner = new Scanner(System.in);
        boolean loop=true;
        while(loop){
            System.out.println("s(show):显示队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):从队列取出数据");
            System.out.println("h(head):查看队列头的数据");
            key=scanner.next().charAt(0);//接受一个字符
            switch (key){
                case 's': po.showQueue(); break;
                case 'a':
                    System.out.println("输入一个数");
                    int value=scanner.nextInt();
                    po.addQueue(value);
                    break;
                case 'g':
                    try{
                        int res= po.getQueue();
                        System.out.printf("取出的数据是%d",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try{
                        int res = po.headQueue();
                        System.out.printf("队列头的数据是%d",res);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'e':
                    scanner.close();
                    loop=false;
                    break;
                default:break;
            }

        }
        System.out.println("程序结束");
    }
}

class ArrayQueuePO{
    private int maxSize;//数组最大容量
    private int front;//队列头
    private int rear;//队列尾
    private int[] arr;//数组存放数据，模拟队列
    //创建队列构造器
    public ArrayQueuePO(int arrMaxSize){
        maxSize=arrMaxSize;
        arr=new int[maxSize];
        front=-1;//指向队列头部，分析出front是指向队列头的前一个位置
        rear=-1;//指向队列尾，指向队列尾的数据
    }
    //判断队列是否满
    public boolean isFull(){
        return rear==maxSize-1;
    }
    //判断队列是否为空
    public boolean isEmpty(){
        return rear==front;
    }
    //添加数据至队列
    public void addQueue(int n){
        //判断队列是否满
        if (isFull()){
            System.out.println("队列已满");
            return;
        }
        rear++;
        arr[rear]=n;
    }
    //获取队列的数据
    public int getQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列空，不能取数据");
        }
        front++;
        return arr[front];
    }
    //显示队列所有数据
    public void showQueue(){
        if (isEmpty()){
            System.out.println("队列是空的");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d",i,arr[i]);
        }
    }
    //显示队列的头数据，不是取出数据
    public  int headQueue(){
        if (isEmpty()){
            throw new RuntimeException("队列空的");
        }
        return arr[front+1];
    }

}
