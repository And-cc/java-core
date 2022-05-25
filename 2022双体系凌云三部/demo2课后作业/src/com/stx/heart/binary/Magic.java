package com.stx.heart.binary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Magic {
    private static Scanner scanner = new Scanner(System.in);

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
        System.out.println("你猜测的结果是：" + Integer.parseInt(result, 2));
    }

    private static String guess(List<Card> cardList) {
        //用来后面拼接
        StringBuilder sb = new StringBuilder();
        for (Card card : cardList) {
            //打印卡片头
            System.out.println(card.getName());
            //卡片
            System.out.println(card.toString());
            //输入的内容
            System.out.println(card.getName() + "中有你选择的数字吗？yes or no?");
            String next = scanner.next();
            sb.append("yes".equals(next) ? "1" : 0);
        }
        //反转
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
            //String类型的二进制
            String binary = Integer.toBinaryString(number);
            //S
            int len = binary.length();
            //循环遍历这个字符串
            for (int i = len - 1; i >= 0; i--) {
                //如果
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
        for (int i = 1; i < (1 << bits); i++) {
            System.out.print(i + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("按Enter继续");
        scanner.nextLine();
    }
}
