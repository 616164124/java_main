package com.测试;

import java.util.Random;
import java.util.UUID;

public class Test01 {
    public static void main(String[] args) {


        System.out.println(new Random().nextInt(10));
        int add = add();
        System.out.println(add);
        System.out.println(UUID.randomUUID().toString());
        System.out.println("jfklsjflsf");

    }

    public static int add(){
        int i =0;
        for (int i1 = 0; i1 < 10; i1++) {
            i++;
            if(i==7){
                return i;
            }
        }
        return i;
    }
}
