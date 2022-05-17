package DataStructures.栈.数组模拟简单栈;

import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2022/03/09/9:05
 * @Description:
 */
public class test {
    public static void main(String[] args) {
        ArrayStack stack=new ArrayStack(4);
        String key="";
        boolean flag=true;
        Scanner scanner=new Scanner(System.in);
        while(flag){
            System.out.println("show:显示栈");
            System.out.println("exit:退出程序");
            System.out.println("push:添加数据");
            System.out.println("pop:取出数据");
            System.out.println("请输入你的选择");
            key=scanner.next();
            switch (key){
                case "show":
                    stack.list();
                    break;
                case "push":
                    System.out.println("请输入一个数");
                    stack.push(scanner.nextInt());
                    break;
                case "pop":
                    try{
                        int pop = stack.pop();
                        System.out.println("出栈的元素是："+pop);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case "exit":
                    scanner.close();
                    flag=false;
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序结束");
    }
}
