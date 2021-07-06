package com.Leetcode;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author mikael
 */
public class BubbleSort {
  private static void bubbleSort(int[] nums) {
    boolean hasChange = true;
    int n = nums.length;
    for (int i = 0; i < n - 1 && hasChange; i++) {
      hasChange = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          swap(nums, j, j + 1);
          hasChange = true;
        }
      }
    }
  }

  private static void swap(int[] nums, int i, int j) {
    int t = nums[i];
    nums[i] = nums[j];
    nums[j] = t;
  }

  public static void main(String[] args) {
    int[] nums = {11, 2, 37, 9, 5, 8, 1};
    int[] nums2 = {11, 2, 37, 9, 5, 8, 1};

    bubbleSort(nums);
    Arrays.sort(nums2);
    System.out.println(Arrays.toString(nums));

    System.out.println(Arrays.toString(nums2));
  }
}
