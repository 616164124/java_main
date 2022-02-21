package com.Interview;

import java.util.Arrays;

/**
 * 基础类型形参不会改变
 * 对象类型（数组）形参改变，会改变原来的值
 */
public class 形参 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int c = 12;
        String str = "stre";
        method(a);
        method2(c);
        method3(str);
        System.out.println("\t" + Arrays.toString(a));
        System.out.println(c);
        System.out.println(str);
    }

    public static void method(int[] i) {
        i[0] = 100;
    }

    public static void method2(int i) {
        i = 100;
    }

    public static void method3(String i) {
        i = "KJFKS";

    }

}
