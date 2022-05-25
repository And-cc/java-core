package com.stx.exercise.p8.TwoYanQingYuan.vehicle;

import java.util.Scanner;

public class VehicleManager {

    private Vehicle[] vehicleList = new Vehicle[10];
    private Scanner scanner = new Scanner(System.in);

    public VehicleManager(){
        //初始化10辆共享车放在vehicleList 数组里面
        int id=0;
        for (int i = 0; i < vehicleList.length; i++) {
            String j=String.valueOf(++id);
            vehicleList[i]=new Vehicle(j,0);
        }
    }


    //开始菜单
    public void start(){

        System.out.println("**************************");
        System.out.println("*******共享车管理系统********");
        System.out.println("**************************");


        boolean isExit = false;
        do{
            System.out.println("---------------------------------------------------------------");
            System.out.println("***请选择操作：");
            System.out.println("***1.查看车辆");
            System.out.println("***2.租赁车辆");
            System.out.println("***3.归还车辆");
            System.out.println("***4.退出");
            String choose = scanner.nextLine();
            System.out.println("---------------------------------------------------------------");
            switch (choose){
                case "1":
                    view();
                    break;
                case "2":
                    rental();
                    break;
                case "3":
                    back();
                    break;
                case "4":
                    scanner.close();
                    isExit=true;
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }

        }while (!isExit);
    }

    private void view(){
        System.out.println("编号\t\t状态");
        //打印全部车辆信息 编号，类型，状态，租车说明
        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.showInfo());
        }
    }

    //租车
    private void rental(){
        System.out.println("请输入租车编号：");
        String id = scanner.nextLine();
        //遍历数组找出车辆信息租车，
        //修改车辆状态为已经出租
        boolean flag=false;
        for (int i = 0; i < vehicleList.length; i++) {
            if (id.equals(vehicleList[i].getId())){
                if (vehicleList[i].getStatus()==1){
                    System.out.println("车辆已租，请换一辆");
                    break;
                }
                vehicleList[i].setStatus(1);
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("租车成功");
        }else {
            System.out.println("没有找到该编号的车辆信息，请重新输入！");
        }

    }

    //还车
    private void back(){
        System.out.println("请输入还车编号：");
        String id = scanner.nextLine();
        //遍历数组找出车辆信息还车，
        //修改车辆状态为可租
        boolean flag=false;
        for (int i = 0; i < vehicleList.length; i++) {
            if (id.equals(vehicleList[i].getId())){
                if (vehicleList[i].getStatus()==0){
                    System.out.println("车辆已还或未出租");
                    break;
                }
                vehicleList[i].setStatus(0);
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("还车成功");
        }else {
            System.out.println("没有找到该编号的车辆信息，请重新输入！");
        }
    }




}
