package com.stx.exercise.p8.TwoYanQingYuan.musician;

import java.util.Scanner;

/**
 * @Author: yqy
 * @Date: 2022/03/10/18:42
 * @Description:
 */
public class MusicianManager {
    Musician[] musicians={new Erhu("二胡"),new Piano("钢琴"),new Violin("小提琴")};
    Scanner scanner=new Scanner(System.in);
    public void start(){
        boolean isExit = false;
        do {
            System.out.println("---------------------------------------------------------------");
            System.out.println("***请选择操作：");
            System.out.println("***1.二胡");
            System.out.println("***2.钢琴");
            System.out.println("***3.小提琴");
            System.out.println("***4.退出");
            int i = scanner.nextInt();
            System.out.println("---------------------------------------------------------------");
            // 完善菜单逻辑
            switch (i) {
                case 1:
                case 2:
                case 3:
                    printInfo(i-1);
                    break;
                case 4:
                    scanner.close();
                    isExit = true;
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
                    break;

            }

        } while (!isExit);
    }
    private void printInfo(int i){
        System.out.println(musicians[i].getSound());
        musicians[i].play();
    }
}
