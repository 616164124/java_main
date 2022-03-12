package com.SynclnDetail;

import javassist.runtime.Inner;

/**
 * 单例 volatile
 */
public class SingnMode {

    public static void main(String[] args) {
        String s = "1231";

        for (int i = 0; i < 100; i++) {
            T t = T.getInstance(); // 单例类的调用,通过该方法调用得到的 T 类型的hashcode 都一样
            T C = T.getInstance();
            System.out.println(t.hashCode());
            System.out.println(t.hashCode() == C.hashCode());
        }
    }
}

/**
 * DCL 单例
 */
class T {

    private static volatile T instance = null; // 准时制生产方式（Just In Time简称JIT）也称为零库存

    private T() {
    }

    public static T getInstance() {
        if (instance == null) {
            synchronized (T.class) {
                if (instance == null) {
                    instance = new T();
                }
            }
        }
        return instance;
    }
}
