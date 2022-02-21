package com.测试;

import java.util.*;

public class Test01 {


    public static void main(String[] args) {
        Test01 test01 = new Test01();
        Map<String, String> o = new HashMap<>();
        o.put("1", "21");
        o.put("1", "21");
        o.put("1", "21");

        System.out.println(new Random().nextInt(10));
        int add = add();
        System.out.printf("add为 %d", add);
        System.out.println(UUID.randomUUID());
        System.out.println("jfklsjflsf");

    }

    public static int add() {
        int i = 0;
        for (int i1 = 0; i1 < 10; i1++) {
            i++;
            if (i == 7) {
                return i;
            }
        }
        return i;
    }

    public static int get(Map<String, Object> i) {
        int size = i.size();
        return size;
    }


}
