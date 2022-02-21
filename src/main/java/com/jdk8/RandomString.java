package com.jdk8;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author mikael
 */
public class RandomString {
    public static void main(String[] args) {
        //
        long l = ThreadLocalRandom.current().nextLong();
        int i = ThreadLocalRandom.current().nextInt();
        System.out.println(i);
        System.out.println(l);
    }
}
