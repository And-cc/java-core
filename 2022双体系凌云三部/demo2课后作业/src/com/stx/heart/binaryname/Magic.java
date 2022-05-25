package com.stx.heart.binaryname;


import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magic {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] names = {"罗广", "张芷茜", "姚明璨", "郭山彤", "梁敦厦", "霍负浪", "虞信品", "马仁毅", "冯州龙", "简务帅",
                                "黎丙赣", "谢尉争", "赵单羽", "孟航沛", "龚开梦", "黄蓝风", "易堃登", "华宸", "云姿", "惠芊",
                                "菡娟", "华倩", "云柳", "华芹", "微佳", "碧倩", "琪姗", "筠依", "熙沁", "惠怡",
                                "珺秋", "珺幽", "菱倚", "莉海", "尔纹", "雁思", "茵玫", "钰佳", "虞昕", "鸣桂",
                                "惠彦", "虞宛", "嘉芷", "绿芸", "莉枝", "菱芹", "晴玥", "诗姗", "睿桑", "语芙",
                                "诗昕", "茜秋", "诗佳", "嘉倩", "琴佳", "绮桂", "岚音", "涵芊", "绮芝", "舞娜",
                                "语凌", "莉妮", "莉沛", "雅南"};

    public static void main(String[] args) {
        // 1, 打印欢迎信息
        int bits = 6;
        welcome(bits);

        // 2, 生成卡片
        List<Card> cardList = generateCards(bits);

        // 3, 猜数
        String result = guess(cardList);

        // 4, 显示结果
        displayResult(result);
    }

    private static void displayResult(String result) {
        int i = Integer.parseInt(result, 2);
        System.out.println("你猜测的结果是：" + names[i]);
    }

    private static String guess(List<Card> cardList) {
        StringBuilder sb = new StringBuilder();
        for (Card card : cardList) {
            System.out.println(card.getName());

            show(card.toString());

            System.out.println(card.getName() + "中有你选择的数字吗？yes or no?");
            String next = scanner.next();
            sb.append("yes".equals(next) ? "1" : 0);
        }
        return sb.reverse().toString();
    }

    private static List<Card> generateCards(int bits) {
        // 初始化卡片张数
        List<Card> cardList = new ArrayList<>();
        for (int i = 0; i < bits; i++) {
            Card card = new Card("卡片" + (i + 1));
            cardList.add(card);
        }

        // 生成卡片
        for (int number = 1; number < (1 << bits); number++) {
            //将当前下标转为二进制
            String binary = Integer.toBinaryString(number);
            int len = binary.length();
            for (int i = len - 1; i >= 0; i--) {
                if (binary.charAt(i) == '0') {
                    continue;
                }
                int cardIndex = len - i - 1;
                Card card = cardList.get(cardIndex);
                card.add(number);
            }
        }
        return cardList;
    }

    private static void welcome(int bits) {
        System.out.printf("在下表中选择一个数字，我猜测%d次就能猜到\r\n", bits);
        for (int i = 0; i < (1 << bits); i++) {
            System.out.print(names[i] + "\t");
            if (i!=0 && i % 10 == 0 ) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("按Enter继续");
        scanner.nextLine();
    }

    //传递来一串字符串，返回
    public static void show(String s) {
        String[] split = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            System.out.print(names[Integer.parseInt(split[i])]+"\t\t");
            if (i%10==0){
                System.out.println();
            }
        }
        /*for (int i = 0; i < s.length(); i++) {

        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                continue;
            }
            String s1 = String.valueOf(chars[i]);
            System.out.print(names[Integer.parseInt(s1)] + "\t");
        }*/
    }
}
