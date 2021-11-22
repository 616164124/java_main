package zb.算法.简单算法;

import java.util.Arrays;

public class 希尔排序 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shellSort(new int[]{11, 21, 7, 9, 5, 8})));
       System.out.println(Arrays.toString(test(new int[]{11, 21, 7, 9, 5, 8})));

    }

    private static int[] shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > key) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = key;
            }
        }
        return arr;
    }

    public static int[] test(int[] arr){
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int key = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > key) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = key;
            }
        }

        return arr;
    }



}
