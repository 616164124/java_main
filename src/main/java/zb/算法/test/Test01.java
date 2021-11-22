package zb.算法.test;

import java.util.PriorityQueue;

/** @author mikael */
public class Test01 {
  public static void main(String[] args) {
    //
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    queue.add(11);
    queue.add(7);
    queue.add(5);
    queue.add(12);
    queue.add(2);
    queue.add(6);
    queue.add(14);
    while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }

  }
}
