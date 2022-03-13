package com.test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @version: V1.0
 * @author: mikael
 * @description:
 * @date: 2020-11-08
 */
public class HashMapTest {

  public static <T> void main(String[] args) {

    HashMap<Object, Object> hashMap = new HashMap<>(200);

    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(12);
    Integer integer = new Integer(12);
    String s = "123";

    for (int i = 0; i < 10; i++) {
      hashMap.put(new Test01(), new Object());
    }

    concurrentHashMap.put("12", "st");
    hashMap.put(1, "fs");
    hashMap.put(null, "hacks");
    System.out.println(hashMap.size());
    System.out.println(hashMap.get(null));
  }
}

class Test01 extends Object {

  @Override
  public int hashCode() {
    return 1;
  }
}
