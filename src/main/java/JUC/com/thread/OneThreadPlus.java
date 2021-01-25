package JUC.com.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class OneThreadPlus {

  public static void main(String[] args) {

    M m = new M();
    for (int i = 0; i < 3; i++) {
      new Thread(
              () -> {
                while (true) {
                  m.add();
                }
              },
              "++" + i)
          .start();
      new Thread(
              () -> {
                while (true) {
                  m.dec();
                }
              },
              "--" + i)
          .start();
    }

    try {
      TimeUnit.SECONDS.sleep(1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.exit(0);
  }
}

class M {
  private static volatile AtomicInteger atomicInteger = new AtomicInteger(0);

  public synchronized void add() {
    atomicInteger.getAndIncrement();
    System.out.println(Thread.currentThread().getName() + "\t" + atomicInteger);
  }

  public synchronized void dec() {
    atomicInteger.getAndDecrement();
    System.out.println(Thread.currentThread().getName() + "\t" + atomicInteger);
  }
}
