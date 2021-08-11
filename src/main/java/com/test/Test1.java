package com.test;

import java.math.BigDecimal;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

public class Test1 {

  volatile boolean flag = true;

  public static void main(String[] args) {
    Test1 test1 = new Test1();

    String s12 =".13";
    System.out.println(new BigDecimal(s12));
    System.out.println(s12.trim() +"\t"+ s12);

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

    new Thread(
            new Runnable() {
              @Override
              public void run() {
                System.out.println("hello");
              }
            })
        .start();

    test1.flag = false;

//只适用于基本数据类型，不用临时变量，交换a,b的值
    int a=123;
    int b=897;
    a=a^b;
    b=a^b;
    a=b^a;
    System.out.println(a+"\t"+b);

    System.out.println("".equals("12"));
    int i= 182/10+1;
    System.out.println(i+"\t i======");
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
