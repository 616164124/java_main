package com.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * UUID(8-4-4-16)由以下几部分的组合：
 *
 * <p>　　（1）当前日期和时间，UUID的第一个部分与时间有关，如果你在生成一个UUID之后，过几秒又生成一个UUID，则第一个部分不同，其余相同。
 *
 * <p>　　（2）时钟序列
 *
 * <p>　　（3）全局唯一的IEEE机器识别号，如果有网卡，从网卡MAC地址获得，没有网卡以其他方式获得
 */
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
