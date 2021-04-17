package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class RateTest {
  public static void main(String[] args) {
    //
    run();
    UUID uuid = UUID.randomUUID();
    System.out.println(uuid);
  }

  /** new date format的用法 */
  public static void run() {
    int money = 500;
    float rate = 1.04f;
    int count = 0;
    long time = new Date().getTime();
    System.out.println(time); // 获取当前时间
    long current = 1618165175529l; //
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");

    while (money < 200000) {
      count++;
      current = current + (24 * 60 * 60 * 1000);
      money = (int) (money * rate);
      System.out.println(count + "\t" + simpleDateFormat.format(current) + "\t" + money);
    }
  }
}
