package com.Interview;

import java.util.TreeMap;

public class TreeMapTest {
  public static void main(String[] args) {
    //
    TreeMap<String, String> treeMap = new TreeMap<>();
    treeMap.put("s0", "sfs");
    treeMap.put("s1", "1111");
    treeMap.put("s2", "222");
    treeMap.put("s3", "3333");
    System.out.println(treeMap.values());
    System.out.println(treeMap.size());
  }
}
