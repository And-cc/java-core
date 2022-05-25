package com.stx.exercise.p8.TwoYanQingYuan.car;

import java.util.Scanner;

public class VehicleManager {
    private Vehicle[] vehicleList = new Vehicle[10];
    private Scanner scanner = new Scanner(System.in);


    //构造函数
    public VehicleManager() {
        //初始化5辆共享单车和5辆电动车放在vehicleList 数组里面
        int id = 0;
        for (int i = 0; i < vehicleList.length; i++) {
            String j = String.valueOf(++id);
            if (i < 5) {
                vehicleList[i] = new Bike(j, 0);
            } else {
                vehicleList[i] = new ElectricVehicle(j, 0);
            }
        }

    }


    //开始菜单
    public void start() {

        System.out.println("**************************");
        System.out.println("*******共享车管理系统********");
        System.out.println("**************************");


        boolean isExit = false;
        do {
            System.out.println("---------------------------------------------------------------");
            System.out.println("***请选择操作：");
            System.out.println("***1.查看车辆");
            System.out.println("***2.租赁车辆");
            System.out.println("***3.归还车辆");
            System.out.println("***4.退出");
            String choose = scanner.nextLine();
            System.out.println("---------------------------------------------------------------");
            // 完善菜单逻辑
            switch (choose) {
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
                    isExit = true;
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;

            }

        } while (!isExit);
    }

    private void view() {

        System.out.println("编号\t\t状态\t\t租车说明");
        //打印全部车辆信息 编号，状态，租车说明
        for (Vehicle vehicle : vehicleList) {
            String sta = "";
            if (vehicle.getStatus() == 1) {
                sta = "已租";
            } else {
                sta = "可租";
            }
            System.out.println(vehicle.getId() + "\t\t" + sta + "\t\t" + vehicle.showInfo());
        }

    }

    //租车
    private void rental() {
        System.out.println("请输入租车编号：");
        String id = scanner.nextLine();
        //遍历数组找出车辆信息租车，
        //修改车辆状态为已经出租
        boolean flag = true;
        int i = 0;
        while (flag && i < vehicleList.length) {
            if (vehicleList[i].getId().equals(id)) {
                vehicleList[i].setStatus(1);
                System.out.println(vehicleList[i].getId() + "成功出租");
                flag = false;
            }
            i++;
        }
        if (flag == true) {
            System.out.println("没有找到该编号的车辆信息，请重新输入！");
        }
    }

    //还车
    private void back() {
        System.out.println("请输入还车编号：");
        String id = scanner.nextLine();
        //遍历数组找出车辆信息还车，
        //遍历数组找出车辆信息租车，
        //修改车辆状态为可租

        boolean flag = true;
        int i = 0;
        while (flag && i < vehicleList.length) {
            if (vehicleList[i].getId().equals(id)) {
                if (vehicleList[i].getStatus() == 0) {
                    System.out.println("车未出租，无法还车");
                    flag = false;
                } else {
                    vehicleList[i].setStatus(0);
                    System.out.println(vehicleList[i].getId() + "成功还车");
                    flag = false;
                }
            }
            i++;
        }
        if (flag) {
            System.out.println("没有找到该编号的车辆信息，请重新输入！");
        }
    }


}
