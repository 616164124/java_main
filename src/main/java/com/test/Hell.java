package com.test;

import java.util.concurrent.atomic.LongAdder;

/**
 * @author mikael
 */
public class Hell {
  public static void main(String[] args) {
    System.out.println("Miho");
    int i =1234567891;

    LongAdder longAdder = new LongAdder();
    longAdder.add(1234567891011l);
    longAdder.increment();
    System.out.println(longAdder);
  }
}
