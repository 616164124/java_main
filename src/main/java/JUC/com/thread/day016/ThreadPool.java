package JUC.com.thread.day016;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(4);
    executorService.execute(new Thread01());
    executorService.execute(new Thread01());
    executorService.execute(new Thread01());
    executorService.execute(new Thread01());
    executorService.execute(new Thread01());
    executorService.execute(new Thread01());
    executorService.execute(new Thread01());
    executorService.execute(new Thread01());
    executorService.execute(new Thread01());
    executorService.shutdown();
  }
}

class Thread01 implements Runnable {

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + "进入 thread01 ");
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class Thread02 implements Runnable {

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + "进入 thread02 ");
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}

class Thread03 implements Runnable {

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + "进入 thread03 ");
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
