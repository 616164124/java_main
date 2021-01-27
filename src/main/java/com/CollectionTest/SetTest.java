/**
 * projectName: JUC fileName: SetTest.java packageName: CollectionTest date: 2020-09-06 copyright(c)
 * 2017-2020 xxx公司
 */
package com.CollectionTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @version: V1.0
 * @author: mikael
 * @className: SetTest
 * @packageName: CollectionTest
 * @description: set方法的test
 * @data: 2020-09-06
 */
public class SetTest {
  public static void main(String[] args) {
    HashMap<Object, String> integerHashMap = new HashMap<>();
    integerHashMap.put(1, "fsjk");
    integerHashMap.put(2, "fsjk");
    integerHashMap.put(4, "fsjk");
    integerHashMap.put("sfsf", "sffs");
    Set<Object> integers = integerHashMap.keySet();
    for (Object integer : integers) {
      System.out.println(integer);
    }
    System.out.println("----------------------------");
    HashSet<String> strings = new HashSet<>();
    strings.add("123");
    strings.add("123");
    strings.add("Ma");
    strings.add("NB");
    for (String s:strings){
      System.out.println(s);
    }
    int h;
    int i = (h = "Ma".hashCode()) ^ (h >>> 16);
    int a = (h = "NB".hashCode()) ^ (h >>> 16);

    System.out.println(i+ "\t"+a);
  }
}
