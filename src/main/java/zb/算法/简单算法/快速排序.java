package zb.算法.简单算法;

import java.awt.font.NumericShaper;
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
        int[] nums = {11, 23, 4, 13, 5123};
        int n = nums.length;
        quickSort(nums, 0, n - 1);
        for (int i = 0; i < n; ++i) {
            System.out.printf("%d ", nums[i]);
        }
        System.out.println();

        int[] numss = {2, 1,3, 4, 41, 12, 234};
        n=numss.length;
        test01(numss, 0, n - 1);
        for (int i = 0; i < n; ++i) {
            System.out.printf("%d ", numss[i]);
        }
        System.out.println();
    }

    //    {11,23,4,13,5123};   0, 4
    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left - 1, j = right + 1;
        int x = nums[left];
        while (i < j) {
            //i表示left ,j代表right
            while (nums[++i] < x) ;//找到nums[i]的值比x大的 i值，
            while (nums[--j] > x) ;//找到nums[i]的值比x小的 j值，
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        quickSort(nums, left, j);
        quickSort(nums, j + 1, right);
    }

    public static void test01(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left - 1, j = right + 1;
        int x = nums[left];
        while (i < j) {
            while (nums[++i] < x) ;
            while (nums[--j] > x) ;
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
            test01(nums, left, j);
            test01(nums, j + 1, right);
        }


    }

}



