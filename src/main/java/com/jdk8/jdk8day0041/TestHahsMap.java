package com.jdk8.jdk8day0041;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestHahsMap {
    private static final List list = new ArrayList();

    public static void main(String[] args) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put(12344, "fls");

        int a = 100;
        int i = a & (4 - 1);
        int b = 100 % 4;
        System.out.println(i + "\t" + b);
    }

    public void Test() {
        for (int j = 0; j < 100; j++) {
            list.add("12kjhdakhfkjhskjdfahfajkhdfjhuakjh3" + j);
        }
        if (list.contains("12388")) {
            System.out.println("ssss");

        }
    }

    public void test01() {

    }

}
