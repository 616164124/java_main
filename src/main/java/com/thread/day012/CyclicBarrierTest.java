package com.thread.day012;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

/** CyclicBarrier (集齐七颗才能召唤神龙) */
public class CyclicBarrierTest {

  public static void main(String[] args) {
      ReentrantLock reentrantLock = new ReentrantLock(true);
      ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(12, 12, 100, TimeUnit.MILLISECONDS,
             new LinkedBlockingDeque<Runnable>(19){
             });

      ThreadPoolExecutor threadPoolExecutor1 = new ThreadPoolExecutor(12, 20, 100, TimeUnit.SECONDS, new BlockingDeque<Runnable>() {
          @Override
          public void addFirst(@NotNull Runnable runnable) {

          }

          @Override
          public void addLast(@NotNull Runnable runnable) {

          }

          @Override
          public boolean offerFirst(@NotNull Runnable runnable) {
              return false;
          }

          @Override
          public boolean offerLast(@NotNull Runnable runnable) {
              return false;
          }

          @Override
          public void putFirst(@NotNull Runnable runnable) throws InterruptedException {

          }

          @Override
          public void putLast(@NotNull Runnable runnable) throws InterruptedException {

          }

          @Override
          public boolean offerFirst(@NotNull Runnable runnable, long timeout, TimeUnit unit) throws InterruptedException {
              return false;
          }

          @Override
          public boolean offerLast(@NotNull Runnable runnable, long timeout, TimeUnit unit) throws InterruptedException {
              return false;
          }

          @NotNull
          @Override
          public Runnable takeFirst() throws InterruptedException {
              return null;
          }

          @NotNull
          @Override
          public Runnable takeLast() throws InterruptedException {
              return null;
          }

          @Nullable
          @Override
          public Runnable pollFirst(long timeout, TimeUnit unit) throws InterruptedException {
              return null;
          }

          @Nullable
          @Override
          public Runnable pollLast(long timeout, TimeUnit unit) throws InterruptedException {
              return null;
          }

          @Override
          public boolean removeFirstOccurrence(Object o) {
              return false;
          }

          @Override
          public boolean removeLastOccurrence(Object o) {
              return false;
          }

          @Override
          public boolean add(@NotNull Runnable runnable) {
              return false;
          }

          @Override
          public boolean offer(@NotNull Runnable runnable) {
              return false;
          }

          @Override
          public void put(@NotNull Runnable runnable) throws InterruptedException {

          }

          @Override
          public boolean offer(@NotNull Runnable runnable, long timeout, TimeUnit unit) throws InterruptedException {
              return false;
          }

          @NotNull
          @Override
          public Runnable remove() {
              return null;
          }

          @Override
          public Runnable poll() {
              return null;
          }

          @NotNull
          @Override
          public Runnable take() throws InterruptedException {
              return null;
          }

          @Nullable
          @Override
          public Runnable poll(long timeout, TimeUnit unit) throws InterruptedException {
              return null;
          }

          @NotNull
          @Override
          public Runnable element() {
              return null;
          }

          @Override
          public Runnable peek() {
              return null;
          }

          @Override
          public boolean remove(Object o) {
              return false;
          }

          @Override
          public boolean contains(Object o) {
              return false;
          }

          @Override
          public int size() {
              return 0;
          }

          @Override
          public Iterator<Runnable> iterator() {
              return null;
          }

          @Override
          public void push(@NotNull Runnable runnable) {

          }

          @Override
          public Runnable removeFirst() {
              return null;
          }

          @Override
          public Runnable removeLast() {
              return null;
          }

          @Override
          public Runnable pollFirst() {
              return null;
          }

          @Override
          public Runnable pollLast() {
              return null;
          }

          @Override
          public Runnable getFirst() {
              return null;
          }

          @Override
          public Runnable getLast() {
              return null;
          }

          @Override
          public Runnable peekFirst() {
              return null;
          }

          @Override
          public Runnable peekLast() {
              return null;
          }

          @Override
          public Runnable pop() {
              return null;
          }

          @NotNull
          @Override
          public Iterator<Runnable> descendingIterator() {
              return null;
          }

          @Override
          public int remainingCapacity() {
              return 0;
          }

          @Override
          public int drainTo(@NotNull Collection<? super Runnable> c) {
              return 0;
          }

          @Override
          public int drainTo(@NotNull Collection<? super Runnable> c, int maxElements) {
              return 0;
          }

          @Override
          public boolean isEmpty() {
              return false;
          }

          @NotNull
          @Override
          public Object[] toArray() {
              return new Object[0];
          }

          @NotNull
          @Override
          public <T> T[] toArray(@NotNull T[] a) {
              return null;
          }

          @Override
          public boolean containsAll(@NotNull Collection<?> c) {
              return false;
          }

          @Override
          public boolean addAll(@NotNull Collection<? extends Runnable> c) {
              return false;
          }

          @Override
          public boolean removeAll(@NotNull Collection<?> c) {
              return false;
          }

          @Override
          public boolean retainAll(@NotNull Collection<?> c) {
              return false;
          }

          @Override
          public void clear() {

          }
      });

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
