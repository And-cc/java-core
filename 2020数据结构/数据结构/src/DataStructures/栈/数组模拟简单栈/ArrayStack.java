package DataStructures.栈.数组模拟简单栈;

/**
 * @Author: yqy
 * @Date: 2022/03/08/20:57
 * @Description:数组模拟栈
 */
public class ArrayStack {
    private int maxSize;
    private int[] stack;
    private int top=-1;//栈顶
    public ArrayStack(int maxSize){
        this.maxSize=maxSize;
        stack=new int[this.maxSize];
    }

    /**
     * 是否满
     * @return
     */
    public boolean isFull(){
        /**
         * 从0开始，所以应该长度-1
         */
        return top==maxSize-1;
    }

    /**
     * 是否空
     * @return
     */
    public boolean isEmpty(){
        return top==-1;
    }

    /**
     * 入栈
     * @param value
     */
    public void push(int value){
        if (isFull()){
            System.out.println("栈满！");
            return;
        }
        top++;
        stack[top]=value;
    }

    /**
     * 出栈
     * @return
     */
    public int pop(){
       if (isEmpty()){
           throw new RuntimeException("空栈，无法取出");
       }
       int value=stack[top];
       top--;
       return value;
    }

    /**
     * 栈顶开始遍历
     */
    public void list(){
        if (isEmpty()){
            System.out.println("this is empty stack！");
            return;
        }
        for (int i = top; i >=0 ; i--) {
            System.out.printf("stack[%d]=%d\n",i,stack[i]);
        }
    }
}
