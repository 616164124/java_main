package zb.算法.简单算法;

import java.util.HashMap;
import java.util.Scanner;

public class 快速排序 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; ++i) {
//            nums[i] = sc.nextInt();
//        }
        int[] nums = {11,23,4,13,5123};
        int n = nums.length;
        quickSort(nums, 0, n - 1);
        for (int i = 0; i < n; ++i) {
            System.out.printf("%d ", nums[i]);
        }
        System.out.println();
    }
//    {1,23,4,13,5123};
    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left - 1, j = right + 1;
        int x = nums[left];
        while (i < j) {
            //i表示left ,j代表right
            while (nums[++i] < x) ;//找到nums[i]的值比x小的 i值，
            while (nums[--j] > x) ;//找到nums[i]的值比x大的 j值，
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        quickSort(nums, left, j);
        quickSort(nums, j + 1, right);
    }


}



