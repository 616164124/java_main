package com.aqs.cas;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class CasTest {
    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger();
        atomicInteger.getAndIncrement();
        AtomicLong aLong = new AtomicLong();
        aLong.addAndGet(12);
        System.out.println(aLong);

    }
}
