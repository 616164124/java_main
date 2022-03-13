package com.test;

public class IntegerTest {
    public static void main(String[] args) {
        Integer a = 3, b = 3, c = 128, d = 128;
        int e = 128, f = 128;
//
        Long l = 129L;
        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(c.equals(e));
        System.out.println(f == c);
        assert e < 3 : "纳尼"; // 断言的用法 参考网址 https://blog.csdn.net/qq_22771739/article/details/85137082
        System.out.println("-----------------");
        //
        /** 跳出循环体的方式： break 标记 try-catch return */
        ok:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + ",j=" + j);
                if (j == 5) break ok;
            }
        }
        System.out.println("------------------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i=" + i + ",j=" + j);
                if (j == 5) return;
            }
        }
    }
}
