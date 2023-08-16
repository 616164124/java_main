package com.jvmtest;

import java.util.ArrayList;

/**
 * 内存泄漏 oom问题 将启动的vm设置小点容易快速发生错误 -xms20m -xmx20m
 *
 * @author: mikael
 */
public class test1 {
    public static void main(String[] args) {

        ArrayList<Object> objects = new ArrayList<>();
        while (true) {
            // 发生内容泄露
            objects.add(new test2());
        }
    }
}



class test2 {
}
