package com.thread;

/** 多个线程按顺序循环执行 循环输出3个数组 */
enum ReadytoRun {
  t1,
  t2,
  t3
}

public class ThreadPrintABC_mode1 {

  // 不使用volatile 时，会造成死锁
  static volatile ReadytoRun t = ReadytoRun.t1;

  public static void main(String[] args) {
    char[] chars = "abcdef".toCharArray();
    char[] chars1 = "123456".toCharArray();
    char[] chars2 = "ABCDEF".toCharArray();
    new Thread(
            () -> {
              while (true) {
                for (char c : chars) {
                  while (t != ReadytoRun.t1) {}
                  System.out.print(c);
                  t = ReadytoRun.t2;
                }
              }
            },
            "第一个")
        .start();
    new Thread(
            () -> {
              while (true) {

                for (char c : chars1) {
                  while (t != ReadytoRun.t2) {}
                  System.out.print(c);
                  t = ReadytoRun.t3;
                }
              }
            },
            "第二个")
        .start();
    new Thread(
            () -> {
              while (true) {
                for (char c : chars2) {
                  while (t != ReadytoRun.t3) {}
                  System.out.print(c);
                  if (c == 'F') {
                    System.out.println();
                  }
                  t = ReadytoRun.t1;
                }
              }
            },
            "第三个")
        .start();
    long l = System.currentTimeMillis();
    while (true) {
      if (System.currentTimeMillis() - l > 10) System.exit(0);
    }
  }
}
