package com.jdk8;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

/** jdk8 关于时间计算 */
// https://blog.csdn.net/hspingcc/article/details/73332526
public class TestDate {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    System.out.println(date);
    // 格式化时间 年月日
    LocalDate of = LocalDate.of(1992, Month.of(3), 3);
    System.out.println(of);
    SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
    System.out.println(dateFormat.format(new Date()));
  }
}
