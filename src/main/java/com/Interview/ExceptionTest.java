package com.Interview;

/** @Description: @Author: mikael */
public class ExceptionTest {
  private static int x = 100;

  private static int doMethod(int i) throws Exception {

    try {
      return i / 10;
    } catch (Exception e) {
      throw new Exception("exception in method");
    } finally {
      System.out.println("finally  exception in method ");
    }
  }

  public static void main(String[] args) {

    try {
      doMethod(0);
    } catch (Exception e) {
      System.out.println("exception in main");
    }
    System.out.println("finally in main");

    // 结果：
    // finally  exception in method
    // finally in main

    ExceptionTest test1 = new ExceptionTest();
    ExceptionTest test2 = new ExceptionTest();
    ExceptionTest test3 = new ExceptionTest();
    // test1.x++;  // 不应该通过类实例访问静态成员
    x++;
  }
}

class Test {
  private static int a = 100;
}
