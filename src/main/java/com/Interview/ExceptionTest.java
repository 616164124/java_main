package com.Interview;

/** @Description: @Author: mikael */
public class ExceptionTest {
  private static int x = 100;

  private static int doMethod(int i) throws Exception {

    try {
      return 10/ i;
    } catch (Exception e) {
      System.out.println("catch in method。。。。");
      throw new Exception("exception in method");
    } finally {
      System.out.println("finally  exception in method ");
    }
  }

  public static void main(String[] args) {

    try {
      doMethod(0);
    } catch (Exception e) {
      System.out.println("catch in main。。。。");
    }finally {
      System.out.println("finally in main");
    }

    // 结果：
    // finally  exception in method
    // finally in main

    ExceptionTest test1 = new ExceptionTest();
    ExceptionTest test2 = new ExceptionTest();
    ExceptionTest test3 = new ExceptionTest();
    x++;  // 不应该通过类实例访问静态成员
    x++;
  }
}

class Test {
  private static final int a = 100;
}
