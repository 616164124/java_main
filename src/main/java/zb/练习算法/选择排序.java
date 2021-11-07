package zb.练习算法;

import java.util.Arrays;

/**
 * @author mikael
 */
public class 选择排序 {
  public static void main(String[] args) {
      int[] a = {2, 3, 7, 1, 3, 4, 9, 8};

      for (int i = 0; i < a.length - 1; i++) {
          int minPos = i;
          int maxPos = i;
          for (int j = i + 1; j < a.length; j++) {
              if (a[j] < a[minPos]) {
                  minPos = j;
              }
              int temp = a[i];
              a[i] = a[minPos];
              a[minPos] = temp;

          }

          System.out.println(Arrays.toString(a));
      }

  }
}
