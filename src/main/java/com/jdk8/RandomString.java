package com.jdk8;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author mikael
 */
public class RandomString {
    public static void main(String[] args) {
        //
        int i  = ThreadLocalRandom.current().nextInt();
        long l = ThreadLocalRandom.current().nextLong();

        System.out.println(i);
        System.out.println(l);
    }
}
