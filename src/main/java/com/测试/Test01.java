package com.测试;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class Test01 {


    public static void main(String[] args) {
        Test01 test01 = new Test01();
        Map<String, String> o = new HashMap<>();
        o.put("1", "21");
        o.put("1", "21");
        o.put("1", "21");

        Long s = new Long(12);
        int maxValue = Integer.MAX_VALUE;
        long maxValue1 = Long.MAX_VALUE;
        System.out.println(maxValue + "======" + maxValue1);

        System.out.println(new Random().nextInt(10));
        int add = add();
        if (add > 0) {
            System.out.println("add>0");
        } else {
            System.out.println("add<0");
        }
        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                System.out.println("====");
            }
        }
        int t = 1000000 + 873;
        int i = t ^ 1111111;
        System.out.printf("add为 %d", add);
        System.out.println(UUID.randomUUID());
        System.out.println("jfklsjflsf");
        System.out.println(t);
        System.out.println(5 >> 1);
        System.out.println("==============");
        System.out.println(o.get("po"));

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
