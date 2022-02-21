package com.algorithm.sort;

/**
 * 插入排序
 */
public class Insertion {
    //对数组a进行排序           Integer[] a={1,2,5,2,77,11,32,9,787};
    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0; j--) {
                if (greater(a[j - 1], a[j])) {
                    exch(a, j - 1, j);
                } else {
                    break;
                }
            }
        }
    }

    //比较元素大小
    public static boolean greater(Comparable x, Comparable y) {
        return x.compareTo(y) > 0;
    }

    //数组交换位置
    public static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
