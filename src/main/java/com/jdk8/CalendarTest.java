package com.jdk8;

import com.jdk8.jdk8day0041.TestHahsMap;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

/**
 * 日期
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar rq = Calendar.getInstance();
        Year yyyy = Year.now();

        System.out.println(yyyy);
        System.out.println(rq.get(Calendar.MONTH) + 1);
        Instant now = Instant.now();
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        ZonedDateTime now1 = ZonedDateTime.now();

        System.out.println("当前时间是: " + now + "\t" + now1);
        //
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");//24小时制
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        System.out.println("另一种表示形式:\t" + now1.format(formatter2));
        System.out.println("另一种表示形式:\t" + now1.format(formatter));
        TestHahsMap testHahsMap = new TestHahsMap();
        for (int i = 0; i < 10; i++) {
            testHahsMap.Test();
        }
    }
}
