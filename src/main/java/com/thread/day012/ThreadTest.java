package com.thread.day012;


import java.util.concurrent.TimeUnit;

/** 循环体在线程内部与外部的区别 */
public class ThreadTest {

  public static void main(String[] args) {
//10个人只做add.anInt(1)这一步
    for (int i = 0; i < 10; i++) {
      new Thread(
              () -> {
                Add add = new Add();
                int a = add.anInt(1);

                System.out.println(a);
              })
          .start();
    }

    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("+++++++++++++++++++++++++++++");
//一个人做了10次的 i++
    new Thread(
            () -> {
              for (int i = 0; i < 10; i++) {

                System.out.println(i);

                //
              }
            })
        .start();
  }
}
