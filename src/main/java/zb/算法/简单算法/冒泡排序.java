package zb.算法.简单算法;

import zb.算法.common.IntUtil;

import java.util.Arrays;

/**
 * @author mikael
 */
public class 冒泡排序 {
    public static void main(String[] args) throws Exception {
        int[] i = {2, 3, 7, 8, 23, 11};
        sort(i);
        System.out.println(Arrays.toString(i));
        System.out.println();
        int[] ii = {2, 3, 7, 8, 23, 11};
        test01(ii);
        System.out.println(Arrays.toString(ii));
        int[] ints = IntUtil.randomInt(100, 1000);
        System.out.println("=========");
        System.out.println(Arrays.toString(ints));
        test01(ints);
        System.out.println(Arrays.toString(ints));
        int[] intss = IntUtil.randomInt(15, 1000);
        System.out.println("=========");
        System.out.println(Arrays.toString(intss));
        test02(intss);
        System.out.println(Arrays.toString(intss));

    }


    public static void sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int i = 1; i < arr.length; i++) {
            // 设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
//        return arr;
    }

    public static void test01(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void test02(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }




}
