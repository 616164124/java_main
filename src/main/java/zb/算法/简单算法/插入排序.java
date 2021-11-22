package zb.算法.简单算法;


import zb.算法.common.CommonUtil;

import java.util.Arrays;

public class 插入排序 {

    public static void main(String[] args) {

        int[] i = CommonUtil.randomInt(10, 1000);
        System.out.println(Arrays.toString(i));
        insertSort(i);
        System.out.println(Arrays.toString(i));
        System.out.println("======");

        int[] ii = CommonUtil.randomInt(10);
//        int[] iic = {1, 2, 3, 1};
        System.out.println(Arrays.toString(ii));
        test03(ii);
        System.out.println(Arrays.toString(ii));
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

    public static void test03(int[] arr) {
        int target, j;
        for (int i = 1; i < arr.length; i++) {
            target = arr[i];
            j = i;
            while (j > 0 && target < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = target;
        }
    }

}
