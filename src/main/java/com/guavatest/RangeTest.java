package com.guavatest;

import com.google.common.collect.Range;

/** @author mikael */
public class RangeTest {
  public static void main(String[] args) {
    //
    boolean contains = Range.closed(1, 3).contains(3);
      boolean contains1 = Range.closed("a", "c").contains("yb");
    System.out.println(contains1);
      System.out.println(contains);
  }
}
