package demo06接口lambda内部类.接口.demo7接口与回调.book;

import javax.swing.*;

/**
 * @Author: yqy
 * @Date: 2021/05/31/21:00
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        TimePrinter timePrinter = new TimePrinter();
        Timer timer = new Timer(1000, (java.awt.event.ActionListener) timePrinter);
        timer.start();
        JOptionPane.showConfirmDialog(null,"quit program");
        System.exit(0);
    }
}
