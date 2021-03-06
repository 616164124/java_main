package com.test;

import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class Test1 {

  volatile boolean flag = true;

  public static void main(String[] args) {
    Test1 test1 = new Test1();

    new Thread(test1::m, "test1 p").start();

    long t =123l;
    Stack<Character> s = new Stack<>();
    s.push('{');

    test1.n();

    try {
      TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    int hell;

    new Thread(
            new Runnable() {
              @Override
              public void run() {
                System.out.println("hello");
              }
            })
        .start();

    test1.flag = false;
  }

  void m() {
    System.out.println("m start");
    while (flag) {}
    System.out.println("m end");
  }

  void n() {
    System.out.println("n()");
  }
}
