/*
 * projectName: JUC
 * fileName: ThreadPoolTest.java
 * packageName: Thread.threadpool
 * date: 2020-11-05
 * copyright(c) 2017-2020 xxx公司
 */
package com.thread.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @version: V1.0
 * @author: mikael
 * @className: ThreadPoolTest
 * @packageName: Thread.threadpool
 * @description:
 * @date: 2020-11-05
 */
public class ThreadPoolTest {

  public static void main(String[] args) {
    ThreadPoolExecutor executor =
        new ThreadPoolExecutor(
            1,
            2,
            4,
            TimeUnit.SECONDS,
            new ArrayBlockingQueue<Runnable>(3),
            new MyRejectedExecutionHandler());
  }
}

class MyRejectedExecutionHandler implements RejectedExecutionHandler {

  @Override
  public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {}
}
