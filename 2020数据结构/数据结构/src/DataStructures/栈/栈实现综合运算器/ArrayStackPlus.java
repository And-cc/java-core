package DataStructures.栈.栈实现综合运算器;

/**
 * @Author: yqy
 * @Date: 2022/03/09/9:36
 * @Description:
 */
public class ArrayStackPlus {
    private int maxSize;
    private int[] stack;
    private int top=-1;//栈顶
    public ArrayStackPlus(int maxSize){
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

    /**
     * 运算符的优先级，数字越大优先级越高
     * @param oper
     * @return
     */
    public int priority(int oper){
        if (oper=='*' ||oper=='/'){
            return 1;
        }else if (oper=='+' || oper=='-'){
            return 0;
        }else {
            return -1;
        }
    }

    /**
     * 判断是不是一个运算符
     * @param val
     * @return
     */
    public boolean isOper(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    /**
     * 计算
     * @param num1
     * @param num2
     * @param oper
     * @return
     */
    public int cal(int num1,int num2,int oper){
        int res=0;
        switch(oper){
            case '+':
                res=num1+num2;
                break;
            case '-':
                res=num1-num2;
                break;
            case '*':
                res=num1*num2;
                break;
            case '/':
                res=num1/num2;
                break;
        }
        return res;
    }
}

