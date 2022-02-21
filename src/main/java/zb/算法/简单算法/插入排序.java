package zb.算法.简单算法;


import zb.算法.common.CommonUtil;
import zb.算法.test.Test02;

import java.util.Arrays;

public class 插入排序 {

    public static void main(String[] args) {
        int[] i = CommonUtil.randomInt(10);
//        insertSort(i);
        System.out.println(Arrays.toString(i));
//        insertSort(i);
//        System.out.println(Arrays.toString(i));
        test04(i);
        System.out.println(Arrays.toString(i));

    }

    public static void insertSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;

        for (int i = 1; i < arr.length; i++) { //假设第一个数位置时正确的；要往后移，必须要假设第一个。

            int j = i;
            int target = arr[i]; //待插入的

            //后移
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }

            //插入
            arr[j] = target;
        }
    }

    public static void test02(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            int target = arr[j];
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;
        }
    }

    public static void test04(int[] arr) {

        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

    }
}
