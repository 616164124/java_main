package com.Interview;

import java.util.HashMap;

/** 统计字符串中各个字符出现的次数 */
public class StringCount implements AutoCloseable {
  public static void main(String[] args) {
    String s = "jflkjslfjldiejflkjslkjfla";

    char[] chars = s.toCharArray();
    HashMap<Character, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < chars.length; i++) {
      if (!hashMap.containsKey(chars[i])) {
        hashMap.put(chars[i], 1);
      } else {
        int count = hashMap.get(chars[i]) + 1;
        hashMap.put(chars[i], count);
      }
    }

    System.out.println(hashMap);
    System.out.println(hashMap.get('a'));
  }

  @Override
  public void close() throws Exception {}
}
