package com.stx.exercise.p10;

import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2022/03/23/17:11
 * @Description:
 */
public class Manager {
    private Scanner scanner=new Scanner(System.in);
    private DBTools tools=new DBTools();
    private String nike="";
    private String pwd="";
    private String love="";


    public void start(){
        boolean isExit = false;
        do {
            System.out.println("***请选择操作：");
            System.out.println("***1.注册");
            System.out.println("***2.登录");
            System.out.println("***3.退出");
            int i = scanner.nextInt();
            // 完善菜单逻辑
            switch (i) {
                case 1:
                    if (register()){
                        System.out.println("注册成功");
                    }else {
                        System.out.println("注册失败");
                    }
                    break;
                case 2:
                    if (login()){
                        System.out.println("登录成功");
                    }else {
                        System.out.println("登录失败");
                    }
                case 3:
                    scanner.close();
                    isExit = true;
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;
            }

        } while (!isExit);
    }


    /**
     * 注册方法 1，判断数据库有没有注册这个人  2.注册
     * @return
     */
    private boolean register(){
        input();
        String sql="INSERT INTO T_USER(ID,NIKE,PWD,LOVE) VALUES(S_U.NEXTVAL,'"+nike+"','"+pwd+"','"+love+"')";
        int i = tools.addOne(sql, nike, pwd, love);
        return i==0? false:true;
    }

    /**
     * 登录方法  查看数据库有没有这人，有验证密码，登录
     * @return
     */
    private boolean login(){
        System.out.println("请输入昵称");
        String name=scanner.next();
        System.out.println("请输入密码");
        String password=scanner.next();
        System.out.println("请输入爱好");
        String love=scanner.next();
        if (showNike(name)){
            if (password.equals(showPwd(name))){
                return true;
            }
            System.out.println("密码有误");
            return false;
        }
        System.out.println("账户有误");
        return false;
    }


    /**
     * 输入信息，输入名字是会递归避免重复
     */
    private void input(){
        System.out.println("请输入昵称");
        nike=repeat(scanner.next());
        System.out.println("请输入密码");
        pwd=scanner.next();
        System.out.println("请输入爱好");
        love=scanner.next();
    }

    /**
     * 查看用户名是否已经注册，已被注册重新输入
     * @param name
     * @return
     */
    private String repeat(String name){
        String sql="select * from t_user where nike='"+name+"'";
        String str= tools.queryOne(sql, "nike");
        if (!"".equals(str) && name.equals(str)){
            System.out.println("已被注册，请从新输入");
            name=repeat(scanner.next());
        }
        return name;
    }

    /**
     * 传入用户名，查询数据库是否有这人
     * @param name
     * @return
     */
    private  boolean showNike(String name){
        String sql="select * from t_user where nike='"+name+"'";
        String str= tools.queryOne(sql, "nike");
        if (str.equals(name)){
            return true;
        }
        return false;
    }

    /**
     * 根据名字查询数据库密码
     * @param name
     * @return
     */
    private String showPwd(String name){
        String sql="select * from t_user where nike='"+name+"'";
        return tools.queryOne(sql, "pwd");
    }

}
