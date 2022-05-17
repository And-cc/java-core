package demo06接口lambda内部类.接口.demo7接口与回调.book;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.Instant;

/**
 * @Author: yqy
 * @Date: 2021/05/31/20:54
 * @Description:
 */
public class TimePrinter implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the zone,the time is"+ Instant.ofEpochMilli(event.getWhen()));
        Toolkit.getDefaultToolkit().beep();
    }
}
