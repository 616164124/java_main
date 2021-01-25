package JUC.com.thread.day012;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/** CyclicBarrier (集齐七颗龙珠才能召唤神龙) */
public class CyclicBarrierTest {

  public static void main(String[] args) {
      CyclicBarrier cyclicBarrier =
              new CyclicBarrier(
                      7,
                      () -> {
                          System.out.println("cyclicBarrier 结束******"); // 等线程数为7的时候才执行
                      });
    for (int i = 0; i <= 7; i++) {

      int a = i;
      new Thread(
              () -> {
                System.out.println(a);

                try {
                  cyclicBarrier.await(); // 每个线程的await相当于parties加1，等加到7时，才执行cyclicBarrier中的内容
                } catch (InterruptedException e) {
                  e.printStackTrace();
                } catch (BrokenBarrierException e) {
                  e.printStackTrace();
                }
              })
          .start();
    }

    try {
      TimeUnit.SECONDS.sleep(4);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

      System.out.println("------------------分割线-----------------------------");

    CyclicBarrier cyclicBarrier1 =
        new CyclicBarrier(
            6,
            () -> {
                System.out.println("cyclicBarrier1 结束-----");
            });

    for (int i = 0; i < 7; i++) {
      int a = i;
      new Thread(
              () -> {
                System.out.println(a);
                try {
                  cyclicBarrier1.await();
                } catch (InterruptedException e) {
                  e.printStackTrace();
                } catch (BrokenBarrierException e) {
                  e.printStackTrace();
                }
              })
          .start();
    }
  }
}