/**
 * projectName: JUC fileName: a.java packageName: test date: 2020-08-30 1:55 copyright(c) 2017-2020
 * xxx公司
 */
package com.github_snippet;

// https://www.cnblogs.com/Dhouse/p/7776780.html

public class format {
  public static void main(String[] args) {
    //
    System.out.println(String.format("我是%s,你是%s,他是%s", "t", "f", "h"));
    String str = null;
    str = String.format("Hi,%s", "王力");
    System.out.println(str);
    int i = Integer.MAX_VALUE;
    int c = Integer.MIN_VALUE;
    int a = Integer.MIN_VALUE - (i + 1) - 1;
    System.out.println(i + "\t" + c + "\t" + a);

    String aa = "Ma";
    String bb = "NB";
    if (aa.equals(bb) == true) {
      System.out.println("jfksf");
    }
    if (aa == bb) {
      System.out.println("true");
    }
  }
}
