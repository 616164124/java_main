package com.jdk8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

/**
 * jdk8 关于时间计算
 */
// https://blog.csdn.net/hspingcc/article/details/73332526
public class TestDate {
    public static void main(String[] args) {
        String now = LocalDateTime.now().toString();//2022-07-15T10:01:51.128
        System.out.println(now);
        // 格式化时间 年月日
        LocalDate of = LocalDate.of(1992, Month.of(3), 3);//1992-03-03
        System.out.println(of);
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY年MM月dd日");
        System.out.println(dateFormat.format(new Date()));//2022年07月15日

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        System.out.println(dateFormat1.format(new Date()));//2022-07-15 10:04:17


    }
}
