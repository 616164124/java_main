package zb.算法.简单算法;

import java.util.Arrays;

public class 选择排序 {

    public static void main(String[] args) {
        int[] i = {11, 2, 66, 4, 6, 11};
        //复制
        int[] ints = Arrays.copyOf(i, i.length);
        selectSort(i);
        System.out.println(Arrays.toString(i));
        int[] ii = {11, 2, 66, 4, 6, 12};
         test03(ii);
        System.out.println(Arrays.toString(ii));

    }

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length == 0)
            return;
        int minIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) { //只需要比较n-1次
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) { //从i+1开始比较，因为minIndex默认为i了，i就没必要比了。
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) { //如果minIndex不为i，说明找到了更小的值，交换之。
                swap(arr, i, minIndex);
            }
        }

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void test01(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] <arr[minPos]) {
                    minPos = j;
                }
            }
            swap(arr, i, minPos);
        }
    }

   public static void test03(int[] arr){
       int minPos;
        for (int i = 0; i < arr.length; i++) {
           minPos=i;
           for(int j=i+1;j<arr.length;j++){
               if(arr[j]<arr[minPos]){
                   minPos=j;
               }
           }
            swap(arr, i,minPos);

        }
   }

}
