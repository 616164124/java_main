package com.guavatest;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * 给出程序执行的时间差 stopwatch
 * @author mikael
 */
public class StopwatchTest {
  public static void main(String[] args) {
    //
      Stopwatch stopwatch = Stopwatch.createUnstarted();
      stopwatch.start();
      try {
          Thread.sleep(10000);
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
      stopwatch.stop();
    System.out.println(stopwatch.elapsed(TimeUnit.SECONDS));
  }
}
