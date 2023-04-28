package com.test;

import cn.hutool.core.lang.func.VoidFunc0;

public class Test {

    private static boolean flag = false;

    public static void main(String[] args) throws Exception {

        int a =3;
        int b= 1;
        System.out.println(a++ + ++b +b);

        Thread threadA = new Thread(() -> {
            while (!flag) {
                System.out.println(flag);
            }
            System.out.println("new data:" + flag);
        });
        threadA.start();

        Thread.sleep(100);
        Thread threadB = new Thread(() -> {
            flag = true;
        });
        threadB.start();
        Thread.sleep(1000);

        VoidFunc0 voidFunc0 = () -> {
            System.out.println("1111");
        };
        voidFunc0.call();
    }
}