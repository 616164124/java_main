package com.Interview;

import java.util.concurrent.TimeUnit;

// 证明volatile的不具有原子性

/** volatile 特性：保证可见性 禁止指令重排 不保证原子性 */
public class multi_thread {
  static volatile int i = 0;
  static volatile int ii = 0;
  static volatile int iii = 0;

  public static void main(String[] args) throws InterruptedException {
    for (int a = 0; a < 2; a++) {

      new Thread(
              () -> {
                for (int j = 0; j < 10000; j++) {
                  synAdd();
                  iii = iii + 1;
                  addd();
                }
              },
              "T" + a)
          .start();
    }

    TimeUnit.SECONDS.sleep(5);

    System.out.println("sychronzied\t" + i);
    System.out.println("addd()\t" + ii);
    System.out.println("iiii = iii+1\t" + iii);
  }

  public static synchronized void synAdd() {
    i = i + 1;
  }

  public static void addd() {
    ii = ii + 1;
  }
}
