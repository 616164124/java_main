package com.Interview;

/** @author mikael */
public class flagTest {
  public static void main(String[] args) {

    boolean flag = 10 % 2 == 1 && 10 / 3 == 0 && 1 / 0 == 0;
    // 结果为lll
    System.out.println(flag ? "jjj" : "llll");
    // 2147483647
    int i = Integer.MAX_VALUE + 1; // 结果为：-2147483648
    int ii = Integer.MAX_VALUE + 2; // 结果为：-2147483647
    int iii = Integer.MAX_VALUE + 3; // 结果为：-2147483646
    System.out.println(i + "\t" + ii + "\t" + iii + "\t" + Integer.MAX_VALUE);
  }
}
