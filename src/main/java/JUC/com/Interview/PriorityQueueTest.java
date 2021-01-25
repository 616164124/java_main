package JUC.com.Interview;

import java.util.PriorityQueue;

/**
 *
 *
 * <p>功能： 数组按顺序排列，取后面k个值的数组中的第一个值
 */

 /**
  * @version: V1.0
  * @author: mikael
  * @description: PriorityQueue 是一个数据按关键词有序排列，插入新数据的时候，会自动插入到合适的位置保证队列有序。（顺序有两种形式：升序或者是降序） 默认是升序
  * @data: 2020/10/12
  **/
public class PriorityQueueTest {
  public static void main(String[] args) {
    //
    int[] nums = {1, 23, 25, 6, 32423};
    int k = 4;
    System.out.println(find(nums, k));
  }

  public static int find(int[] nums, int k) {
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    for (int num : nums) {
      priorityQueue.add(num);
      System.out.println(priorityQueue);
      if (priorityQueue.size() > k) {
        priorityQueue.poll();
      }
    }
    System.out.println(priorityQueue);
    return priorityQueue.peek();
  }
}
