package com.stx.exercise.p11.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: yqy
 * @Date: 2022/03/28/17:28
 * @Description:
 */
public class DateUtil {
    private static SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
    public static String timestampToStr(Timestamp timestamp){
        Date date=timestamp;
        return format.format(date);
    }
    public static Timestamp toTimestamp(String time){
        Date parse = new Date();
        try {
             parse= format.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long l = parse.getTime();
        return new Timestamp(l);
    }

}
